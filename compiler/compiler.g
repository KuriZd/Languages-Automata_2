grammar compiler;
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
}
@members{
    HashMap SymT = new HashMap();

    private void pushID(String id, String tipo){
        System.out.println("Insertando a TS:"+id+" con tipo:"+tipo);
        Integer existe = (Integer) SymT.get(id);
        if(existe==null){
            if(tipo.compareTo("int")==0)    SymT.put(id,1);
            else if(tipo.compareTo("double")==0)    SymT.put(id,2);
            else SymT.put(id,3);
        } else { System.out.println("ID: "+id+" ya declarado");}
    }
}
program: classes+;
//public class ID { }       OCURLYB (OPENED CURLY BRACKETS)
classes: accesmod CLASS ID 
                    OCURLYB 
                        member*
                    CCURLYB;
assignment  :       ID '=' expr 
                    { System.out.println("Tipo de expr es: "+$expr.vType);}
                    SEMICOLON ;

member      :       method  | property  ;

property    :       accesmod tipo ID ( COMMA ID)* SEMICOLON;
                    //public int metodo(int a, int b)
method      :       accesmod tipo ID '(' decl_args?   ')' 
                                    OCURLYB
                                        sentences*
                                    CCURLYB;
            //int x, int a, double b
decl_args   :       t1=tipo id1=ID {pushID($id1.text, $t1.text);}
                        (COMMA t2=tipo id2=ID {pushID($id2.text, $t2.text);})*;
decl_local  :       tipo id1=ID {pushID($id1.text, $tipo.text);} 
                        (COMMA id2=ID {pushID($id2.text, $tipo.text);})* SEMICOLON;

sentences   :       assignment | decl_local;
                            //multExpr (('+'| '-') multExpr)*
expr returns [int vType]    : m1=multExpr { $vType=$m1.vType; } 
                                (('+' | '-') m2=multExpr
                                { if($vType != $m2.vType)  $vType=3; }
                                )*;
                            //atom ('' atom)
multExpr returns [int vType]: 
                    a1=atom{$vType=$a1.vType;} 
                    ('*' a2=atom
                        {
                            if($a1.vType != $a2.vType)  $vType=3;
                        }
                    )*;

atom returns [int vType]
    : CINT      { $vType=1; }   //regresa un 1 para identificar que es un int
	| CFLOAT    { $vType=2; }   //regresa un 2 para identificar que es float 
	| ID       
	|  '(' expr ')'  { $vType=$expr.vType; }   ;

accesmod: PUBLIC | PRIVATE | PROTECTED;

tipo    : INT | DOUBLE;


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
ID: ('a' ..'z' | 'A' ..'Z' | '_') 
    (
		'a' ..'z'
		| 'A' ..'Z'
		| '_'
		| '0' ..'9'
	)*;

WS: (' ' | '\n' | '\r' | '\t')+ {$channel=HIDDEN;};