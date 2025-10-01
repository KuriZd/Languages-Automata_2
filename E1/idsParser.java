package E1;
// $ANTLR 3.5.2 ids.g 2025-09-01 10:47:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class idsParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS"
	};
	public static final int EOF=-1;
	public static final int ID=4;
	public static final int WS=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public idsParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public idsParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return idsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "ids.g"; }



	// $ANTLR start "inicio"
	// ids.g:3:1: inicio : identificadores ;
	public final void inicio() throws RecognitionException {
		try {
			// ids.g:3:17: ( identificadores )
			// ids.g:3:19: identificadores
			{
			pushFollow(FOLLOW_identificadores_in_inicio19);
			identificadores();
			state._fsp--;

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
	// $ANTLR end "inicio"



	// $ANTLR start "identificadores"
	// ids.g:4:1: identificadores : ( ID )+ ;
	public final void identificadores() throws RecognitionException {
		try {
			// ids.g:4:17: ( ( ID )+ )
			// ids.g:4:19: ( ID )+
			{
			// ids.g:4:19: ( ID )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ids.g:4:19: ID
					{
					match(input,ID,FOLLOW_ID_in_identificadores27); 
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
	// $ANTLR end "identificadores"

	// Delegated rules



	public static final BitSet FOLLOW_identificadores_in_inicio19 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identificadores27 = new BitSet(new long[]{0x0000000000000012L});
}
