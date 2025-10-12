grammar compilador;

/*
Tipos de ejemplos que se pueden realizar

    public class Nombre {
        public int metodo (int a, double b){
            double f, g;
            x = 3 + 4 * 5;
            y = 3.3 + 5.6*6.7;
            g = 4 + 5.6;
        }
    }
    public class Nombre {
        private x, y, z ;
        public int metodo (int a, double b){
            double f, g;
            x = a*(b-v+345.234);
            y=234;
            int r, f, c;
        }
    }
*/ 
@header{
    import java.util.HashMap;
    import java.util.LinkedHashMap;
}
@members{
    static final int T_INT=1, T_DOUBLE=2, T_MIXED=3, T_BOOL=4;

// --- Tablas de símbolos ---
HashMap<String,Integer> SymT = new HashMap<>();                 // Local por método
HashMap<String,ClassInfo> SymTG = new HashMap<>();              // Global

// Clase -> { atributos, metodos }
static class ClassInfo {
    String name;
    HashMap<String,Integer> attributes = new HashMap<>();       // nombre -> tipo
    HashMap<String,MethodInfo> methods = new HashMap<>();       // nombre -> firma (ojo: sobrecarga simple por nombre)
    ClassInfo(String n){ this.name=n; }
}

// Método -> { tipoRet, params, locals }
static class MethodInfo {
    String name;
    int returnType;
    LinkedHashMap<String,Integer> params = new LinkedHashMap<>();
    HashMap<String,Integer> locals = new HashMap<>(); // opcional si quieres persistirlos
    MethodInfo(String n,int rt){ name=n; returnType=rt; }
}

// Contexto actual (durante el parseo)
String currentClass = null;
MethodInfo currentMethod = null;

// Salida a IDE
private javax.swing.JTextArea salida;
public void setSalida(javax.swing.JTextArea ta){ this.salida = ta; }

// Utilidades de log
private void log(String s){ if(salida!=null) salida.append("\n"+s); }

// --- Helpers de inserción/lookup ---

private int strTypeToInt(String t){
    if("int".equals(t)) return T_INT;
    if("double".equals(t)) return T_DOUBLE;
    return T_MIXED; // por si se amplía el lenguaje
}

// GLOBAL: registrar clase
private void pushClass(String name){
    if(SymTG.containsKey(name)){
        log("[ERR] Clase redeclarada: "+name);
    } else {
        SymTG.put(name,new ClassInfo(name));
        log("[OK] Clase registrada: "+name);
    }
}

// GLOBAL: registrar atributo en la clase actual
private void pushAttribute(String id, String tipo){
    if(currentClass==null){ log("[ERR] Atributo fuera de clase: "+id); return; }
    ClassInfo C = SymTG.get(currentClass);
    if(C==null){ log("[ERR] Contexto de clase no inicializado: "+currentClass); return; }
    if(C.attributes.containsKey(id)){
        log("[ERR] Atributo redeclarado en "+currentClass+": "+id);
    } else {
        C.attributes.put(id, strTypeToInt(tipo));
        log("[OK] Atributo "+currentClass+"."+id+" : "+tipo);
    }
}

// GLOBAL: registrar método (firma) en la clase actual
private void pushMethod(String name, String retType){
    if(currentClass==null){ log("[ERR] Método fuera de clase: "+name); return; }
    ClassInfo C = SymTG.get(currentClass);
    if(C==null){ log("[ERR] Contexto de clase no inicializado: "+currentClass); return; }
    if(C.methods.containsKey(name)){
        log("[ERR] Método redeclarado en "+currentClass+": "+name);
    } else {
        currentMethod = new MethodInfo(name, strTypeToInt(retType));
        C.methods.put(name, currentMethod);
        log("[OK] Método "+currentClass+"."+name+" : "+retType);
    }
}

// LOCAL: registrar parámetro/variable local (SymT + persistir en currentMethod.locals si quieres)
private void pushLocal(String id, String tipo){
    if(SymT.containsKey(id)){
        log("[ERR] Identificador local redeclarado en método: "+id);
    } else {
        int t = strTypeToInt(tipo);
        SymT.put(id, t);
        if(currentMethod!=null) currentMethod.locals.put(id, t);
        log("Insertando a TS local: "+id+" : "+tipo);
    }
}

// LOCAL lookup (primero local, opcionalmente atributos si decides permitirlo)
private int lookupVarType(String id){
    // 1 Prioridad: TS local (parámetros + variables locales del método)
    Integer t = SymT.get(id);
    if(t != null) return t;

    // 2 Segundo: atributos de la clase actual en la TS global
    if(currentClass != null){
        ClassInfo C = SymTG.get(currentClass);
        if(C != null){
            Integer ta = C.attributes.get(id);
            if(ta != null) return ta;
        }
    }
    // 3 No encontrado en ningún lado -> error
    log("[ERR] Uso de variable no declarada: " + id);
    return T_MIXED; // conserva la compilación del árbol de expr como 'mixed/error'
}

private int ensureBool(String ctx, int t){
    if(t!=T_BOOL){
        log("[ERR] La condición de "+ctx+" debe ser booleana, no de tipo "+t);
        return T_MIXED; // para seguir análisis
    }
    return T_BOOL;
}

private int mixBool(int a, int b, String ctx){
    if(a==T_BOOL && b==T_BOOL) return T_BOOL;
    log("[ERR] "+ctx+" requiere operandos booleanos (recibidos "+a+" y "+b+")");
    return T_MIXED;
   }

private int mixTypes(int a, int b, String ctx){
    if(a==T_MIXED || b==T_MIXED) return T_MIXED;
    if(a!=b){
        log("[ERR] "+ctx+" entre tipos distintos ("+a+" vs "+b+")");
        return T_MIXED;
    }
    return a;
  }
}
program: classes+;
//public class ID { }       OCURLYB (OPENED CURLY BRACKETS)
classes : accesmod CLASS id=ID
          { currentClass = $id.text; pushClass(currentClass); }
          OCURLYB ( member )* CCURLYB
          { currentClass = null; } ;

assignment  : lhs=ID '=' e=expr SEMICOLON
                {
                int lt = lookupVarType($lhs.text);      // tipo LHS (local o atributo)
                log("Tipo de expr es: "+$e.vType);
                if(lt!=T_MIXED && $e.vType!=T_MIXED && lt!=$e.vType){
                    log("[ERR] Asignación incompatible: "+$lhs.text+" (tipo "+lt+") = expr (tipo "+$e.vType+")");
                }
            } ;


member      :       method  | property  ;

property    :       accesmod t=tipo id1=ID { 
                    ClassInfo C = SymTG.get(currentClass);
                    if(C!=null){
                        if(C.attributes.containsKey($id1.text)) log("[ERR] Redeclaración de atributo: "+$id1.text);
                        else { C.attributes.put($id1.text, strTypeToInt($t.text)); log("[OK] Atributo "+currentClass+"."+ $id1.text+" : "+$t.text); }
                    }
                }
                ( COMMA id2=ID {
                    ClassInfo C = SymTG.get(currentClass);
                    if(C!=null){
                        if(C.attributes.containsKey($id2.text)) log("[ERR] Redeclaración de atributo: "+$id2.text);
                        else { C.attributes.put($id2.text, strTypeToInt($t.text)); log("[OK] Atributo "+currentClass+"."+ $id2.text+" : "+$t.text); }
                    }
                } )* SEMICOLON ;



//public int metodo(int a, int b)
// PURGA POR MÉTODO: limpia la TS al entrar al método
method    : accesmod t=tipo m=ID
            '(' { pushMethod($m.text, $t.text); } decl_args? ')'
            OCURLYB sentences* CCURLYB
            { currentMethod = null; SymT.clear(); } ;


decl_args : t1=tipo id1=ID {
            pushLocal($id1.text, $t1.text);
            if(currentMethod!=null) currentMethod.params.put($id1.text, strTypeToInt($t1.text));
        }
        ( COMMA t2=tipo id2=ID {
            pushLocal($id2.text, $t2.text);
            if(currentMethod!=null) currentMethod.params.put($id2.text, strTypeToInt($t2.text));
        } )* ;


decl_local : t=tipo id1=ID { pushLocal($id1.text, $t.text); }
             ( COMMA id2=ID { pushLocal($id2.text, $t.text); } )*
             SEMICOLON;


sentences  : assignment  | decl_local  | ifStmt  | whileStmt  ;

ifStmt  : IF '(' c=boolExpr ')' { ensureBool("if", $c.vType); }
          OCURLYB sentences* CCURLYB
          ( ELSE OCURLYB sentences* CCURLYB )?  ;

whileStmt  : WHILE '(' c=boolExpr ')' { ensureBool("while", $c.vType); }
             OCURLYB sentences* CCURLYB  ;

boolExpr returns [int vType]  : a=boolAnd  { $vType = $a.vType; }  (
                                OR b=boolAnd  { $vType = mixBool($vType, $b.vType, "OR"); } )*  ;

boolAnd returns [int vType]  : a=boolNot    { $vType = $a.vType; }
                               ( AND b=boolNot { $vType = mixBool($vType, $b.vType, "AND"); } )*  ;

boolNot returns [int vType]
  : NOT x=boolNot              { $vType = ensureBool("NOT", $x.vType); }
  | x=boolAtom                 { $vType = $x.vType; }
  ;

boolAtom returns [int vType]
  : TRUE                       { $vType = T_BOOL; }
  | FALSE                      { $vType = T_BOOL; }
  | '(' b=boolExpr ')'         { $vType = $b.vType; }          // paréntesis para booleanos
  | c=cmpNoParen               { $vType = $c.vType; }          // comparación "desnuda" (sin '(' inicial)
  ;

cmpNoParen returns [int vType]
  : a=exprNoParen op=(EQ|NE|LE|GE|LT|GT) b=expr
    {
      if( ($a.vType==T_INT && $b.vType==T_INT) ||
          ($a.vType==T_DOUBLE && $b.vType==T_DOUBLE) ) {
        $vType = T_BOOL;
      } else {
        log("[ERR] Comparación entre tipos incompatibles en condición ("+$a.vType+" vs "+$b.vType+")");
        $vType = T_MIXED;
      }
    }
  ;

// ====== Versión sin paréntesis de tu aritmética ======
exprNoParen returns [int vType]
  : m1=multNoParen            { $vType = $m1.vType; }
    ( ('+'|'-') m2=multNoParen { $vType = mixTypes($vType, $m2.vType, "Suma/Resta"); } )*
  ;

multNoParen returns [int vType]
  : a1=atomNoParen            { $vType = $a1.vType; }
    ( '' a2=atomNoParen      { $vType = mixTypes($vType, $a2.vType, "Multiplicación"); } )
  ;

// Igual que tu atom, pero SIN la alternativa de '(' expr ')'
atomNoParen returns [int vType]
  : CINT                      { $vType = T_INT; }
  | CFLOAT                    { $vType = T_DOUBLE; }
  | id=ID                     { $vType = lookupVarType($id.text); }
  ;


expr returns [int vType] : m1=multExpr { $vType=$m1.vType; }
                           ( ('+'|'-') m2=multExpr { $vType = mixTypes($vType, $m2.vType, "Suma/Resta"); } )* ;

multExpr returns [int vType]  : a1=atom { $vType=$a1.vType; }
                                ( '' a2=atom { $vType = mixTypes($vType, $a2.vType, "Multiplicación"); } ) ;

atom returns [int vType]
  : CINT              { $vType=T_INT; }
  | CFLOAT            { $vType=T_DOUBLE; }
  | id=ID             { $vType = lookupVarType($id.text); }
  | '(' expr ')'      { $vType=$expr.vType; } ;



accesmod: PUBLIC | PRIVATE | PROTECTED;

VOID : 'void';
tipo : INT | DOUBLE | VOID ;


//un token es una regla léxica válida en el lenguaje
PUBLIC      : 'public';
PRIVATE     : 'private';
PROTECTED   : 'protected';
INT         : 'int' ;
DOUBLE      : 'double';
CLASS       : 'class';
OCURLYB     : '{';
CCURLYB     : '}';

COMMA       : ',';
SEMICOLON   : ';';
DOT         : '.';
CINT        : ('0' ..'9')+;
CFLOAT      : CINT DOT CINT;
IF          : 'if';
ELSE        : 'else';
WHILE       : 'while';
TRUE        : 'true';
FALSE       : 'false';
AND         : '&&';
OR          : '||';
NOT         : '!';
EQ          : '==';
NE          : '!=';
LE          : '<=';
GE          : '>=';
LT          : '<';
GT          : '>';

ID: ('a' ..'z' | 'A' ..'Z' | '_') 
    ( 'a' ..'z' | 'A' ..'Z' | '_' | '0' ..'9' )*;

WS: (' ' | '\n' | '\r' | '\t')+ {$channel=HIDDEN;};