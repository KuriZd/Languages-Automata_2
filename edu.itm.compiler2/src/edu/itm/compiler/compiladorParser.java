
package edu.itm.compiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compiladorParser extends Parser {
    private javax.swing.JTextArea taSalida;

    public void setSalida(javax.swing.JTextArea _salida) {
        this.taSalida = _salida;
    }
    
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


	public compiladorParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public compiladorParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return compiladorParser.tokenNames; }
	@Override public String getGrammarFileName() { return "compilador.g"; }

	 


	// $ANTLR start "program"
	// compilador.g:6:1: program : ( classes )+ ;
	public final void program() throws RecognitionException {
		try {
			// compilador.g:6:8: ( ( classes )+ )
			// compilador.g:6:10: ( classes )+
			{
			// compilador.g:6:10: ( classes )+
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
					// compilador.g:6:10: classes
					{
					pushFollow(FOLLOW_classes_in_program25);
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
	// compilador.g:9:1: classes : accessmod CLASS ID OCURLYB ( member )* CCURLYB ;
	public final void classes() throws RecognitionException {
		try {
			// compilador.g:9:10: ( accessmod CLASS ID OCURLYB ( member )* CCURLYB )
			// compilador.g:9:12: accessmod CLASS ID OCURLYB ( member )* CCURLYB
			{
			pushFollow(FOLLOW_accessmod_in_classes36);
			accessmod();
			state._fsp--;

			match(input,CLASS,FOLLOW_CLASS_in_classes38); 
			match(input,ID,FOLLOW_ID_in_classes40); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_classes66); 
			// compilador.g:11:30: ( member )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// compilador.g:11:30: member
					{
					pushFollow(FOLLOW_member_in_classes97);
					member();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_classes123); 
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
	// compilador.g:14:1: member : ( method | property );
	public final void member() throws RecognitionException {
		try {
			// compilador.g:14:13: ( method | property )
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
					// compilador.g:14:16: method
					{
					pushFollow(FOLLOW_method_in_member139);
					method();
					state._fsp--;

					}
					break;
				case 2 :
					// compilador.g:14:25: property
					{
					pushFollow(FOLLOW_property_in_member143);
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
	// compilador.g:16:1: property : accessmod tipo ID ( COMMA ID )* SEMICOLON ;
	public final void property() throws RecognitionException {
		try {
			// compilador.g:16:13: ( accessmod tipo ID ( COMMA ID )* SEMICOLON )
			// compilador.g:16:16: accessmod tipo ID ( COMMA ID )* SEMICOLON
			{
			pushFollow(FOLLOW_accessmod_in_property159);
			accessmod();
			state._fsp--;

			pushFollow(FOLLOW_tipo_in_property161);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_property163); 
			// compilador.g:16:35: ( COMMA ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// compilador.g:16:37: COMMA ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_property168); 
					match(input,ID,FOLLOW_ID_in_property170); 
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_property176); 
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
	// compilador.g:18:1: method : accessmod tipo ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB ;
	public final void method() throws RecognitionException {
		try {
			// compilador.g:18:13: ( accessmod tipo ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB )
			// compilador.g:18:16: accessmod tipo ID '(' ( decl_args )? ')' OCURLYB ( sentences )* CCURLYB
			{
			pushFollow(FOLLOW_accessmod_in_method190);
			accessmod();
			state._fsp--;

			pushFollow(FOLLOW_tipo_in_method192);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_method194); 
			match(input,19,FOLLOW_19_in_method196); 
			// compilador.g:18:39: ( decl_args )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DOUBLE||LA5_0==INT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// compilador.g:18:39: decl_args
					{
					pushFollow(FOLLOW_decl_args_in_method199);
					decl_args();
					state._fsp--;

					}
					break;

			}

			match(input,20,FOLLOW_20_in_method205); 
			match(input,OCURLYB,FOLLOW_OCURLYB_in_method231); 
			// compilador.g:19:33: ( sentences )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= DOUBLE && LA6_0 <= INT)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// compilador.g:19:33: sentences
					{
					pushFollow(FOLLOW_sentences_in_method234);
					sentences();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			match(input,CCURLYB,FOLLOW_CCURLYB_in_method239); 
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
	// compilador.g:21:1: decl_args : tipo ID ( COMMA tipo ID )* ;
	public final void decl_args() throws RecognitionException {
		try {
			// compilador.g:21:13: ( tipo ID ( COMMA tipo ID )* )
			// compilador.g:21:16: tipo ID ( COMMA tipo ID )*
			{
			pushFollow(FOLLOW_tipo_in_decl_args250);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_decl_args252); 
			// compilador.g:21:24: ( COMMA tipo ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// compilador.g:21:25: COMMA tipo ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_args255); 
					pushFollow(FOLLOW_tipo_in_decl_args257);
					tipo();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_decl_args259); 
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
	// compilador.g:23:1: decl_local : tipo ID ( COMMA ID )* SEMICOLON ;
	public final void decl_local() throws RecognitionException {
		try {
			// compilador.g:23:13: ( tipo ID ( COMMA ID )* SEMICOLON )
			// compilador.g:23:16: tipo ID ( COMMA ID )* SEMICOLON
			{
			pushFollow(FOLLOW_tipo_in_decl_local271);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_decl_local273); 
			// compilador.g:23:24: ( COMMA ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// compilador.g:23:25: COMMA ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_local276); 
					match(input,ID,FOLLOW_ID_in_decl_local278); 
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_local282); 
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
	// compilador.g:25:1: sentences : ( assignment | decl_local );
	public final void sentences() throws RecognitionException {
		try {
			// compilador.g:25:13: ( assignment | decl_local )
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
					// compilador.g:25:15: assignment
					{
					pushFollow(FOLLOW_assignment_in_sentences292);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// compilador.g:25:28: decl_local
					{
					pushFollow(FOLLOW_decl_local_in_sentences296);
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



	// $ANTLR start "assignment"
	// compilador.g:28:1: assignment : ID '=' expr SEMICOLON ;
	public final void assignment() throws RecognitionException {
		try {
			// compilador.g:28:13: ( ID '=' expr SEMICOLON )
			// compilador.g:28:15: ID '=' expr SEMICOLON
			{
			match(input,ID,FOLLOW_ID_in_assignment308); 
			match(input,24,FOLLOW_24_in_assignment310); 
			pushFollow(FOLLOW_expr_in_assignment312);
			expr();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignment314); 
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



	// $ANTLR start "expr"
	// compilador.g:29:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final void expr() throws RecognitionException {
		try {
			// compilador.g:29:13: ( multExpr ( ( '+' | '-' ) multExpr )* )
			// compilador.g:29:15: multExpr ( ( '+' | '-' ) multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr349);
			multExpr();
			state._fsp--;

			// compilador.g:29:24: ( ( '+' | '-' ) multExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= 22 && LA10_0 <= 23)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// compilador.g:29:25: ( '+' | '-' ) multExpr
					{
					if ( (input.LA(1) >= 22 && input.LA(1) <= 23) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr360);
					multExpr();
					state._fsp--;

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
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// compilador.g:30:1: multExpr : atom ( '*' atom )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// compilador.g:30:13: ( atom ( '*' atom )* )
			// compilador.g:30:15: atom ( '*' atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr374);
			atom();
			state._fsp--;

			// compilador.g:30:20: ( '*' atom )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==21) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// compilador.g:30:21: '*' atom
					{
					match(input,21,FOLLOW_21_in_multExpr377); 
					pushFollow(FOLLOW_atom_in_multExpr379);
					atom();
					state._fsp--;

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
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// compilador.g:31:1: atom : ( CINT | CFLOAT | ID | '(' expr ')' );
	public final void atom() throws RecognitionException {
		try {
			// compilador.g:31:13: ( CINT | CFLOAT | ID | '(' expr ')' )
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
					// compilador.g:31:17: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom415); 
					}
					break;
				case 2 :
					// compilador.g:32:17: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atom434); 
					}
					break;
				case 3 :
					// compilador.g:33:17: ID
					{
					match(input,ID,FOLLOW_ID_in_atom452); 
					}
					break;
				case 4 :
					// compilador.g:34:17: '(' expr ')'
					{
					match(input,19,FOLLOW_19_in_atom474); 
					pushFollow(FOLLOW_expr_in_atom476);
					expr();
					state._fsp--;

					match(input,20,FOLLOW_20_in_atom478); 
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
	// $ANTLR end "atom"



	// $ANTLR start "tipo"
	// compilador.g:36:1: tipo : ( INT | DOUBLE );
	public final void tipo() throws RecognitionException {
		try {
			// compilador.g:36:11: ( INT | DOUBLE )
			// compilador.g:
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tipo"



	// $ANTLR start "accessmod"
	// compilador.g:37:1: accessmod : ( PUBLIC | PRIVATE | PROTECTED );
	public final void accessmod() throws RecognitionException {
		try {
			// compilador.g:37:11: ( PUBLIC | PRIVATE | PROTECTED )
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
	// $ANTLR end "accessmod"

	// Delegated rules



	public static final BitSet FOLLOW_classes_in_program25 = new BitSet(new long[]{0x000000000001C002L});
	public static final BitSet FOLLOW_accessmod_in_classes36 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CLASS_in_classes38 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classes40 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_OCURLYB_in_classes66 = new BitSet(new long[]{0x000000000001C010L});
	public static final BitSet FOLLOW_member_in_classes97 = new BitSet(new long[]{0x000000000001C010L});
	public static final BitSet FOLLOW_CCURLYB_in_classes123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_member139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_member143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessmod_in_property159 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_tipo_in_property161 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_property163 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_COMMA_in_property168 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_property170 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_SEMICOLON_in_property176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessmod_in_method190 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_tipo_in_method192 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_method194 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_method196 = new BitSet(new long[]{0x0000000000101400L});
	public static final BitSet FOLLOW_decl_args_in_method199 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_method205 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_OCURLYB_in_method231 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_sentences_in_method234 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_CCURLYB_in_method239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_args250 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_decl_args252 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_decl_args255 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_tipo_in_decl_args257 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_decl_args259 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_tipo_in_decl_local271 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_decl_local273 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_COMMA_in_decl_local276 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_decl_local278 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_SEMICOLON_in_decl_local282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_sentences292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_local_in_sentences296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment308 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_assignment310 = new BitSet(new long[]{0x0000000000080860L});
	public static final BitSet FOLLOW_expr_in_assignment312 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assignment314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr349 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_set_in_expr352 = new BitSet(new long[]{0x0000000000080860L});
	public static final BitSet FOLLOW_multExpr_in_expr360 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_atom_in_multExpr374 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr377 = new BitSet(new long[]{0x0000000000080860L});
	public static final BitSet FOLLOW_atom_in_multExpr379 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_CINT_in_atom415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atom434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_atom474 = new BitSet(new long[]{0x0000000000080860L});
	public static final BitSet FOLLOW_expr_in_atom476 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_atom478 = new BitSet(new long[]{0x0000000000000002L});
}
