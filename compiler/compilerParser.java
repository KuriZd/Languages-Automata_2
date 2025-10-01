// $ANTLR 3.5.2 compiler.g 2025-10-01 01:44:36

    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CCURLYB", "CFLOAT", "CINT", "CLASS", 
		"COMMA", "DOT", "DOUBLE", "ID", "INT", "OCURLYB", "PRIVATE", "PROTECTED", 
		"PUBLIC", "SEMICOLON", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int CCURLYB=4;
	public static final int CFLOAT=5;
	public static final int CINT=6;
	public static final int CLASS=7;
	public static final int COMMA=8;
	public static final int DOT=9;
	public static final int DOUBLE=10;
	public static final int ID=11;
	public static final int INT=12;
	public static final int OCURLYB=13;
	public static final int PRIVATE=14;
	public static final int PROTECTED=15;
	public static final int PUBLIC=16;
	public static final int SEMICOLON=17;
	public static final int WS=18;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public compilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public compilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return compilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "compiler.g"; }


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



	// $ANTLR start "program"
	// compiler.g:39:1: program : ( classes )+ ;
	public final void program() throws RecognitionException {
		try {
			// compiler.g:39:8: ( ( classes )+ )
			// compiler.g:39:10: ( classes )+
			{
			// compiler.g:39:10: ( classes )+
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
					// compiler.g:39:10: classes
					{
					pushFollow(FOLLOW_classes_in_program19);
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
	// compiler.g:41:1: classes : accesmod CLASS ID OCURLYB ( member )* CCURLYB ;
	public final void classes() throws RecognitionException {
		try {
			// compiler.g:41:8: ( accesmod CLASS ID OCURLYB ( member )* CCURLYB )
			// compiler.g:41:10: accesmod CLASS ID OCURLYB ( member )* CCURLYB
			{
			pushFollow(FOLLOW_accesmod_in_classes27);
			accesmod();
			state._fsp--;

			match(input,CLASS,FOLLOW_CLASS_in_classes29); 
			match(input,ID,FOLLOW_ID_in_classes31); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_classes54); 
			// compiler.g:43:25: ( member )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// compiler.g:43:25: member
					{
					pushFollow(FOLLOW_member_in_classes81);
					member();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_classes104); 
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
	// compiler.g:45:1: assignment : ID '=' expr SEMICOLON ;
	public final void assignment() throws RecognitionException {
		int expr1 =0;

		try {
			// compiler.g:45:13: ( ID '=' expr SEMICOLON )
			// compiler.g:45:21: ID '=' expr SEMICOLON
			{
			match(input,ID,FOLLOW_ID_in_assignment118); 
			match(input,24,FOLLOW_24_in_assignment120); 
			pushFollow(FOLLOW_expr_in_assignment122);
			expr1=expr();
			state._fsp--;

			 System.out.println("Tipo de expr es: "+expr1);
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignment167); 
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
	// compiler.g:49:1: member : ( method | property );
	public final void member() throws RecognitionException {
		try {
			// compiler.g:49:13: ( method | property )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DOUBLE||LA3_1==INT) ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2==ID) ) {
						int LA3_3 = input.LA(4);
						if ( (LA3_3==19) ) {
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
					// compiler.g:49:21: method
					{
					pushFollow(FOLLOW_method_in_member187);
					method();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:49:31: property
					{
					pushFollow(FOLLOW_property_in_member192);
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
	// compiler.g:51:1: property : accesmod tipo ID ( COMMA ID )* SEMICOLON ;
	public final void property() throws RecognitionException {
		try {
			// compiler.g:51:13: ( accesmod tipo ID ( COMMA ID )* SEMICOLON )
			// compiler.g:51:21: accesmod tipo ID ( COMMA ID )* SEMICOLON
			{
			pushFollow(FOLLOW_accesmod_in_property211);
			accesmod();
			state._fsp--;

			pushFollow(FOLLOW_tipo_in_property213);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_property215); 
			// compiler.g:51:38: ( COMMA ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// compiler.g:51:40: COMMA ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_property219); 
					match(input,ID,FOLLOW_ID_in_property221); 
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_property225); 
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
	// compiler.g:53:1: method : accesmod tipo ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB ;
	public final void method() throws RecognitionException {
		try {
			// compiler.g:53:13: ( accesmod tipo ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB )
			// compiler.g:53:21: accesmod tipo ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB
			{
			pushFollow(FOLLOW_accesmod_in_method264);
			accesmod();
			state._fsp--;

			pushFollow(FOLLOW_tipo_in_method266);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_method268); 
			match(input,19,FOLLOW_19_in_method270); 
			// compiler.g:53:42: ( decl_args )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DOUBLE||LA5_0==INT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// compiler.g:53:42: decl_args
					{
					pushFollow(FOLLOW_decl_args_in_method272);
					decl_args();
					state._fsp--;

					}
					break;

			}

			match(input,20,FOLLOW_20_in_method277); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_method316); 
			// compiler.g:55:41: ( sentences )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= DOUBLE && LA6_0 <= INT)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// compiler.g:55:41: sentences
					{
					pushFollow(FOLLOW_sentences_in_method358);
					sentences();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_method397); 
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
	// compiler.g:58:1: decl_args : t1= tipo id1= ID ( COMMA t2= tipo id2= ID )* ;
	public final void decl_args() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try {
			// compiler.g:58:13: (t1= tipo id1= ID ( COMMA t2= tipo id2= ID )* )
			// compiler.g:58:21: t1= tipo id1= ID ( COMMA t2= tipo id2= ID )*
			{
			pushFollow(FOLLOW_tipo_in_decl_args427);
			t1=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_args431); 
			pushID((id1!=null?id1.getText():null), (t1!=null?input.toString(t1.start,t1.stop):null));
			// compiler.g:59:25: ( COMMA t2= tipo id2= ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// compiler.g:59:26: COMMA t2= tipo id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_args460); 
					pushFollow(FOLLOW_tipo_in_decl_args464);
					t2=tipo();
					state._fsp--;

					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_args468); 
					pushID((id2!=null?id2.getText():null), (t2!=null?input.toString(t2.start,t2.stop):null));
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
	// compiler.g:60:1: decl_local : tipo id1= ID ( COMMA id2= ID )* SEMICOLON ;
	public final void decl_local() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo2 =null;

		try {
			// compiler.g:60:13: ( tipo id1= ID ( COMMA id2= ID )* SEMICOLON )
			// compiler.g:60:21: tipo id1= ID ( COMMA id2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_tipo_in_decl_local486);
			tipo2=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_local490); 
			pushID((id1!=null?id1.getText():null), (tipo2!=null?input.toString(tipo2.start,tipo2.stop):null));
			// compiler.g:61:25: ( COMMA id2= ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// compiler.g:61:26: COMMA id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_local520); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_local524); 
					pushID((id2!=null?id2.getText():null), (tipo2!=null?input.toString(tipo2.start,tipo2.stop):null));
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_local530); 
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
	// compiler.g:63:1: sentences : ( assignment | decl_local );
	public final void sentences() throws RecognitionException {
		try {
			// compiler.g:63:13: ( assignment | decl_local )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			else if ( (LA9_0==DOUBLE||LA9_0==INT) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// compiler.g:63:21: assignment
					{
					pushFollow(FOLLOW_assignment_in_sentences546);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:63:34: decl_local
					{
					pushFollow(FOLLOW_decl_local_in_sentences550);
					decl_local();
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



	// $ANTLR start "expr"
	// compiler.g:65:1: expr returns [int vType] : m1= multExpr ( ( '+' | '-' ) m2= multExpr )* ;
	public final int expr() throws RecognitionException {
		int vType = 0;


		int m1 =0;
		int m2 =0;

		try {
			// compiler.g:65:29: (m1= multExpr ( ( '+' | '-' ) m2= multExpr )* )
			// compiler.g:65:31: m1= multExpr ( ( '+' | '-' ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr595);
			m1=multExpr();
			state._fsp--;

			 vType =m1; 
			// compiler.g:66:33: ( ( '+' | '-' ) m2= multExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= 22 && LA10_0 <= 23)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// compiler.g:66:34: ( '+' | '-' ) m2= multExpr
					{
					if ( (input.LA(1) >= 22 && input.LA(1) <= 23) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr643);
					m2=multExpr();
					state._fsp--;

					 if(vType != m2)  vType =3; 
					}
					break;

				default :
					break loop10;
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
	// compiler.g:70:1: multExpr returns [int vType] : a1= atom ( '*' a2= atom )* ;
	public final int multExpr() throws RecognitionException {
		int vType = 0;


		int a1 =0;
		int a2 =0;

		try {
			// compiler.g:70:29: (a1= atom ( '*' a2= atom )* )
			// compiler.g:71:21: a1= atom ( '*' a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr774);
			a1=atom();
			state._fsp--;

			vType =a1;
			// compiler.g:72:21: ( '*' a2= atom )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==21) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// compiler.g:72:22: '*' a2= atom
					{
					match(input,21,FOLLOW_21_in_multExpr799); 
					pushFollow(FOLLOW_atom_in_multExpr803);
					a2=atom();
					state._fsp--;


					                            if(a1 != a2)  vType =3;
					                        
					}
					break;

				default :
					break loop11;
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
	// compiler.g:78:1: atom returns [int vType] : ( CINT | CFLOAT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int vType = 0;


		int expr3 =0;

		try {
			// compiler.g:79:5: ( CINT | CFLOAT | ID | '(' expr ')' )
			int alt12=4;
			switch ( input.LA(1) ) {
			case CINT:
				{
				alt12=1;
				}
				break;
			case CFLOAT:
				{
				alt12=2;
				}
				break;
			case ID:
				{
				alt12=3;
				}
				break;
			case 19:
				{
				alt12=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// compiler.g:79:7: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom868); 
					 vType =1; 
					}
					break;
				case 2 :
					// compiler.g:80:4: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atom883); 
					 vType =2; 
					}
					break;
				case 3 :
					// compiler.g:81:4: ID
					{
					match(input,ID,FOLLOW_ID_in_atom896); 
					}
					break;
				case 4 :
					// compiler.g:82:5: '(' expr ')'
					{
					match(input,19,FOLLOW_19_in_atom909); 
					pushFollow(FOLLOW_expr_in_atom911);
					expr3=expr();
					state._fsp--;

					match(input,20,FOLLOW_20_in_atom913); 
					 vType =expr3; 
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
	// compiler.g:84:1: accesmod : ( PUBLIC | PRIVATE | PROTECTED );
	public final void accesmod() throws RecognitionException {
		try {
			// compiler.g:84:9: ( PUBLIC | PRIVATE | PROTECTED )
			// compiler.g:
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
	// compiler.g:86:1: tipo : ( INT | DOUBLE );
	public final compilerParser.tipo_return tipo() throws RecognitionException {
		compilerParser.tipo_return retval = new compilerParser.tipo_return();
		retval.start = input.LT(1);

		try {
			// compiler.g:86:9: ( INT | DOUBLE )
			// compiler.g:
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
	// $ANTLR end "tipo"

	// Delegated rules



	public static final BitSet FOLLOW_classes_in_program19 = new BitSet(new long[]{0x000000000001C002L});
	public static final BitSet FOLLOW_accesmod_in_classes27 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CLASS_in_classes29 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classes31 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_OCURLYB_in_classes54 = new BitSet(new long[]{0x000000000001C010L});
	public static final BitSet FOLLOW_member_in_classes81 = new BitSet(new long[]{0x000000000001C010L});
	public static final BitSet FOLLOW_CCURLYB_in_classes104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment118 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_assignment120 = new BitSet(new long[]{0x0000000000080860L});
	public static final BitSet FOLLOW_expr_in_assignment122 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assignment167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_member187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_member192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accesmod_in_property211 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_tipo_in_property213 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_property215 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_COMMA_in_property219 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_property221 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_SEMICOLON_in_property225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accesmod_in_method264 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_tipo_in_method266 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_method268 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_method270 = new BitSet(new long[]{0x0000000000101400L});
	public static final BitSet FOLLOW_decl_args_in_method272 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_method277 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_OCURLYB_in_method316 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_sentences_in_method358 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_CCURLYB_in_method397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_args427 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_decl_args431 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_decl_args460 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_tipo_in_decl_args464 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_decl_args468 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_tipo_in_decl_local486 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_decl_local490 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_COMMA_in_decl_local520 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_decl_local524 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_SEMICOLON_in_decl_local530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_sentences546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_local_in_sentences550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr595 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_set_in_expr633 = new BitSet(new long[]{0x0000000000080860L});
	public static final BitSet FOLLOW_multExpr_in_expr643 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_atom_in_multExpr774 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr799 = new BitSet(new long[]{0x0000000000080860L});
	public static final BitSet FOLLOW_atom_in_multExpr803 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_CINT_in_atom868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atom883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_atom909 = new BitSet(new long[]{0x0000000000080860L});
	public static final BitSet FOLLOW_expr_in_atom911 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_atom913 = new BitSet(new long[]{0x0000000000000002L});
}
