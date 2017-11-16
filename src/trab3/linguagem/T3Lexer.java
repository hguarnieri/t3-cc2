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
		T__0=1, T__1=2, IDENT=3, CADEIA=4, NUM_INT=5, NUM_REAL=6, COMENTARIO=7, 
		COMENTARIOERRO=8, WS=9, ERROR=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", 
		"COMENTARIOERRO", "WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "'fim_algoritmo'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", 
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
		case 6:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			COMENTARIOERRO_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
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
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fi\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4\62\n\4\f\4\16\4\65\13\4\3\5"+
		"\3\5\7\59\n\5\f\5\16\5<\13\5\3\5\3\5\3\6\6\6A\n\6\r\6\16\6B\3\7\6\7F\n"+
		"\7\r\7\16\7G\3\7\3\7\6\7L\n\7\r\7\16\7M\3\b\3\b\7\bR\n\b\f\b\16\bU\13"+
		"\b\3\b\3\b\3\b\3\t\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\5\2\f\f\17\17\177\177"+
		"\4\2\f\f\177\177\5\2\13\f\17\17\"\"\2o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5!\3\2\2\2\7/\3\2\2\2\t\66\3\2\2"+
		"\2\13@\3\2\2\2\rE\3\2\2\2\17O\3\2\2\2\21Y\3\2\2\2\23c\3\2\2\2\25f\3\2"+
		"\2\2\27\30\7c\2\2\30\31\7n\2\2\31\32\7i\2\2\32\33\7q\2\2\33\34\7t\2\2"+
		"\34\35\7k\2\2\35\36\7v\2\2\36\37\7o\2\2\37 \7q\2\2 \4\3\2\2\2!\"\7h\2"+
		"\2\"#\7k\2\2#$\7o\2\2$%\7a\2\2%&\7c\2\2&\'\7n\2\2\'(\7i\2\2()\7q\2\2)"+
		"*\7t\2\2*+\7k\2\2+,\7v\2\2,-\7o\2\2-.\7q\2\2.\6\3\2\2\2/\63\t\2\2\2\60"+
		"\62\t\3\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\b\3\2\2\2\65\63\3\2\2\2\66:\7$\2\2\679\n\4\2\28\67\3\2\2\29<\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7$\2\2>\n\3\2\2\2?A\4\62;\2"+
		"@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\f\3\2\2\2DF\4\62;\2ED\3\2\2"+
		"\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IK\7\60\2\2JL\4\62;\2KJ\3\2"+
		"\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\16\3\2\2\2OS\7}\2\2PR\n\5\2\2QP\3"+
		"\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\177\2\2W"+
		"X\b\b\2\2X\20\3\2\2\2Y]\7}\2\2Z\\\n\6\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\f\2\2ab\b\t\3\2b\22\3\2\2\2cd\t\7"+
		"\2\2de\b\n\4\2e\24\3\2\2\2fg\13\2\2\2gh\b\13\5\2h\26\3\2\2\2\n\2\63:B"+
		"GMS]\6\3\b\2\3\t\3\3\n\4\3\13\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}