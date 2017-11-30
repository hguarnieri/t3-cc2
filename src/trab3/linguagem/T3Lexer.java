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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, IDENT=26, CADEIA=27, NUM_INT=28, COMENTARIO=29, COMENTARIOERRO=30, 
		EMAIL=31, DATA=32, WS=33, ERROR=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"IDENT", "CADEIA", "NUM_INT", "COMENTARIO", "COMENTARIOERRO", "EMAIL", 
		"DATA", "WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'('", "')'", "'tipo='", "','", "'titulo='", "'autor='", 
		"'autor'", "'id='", "'nome='", "'contato='", "'descricao='", "'blog'", 
		"'cv'", "'post'", "'data='", "'conteudo='", "'experiencia'", "'periodo='", 
		"'organizacao='", "'atividade='", "'profissional'", "'educacional'", "'atividade'", 
		"'experiencia='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "IDENT", "CADEIA", "NUM_INT", "COMENTARIO", "COMENTARIOERRO", 
		"EMAIL", "DATA", "WS", "ERROR"
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
		case 28:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			COMENTARIOERRO_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\7\33\u0108\n\33\f\33\16\33\u010b\13\33\3\34\3\34\7\34\u010f\n\34"+
		"\f\34\16\34\u0112\13\34\3\34\3\34\3\35\6\35\u0117\n\35\r\35\16\35\u0118"+
		"\3\36\3\36\7\36\u011d\n\36\f\36\16\36\u0120\13\36\3\36\3\36\3\36\3\37"+
		"\3\37\7\37\u0127\n\37\f\37\16\37\u012a\13\37\3\37\3\37\3\37\3 \7 \u0130"+
		"\n \f \16 \u0133\13 \3 \3 \7 \u0137\n \f \16 \u013a\13 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \5 \u0144\n \3!\6!\u0147\n!\r!\16!\u0148\3!\3!\6!\u014d\n!\r"+
		"!\16!\u014e\3!\3!\6!\u0153\n!\r!\16!\u0154\3\"\3\"\3\"\3#\3#\3#\2\2$\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\5\2\f\f\17"+
		"\17\177\177\4\2\f\f\177\177\5\2\13\f\17\17\"\"\2\u0166\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5L\3\2\2\2\7N"+
		"\3\2\2\2\tP\3\2\2\2\13V\3\2\2\2\rX\3\2\2\2\17`\3\2\2\2\21g\3\2\2\2\23"+
		"m\3\2\2\2\25q\3\2\2\2\27w\3\2\2\2\31\u0080\3\2\2\2\33\u008b\3\2\2\2\35"+
		"\u0090\3\2\2\2\37\u0093\3\2\2\2!\u0098\3\2\2\2#\u009e\3\2\2\2%\u00a8\3"+
		"\2\2\2\'\u00b4\3\2\2\2)\u00bd\3\2\2\2+\u00ca\3\2\2\2-\u00d5\3\2\2\2/\u00e2"+
		"\3\2\2\2\61\u00ee\3\2\2\2\63\u00f8\3\2\2\2\65\u0105\3\2\2\2\67\u010c\3"+
		"\2\2\29\u0116\3\2\2\2;\u011a\3\2\2\2=\u0124\3\2\2\2?\u0131\3\2\2\2A\u0146"+
		"\3\2\2\2C\u0156\3\2\2\2E\u0159\3\2\2\2GH\7u\2\2HI\7k\2\2IJ\7v\2\2JK\7"+
		"g\2\2K\4\3\2\2\2LM\7*\2\2M\6\3\2\2\2NO\7+\2\2O\b\3\2\2\2PQ\7v\2\2QR\7"+
		"k\2\2RS\7r\2\2ST\7q\2\2TU\7?\2\2U\n\3\2\2\2VW\7.\2\2W\f\3\2\2\2XY\7v\2"+
		"\2YZ\7k\2\2Z[\7v\2\2[\\\7w\2\2\\]\7n\2\2]^\7q\2\2^_\7?\2\2_\16\3\2\2\2"+
		"`a\7c\2\2ab\7w\2\2bc\7v\2\2cd\7q\2\2de\7t\2\2ef\7?\2\2f\20\3\2\2\2gh\7"+
		"c\2\2hi\7w\2\2ij\7v\2\2jk\7q\2\2kl\7t\2\2l\22\3\2\2\2mn\7k\2\2no\7f\2"+
		"\2op\7?\2\2p\24\3\2\2\2qr\7p\2\2rs\7q\2\2st\7o\2\2tu\7g\2\2uv\7?\2\2v"+
		"\26\3\2\2\2wx\7e\2\2xy\7q\2\2yz\7p\2\2z{\7v\2\2{|\7c\2\2|}\7v\2\2}~\7"+
		"q\2\2~\177\7?\2\2\177\30\3\2\2\2\u0080\u0081\7f\2\2\u0081\u0082\7g\2\2"+
		"\u0082\u0083\7u\2\2\u0083\u0084\7e\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7e\2\2\u0087\u0088\7c\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7?\2\2\u008a\32\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7q\2\2\u008e\u008f\7i\2\2\u008f\34\3\2\2\2\u0090\u0091\7e\2\2\u0091"+
		"\u0092\7x\2\2\u0092\36\3\2\2\2\u0093\u0094\7r\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7v\2\2\u0097 \3\2\2\2\u0098\u0099\7f\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7v\2\2\u009b\u009c\7c\2\2\u009c\u009d\7?\2\2"+
		"\u009d\"\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7p"+
		"\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5"+
		"\7f\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7?\2\2\u00a7$\3\2\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7z\2\2\u00aa\u00ab\7r\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7e\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7c\2\2\u00b3&\3\2\2"+
		"\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"\u00bc\7?\2\2\u00bc(\3\2\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7i\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7k\2\2"+
		"\u00c3\u00c4\7|\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7?\2\2\u00c9*\3\2\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7x\2\2\u00ce"+
		"\u00cf\7k\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7f\2\2"+
		"\u00d2\u00d3\7g\2\2\u00d3\u00d4\7?\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7r\2"+
		"\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da"+
		"\7k\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2"+
		"\u00e1.\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7w\2"+
		"\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9"+
		"\7k\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7c\2\2\u00ec"+
		"\u00ed\7n\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7v\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7f\2\2"+
		"\u00f4\u00f5\7c\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7\7g\2\2\u00f7\62\3\2"+
		"\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7z\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7p\2\2\u0100\u0101\7e\2\2\u0101\u0102\7k\2\2\u0102\u0103\7c\2\2"+
		"\u0103\u0104\7?\2\2\u0104\64\3\2\2\2\u0105\u0109\t\2\2\2\u0106\u0108\t"+
		"\3\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\66\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0110\7$\2\2"+
		"\u010d\u010f\n\4\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0114\7$\2\2\u01148\3\2\2\2\u0115\u0117\4\62;\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119:\3\2\2\2"+
		"\u011a\u011e\7}\2\2\u011b\u011d\n\5\2\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\7\177\2\2\u0122\u0123\b\36\2\2\u0123<\3\2\2"+
		"\2\u0124\u0128\7}\2\2\u0125\u0127\n\6\2\2\u0126\u0125\3\2\2\2\u0127\u012a"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\7\f\2\2\u012c\u012d\b\37\3\2\u012d>\3\2\2\2"+
		"\u012e\u0130\n\4\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0138\7B\2\2\u0135\u0137\n\4\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013c\7\60\2\2\u013c\u013d\7e\2\2\u013d\u013e\7q"+
		"\2\2\u013e\u013f\7o\2\2\u013f\u0143\3\2\2\2\u0140\u0141\7\60\2\2\u0141"+
		"\u0142\7d\2\2\u0142\u0144\7t\2\2\u0143\u0140\3\2\2\2\u0143\u0144\3\2\2"+
		"\2\u0144@\3\2\2\2\u0145\u0147\4\62;\2\u0146\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\7\61\2\2\u014b\u014d\4\62;\2\u014c\u014b\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\7\61\2\2\u0151\u0153\4\62;\2\u0152\u0151\3\2\2\2\u0153\u0154\3"+
		"\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155B\3\2\2\2\u0156\u0157"+
		"\t\7\2\2\u0157\u0158\b\"\4\2\u0158D\3\2\2\2\u0159\u015a\13\2\2\2\u015a"+
		"\u015b\b#\5\2\u015bF\3\2\2\2\16\2\u0109\u0110\u0118\u011e\u0128\u0131"+
		"\u0138\u0143\u0148\u014e\u0154\6\3\36\2\3\37\3\3\"\4\3#\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}