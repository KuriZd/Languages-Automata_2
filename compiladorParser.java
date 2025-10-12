// $ANTLR 3.5.2 compilador.g 2025-10-12 02:16:45

    import java.util.HashMap;
    import java.util.LinkedHashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compiladorParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CCURLYB", "CFLOAT", "CINT", 
		"CLASS", "COMMA", "DOT", "DOUBLE", "ELSE", "EQ", "FALSE", "GE", "GT", 
		"ID", "IF", "INT", "LE", "LT", "NE", "NOT", "OCURLYB", "OR", "PRIVATE", 
		"PROTECTED", "PUBLIC", "SEMICOLON", "TRUE", "VOID", "WHILE", "WS", "''", 
		"'('", "')'", "'+'", "'-'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int AND=4;
	public static final int CCURLYB=5;
	public static final int CFLOAT=6;
	public static final int CINT=7;
	public static final int CLASS=8;
	public static final int COMMA=9;
	public static final int DOT=10;
	public static final int DOUBLE=11;
	public static final int ELSE=12;
	public static final int EQ=13;
	public static final int FALSE=14;
	public static final int GE=15;
	public static final int GT=16;
	public static final int ID=17;
	public static final int IF=18;
	public static final int INT=19;
	public static final int LE=20;
	public static final int LT=21;
	public static final int NE=22;
	public static final int NOT=23;
	public static final int OCURLYB=24;
	public static final int OR=25;
	public static final int PRIVATE=26;
	public static final int PROTECTED=27;
	public static final int PUBLIC=28;
	public static final int SEMICOLON=29;
	public static final int TRUE=30;
	public static final int VOID=31;
	public static final int WHILE=32;
	public static final int WS=33;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public compiladorParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public compiladorParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return compiladorParser.tokenNames; }
	@Override public String getGrammarFileName() { return "compilador.g"; }


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



	// $ANTLR start "program"
	// compilador.g:162:1: program : ( classes )+ ;
	public final void program() throws RecognitionException {
		try {
			// compilador.g:162:8: ( ( classes )+ )
			// compilador.g:162:10: ( classes )+
			{
			// compilador.g:162:10: ( classes )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= PRIVATE && LA1_0 <= PUBLIC)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// compilador.g:162:10: classes
					{
					pushFollow(FOLLOW_classes_in_program20);
					classes();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "classes"
	// compilador.g:164:1: classes : accesmod CLASS id= ID OCURLYB ( member )* CCURLYB ;
	public final void classes() throws RecognitionException {
		Token id=null;

		try {
			// compilador.g:164:9: ( accesmod CLASS id= ID OCURLYB ( member )* CCURLYB )
			// compilador.g:164:11: accesmod CLASS id= ID OCURLYB ( member )* CCURLYB
			{
			pushFollow(FOLLOW_accesmod_in_classes29);
			accesmod();
			state._fsp--;

			match(input,CLASS,FOLLOW_CLASS_in_classes31); 
			id=(Token)match(input,ID,FOLLOW_ID_in_classes35); 
			 currentClass = (id!=null?id.getText():null); pushClass(currentClass); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_classes59); 
			// compilador.g:166:19: ( member )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// compilador.g:166:21: member
					{
					pushFollow(FOLLOW_member_in_classes63);
					member();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_classes68); 
			 currentClass = null; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classes"



	// $ANTLR start "assignment"
	// compilador.g:169:1: assignment : lhs= ID '=' e= expr SEMICOLON ;
	public final void assignment() throws RecognitionException {
		Token lhs=null;
		int e =0;

		try {
			// compilador.g:169:13: (lhs= ID '=' e= expr SEMICOLON )
			// compilador.g:169:15: lhs= ID '=' e= expr SEMICOLON
			{
			lhs=(Token)match(input,ID,FOLLOW_ID_in_assignment92); 
			match(input,39,FOLLOW_39_in_assignment94); 
			pushFollow(FOLLOW_expr_in_assignment98);
			e=expr();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignment100); 

			                int lt = lookupVarType((lhs!=null?lhs.getText():null));      // tipo LHS (local o atributo)
			                log("Tipo de expr es: "+e);
			                if(lt!=T_MIXED && e!=T_MIXED && lt!=e){
			                    log("[ERR] Asignación incompatible: "+(lhs!=null?lhs.getText():null)+" (tipo "+lt+") = expr (tipo "+e+")");
			                }
			            
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "member"
	// compilador.g:179:1: member : ( method | property );
	public final void member() throws RecognitionException {
		try {
			// compilador.g:179:13: ( method | property )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DOUBLE||LA3_1==INT||LA3_1==VOID) ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2==ID) ) {
						int LA3_3 = input.LA(4);
						if ( (LA3_3==35) ) {
							alt3=1;
						}
						else if ( (LA3_3==COMMA||LA3_3==SEMICOLON) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// compilador.g:179:21: method
					{
					pushFollow(FOLLOW_method_in_member139);
					method();
					state._fsp--;

					}
					break;
				case 2 :
					// compilador.g:179:31: property
					{
					pushFollow(FOLLOW_property_in_member144);
					property();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "member"



	// $ANTLR start "property"
	// compilador.g:181:1: property : accesmod t= tipo id1= ID ( COMMA id2= ID )* SEMICOLON ;
	public final void property() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope t =null;

		try {
			// compilador.g:181:13: ( accesmod t= tipo id1= ID ( COMMA id2= ID )* SEMICOLON )
			// compilador.g:181:21: accesmod t= tipo id1= ID ( COMMA id2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_accesmod_in_property163);
			accesmod();
			state._fsp--;

			pushFollow(FOLLOW_tipo_in_property167);
			t=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_property171); 
			 
			                    ClassInfo C = SymTG.get(currentClass);
			                    if(C!=null){
			                        if(C.attributes.containsKey((id1!=null?id1.getText():null))) log("[ERR] Redeclaración de atributo: "+(id1!=null?id1.getText():null));
			                        else { C.attributes.put((id1!=null?id1.getText():null), strTypeToInt((t!=null?input.toString(t.start,t.stop):null))); log("[OK] Atributo "+currentClass+"."+ (id1!=null?id1.getText():null)+" : "+(t!=null?input.toString(t.start,t.stop):null)); }
			                    }
			                
			// compilador.g:188:17: ( COMMA id2= ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// compilador.g:188:19: COMMA id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_property193); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_property197); 

					                    ClassInfo C = SymTG.get(currentClass);
					                    if(C!=null){
					                        if(C.attributes.containsKey((id2!=null?id2.getText():null))) log("[ERR] Redeclaración de atributo: "+(id2!=null?id2.getText():null));
					                        else { C.attributes.put((id2!=null?id2.getText():null), strTypeToInt((t!=null?input.toString(t.start,t.stop):null))); log("[OK] Atributo "+currentClass+"."+ (id2!=null?id2.getText():null)+" : "+(t!=null?input.toString(t.start,t.stop):null)); }
					                    }
					                
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_property204); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "property"



	// $ANTLR start "method"
	// compilador.g:200:1: method : accesmod t= tipo m= ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB ;
	public final void method() throws RecognitionException {
		Token m=null;
		ParserRuleReturnScope t =null;

		try {
			// compilador.g:200:11: ( accesmod t= tipo m= ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB )
			// compilador.g:200:13: accesmod t= tipo m= ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB
			{
			pushFollow(FOLLOW_accesmod_in_method220);
			accesmod();
			state._fsp--;

			pushFollow(FOLLOW_tipo_in_method224);
			t=tipo();
			state._fsp--;

			m=(Token)match(input,ID,FOLLOW_ID_in_method228); 
			match(input,35,FOLLOW_35_in_method242); 
			 pushMethod((m!=null?m.getText():null), (t!=null?input.toString(t.start,t.stop):null)); 
			// compilador.g:201:51: ( decl_args )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DOUBLE||LA5_0==INT||LA5_0==VOID) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// compilador.g:201:51: decl_args
					{
					pushFollow(FOLLOW_decl_args_in_method246);
					decl_args();
					state._fsp--;

					}
					break;

			}

			match(input,36,FOLLOW_36_in_method249); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_method263); 
			// compilador.g:202:21: ( sentences )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DOUBLE||(LA6_0 >= ID && LA6_0 <= INT)||(LA6_0 >= VOID && LA6_0 <= WHILE)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// compilador.g:202:21: sentences
					{
					pushFollow(FOLLOW_sentences_in_method265);
					sentences();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_method268); 
			 currentMethod = null; SymT.clear(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "method"



	// $ANTLR start "decl_args"
	// compilador.g:206:1: decl_args : t1= tipo id1= ID ( COMMA t2= tipo id2= ID )* ;
	public final void decl_args() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try {
			// compilador.g:206:11: (t1= tipo id1= ID ( COMMA t2= tipo id2= ID )* )
			// compilador.g:206:13: t1= tipo id1= ID ( COMMA t2= tipo id2= ID )*
			{
			pushFollow(FOLLOW_tipo_in_decl_args294);
			t1=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_args298); 

			            pushLocal((id1!=null?id1.getText():null), (t1!=null?input.toString(t1.start,t1.stop):null));
			            if(currentMethod!=null) currentMethod.params.put((id1!=null?id1.getText():null), strTypeToInt((t1!=null?input.toString(t1.start,t1.stop):null)));
			        
			// compilador.g:210:9: ( COMMA t2= tipo id2= ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// compilador.g:210:11: COMMA t2= tipo id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_args312); 
					pushFollow(FOLLOW_tipo_in_decl_args316);
					t2=tipo();
					state._fsp--;

					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_args320); 

					            pushLocal((id2!=null?id2.getText():null), (t2!=null?input.toString(t2.start,t2.stop):null));
					            if(currentMethod!=null) currentMethod.params.put((id2!=null?id2.getText():null), strTypeToInt((t2!=null?input.toString(t2.start,t2.stop):null)));
					        
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl_args"



	// $ANTLR start "decl_local"
	// compilador.g:216:1: decl_local : t= tipo id1= ID ( COMMA id2= ID )* SEMICOLON ;
	public final void decl_local() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope t =null;

		try {
			// compilador.g:216:12: (t= tipo id1= ID ( COMMA id2= ID )* SEMICOLON )
			// compilador.g:216:14: t= tipo id1= ID ( COMMA id2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_tipo_in_decl_local337);
			t=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_local341); 
			 pushLocal((id1!=null?id1.getText():null), (t!=null?input.toString(t.start,t.stop):null)); 
			// compilador.g:217:14: ( COMMA id2= ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// compilador.g:217:16: COMMA id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_local360); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_local364); 
					 pushLocal((id2!=null?id2.getText():null), (t!=null?input.toString(t.start,t.stop):null)); 
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_local384); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl_local"



	// $ANTLR start "sentences"
	// compilador.g:221:1: sentences : ( assignment | decl_local | ifStmt | whileStmt );
	public final void sentences() throws RecognitionException {
		try {
			// compilador.g:221:12: ( assignment | decl_local | ifStmt | whileStmt )
			int alt9=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt9=1;
				}
				break;
			case DOUBLE:
			case INT:
			case VOID:
				{
				alt9=2;
				}
				break;
			case IF:
				{
				alt9=3;
				}
				break;
			case WHILE:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// compilador.g:221:14: assignment
					{
					pushFollow(FOLLOW_assignment_in_sentences394);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// compilador.g:221:28: decl_local
					{
					pushFollow(FOLLOW_decl_local_in_sentences399);
					decl_local();
					state._fsp--;

					}
					break;
				case 3 :
					// compilador.g:221:42: ifStmt
					{
					pushFollow(FOLLOW_ifStmt_in_sentences404);
					ifStmt();
					state._fsp--;

					}
					break;
				case 4 :
					// compilador.g:221:52: whileStmt
					{
					pushFollow(FOLLOW_whileStmt_in_sentences409);
					whileStmt();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sentences"



	// $ANTLR start "ifStmt"
	// compilador.g:223:1: ifStmt : IF '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB ( ELSE OCURLYB ( sentences )* CCURLYB )? ;
	public final void ifStmt() throws RecognitionException {
		int c =0;

		try {
			// compilador.g:223:9: ( IF '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB ( ELSE OCURLYB ( sentences )* CCURLYB )? )
			// compilador.g:223:11: IF '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB ( ELSE OCURLYB ( sentences )* CCURLYB )?
			{
			match(input,IF,FOLLOW_IF_in_ifStmt420); 
			match(input,35,FOLLOW_35_in_ifStmt422); 
			pushFollow(FOLLOW_boolExpr_in_ifStmt426);
			c=boolExpr();
			state._fsp--;

			match(input,36,FOLLOW_36_in_ifStmt428); 
			 ensureBool("if", c); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_ifStmt442); 
			// compilador.g:224:19: ( sentences )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==DOUBLE||(LA10_0 >= ID && LA10_0 <= INT)||(LA10_0 >= VOID && LA10_0 <= WHILE)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// compilador.g:224:19: sentences
					{
					pushFollow(FOLLOW_sentences_in_ifStmt444);
					sentences();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_ifStmt447); 
			// compilador.g:225:11: ( ELSE OCURLYB ( sentences )* CCURLYB )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ELSE) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// compilador.g:225:13: ELSE OCURLYB ( sentences )* CCURLYB
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStmt461); 
					match(input,OCURLYB,FOLLOW_OCURLYB_in_ifStmt463); 
					// compilador.g:225:26: ( sentences )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==DOUBLE||(LA11_0 >= ID && LA11_0 <= INT)||(LA11_0 >= VOID && LA11_0 <= WHILE)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// compilador.g:225:26: sentences
							{
							pushFollow(FOLLOW_sentences_in_ifStmt465);
							sentences();
							state._fsp--;

							}
							break;

						default :
							break loop11;
						}
					}

					match(input,CCURLYB,FOLLOW_CCURLYB_in_ifStmt468); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifStmt"



	// $ANTLR start "whileStmt"
	// compilador.g:227:1: whileStmt : WHILE '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB ;
	public final void whileStmt() throws RecognitionException {
		int c =0;

		try {
			// compilador.g:227:12: ( WHILE '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB )
			// compilador.g:227:14: WHILE '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStmt482); 
			match(input,35,FOLLOW_35_in_whileStmt484); 
			pushFollow(FOLLOW_boolExpr_in_whileStmt488);
			c=boolExpr();
			state._fsp--;

			match(input,36,FOLLOW_36_in_whileStmt490); 
			 ensureBool("while", c); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_whileStmt507); 
			// compilador.g:228:22: ( sentences )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DOUBLE||(LA13_0 >= ID && LA13_0 <= INT)||(LA13_0 >= VOID && LA13_0 <= WHILE)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// compilador.g:228:22: sentences
					{
					pushFollow(FOLLOW_sentences_in_whileStmt509);
					sentences();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_whileStmt512); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whileStmt"



	// $ANTLR start "boolExpr"
	// compilador.g:230:1: boolExpr returns [int vType] : a= boolAnd ( OR b= boolAnd )* ;
	public final int boolExpr() throws RecognitionException {
		int vType = 0;


		int a =0;
		int b =0;

		try {
			// compilador.g:230:31: (a= boolAnd ( OR b= boolAnd )* )
			// compilador.g:230:33: a= boolAnd ( OR b= boolAnd )*
			{
			pushFollow(FOLLOW_boolAnd_in_boolExpr529);
			a=boolAnd();
			state._fsp--;

			 vType = a; 
			// compilador.g:230:68: ( OR b= boolAnd )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==OR) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// compilador.g:231:33: OR b= boolAnd
					{
					match(input,OR,FOLLOW_OR_in_boolExpr569); 
					pushFollow(FOLLOW_boolAnd_in_boolExpr573);
					b=boolAnd();
					state._fsp--;

					 vType = mixBool(vType, b, "OR"); 
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "boolExpr"



	// $ANTLR start "boolAnd"
	// compilador.g:233:1: boolAnd returns [int vType] : a= boolNot ( AND b= boolNot )* ;
	public final int boolAnd() throws RecognitionException {
		int vType = 0;


		int a =0;
		int b =0;

		try {
			// compilador.g:233:30: (a= boolNot ( AND b= boolNot )* )
			// compilador.g:233:32: a= boolNot ( AND b= boolNot )*
			{
			pushFollow(FOLLOW_boolNot_in_boolAnd596);
			a=boolNot();
			state._fsp--;

			 vType = a; 
			// compilador.g:234:32: ( AND b= boolNot )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==AND) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// compilador.g:234:34: AND b= boolNot
					{
					match(input,AND,FOLLOW_AND_in_boolAnd636); 
					pushFollow(FOLLOW_boolNot_in_boolAnd640);
					b=boolNot();
					state._fsp--;

					 vType = mixBool(vType, b, "AND"); 
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "boolAnd"



	// $ANTLR start "boolNot"
	// compilador.g:236:1: boolNot returns [int vType] : ( NOT x= boolNot |x= boolAtom );
	public final int boolNot() throws RecognitionException {
		int vType = 0;


		int x =0;

		try {
			// compilador.g:237:3: ( NOT x= boolNot |x= boolAtom )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==NOT) ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= CFLOAT && LA16_0 <= CINT)||LA16_0==FALSE||LA16_0==ID||LA16_0==TRUE||LA16_0==35) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// compilador.g:237:5: NOT x= boolNot
					{
					match(input,NOT,FOLLOW_NOT_in_boolNot661); 
					pushFollow(FOLLOW_boolNot_in_boolNot665);
					x=boolNot();
					state._fsp--;

					 vType = ensureBool("NOT", x); 
					}
					break;
				case 2 :
					// compilador.g:238:5: x= boolAtom
					{
					pushFollow(FOLLOW_boolAtom_in_boolNot688);
					x=boolAtom();
					state._fsp--;

					 vType = x; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "boolNot"



	// $ANTLR start "boolAtom"
	// compilador.g:241:1: boolAtom returns [int vType] : ( TRUE | FALSE | '(' b= boolExpr ')' |c= cmpNoParen );
	public final int boolAtom() throws RecognitionException {
		int vType = 0;


		int b =0;
		int c =0;

		try {
			// compilador.g:242:3: ( TRUE | FALSE | '(' b= boolExpr ')' |c= cmpNoParen )
			int alt17=4;
			switch ( input.LA(1) ) {
			case TRUE:
				{
				alt17=1;
				}
				break;
			case FALSE:
				{
				alt17=2;
				}
				break;
			case 35:
				{
				alt17=3;
				}
				break;
			case CFLOAT:
			case CINT:
			case ID:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// compilador.g:242:5: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_boolAtom723); 
					 vType = T_BOOL; 
					}
					break;
				case 2 :
					// compilador.g:243:5: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_boolAtom753); 
					 vType = T_BOOL; 
					}
					break;
				case 3 :
					// compilador.g:244:5: '(' b= boolExpr ')'
					{
					match(input,35,FOLLOW_35_in_boolAtom782); 
					pushFollow(FOLLOW_boolExpr_in_boolAtom786);
					b=boolExpr();
					state._fsp--;

					match(input,36,FOLLOW_36_in_boolAtom788); 
					 vType = b; 
					}
					break;
				case 4 :
					// compilador.g:245:5: c= cmpNoParen
					{
					pushFollow(FOLLOW_cmpNoParen_in_boolAtom816);
					c=cmpNoParen();
					state._fsp--;

					 vType = c; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "boolAtom"



	// $ANTLR start "cmpNoParen"
	// compilador.g:248:1: cmpNoParen returns [int vType] : a= exprNoParen op= ( EQ | NE | LE | GE | LT | GT ) b= expr ;
	public final int cmpNoParen() throws RecognitionException {
		int vType = 0;


		Token op=null;
		int a =0;
		int b =0;

		try {
			// compilador.g:249:3: (a= exprNoParen op= ( EQ | NE | LE | GE | LT | GT ) b= expr )
			// compilador.g:249:5: a= exprNoParen op= ( EQ | NE | LE | GE | LT | GT ) b= expr
			{
			pushFollow(FOLLOW_exprNoParen_in_cmpNoParen861);
			a=exprNoParen();
			state._fsp--;

			op=input.LT(1);
			if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||(input.LA(1) >= LE && input.LA(1) <= NE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_expr_in_cmpNoParen881);
			b=expr();
			state._fsp--;


			      if( (a==T_INT && b==T_INT) ||
			          (a==T_DOUBLE && b==T_DOUBLE) ) {
			        vType = T_BOOL;
			      } else {
			        log("[ERR] Comparación entre tipos incompatibles en condición ("+a+" vs "+b+")");
			        vType = T_MIXED;
			      }
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "cmpNoParen"



	// $ANTLR start "exprNoParen"
	// compilador.g:262:1: exprNoParen returns [int vType] : m1= multNoParen ( ( '+' | '-' ) m2= multNoParen )* ;
	public final int exprNoParen() throws RecognitionException {
		int vType = 0;


		int m1 =0;
		int m2 =0;

		try {
			// compilador.g:263:3: (m1= multNoParen ( ( '+' | '-' ) m2= multNoParen )* )
			// compilador.g:263:5: m1= multNoParen ( ( '+' | '-' ) m2= multNoParen )*
			{
			pushFollow(FOLLOW_multNoParen_in_exprNoParen907);
			m1=multNoParen();
			state._fsp--;

			 vType = m1; 
			// compilador.g:264:5: ( ( '+' | '-' ) m2= multNoParen )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= 37 && LA18_0 <= 38)) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// compilador.g:264:7: ( '+' | '-' ) m2= multNoParen
					{
					if ( (input.LA(1) >= 37 && input.LA(1) <= 38) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multNoParen_in_exprNoParen936);
					m2=multNoParen();
					state._fsp--;

					 vType = mixTypes(vType, m2, "Suma/Resta"); 
					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "exprNoParen"



	// $ANTLR start "multNoParen"
	// compilador.g:267:1: multNoParen returns [int vType] : a1= atomNoParen ( '' a2= atomNoParen ) ;
	public final int multNoParen() throws RecognitionException {
		int vType = 0;


		int a1 =0;
		int a2 =0;

		try {
			// compilador.g:268:3: (a1= atomNoParen ( '' a2= atomNoParen ) )
			// compilador.g:268:5: a1= atomNoParen ( '' a2= atomNoParen )
			{
			pushFollow(FOLLOW_atomNoParen_in_multNoParen960);
			a1=atomNoParen();
			state._fsp--;

			 vType = a1; 
			// compilador.g:269:5: ( '' a2= atomNoParen )
			// compilador.g:269:7: '' a2= atomNoParen
			{
			match(input,34,FOLLOW_34_in_multNoParen981); 
			pushFollow(FOLLOW_atomNoParen_in_multNoParen985);
			a2=atomNoParen();
			state._fsp--;

			 vType = mixTypes(vType, a2, "Multiplicación"); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "multNoParen"



	// $ANTLR start "atomNoParen"
	// compilador.g:273:1: atomNoParen returns [int vType] : ( CINT | CFLOAT |id= ID );
	public final int atomNoParen() throws RecognitionException {
		int vType = 0;


		Token id=null;

		try {
			// compilador.g:274:3: ( CINT | CFLOAT |id= ID )
			int alt19=3;
			switch ( input.LA(1) ) {
			case CINT:
				{
				alt19=1;
				}
				break;
			case CFLOAT:
				{
				alt19=2;
				}
				break;
			case ID:
				{
				alt19=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// compilador.g:274:5: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atomNoParen1012); 
					 vType = T_INT; 
					}
					break;
				case 2 :
					// compilador.g:275:5: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atomNoParen1041); 
					 vType = T_DOUBLE; 
					}
					break;
				case 3 :
					// compilador.g:276:5: id= ID
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_atomNoParen1070); 
					 vType = lookupVarType((id!=null?id.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "atomNoParen"



	// $ANTLR start "expr"
	// compilador.g:280:1: expr returns [int vType] : m1= multExpr ( ( '+' | '-' ) m2= multExpr )* ;
	public final int expr() throws RecognitionException {
		int vType = 0;


		int m1 =0;
		int m2 =0;

		try {
			// compilador.g:280:26: (m1= multExpr ( ( '+' | '-' ) m2= multExpr )* )
			// compilador.g:280:28: m1= multExpr ( ( '+' | '-' ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr1110);
			m1=multExpr();
			state._fsp--;

			 vType =m1; 
			// compilador.g:281:28: ( ( '+' | '-' ) m2= multExpr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= 37 && LA20_0 <= 38)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// compilador.g:281:30: ( '+' | '-' ) m2= multExpr
					{
					if ( (input.LA(1) >= 37 && input.LA(1) <= 38) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr1151);
					m2=multExpr();
					state._fsp--;

					 vType = mixTypes(vType, m2, "Suma/Resta"); 
					}
					break;

				default :
					break loop20;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// compilador.g:283:1: multExpr returns [int vType] : a1= atom ( '' a2= atom ) ;
	public final int multExpr() throws RecognitionException {
		int vType = 0;


		int a1 =0;
		int a2 =0;

		try {
			// compilador.g:283:31: (a1= atom ( '' a2= atom ) )
			// compilador.g:283:33: a1= atom ( '' a2= atom )
			{
			pushFollow(FOLLOW_atom_in_multExpr1172);
			a1=atom();
			state._fsp--;

			 vType =a1; 
			// compilador.g:284:33: ( '' a2= atom )
			// compilador.g:284:35: '' a2= atom
			{
			match(input,34,FOLLOW_34_in_multExpr1210); 
			pushFollow(FOLLOW_atom_in_multExpr1214);
			a2=atom();
			state._fsp--;

			 vType = mixTypes(vType, a2, "Multiplicación"); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// compilador.g:286:1: atom returns [int vType] : ( CINT | CFLOAT |id= ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int vType = 0;


		Token id=null;
		int expr1 =0;

		try {
			// compilador.g:287:3: ( CINT | CFLOAT |id= ID | '(' expr ')' )
			int alt21=4;
			switch ( input.LA(1) ) {
			case CINT:
				{
				alt21=1;
				}
				break;
			case CFLOAT:
				{
				alt21=2;
				}
				break;
			case ID:
				{
				alt21=3;
				}
				break;
			case 35:
				{
				alt21=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// compilador.g:287:5: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom1233); 
					 vType =T_INT; 
					}
					break;
				case 2 :
					// compilador.g:288:5: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atom1254); 
					 vType =T_DOUBLE; 
					}
					break;
				case 3 :
					// compilador.g:289:5: id= ID
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_atom1275); 
					 vType = lookupVarType((id!=null?id.getText():null)); 
					}
					break;
				case 4 :
					// compilador.g:290:5: '(' expr ')'
					{
					match(input,35,FOLLOW_35_in_atom1295); 
					pushFollow(FOLLOW_expr_in_atom1297);
					expr1=expr();
					state._fsp--;

					match(input,36,FOLLOW_36_in_atom1299); 
					 vType =expr1; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vType;
	}
	// $ANTLR end "atom"



	// $ANTLR start "accesmod"
	// compilador.g:294:1: accesmod : ( PUBLIC | PRIVATE | PROTECTED );
	public final void accesmod() throws RecognitionException {
		try {
			// compilador.g:294:9: ( PUBLIC | PRIVATE | PROTECTED )
			// compilador.g:
			{
			if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "accesmod"


	public static class tipo_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tipo"
	// compilador.g:297:1: tipo : ( INT | DOUBLE | VOID );
	public final compiladorParser.tipo_return tipo() throws RecognitionException {
		compiladorParser.tipo_return retval = new compiladorParser.tipo_return();
		retval.start = input.LT(1);

		try {
			// compilador.g:297:6: ( INT | DOUBLE | VOID )
			// compilador.g:
			{
			if ( input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==VOID ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tipo"

	// Delegated rules



	public static final BitSet FOLLOW_classes_in_program20 = new BitSet(new long[]{0x000000001C000002L});
	public static final BitSet FOLLOW_accesmod_in_classes29 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLASS_in_classes31 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_classes35 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_classes59 = new BitSet(new long[]{0x000000001C000020L});
	public static final BitSet FOLLOW_member_in_classes63 = new BitSet(new long[]{0x000000001C000020L});
	public static final BitSet FOLLOW_CCURLYB_in_classes68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment92 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_assignment94 = new BitSet(new long[]{0x00000008000200C0L});
	public static final BitSet FOLLOW_expr_in_assignment98 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assignment100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_member139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_member144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accesmod_in_property163 = new BitSet(new long[]{0x0000000080080800L});
	public static final BitSet FOLLOW_tipo_in_property167 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_property171 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_COMMA_in_property193 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_property197 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_SEMICOLON_in_property204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accesmod_in_method220 = new BitSet(new long[]{0x0000000080080800L});
	public static final BitSet FOLLOW_tipo_in_method224 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_method228 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_method242 = new BitSet(new long[]{0x0000001080080800L});
	public static final BitSet FOLLOW_decl_args_in_method246 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_method249 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_method263 = new BitSet(new long[]{0x00000001800E0820L});
	public static final BitSet FOLLOW_sentences_in_method265 = new BitSet(new long[]{0x00000001800E0820L});
	public static final BitSet FOLLOW_CCURLYB_in_method268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_args294 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_decl_args298 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_decl_args312 = new BitSet(new long[]{0x0000000080080800L});
	public static final BitSet FOLLOW_tipo_in_decl_args316 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_decl_args320 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_tipo_in_decl_local337 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_decl_local341 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_COMMA_in_decl_local360 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_decl_local364 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_SEMICOLON_in_decl_local384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_sentences394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_local_in_sentences399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStmt_in_sentences404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStmt_in_sentences409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStmt420 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_ifStmt422 = new BitSet(new long[]{0x00000008408240C0L});
	public static final BitSet FOLLOW_boolExpr_in_ifStmt426 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_ifStmt428 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_ifStmt442 = new BitSet(new long[]{0x00000001800E0820L});
	public static final BitSet FOLLOW_sentences_in_ifStmt444 = new BitSet(new long[]{0x00000001800E0820L});
	public static final BitSet FOLLOW_CCURLYB_in_ifStmt447 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_ELSE_in_ifStmt461 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_ifStmt463 = new BitSet(new long[]{0x00000001800E0820L});
	public static final BitSet FOLLOW_sentences_in_ifStmt465 = new BitSet(new long[]{0x00000001800E0820L});
	public static final BitSet FOLLOW_CCURLYB_in_ifStmt468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStmt482 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_whileStmt484 = new BitSet(new long[]{0x00000008408240C0L});
	public static final BitSet FOLLOW_boolExpr_in_whileStmt488 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_whileStmt490 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_whileStmt507 = new BitSet(new long[]{0x00000001800E0820L});
	public static final BitSet FOLLOW_sentences_in_whileStmt509 = new BitSet(new long[]{0x00000001800E0820L});
	public static final BitSet FOLLOW_CCURLYB_in_whileStmt512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolAnd_in_boolExpr529 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_OR_in_boolExpr569 = new BitSet(new long[]{0x00000008408240C0L});
	public static final BitSet FOLLOW_boolAnd_in_boolExpr573 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_boolNot_in_boolAnd596 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_boolAnd636 = new BitSet(new long[]{0x00000008408240C0L});
	public static final BitSet FOLLOW_boolNot_in_boolAnd640 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_NOT_in_boolNot661 = new BitSet(new long[]{0x00000008408240C0L});
	public static final BitSet FOLLOW_boolNot_in_boolNot665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolAtom_in_boolNot688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_boolAtom723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_boolAtom753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_boolAtom782 = new BitSet(new long[]{0x00000008408240C0L});
	public static final BitSet FOLLOW_boolExpr_in_boolAtom786 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_boolAtom788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cmpNoParen_in_boolAtom816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprNoParen_in_cmpNoParen861 = new BitSet(new long[]{0x000000000071A000L});
	public static final BitSet FOLLOW_set_in_cmpNoParen865 = new BitSet(new long[]{0x00000008000200C0L});
	public static final BitSet FOLLOW_expr_in_cmpNoParen881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multNoParen_in_exprNoParen907 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_set_in_exprNoParen928 = new BitSet(new long[]{0x00000000000200C0L});
	public static final BitSet FOLLOW_multNoParen_in_exprNoParen936 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_atomNoParen_in_multNoParen960 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_multNoParen981 = new BitSet(new long[]{0x00000000000200C0L});
	public static final BitSet FOLLOW_atomNoParen_in_multNoParen985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CINT_in_atomNoParen1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atomNoParen1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atomNoParen1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr1110 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_set_in_expr1143 = new BitSet(new long[]{0x00000008000200C0L});
	public static final BitSet FOLLOW_multExpr_in_expr1151 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr1172 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_multExpr1210 = new BitSet(new long[]{0x00000008000200C0L});
	public static final BitSet FOLLOW_atom_in_multExpr1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CINT_in_atom1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atom1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_atom1295 = new BitSet(new long[]{0x00000008000200C0L});
	public static final BitSet FOLLOW_expr_in_atom1297 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_atom1299 = new BitSet(new long[]{0x0000000000000002L});
}
