// $ANTLR 3.5.2 compilador.g 2025-09-30 23:52:56
package edu.itm.compiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compiladorLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public compiladorLexer() {} 
	public compiladorLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public compiladorLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "compilador.g"; }

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:2:7: ( '(' )
			// compilador.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:3:7: ( ')' )
			// compilador.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:4:7: ( '*' )
			// compilador.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:5:7: ( '+' )
			// compilador.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:6:7: ( '-' )
			// compilador.g:6:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:7:7: ( '=' )
			// compilador.g:7:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:39:11: ( 'int' )
			// compilador.g:39:13: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:40:11: ( 'double' )
			// compilador.g:40:13: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:41:11: ( 'public' )
			// compilador.g:41:13: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:42:11: ( 'private' )
			// compilador.g:42:13: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:43:11: ( 'protected' )
			// compilador.g:43:13: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "OCURLYB"
	public final void mOCURLYB() throws RecognitionException {
		try {
			int _type = OCURLYB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:45:11: ( '{' )
			// compilador.g:45:13: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCURLYB"

	// $ANTLR start "CCURLYB"
	public final void mCCURLYB() throws RecognitionException {
		try {
			int _type = CCURLYB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:46:11: ( '}' )
			// compilador.g:46:13: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CCURLYB"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:47:11: ( 'class' )
			// compilador.g:47:13: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:49:11: ( ',' )
			// compilador.g:49:14: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:50:11: ( ';' )
			// compilador.g:50:14: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:51:11: ( '.' )
			// compilador.g:51:14: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "CFLOAT"
	public final void mCFLOAT() throws RecognitionException {
		try {
			int _type = CFLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:52:11: ( CINT DOT CINT )
			// compilador.g:52:14: CINT DOT CINT
			{
			mCINT(); 

			mDOT(); 

			mCINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CFLOAT"

	// $ANTLR start "CINT"
	public final void mCINT() throws RecognitionException {
		try {
			int _type = CINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:53:11: ( ( '0' .. '9' )+ )
			// compilador.g:53:14: ( '0' .. '9' )+
			{
			// compilador.g:53:14: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// compilador.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CINT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:54:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// compilador.g:54:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// compilador.g:54:38: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// compilador.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:55:10: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// compilador.g:55:13: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// compilador.g:55:13: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// compilador.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// compilador.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | INT | DOUBLE | PUBLIC | PRIVATE | PROTECTED | OCURLYB | CCURLYB | CLASS | COMMA | SEMICOLON | DOT | CFLOAT | CINT | ID | WS )
		int alt4=21;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// compilador.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// compilador.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// compilador.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// compilador.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// compilador.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// compilador.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// compilador.g:1:46: INT
				{
				mINT(); 

				}
				break;
			case 8 :
				// compilador.g:1:50: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 9 :
				// compilador.g:1:57: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 10 :
				// compilador.g:1:64: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 11 :
				// compilador.g:1:72: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 12 :
				// compilador.g:1:82: OCURLYB
				{
				mOCURLYB(); 

				}
				break;
			case 13 :
				// compilador.g:1:90: CCURLYB
				{
				mCCURLYB(); 

				}
				break;
			case 14 :
				// compilador.g:1:98: CLASS
				{
				mCLASS(); 

				}
				break;
			case 15 :
				// compilador.g:1:104: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 16 :
				// compilador.g:1:110: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 17 :
				// compilador.g:1:120: DOT
				{
				mDOT(); 

				}
				break;
			case 18 :
				// compilador.g:1:124: CFLOAT
				{
				mCFLOAT(); 

				}
				break;
			case 19 :
				// compilador.g:1:131: CINT
				{
				mCINT(); 

				}
				break;
			case 20 :
				// compilador.g:1:136: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// compilador.g:1:139: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\7\uffff\3\21\2\uffff\1\21\3\uffff\1\30\2\uffff\5\21\2\uffff\1\40\5\21"+
		"\1\uffff\11\21\1\57\1\60\1\61\2\21\3\uffff\1\64\1\21\1\uffff\1\21\1\67"+
		"\1\uffff";
	static final String DFA4_eofS =
		"\70\uffff";
	static final String DFA4_minS =
		"\1\11\6\uffff\1\156\1\157\1\162\2\uffff\1\154\3\uffff\1\56\2\uffff\1\164"+
		"\1\165\1\142\1\151\1\141\2\uffff\1\60\1\142\1\154\1\166\1\164\1\163\1"+
		"\uffff\1\154\1\151\1\141\1\145\1\163\1\145\1\143\1\164\1\143\3\60\1\145"+
		"\1\164\3\uffff\1\60\1\145\1\uffff\1\144\1\60\1\uffff";
	static final String DFA4_maxS =
		"\1\175\6\uffff\1\156\1\157\1\165\2\uffff\1\154\3\uffff\1\71\2\uffff\1"+
		"\164\1\165\1\142\1\157\1\141\2\uffff\1\172\1\142\1\154\1\166\1\164\1\163"+
		"\1\uffff\1\154\1\151\1\141\1\145\1\163\1\145\1\143\1\164\1\143\3\172\1"+
		"\145\1\164\3\uffff\1\172\1\145\1\uffff\1\144\1\172\1\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\14\1\15\1\uffff\1\17\1\20\1"+
		"\21\1\uffff\1\24\1\25\5\uffff\1\23\1\22\6\uffff\1\7\16\uffff\1\16\1\10"+
		"\1\11\2\uffff\1\12\2\uffff\1\13";
	static final String DFA4_specialS =
		"\70\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\7\uffff\1\1\1\2\1\3\1\4\1\15\1\5\1\17"+
			"\1\uffff\12\20\1\uffff\1\16\1\uffff\1\6\3\uffff\32\21\4\uffff\1\21\1"+
			"\uffff\2\21\1\14\1\10\4\21\1\7\6\21\1\11\12\21\1\12\1\uffff\1\13",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\23",
			"\1\24",
			"\1\26\2\uffff\1\25",
			"",
			"",
			"\1\27",
			"",
			"",
			"",
			"\1\31\1\uffff\12\20",
			"",
			"",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35\5\uffff\1\36",
			"\1\37",
			"",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\62",
			"\1\63",
			"",
			"",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\65",
			"",
			"\1\66",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | INT | DOUBLE | PUBLIC | PRIVATE | PROTECTED | OCURLYB | CCURLYB | CLASS | COMMA | SEMICOLON | DOT | CFLOAT | CINT | ID | WS );";
		}
	}

}
