// $ANTLR 3.5.2 compiler.g 2025-10-01 01:44:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compilerLexer extends Lexer {
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

	public compilerLexer() {} 
	public compilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public compilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "compiler.g"; }

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:2:7: ( '(' )
			// compiler.g:2:9: '('
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
			// compiler.g:3:7: ( ')' )
			// compiler.g:3:9: ')'
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
			// compiler.g:4:7: ( '*' )
			// compiler.g:4:9: '*'
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
			// compiler.g:5:7: ( '+' )
			// compiler.g:5:9: '+'
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
			// compiler.g:6:7: ( '-' )
			// compiler.g:6:9: '-'
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
			// compiler.g:7:7: ( '=' )
			// compiler.g:7:9: '='
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

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:90:13: ( 'public' )
			// compiler.g:90:15: 'public'
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
			// compiler.g:91:13: ( 'private' )
			// compiler.g:91:15: 'private'
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
			// compiler.g:92:13: ( 'protected' )
			// compiler.g:92:15: 'protected'
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:93:13: ( 'int' )
			// compiler.g:93:15: 'int'
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
			// compiler.g:94:13: ( 'double' )
			// compiler.g:94:15: 'double'
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

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:95:13: ( 'class' )
			// compiler.g:95:15: 'class'
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

	// $ANTLR start "OCURLYB"
	public final void mOCURLYB() throws RecognitionException {
		try {
			int _type = OCURLYB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:96:13: ( '{' )
			// compiler.g:96:15: '{'
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
			// compiler.g:97:13: ( '}' )
			// compiler.g:97:15: '}'
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

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:99:13: ( ',' )
			// compiler.g:99:15: ','
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
			// compiler.g:100:13: ( ';' )
			// compiler.g:100:15: ';'
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
			// compiler.g:101:13: ( '.' )
			// compiler.g:101:15: '.'
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

	// $ANTLR start "CINT"
	public final void mCINT() throws RecognitionException {
		try {
			int _type = CINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:102:13: ( ( '0' .. '9' )+ )
			// compiler.g:102:15: ( '0' .. '9' )+
			{
			// compiler.g:102:15: ( '0' .. '9' )+
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
					// compiler.g:
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

	// $ANTLR start "CFLOAT"
	public final void mCFLOAT() throws RecognitionException {
		try {
			int _type = CFLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:103:13: ( CINT DOT CINT )
			// compiler.g:103:15: CINT DOT CINT
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:104:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// compiler.g:104:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// compiler.g:105:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// compiler.g:
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
			// compiler.g:112:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
			// compiler.g:112:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
			{
			// compiler.g:112:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
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
					// compiler.g:
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
		// compiler.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | PUBLIC | PRIVATE | PROTECTED | INT | DOUBLE | CLASS | OCURLYB | CCURLYB | COMMA | SEMICOLON | DOT | CINT | CFLOAT | ID | WS )
		int alt4=21;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// compiler.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// compiler.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// compiler.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// compiler.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// compiler.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// compiler.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// compiler.g:1:46: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 8 :
				// compiler.g:1:53: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 9 :
				// compiler.g:1:61: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 10 :
				// compiler.g:1:71: INT
				{
				mINT(); 

				}
				break;
			case 11 :
				// compiler.g:1:75: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 12 :
				// compiler.g:1:82: CLASS
				{
				mCLASS(); 

				}
				break;
			case 13 :
				// compiler.g:1:88: OCURLYB
				{
				mOCURLYB(); 

				}
				break;
			case 14 :
				// compiler.g:1:96: CCURLYB
				{
				mCCURLYB(); 

				}
				break;
			case 15 :
				// compiler.g:1:104: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 16 :
				// compiler.g:1:110: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 17 :
				// compiler.g:1:120: DOT
				{
				mDOT(); 

				}
				break;
			case 18 :
				// compiler.g:1:124: CINT
				{
				mCINT(); 

				}
				break;
			case 19 :
				// compiler.g:1:129: CFLOAT
				{
				mCFLOAT(); 

				}
				break;
			case 20 :
				// compiler.g:1:136: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// compiler.g:1:139: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\7\uffff\4\21\5\uffff\1\30\2\uffff\5\21\2\uffff\3\21\1\43\5\21\1\uffff"+
		"\6\21\1\57\1\60\2\21\1\63\2\uffff\1\64\1\21\2\uffff\1\21\1\67\1\uffff";
	static final String DFA4_eofS =
		"\70\uffff";
	static final String DFA4_minS =
		"\1\11\6\uffff\1\162\1\156\1\157\1\154\5\uffff\1\56\2\uffff\1\142\1\151"+
		"\1\164\1\165\1\141\2\uffff\1\154\1\166\1\164\1\60\1\142\1\163\1\151\1"+
		"\141\1\145\1\uffff\1\154\1\163\1\143\1\164\1\143\1\145\2\60\1\145\1\164"+
		"\1\60\2\uffff\1\60\1\145\2\uffff\1\144\1\60\1\uffff";
	static final String DFA4_maxS =
		"\1\175\6\uffff\1\165\1\156\1\157\1\154\5\uffff\1\71\2\uffff\1\142\1\157"+
		"\1\164\1\165\1\141\2\uffff\1\154\1\166\1\164\1\172\1\142\1\163\1\151\1"+
		"\141\1\145\1\uffff\1\154\1\163\1\143\1\164\1\143\1\145\2\172\1\145\1\164"+
		"\1\172\2\uffff\1\172\1\145\2\uffff\1\144\1\172\1\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\4\uffff\1\15\1\16\1\17\1\20\1\21\1\uffff"+
		"\1\24\1\25\5\uffff\1\22\1\23\11\uffff\1\12\13\uffff\1\14\1\7\2\uffff\1"+
		"\13\1\10\2\uffff\1\11";
	static final String DFA4_specialS =
		"\70\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\7\uffff\1\1\1\2\1\3\1\4\1\15\1\5\1\17"+
			"\1\uffff\12\20\1\uffff\1\16\1\uffff\1\6\3\uffff\32\21\4\uffff\1\21\1"+
			"\uffff\2\21\1\12\1\11\4\21\1\10\6\21\1\7\12\21\1\13\1\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\24\2\uffff\1\23",
			"\1\25",
			"\1\26",
			"\1\27",
			"",
			"",
			"",
			"",
			"",
			"\1\31\1\uffff\12\20",
			"",
			"",
			"\1\32",
			"\1\33\5\uffff\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"",
			"",
			"\1\40",
			"\1\41",
			"\1\42",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\61",
			"\1\62",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\65",
			"",
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
			return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | PUBLIC | PRIVATE | PROTECTED | INT | DOUBLE | CLASS | OCURLYB | CCURLYB | COMMA | SEMICOLON | DOT | CINT | CFLOAT | ID | WS );";
		}
	}

}
