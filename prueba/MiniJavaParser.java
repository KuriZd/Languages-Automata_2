// $ANTLR 3.5.2 MiniJava.g 2025-10-13 01:11:04

    import java.util.HashMap;
    import java.util.LinkedHashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MiniJavaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CCURLYB", "CFLOAT", "CINT", 
		"CLASS", "COMMA", "DOT", "DOUBLE", "ELSE", "EQ", "FALSE", "GE", "GT", 
		"ID", "IF", "INT", "LE", "LT", "NE", "NOT", "OCURLYB", "OR", "PRIVATE", 
		"PROTECTED", "PUBLIC", "SEMICOLON", "TRUE", "VOID", "WHILE", "WS", "'('", 
		"')'", "'*'", "'+'", "'-'", "'/'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
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


	public MiniJavaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MiniJavaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MiniJavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "MiniJava.g"; }


	    static final int T_INT=1, T_DOUBLE=2, T_MIXED=3, T_BOOL=4;

	    // --- Tablas de símbolos ---
	    HashMap<String,Integer> SymT = new HashMap<>();                 // Local por método
	    HashMap<String,ClassInfo> SymTG = new HashMap<>();              // Global

	    // Clase -> { atributos, metodos }
	    static class ClassInfo {
	        String name;
	        HashMap<String,Integer> attributes = new HashMap<>();
	        HashMap<String,MethodInfo> methods = new HashMap<>();
	        ClassInfo(String n){ this.name=n; }
	    }

	    static class MethodInfo {
	        String name;
	        int returnType;
	        LinkedHashMap<String,Integer> params = new LinkedHashMap<>();
	        HashMap<String,Integer> locals = new HashMap<>();
	        MethodInfo(String n,int rt){ name=n; returnType=rt; }
	    }

	    String currentClass = null;
	    MethodInfo currentMethod = null;

	    private javax.swing.JTextArea salida;
	    public void setSalida(javax.swing.JTextArea ta){ this.salida = ta; }
	    private void log(String s){ if(salida!=null) salida.append("\n"+s); }

	    private int strTypeToInt(String t){
	        if("int".equals(t)) return T_INT;
	        if("double".equals(t)) return T_DOUBLE;
	        // if("void".equals(t)) return T_VOID; // no lo usamos para variables
	        return T_MIXED;
	    }

	    private void pushClass(String name){
	        if(SymTG.containsKey(name)){
	            log("[ERR] Clase redeclarada: "+name);
	        } else {
	            SymTG.put(name,new ClassInfo(name));
	            log("[OK] Clase registrada: "+name);
	        }
	    }

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

	    private int lookupVarType(String id){
	        Integer t = SymT.get(id);
	        if(t != null) return t;
	        if(currentClass != null){
	            ClassInfo C = SymTG.get(currentClass);
	            if(C != null){
	                Integer ta = C.attributes.get(id);
	                if(ta != null) return ta;
	            }
	        }
	        log("[ERR] Uso de variable no declarada: " + id);
	        return T_MIXED;
	    }

	    private int ensureBool(String ctx, int t){
	        if(t!=T_BOOL){
	            log("[ERR] La condición de "+ctx+" debe ser booleana, no de tipo "+t);
	            return T_MIXED;
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

	    // --- (Opcional) promoción int→double para expresiones/comparaciones ---
	    private int promote(int a, int b){
	        if(a==T_DOUBLE || b==T_DOUBLE) return T_DOUBLE;
	        if(a==T_INT && b==T_INT) return T_INT;
	        return T_MIXED;
	    }



	// $ANTLR start "program"
	// MiniJava.g:134:1: program : ( classes )+ ;
	public final void program() throws RecognitionException {
		try {
			// MiniJava.g:134:8: ( ( classes )+ )
			// MiniJava.g:134:10: ( classes )+
			{
			// MiniJava.g:134:10: ( classes )+
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
					// MiniJava.g:134:10: classes
					{
					pushFollow(FOLLOW_classes_in_program18);
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
	// MiniJava.g:136:1: classes : accesmod CLASS id= ID OCURLYB ( member )* CCURLYB ;
	public final void classes() throws RecognitionException {
		Token id=null;

		try {
			// MiniJava.g:137:5: ( accesmod CLASS id= ID OCURLYB ( member )* CCURLYB )
			// MiniJava.g:137:7: accesmod CLASS id= ID OCURLYB ( member )* CCURLYB
			{
			pushFollow(FOLLOW_accesmod_in_classes31);
			accesmod();
			state._fsp--;

			match(input,CLASS,FOLLOW_CLASS_in_classes33); 
			id=(Token)match(input,ID,FOLLOW_ID_in_classes37); 
			 currentClass = (id!=null?id.getText():null); pushClass(currentClass); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_classes53); 
			// MiniJava.g:139:15: ( member )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// MiniJava.g:139:17: member
					{
					pushFollow(FOLLOW_member_in_classes57);
					member();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_classes62); 
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



	// $ANTLR start "member"
	// MiniJava.g:143:1: member : ( method | property );
	public final void member() throws RecognitionException {
		try {
			// MiniJava.g:143:8: ( method | property )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DOUBLE||LA3_1==INT) ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2==ID) ) {
						int LA3_4 = input.LA(4);
						if ( (LA3_4==34) ) {
							alt3=1;
						}
						else if ( (LA3_4==COMMA||LA3_4==SEMICOLON) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 4, input);
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
				else if ( (LA3_1==VOID) ) {
					alt3=1;
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
					// MiniJava.g:143:10: method
					{
					pushFollow(FOLLOW_method_in_member83);
					method();
					state._fsp--;

					}
					break;
				case 2 :
					// MiniJava.g:143:19: property
					{
					pushFollow(FOLLOW_property_in_member87);
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
	// MiniJava.g:147:1: property : accesmod t= tipoVar id1= ID ( COMMA id2= ID )* SEMICOLON ;
	public final void property() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope t =null;

		try {
			// MiniJava.g:148:5: ( accesmod t= tipoVar id1= ID ( COMMA id2= ID )* SEMICOLON )
			// MiniJava.g:148:7: accesmod t= tipoVar id1= ID ( COMMA id2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_accesmod_in_property102);
			accesmod();
			state._fsp--;

			pushFollow(FOLLOW_tipoVar_in_property106);
			t=tipoVar();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_property110); 
			 pushAttribute((id1!=null?id1.getText():null), (t!=null?input.toString(t.start,t.stop):null)); 
			// MiniJava.g:149:7: ( COMMA id2= ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// MiniJava.g:149:9: COMMA id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_property122); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_property126); 
					 pushAttribute((id2!=null?id2.getText():null), (t!=null?input.toString(t.start,t.stop):null)); 
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_property139); 
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
	// MiniJava.g:155:1: method : accesmod t= tipoRet m= ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB ;
	public final void method() throws RecognitionException {
		Token m=null;
		ParserRuleReturnScope t =null;

		try {
			// MiniJava.g:156:5: ( accesmod t= tipoRet m= ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB )
			// MiniJava.g:156:7: accesmod t= tipoRet m= ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB
			{
			pushFollow(FOLLOW_accesmod_in_method158);
			accesmod();
			state._fsp--;

			pushFollow(FOLLOW_tipoRet_in_method162);
			t=tipoRet();
			state._fsp--;

			m=(Token)match(input,ID,FOLLOW_ID_in_method166); 
			match(input,34,FOLLOW_34_in_method174); 
			 pushMethod((m!=null?m.getText():null), (t!=null?input.toString(t.start,t.stop):null)); 
			// MiniJava.g:157:45: ( decl_args )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DOUBLE||LA5_0==INT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// MiniJava.g:157:45: decl_args
					{
					pushFollow(FOLLOW_decl_args_in_method178);
					decl_args();
					state._fsp--;

					}
					break;

			}

			match(input,35,FOLLOW_35_in_method181); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_method189); 
			// MiniJava.g:158:15: ( sentences )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DOUBLE||(LA6_0 >= ID && LA6_0 <= INT)||LA6_0==WHILE) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// MiniJava.g:158:15: sentences
					{
					pushFollow(FOLLOW_sentences_in_method191);
					sentences();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_method194); 
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
	// MiniJava.g:162:1: decl_args : t1= tipoVar id1= ID ( COMMA t2= tipoVar id2= ID )* ;
	public final void decl_args() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try {
			// MiniJava.g:163:5: (t1= tipoVar id1= ID ( COMMA t2= tipoVar id2= ID )* )
			// MiniJava.g:163:7: t1= tipoVar id1= ID ( COMMA t2= tipoVar id2= ID )*
			{
			pushFollow(FOLLOW_tipoVar_in_decl_args221);
			t1=tipoVar();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_args225); 

			          pushLocal((id1!=null?id1.getText():null), (t1!=null?input.toString(t1.start,t1.stop):null));
			          if(currentMethod!=null) currentMethod.params.put((id1!=null?id1.getText():null), strTypeToInt((t1!=null?input.toString(t1.start,t1.stop):null)));
			      
			// MiniJava.g:167:7: ( COMMA t2= tipoVar id2= ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// MiniJava.g:167:9: COMMA t2= tipoVar id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_args237); 
					pushFollow(FOLLOW_tipoVar_in_decl_args241);
					t2=tipoVar();
					state._fsp--;

					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_args245); 

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
	// MiniJava.g:173:1: decl_local : t= tipoVar id1= ID ( COMMA id2= ID )* SEMICOLON ;
	public final void decl_local() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope t =null;

		try {
			// MiniJava.g:174:5: (t= tipoVar id1= ID ( COMMA id2= ID )* SEMICOLON )
			// MiniJava.g:174:7: t= tipoVar id1= ID ( COMMA id2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_tipoVar_in_decl_local269);
			t=tipoVar();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_local273); 
			 pushLocal((id1!=null?id1.getText():null), (t!=null?input.toString(t.start,t.stop):null)); 
			// MiniJava.g:175:7: ( COMMA id2= ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// MiniJava.g:175:9: COMMA id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_local285); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_local289); 
					 pushLocal((id2!=null?id2.getText():null), (t!=null?input.toString(t.start,t.stop):null)); 
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_local302); 
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
	// MiniJava.g:179:1: sentences : ( assignment | decl_local | ifStmt | whileStmt );
	public final void sentences() throws RecognitionException {
		try {
			// MiniJava.g:179:12: ( assignment | decl_local | ifStmt | whileStmt )
			int alt9=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt9=1;
				}
				break;
			case DOUBLE:
			case INT:
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
					// MiniJava.g:179:14: assignment
					{
					pushFollow(FOLLOW_assignment_in_sentences316);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// MiniJava.g:179:27: decl_local
					{
					pushFollow(FOLLOW_decl_local_in_sentences320);
					decl_local();
					state._fsp--;

					}
					break;
				case 3 :
					// MiniJava.g:179:40: ifStmt
					{
					pushFollow(FOLLOW_ifStmt_in_sentences324);
					ifStmt();
					state._fsp--;

					}
					break;
				case 4 :
					// MiniJava.g:179:49: whileStmt
					{
					pushFollow(FOLLOW_whileStmt_in_sentences328);
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



	// $ANTLR start "assignment"
	// MiniJava.g:181:1: assignment : lhs= ID '=' e= expr SEMICOLON ;
	public final void assignment() throws RecognitionException {
		Token lhs=null;
		int e =0;

		try {
			// MiniJava.g:182:5: (lhs= ID '=' e= expr SEMICOLON )
			// MiniJava.g:182:7: lhs= ID '=' e= expr SEMICOLON
			{
			lhs=(Token)match(input,ID,FOLLOW_ID_in_assignment343); 
			match(input,40,FOLLOW_40_in_assignment345); 
			pushFollow(FOLLOW_expr_in_assignment349);
			e=expr();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignment351); 

			        int lt = lookupVarType((lhs!=null?lhs.getText():null));
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



	// $ANTLR start "ifStmt"
	// MiniJava.g:193:1: ifStmt : IF '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB ( ELSE OCURLYB ( sentences )* CCURLYB )? ;
	public final void ifStmt() throws RecognitionException {
		int c =0;

		try {
			// MiniJava.g:194:3: ( IF '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB ( ELSE OCURLYB ( sentences )* CCURLYB )? )
			// MiniJava.g:194:5: IF '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB ( ELSE OCURLYB ( sentences )* CCURLYB )?
			{
			match(input,IF,FOLLOW_IF_in_ifStmt375); 
			match(input,34,FOLLOW_34_in_ifStmt377); 
			pushFollow(FOLLOW_boolExpr_in_ifStmt381);
			c=boolExpr();
			state._fsp--;

			match(input,35,FOLLOW_35_in_ifStmt383); 
			 ensureBool("if", c); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_ifStmt391); 
			// MiniJava.g:195:13: ( sentences )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==DOUBLE||(LA10_0 >= ID && LA10_0 <= INT)||LA10_0==WHILE) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// MiniJava.g:195:13: sentences
					{
					pushFollow(FOLLOW_sentences_in_ifStmt393);
					sentences();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_ifStmt396); 
			// MiniJava.g:196:5: ( ELSE OCURLYB ( sentences )* CCURLYB )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ELSE) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// MiniJava.g:196:7: ELSE OCURLYB ( sentences )* CCURLYB
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStmt404); 
					match(input,OCURLYB,FOLLOW_OCURLYB_in_ifStmt406); 
					// MiniJava.g:196:20: ( sentences )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==DOUBLE||(LA11_0 >= ID && LA11_0 <= INT)||LA11_0==WHILE) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// MiniJava.g:196:20: sentences
							{
							pushFollow(FOLLOW_sentences_in_ifStmt408);
							sentences();
							state._fsp--;

							}
							break;

						default :
							break loop11;
						}
					}

					match(input,CCURLYB,FOLLOW_CCURLYB_in_ifStmt411); 
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
	// MiniJava.g:199:1: whileStmt : WHILE '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB ;
	public final void whileStmt() throws RecognitionException {
		int c =0;

		try {
			// MiniJava.g:200:3: ( WHILE '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB )
			// MiniJava.g:200:5: WHILE '(' c= boolExpr ')' OCURLYB ( sentences )* CCURLYB
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStmt427); 
			match(input,34,FOLLOW_34_in_whileStmt429); 
			pushFollow(FOLLOW_boolExpr_in_whileStmt433);
			c=boolExpr();
			state._fsp--;

			match(input,35,FOLLOW_35_in_whileStmt435); 
			 ensureBool("while", c); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_whileStmt443); 
			// MiniJava.g:201:13: ( sentences )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DOUBLE||(LA13_0 >= ID && LA13_0 <= INT)||LA13_0==WHILE) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// MiniJava.g:201:13: sentences
					{
					pushFollow(FOLLOW_sentences_in_whileStmt445);
					sentences();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_whileStmt448); 
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
	// MiniJava.g:204:1: boolExpr returns [int vType] : a= boolAnd ( OR b= boolAnd )* ;
	public final int boolExpr() throws RecognitionException {
		int vType = 0;


		int a =0;
		int b =0;

		try {
			// MiniJava.g:205:3: (a= boolAnd ( OR b= boolAnd )* )
			// MiniJava.g:205:5: a= boolAnd ( OR b= boolAnd )*
			{
			pushFollow(FOLLOW_boolAnd_in_boolExpr467);
			a=boolAnd();
			state._fsp--;

			 vType = a; 
			// MiniJava.g:206:5: ( OR b= boolAnd )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==OR) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// MiniJava.g:206:7: OR b= boolAnd
					{
					match(input,OR,FOLLOW_OR_in_boolExpr488); 
					pushFollow(FOLLOW_boolAnd_in_boolExpr492);
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
	// MiniJava.g:209:1: boolAnd returns [int vType] : a= boolNot ( AND b= boolNot )* ;
	public final int boolAnd() throws RecognitionException {
		int vType = 0;


		int a =0;
		int b =0;

		try {
			// MiniJava.g:210:3: (a= boolNot ( AND b= boolNot )* )
			// MiniJava.g:210:5: a= boolNot ( AND b= boolNot )*
			{
			pushFollow(FOLLOW_boolNot_in_boolAnd522);
			a=boolNot();
			state._fsp--;

			 vType = a; 
			// MiniJava.g:211:5: ( AND b= boolNot )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==AND) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// MiniJava.g:211:7: AND b= boolNot
					{
					match(input,AND,FOLLOW_AND_in_boolAnd543); 
					pushFollow(FOLLOW_boolNot_in_boolAnd547);
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
	// MiniJava.g:214:1: boolNot returns [int vType] : ( NOT x= boolNot |x= boolAtom );
	public final int boolNot() throws RecognitionException {
		int vType = 0;


		int x =0;

		try {
			// MiniJava.g:215:3: ( NOT x= boolNot |x= boolAtom )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==NOT) ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= CFLOAT && LA16_0 <= CINT)||LA16_0==FALSE||LA16_0==ID||LA16_0==TRUE||LA16_0==34) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// MiniJava.g:215:5: NOT x= boolNot
					{
					match(input,NOT,FOLLOW_NOT_in_boolNot574); 
					pushFollow(FOLLOW_boolNot_in_boolNot578);
					x=boolNot();
					state._fsp--;

					 vType = ensureBool("NOT", x); 
					}
					break;
				case 2 :
					// MiniJava.g:216:5: x= boolAtom
					{
					pushFollow(FOLLOW_boolAtom_in_boolNot595);
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
	// MiniJava.g:219:1: boolAtom returns [int vType] : ( TRUE | FALSE | '(' b= boolExpr ')' |c= cmpNoParen );
	public final int boolAtom() throws RecognitionException {
		int vType = 0;


		int b =0;
		int c =0;

		try {
			// MiniJava.g:220:3: ( TRUE | FALSE | '(' b= boolExpr ')' |c= cmpNoParen )
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
			case 34:
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
					// MiniJava.g:220:5: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_boolAtom624); 
					 vType = T_BOOL; 
					}
					break;
				case 2 :
					// MiniJava.g:221:5: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_boolAtom648); 
					 vType = T_BOOL; 
					}
					break;
				case 3 :
					// MiniJava.g:222:5: '(' b= boolExpr ')'
					{
					match(input,34,FOLLOW_34_in_boolAtom671); 
					pushFollow(FOLLOW_boolExpr_in_boolAtom675);
					b=boolExpr();
					state._fsp--;

					match(input,35,FOLLOW_35_in_boolAtom677); 
					 vType = b; 
					}
					break;
				case 4 :
					// MiniJava.g:223:5: c= cmpNoParen
					{
					pushFollow(FOLLOW_cmpNoParen_in_boolAtom689);
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
	// MiniJava.g:226:1: cmpNoParen returns [int vType] : a= exprNoParen op= ( EQ | NE | LE | GE | LT | GT ) b= expr ;
	public final int cmpNoParen() throws RecognitionException {
		int vType = 0;


		Token op=null;
		int a =0;
		int b =0;

		try {
			// MiniJava.g:227:3: (a= exprNoParen op= ( EQ | NE | LE | GE | LT | GT ) b= expr )
			// MiniJava.g:227:5: a= exprNoParen op= ( EQ | NE | LE | GE | LT | GT ) b= expr
			{
			pushFollow(FOLLOW_exprNoParen_in_cmpNoParen718);
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
			pushFollow(FOLLOW_expr_in_cmpNoParen738);
			b=expr();
			state._fsp--;


			      // *** Igualdad/desigualdad y comparadores solo entre numéricos homogéneos;
			      // si quieres permitir int vs double, usa promote(a,b) y sigue devolviendo T_BOOL.
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
	// MiniJava.g:242:1: exprNoParen returns [int vType] : m1= multNoParen ( ( '+' | '-' ) m2= multNoParen )* ;
	public final int exprNoParen() throws RecognitionException {
		int vType = 0;


		int m1 =0;
		int m2 =0;

		try {
			// MiniJava.g:243:3: (m1= multNoParen ( ( '+' | '-' ) m2= multNoParen )* )
			// MiniJava.g:243:5: m1= multNoParen ( ( '+' | '-' ) m2= multNoParen )*
			{
			pushFollow(FOLLOW_multNoParen_in_exprNoParen764);
			m1=multNoParen();
			state._fsp--;

			 vType = m1; 
			// MiniJava.g:244:5: ( ( '+' | '-' ) m2= multNoParen )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= 37 && LA18_0 <= 38)) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// MiniJava.g:244:7: ( '+' | '-' ) m2= multNoParen
					{
					if ( (input.LA(1) >= 37 && input.LA(1) <= 38) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multNoParen_in_exprNoParen792);
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
	// MiniJava.g:247:1: multNoParen returns [int vType] : a1= atomNoParen ( ( '*' | '/' ) a2= atomNoParen )* ;
	public final int multNoParen() throws RecognitionException {
		int vType = 0;


		int a1 =0;
		int a2 =0;

		try {
			// MiniJava.g:248:3: (a1= atomNoParen ( ( '*' | '/' ) a2= atomNoParen )* )
			// MiniJava.g:248:5: a1= atomNoParen ( ( '*' | '/' ) a2= atomNoParen )*
			{
			pushFollow(FOLLOW_atomNoParen_in_multNoParen816);
			a1=atomNoParen();
			state._fsp--;

			 vType = a1; 
			// MiniJava.g:249:5: ( ( '*' | '/' ) a2= atomNoParen )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==36||LA19_0==39) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// MiniJava.g:249:7: ( '*' | '/' ) a2= atomNoParen
					{
					if ( input.LA(1)==36||input.LA(1)==39 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atomNoParen_in_multNoParen844);
					a2=atomNoParen();
					state._fsp--;

					 vType = mixTypes(vType, a2, "Multiplicación"); 
					}
					break;

				default :
					break loop19;
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
	// $ANTLR end "multNoParen"



	// $ANTLR start "atomNoParen"
	// MiniJava.g:252:1: atomNoParen returns [int vType] : ( CINT | CFLOAT |id= ID );
	public final int atomNoParen() throws RecognitionException {
		int vType = 0;


		Token id=null;

		try {
			// MiniJava.g:253:3: ( CINT | CFLOAT |id= ID )
			int alt20=3;
			switch ( input.LA(1) ) {
			case CINT:
				{
				alt20=1;
				}
				break;
			case CFLOAT:
				{
				alt20=2;
				}
				break;
			case ID:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// MiniJava.g:253:5: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atomNoParen866); 
					 vType = T_INT; 
					}
					break;
				case 2 :
					// MiniJava.g:254:5: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atomNoParen894); 
					 vType = T_DOUBLE; 
					}
					break;
				case 3 :
					// MiniJava.g:255:5: id= ID
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_atomNoParen922); 
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
	// MiniJava.g:259:1: expr returns [int vType] : m1= multExpr ( ( '+' | '-' ) m2= multExpr )* ;
	public final int expr() throws RecognitionException {
		int vType = 0;


		int m1 =0;
		int m2 =0;

		try {
			// MiniJava.g:260:3: (m1= multExpr ( ( '+' | '-' ) m2= multExpr )* )
			// MiniJava.g:260:5: m1= multExpr ( ( '+' | '-' ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr963);
			m1=multExpr();
			state._fsp--;

			 vType =m1; 
			// MiniJava.g:261:5: ( ( '+' | '-' ) m2= multExpr )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= 37 && LA21_0 <= 38)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// MiniJava.g:261:7: ( '+' | '-' ) m2= multExpr
					{
					if ( (input.LA(1) >= 37 && input.LA(1) <= 38) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr994);
					m2=multExpr();
					state._fsp--;

					 vType = mixTypes(vType, m2, "Suma/Resta"); 
					}
					break;

				default :
					break loop21;
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
	// MiniJava.g:264:1: multExpr returns [int vType] : a1= atom ( ( '*' | '/' ) a2= atom )* ;
	public final int multExpr() throws RecognitionException {
		int vType = 0;


		int a1 =0;
		int a2 =0;

		try {
			// MiniJava.g:265:3: (a1= atom ( ( '*' | '/' ) a2= atom )* )
			// MiniJava.g:265:5: a1= atom ( ( '*' | '/' ) a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr1019);
			a1=atom();
			state._fsp--;

			 vType =a1; 
			// MiniJava.g:266:5: ( ( '*' | '/' ) a2= atom )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==36||LA22_0==39) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// MiniJava.g:266:7: ( '*' | '/' ) a2= atom
					{
					if ( input.LA(1)==36||input.LA(1)==39 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multExpr1054);
					a2=atom();
					state._fsp--;

					 vType = mixTypes(vType, a2, "Multiplicación"); 
					}
					break;

				default :
					break loop22;
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
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// MiniJava.g:269:1: atom returns [int vType] : ( CINT | CFLOAT |id= ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int vType = 0;


		Token id=null;
		int expr1 =0;

		try {
			// MiniJava.g:270:3: ( CINT | CFLOAT |id= ID | '(' expr ')' )
			int alt23=4;
			switch ( input.LA(1) ) {
			case CINT:
				{
				alt23=1;
				}
				break;
			case CFLOAT:
				{
				alt23=2;
				}
				break;
			case ID:
				{
				alt23=3;
				}
				break;
			case 34:
				{
				alt23=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// MiniJava.g:270:5: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom1081); 
					 vType =T_INT; 
					}
					break;
				case 2 :
					// MiniJava.g:271:5: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atom1109); 
					 vType =T_DOUBLE; 
					}
					break;
				case 3 :
					// MiniJava.g:272:5: id= ID
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_atom1137); 
					 vType = lookupVarType((id!=null?id.getText():null)); 
					}
					break;
				case 4 :
					// MiniJava.g:273:5: '(' expr ')'
					{
					match(input,34,FOLLOW_34_in_atom1164); 
					pushFollow(FOLLOW_expr_in_atom1166);
					expr1=expr();
					state._fsp--;

					match(input,35,FOLLOW_35_in_atom1168); 
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
	// MiniJava.g:277:1: accesmod : ( PUBLIC | PRIVATE | PROTECTED );
	public final void accesmod() throws RecognitionException {
		try {
			// MiniJava.g:277:10: ( PUBLIC | PRIVATE | PROTECTED )
			// MiniJava.g:
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


	public static class tipoVar_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tipoVar"
	// MiniJava.g:280:1: tipoVar : ( INT | DOUBLE );
	public final MiniJavaParser.tipoVar_return tipoVar() throws RecognitionException {
		MiniJavaParser.tipoVar_return retval = new MiniJavaParser.tipoVar_return();
		retval.start = input.LT(1);

		try {
			// MiniJava.g:280:10: ( INT | DOUBLE )
			// MiniJava.g:
			{
			if ( input.LA(1)==DOUBLE||input.LA(1)==INT ) {
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
	// $ANTLR end "tipoVar"


	public static class tipoRet_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tipoRet"
	// MiniJava.g:281:1: tipoRet : ( INT | DOUBLE | VOID );
	public final MiniJavaParser.tipoRet_return tipoRet() throws RecognitionException {
		MiniJavaParser.tipoRet_return retval = new MiniJavaParser.tipoRet_return();
		retval.start = input.LT(1);

		try {
			// MiniJava.g:281:10: ( INT | DOUBLE | VOID )
			// MiniJava.g:
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
	// $ANTLR end "tipoRet"

	// Delegated rules



	public static final BitSet FOLLOW_classes_in_program18 = new BitSet(new long[]{0x000000001C000002L});
	public static final BitSet FOLLOW_accesmod_in_classes31 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLASS_in_classes33 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_classes37 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_classes53 = new BitSet(new long[]{0x000000001C000020L});
	public static final BitSet FOLLOW_member_in_classes57 = new BitSet(new long[]{0x000000001C000020L});
	public static final BitSet FOLLOW_CCURLYB_in_classes62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_member83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_member87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accesmod_in_property102 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_tipoVar_in_property106 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_property110 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_COMMA_in_property122 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_property126 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_SEMICOLON_in_property139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accesmod_in_method158 = new BitSet(new long[]{0x0000000080080800L});
	public static final BitSet FOLLOW_tipoRet_in_method162 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_method166 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_method174 = new BitSet(new long[]{0x0000000800080800L});
	public static final BitSet FOLLOW_decl_args_in_method178 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_method181 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_method189 = new BitSet(new long[]{0x00000001000E0820L});
	public static final BitSet FOLLOW_sentences_in_method191 = new BitSet(new long[]{0x00000001000E0820L});
	public static final BitSet FOLLOW_CCURLYB_in_method194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipoVar_in_decl_args221 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_decl_args225 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_decl_args237 = new BitSet(new long[]{0x0000000000080800L});
	public static final BitSet FOLLOW_tipoVar_in_decl_args241 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_decl_args245 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_tipoVar_in_decl_local269 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_decl_local273 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_COMMA_in_decl_local285 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_decl_local289 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_SEMICOLON_in_decl_local302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_sentences316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_local_in_sentences320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStmt_in_sentences324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStmt_in_sentences328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment343 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_assignment345 = new BitSet(new long[]{0x00000004000200C0L});
	public static final BitSet FOLLOW_expr_in_assignment349 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assignment351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStmt375 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_ifStmt377 = new BitSet(new long[]{0x00000004408240C0L});
	public static final BitSet FOLLOW_boolExpr_in_ifStmt381 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_ifStmt383 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_ifStmt391 = new BitSet(new long[]{0x00000001000E0820L});
	public static final BitSet FOLLOW_sentences_in_ifStmt393 = new BitSet(new long[]{0x00000001000E0820L});
	public static final BitSet FOLLOW_CCURLYB_in_ifStmt396 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_ELSE_in_ifStmt404 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_ifStmt406 = new BitSet(new long[]{0x00000001000E0820L});
	public static final BitSet FOLLOW_sentences_in_ifStmt408 = new BitSet(new long[]{0x00000001000E0820L});
	public static final BitSet FOLLOW_CCURLYB_in_ifStmt411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStmt427 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_whileStmt429 = new BitSet(new long[]{0x00000004408240C0L});
	public static final BitSet FOLLOW_boolExpr_in_whileStmt433 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_whileStmt435 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_OCURLYB_in_whileStmt443 = new BitSet(new long[]{0x00000001000E0820L});
	public static final BitSet FOLLOW_sentences_in_whileStmt445 = new BitSet(new long[]{0x00000001000E0820L});
	public static final BitSet FOLLOW_CCURLYB_in_whileStmt448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolAnd_in_boolExpr467 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_OR_in_boolExpr488 = new BitSet(new long[]{0x00000004408240C0L});
	public static final BitSet FOLLOW_boolAnd_in_boolExpr492 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_boolNot_in_boolAnd522 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_boolAnd543 = new BitSet(new long[]{0x00000004408240C0L});
	public static final BitSet FOLLOW_boolNot_in_boolAnd547 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_NOT_in_boolNot574 = new BitSet(new long[]{0x00000004408240C0L});
	public static final BitSet FOLLOW_boolNot_in_boolNot578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolAtom_in_boolNot595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_boolAtom624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_boolAtom648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_boolAtom671 = new BitSet(new long[]{0x00000004408240C0L});
	public static final BitSet FOLLOW_boolExpr_in_boolAtom675 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_boolAtom677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cmpNoParen_in_boolAtom689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprNoParen_in_cmpNoParen718 = new BitSet(new long[]{0x000000000071A000L});
	public static final BitSet FOLLOW_set_in_cmpNoParen722 = new BitSet(new long[]{0x00000004000200C0L});
	public static final BitSet FOLLOW_expr_in_cmpNoParen738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multNoParen_in_exprNoParen764 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_set_in_exprNoParen784 = new BitSet(new long[]{0x00000000000200C0L});
	public static final BitSet FOLLOW_multNoParen_in_exprNoParen792 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_atomNoParen_in_multNoParen816 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_set_in_multNoParen836 = new BitSet(new long[]{0x00000000000200C0L});
	public static final BitSet FOLLOW_atomNoParen_in_multNoParen844 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_CINT_in_atomNoParen866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atomNoParen894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atomNoParen922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr963 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_set_in_expr986 = new BitSet(new long[]{0x00000004000200C0L});
	public static final BitSet FOLLOW_multExpr_in_expr994 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr1019 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_set_in_multExpr1046 = new BitSet(new long[]{0x00000004000200C0L});
	public static final BitSet FOLLOW_atom_in_multExpr1054 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_CINT_in_atom1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atom1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_atom1164 = new BitSet(new long[]{0x00000004000200C0L});
	public static final BitSet FOLLOW_expr_in_atom1166 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_atom1168 = new BitSet(new long[]{0x0000000000000002L});
}
