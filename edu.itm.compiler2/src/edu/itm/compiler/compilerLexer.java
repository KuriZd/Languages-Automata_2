// $ANTLR 3.5.2 compilador.g 2025-10-12 02:18:52
package edu.itm.compiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compilerLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "compilador.g"; }

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
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
	// $ANTLR end "T__39"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:296:6: ( 'void' )
			// compilador.g:296:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:301:13: ( 'public' )
			// compilador.g:301:15: 'public'
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
			// compilador.g:302:13: ( 'private' )
			// compilador.g:302:15: 'private'
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
			// compilador.g:303:13: ( 'protected' )
			// compilador.g:303:15: 'protected'
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
			// compilador.g:304:13: ( 'int' )
			// compilador.g:304:15: 'int'
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
			// compilador.g:305:13: ( 'double' )
			// compilador.g:305:15: 'double'
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
			// compilador.g:306:13: ( 'class' )
			// compilador.g:306:15: 'class'
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
			// compilador.g:307:13: ( '{' )
			// compilador.g:307:15: '{'
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
			// compilador.g:308:13: ( '}' )
			// compilador.g:308:15: '}'
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
			// compilador.g:310:13: ( ',' )
			// compilador.g:310:15: ','
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
			// compilador.g:311:13: ( ';' )
			// compilador.g:311:15: ';'
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
			// compilador.g:312:13: ( '.' )
			// compilador.g:312:15: '.'
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
			// compilador.g:313:13: ( ( '0' .. '9' )+ )
			// compilador.g:313:15: ( '0' .. '9' )+
			{
			// compilador.g:313:15: ( '0' .. '9' )+
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

	// $ANTLR start "CFLOAT"
	public final void mCFLOAT() throws RecognitionException {
		try {
			int _type = CFLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:314:13: ( CINT DOT CINT )
			// compilador.g:314:15: CINT DOT CINT
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

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:315:13: ( 'if' )
			// compilador.g:315:15: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:316:13: ( 'else' )
			// compilador.g:316:15: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:317:13: ( 'while' )
			// compilador.g:317:15: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:318:13: ( 'true' )
			// compilador.g:318:15: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:319:13: ( 'false' )
			// compilador.g:319:15: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:320:13: ( '&&' )
			// compilador.g:320:15: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:321:13: ( '||' )
			// compilador.g:321:15: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:322:13: ( '!' )
			// compilador.g:322:15: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:323:13: ( '==' )
			// compilador.g:323:15: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:324:13: ( '!=' )
			// compilador.g:324:15: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:325:13: ( '<=' )
			// compilador.g:325:15: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:326:13: ( '>=' )
			// compilador.g:326:15: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:327:13: ( '<' )
			// compilador.g:327:15: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:328:13: ( '>' )
			// compilador.g:328:15: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compilador.g:330:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// compilador.g:330:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// compilador.g:331:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
			// compilador.g:333:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
			// compilador.g:333:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
			{
			// compilador.g:333:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
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
		// compilador.g:1:8: ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | VOID | PUBLIC | PRIVATE | PROTECTED | INT | DOUBLE | CLASS | OCURLYB | CCURLYB | COMMA | SEMICOLON | DOT | CINT | CFLOAT | IF | ELSE | WHILE | TRUE | FALSE | AND | OR | NOT | EQ | NE | LE | GE | LT | GT | ID | WS )
		int alt4=36;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// compilador.g:1:10: T__34
				{
				mT__34(); 

				}
				break;
			case 2 :
				// compilador.g:1:16: T__35
				{
				mT__35(); 

				}
				break;
			case 3 :
				// compilador.g:1:22: T__36
				{
				mT__36(); 

				}
				break;
			case 4 :
				// compilador.g:1:28: T__37
				{
				mT__37(); 

				}
				break;
			case 5 :
				// compilador.g:1:34: T__38
				{
				mT__38(); 

				}
				break;
			case 6 :
				// compilador.g:1:40: T__39
				{
				mT__39(); 

				}
				break;
			case 7 :
				// compilador.g:1:46: VOID
				{
				mVOID(); 

				}
				break;
			case 8 :
				// compilador.g:1:51: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 9 :
				// compilador.g:1:58: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 10 :
				// compilador.g:1:66: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 11 :
				// compilador.g:1:76: INT
				{
				mINT(); 

				}
				break;
			case 12 :
				// compilador.g:1:80: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 13 :
				// compilador.g:1:87: CLASS
				{
				mCLASS(); 

				}
				break;
			case 14 :
				// compilador.g:1:93: OCURLYB
				{
				mOCURLYB(); 

				}
				break;
			case 15 :
				// compilador.g:1:101: CCURLYB
				{
				mCCURLYB(); 

				}
				break;
			case 16 :
				// compilador.g:1:109: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 17 :
				// compilador.g:1:115: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 18 :
				// compilador.g:1:125: DOT
				{
				mDOT(); 

				}
				break;
			case 19 :
				// compilador.g:1:129: CINT
				{
				mCINT(); 

				}
				break;
			case 20 :
				// compilador.g:1:134: CFLOAT
				{
				mCFLOAT(); 

				}
				break;
			case 21 :
				// compilador.g:1:141: IF
				{
				mIF(); 

				}
				break;
			case 22 :
				// compilador.g:1:144: ELSE
				{
				mELSE(); 

				}
				break;
			case 23 :
				// compilador.g:1:149: WHILE
				{
				mWHILE(); 

				}
				break;
			case 24 :
				// compilador.g:1:155: TRUE
				{
				mTRUE(); 

				}
				break;
			case 25 :
				// compilador.g:1:160: FALSE
				{
				mFALSE(); 

				}
				break;
			case 26 :
				// compilador.g:1:166: AND
				{
				mAND(); 

				}
				break;
			case 27 :
				// compilador.g:1:170: OR
				{
				mOR(); 

				}
				break;
			case 28 :
				// compilador.g:1:173: NOT
				{
				mNOT(); 

				}
				break;
			case 29 :
				// compilador.g:1:177: EQ
				{
				mEQ(); 

				}
				break;
			case 30 :
				// compilador.g:1:180: NE
				{
				mNE(); 

				}
				break;
			case 31 :
				// compilador.g:1:183: LE
				{
				mLE(); 

				}
				break;
			case 32 :
				// compilador.g:1:186: GE
				{
				mGE(); 

				}
				break;
			case 33 :
				// compilador.g:1:189: LT
				{
				mLT(); 

				}
				break;
			case 34 :
				// compilador.g:1:192: GT
				{
				mGT(); 

				}
				break;
			case 35 :
				// compilador.g:1:195: ID
				{
				mID(); 

				}
				break;
			case 36 :
				// compilador.g:1:198: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\6\uffff\1\36\5\33\5\uffff\1\46\4\33\2\uffff\1\55\1\57\1\61\4\uffff\4"+
		"\33\1\67\2\33\2\uffff\4\33\6\uffff\4\33\1\102\1\uffff\6\33\1\111\3\33"+
		"\1\uffff\2\33\1\117\1\33\1\121\1\33\1\uffff\4\33\1\127\1\uffff\1\130\1"+
		"\uffff\1\131\1\132\2\33\1\135\4\uffff\1\136\1\33\2\uffff\1\33\1\141\1"+
		"\uffff";
	static final String DFA4_eofS =
		"\142\uffff";
	static final String DFA4_minS =
		"\1\11\5\uffff\1\75\1\157\1\162\1\146\1\157\1\154\5\uffff\1\56\1\154\1"+
		"\150\1\162\1\141\2\uffff\3\75\4\uffff\1\151\1\142\1\151\1\164\1\60\1\165"+
		"\1\141\2\uffff\1\163\1\151\1\165\1\154\6\uffff\1\144\1\154\1\166\1\164"+
		"\1\60\1\uffff\1\142\1\163\1\145\1\154\1\145\1\163\1\60\1\151\1\141\1\145"+
		"\1\uffff\1\154\1\163\1\60\1\145\1\60\1\145\1\uffff\1\143\1\164\1\143\1"+
		"\145\1\60\1\uffff\1\60\1\uffff\2\60\1\145\1\164\1\60\4\uffff\1\60\1\145"+
		"\2\uffff\1\144\1\60\1\uffff";
	static final String DFA4_maxS =
		"\1\175\5\uffff\1\75\1\157\1\165\1\156\1\157\1\154\5\uffff\1\71\1\154\1"+
		"\150\1\162\1\141\2\uffff\3\75\4\uffff\1\151\1\142\1\157\1\164\1\172\1"+
		"\165\1\141\2\uffff\1\163\1\151\1\165\1\154\6\uffff\1\144\1\154\1\166\1"+
		"\164\1\172\1\uffff\1\142\1\163\1\145\1\154\1\145\1\163\1\172\1\151\1\141"+
		"\1\145\1\uffff\1\154\1\163\1\172\1\145\1\172\1\145\1\uffff\1\143\1\164"+
		"\1\143\1\145\1\172\1\uffff\1\172\1\uffff\2\172\1\145\1\164\1\172\4\uffff"+
		"\1\172\1\145\2\uffff\1\144\1\172\1\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\6\uffff\1\16\1\17\1\20\1\21\1\22\5\uffff"+
		"\1\32\1\33\3\uffff\1\43\1\44\1\35\1\6\7\uffff\1\23\1\24\4\uffff\1\36\1"+
		"\34\1\37\1\41\1\40\1\42\5\uffff\1\25\12\uffff\1\13\6\uffff\1\7\5\uffff"+
		"\1\26\1\uffff\1\30\5\uffff\1\15\1\27\1\31\1\10\2\uffff\1\14\1\11\2\uffff"+
		"\1\12";
	static final String DFA4_specialS =
		"\142\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\34\2\uffff\1\34\22\uffff\1\34\1\30\4\uffff\1\26\1\uffff\1\1\1\2\1"+
			"\3\1\4\1\16\1\5\1\20\1\uffff\12\21\1\uffff\1\17\1\31\1\6\1\32\2\uffff"+
			"\32\33\4\uffff\1\33\1\uffff\2\33\1\13\1\12\1\22\1\25\2\33\1\11\6\33\1"+
			"\10\3\33\1\24\1\33\1\7\1\23\3\33\1\14\1\27\1\15",
			"",
			"",
			"",
			"",
			"",
			"\1\35",
			"\1\37",
			"\1\41\2\uffff\1\40",
			"\1\43\7\uffff\1\42",
			"\1\44",
			"\1\45",
			"",
			"",
			"",
			"",
			"",
			"\1\47\1\uffff\12\21",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"",
			"",
			"\1\54",
			"\1\56",
			"\1\60",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\63",
			"\1\64\5\uffff\1\65",
			"\1\66",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\70",
			"\1\71",
			"",
			"",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\112",
			"\1\113",
			"\1\114",
			"",
			"\1\115",
			"\1\116",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\120",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\122",
			"",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\133",
			"\1\134",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\137",
			"",
			"",
			"\1\140",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
			return "1:1: Tokens : ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | VOID | PUBLIC | PRIVATE | PROTECTED | INT | DOUBLE | CLASS | OCURLYB | CCURLYB | COMMA | SEMICOLON | DOT | CINT | CFLOAT | IF | ELSE | WHILE | TRUE | FALSE | AND | OR | NOT | EQ | NE | LE | GE | LT | GT | ID | WS );";
		}
	}

}
