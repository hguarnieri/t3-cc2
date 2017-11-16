// Generated from ../linguagem/T3.g4 by ANTLR 4.7
package trab3.linguagem;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class T3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IDENT=4, CADEIA=5, NUM_INT=6, NUM_REAL=7, COMENTARIO=8, 
		COMENTARIOERRO=9, WS=10, ERROR=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", 
		"COMENTARIOERRO", "WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", 
		"COMENTARIOERRO", "WS", "ERROR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public T3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "T3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			COMENTARIOERRO_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMENTARIOERRO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			throw new ParseCancellationException("Linha "+getLine()+": comentario nao fechado");
//			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 throw new ParseCancellationException("Linha " + getLine() + ": "+ getText() +" - simbolo nao identificado"); 
//			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\\\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5%\n\5\f\5\16"+
		"\5(\13\5\3\6\3\6\7\6,\n\6\f\6\16\6/\13\6\3\6\3\6\3\7\6\7\64\n\7\r\7\16"+
		"\7\65\3\b\6\b9\n\b\r\b\16\b:\3\b\3\b\6\b?\n\b\r\b\16\b@\3\t\3\t\7\tE\n"+
		"\t\f\t\16\tH\13\t\3\t\3\t\3\t\3\n\3\n\7\nO\n\n\f\n\16\nR\13\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\5\2"+
		"\f\f\17\17\177\177\4\2\f\f\177\177\5\2\13\f\17\17\"\"\2b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5"+
		"\36\3\2\2\2\7 \3\2\2\2\t\"\3\2\2\2\13)\3\2\2\2\r\63\3\2\2\2\178\3\2\2"+
		"\2\21B\3\2\2\2\23L\3\2\2\2\25V\3\2\2\2\27Y\3\2\2\2\31\32\7u\2\2\32\33"+
		"\7k\2\2\33\34\7v\2\2\34\35\7g\2\2\35\4\3\2\2\2\36\37\7*\2\2\37\6\3\2\2"+
		"\2 !\7+\2\2!\b\3\2\2\2\"&\t\2\2\2#%\t\3\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\'\n\3\2\2\2(&\3\2\2\2)-\7$\2\2*,\n\4\2\2+*\3\2\2\2,/\3"+
		"\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7$\2\2\61\f\3\2"+
		"\2\2\62\64\4\62;\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2"+
		"\2\2\66\16\3\2\2\2\679\4\62;\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2"+
		"\2;<\3\2\2\2<>\7\60\2\2=?\4\62;\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2A\20\3\2\2\2BF\7}\2\2CE\n\5\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\177\2\2JK\b\t\2\2K\22\3\2\2\2LP\7}\2\2"+
		"MO\n\6\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2"+
		"ST\7\f\2\2TU\b\n\3\2U\24\3\2\2\2VW\t\7\2\2WX\b\13\4\2X\26\3\2\2\2YZ\13"+
		"\2\2\2Z[\b\f\5\2[\30\3\2\2\2\n\2&-\65:@FP\6\3\t\2\3\n\3\3\13\4\3\f\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}