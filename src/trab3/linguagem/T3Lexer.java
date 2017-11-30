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
		T__24=25, T__25=26, T__26=27, IDENT=28, CADEIA=29, NUM_INT=30, COMENTARIO=31, 
		COMENTARIOERRO=32, EMAIL=33, DATA=34, WS=35, ERROR=36;
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
		"T__25", "T__26", "IDENT", "CADEIA", "NUM_INT", "COMENTARIO", "COMENTARIOERRO", 
		"EMAIL", "DATA", "WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'('", "')'", "'tipo='", "','", "'titulo='", "'autor='", 
		"'var'", "':'", "'='", "'autor'", "'nome='", "'contato='", "'descricao='", 
		"'blog'", "'cv'", "'post'", "'data='", "'conteudo='", "'item'", "'experiencia'", 
		"'periodo='", "'organizacao='", "'atividade='", "'profissional'", "'educacional'", 
		"'infoAdicional'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "IDENT", "CADEIA", "NUM_INT", "COMENTARIO", "COMENTARIOERRO", 
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
		case 30:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			COMENTARIOERRO_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0160\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u010c\n\35\f\35\16\35\u010f\13\35"+
		"\3\36\3\36\7\36\u0113\n\36\f\36\16\36\u0116\13\36\3\36\3\36\3\37\6\37"+
		"\u011b\n\37\r\37\16\37\u011c\3 \3 \7 \u0121\n \f \16 \u0124\13 \3 \3 "+
		"\3 \3!\3!\7!\u012b\n!\f!\16!\u012e\13!\3!\3!\3!\3\"\7\"\u0134\n\"\f\""+
		"\16\"\u0137\13\"\3\"\3\"\7\"\u013b\n\"\f\"\16\"\u013e\13\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u0148\n\"\3#\6#\u014b\n#\r#\16#\u014c\3#\3#\6"+
		"#\u0151\n#\r#\16#\u0152\3#\3#\6#\u0157\n#\r#\16#\u0158\3$\3$\3$\3%\3%"+
		"\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17"+
		"$$\5\2\f\f\17\17\177\177\4\2\f\f\177\177\5\2\13\f\17\17\"\"\2\u016a\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\3K\3\2\2\2\5P\3\2\2\2\7R\3\2\2\2\tT\3\2\2\2\13Z\3\2\2\2\r"+
		"\\\3\2\2\2\17d\3\2\2\2\21k\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2"+
		"\31y\3\2\2\2\33\177\3\2\2\2\35\u0088\3\2\2\2\37\u0093\3\2\2\2!\u0098\3"+
		"\2\2\2#\u009b\3\2\2\2%\u00a0\3\2\2\2\'\u00a6\3\2\2\2)\u00b0\3\2\2\2+\u00b5"+
		"\3\2\2\2-\u00c1\3\2\2\2/\u00ca\3\2\2\2\61\u00d7\3\2\2\2\63\u00e2\3\2\2"+
		"\2\65\u00ef\3\2\2\2\67\u00fb\3\2\2\29\u0109\3\2\2\2;\u0110\3\2\2\2=\u011a"+
		"\3\2\2\2?\u011e\3\2\2\2A\u0128\3\2\2\2C\u0135\3\2\2\2E\u014a\3\2\2\2G"+
		"\u015a\3\2\2\2I\u015d\3\2\2\2KL\7u\2\2LM\7k\2\2MN\7v\2\2NO\7g\2\2O\4\3"+
		"\2\2\2PQ\7*\2\2Q\6\3\2\2\2RS\7+\2\2S\b\3\2\2\2TU\7v\2\2UV\7k\2\2VW\7r"+
		"\2\2WX\7q\2\2XY\7?\2\2Y\n\3\2\2\2Z[\7.\2\2[\f\3\2\2\2\\]\7v\2\2]^\7k\2"+
		"\2^_\7v\2\2_`\7w\2\2`a\7n\2\2ab\7q\2\2bc\7?\2\2c\16\3\2\2\2de\7c\2\2e"+
		"f\7w\2\2fg\7v\2\2gh\7q\2\2hi\7t\2\2ij\7?\2\2j\20\3\2\2\2kl\7x\2\2lm\7"+
		"c\2\2mn\7t\2\2n\22\3\2\2\2op\7<\2\2p\24\3\2\2\2qr\7?\2\2r\26\3\2\2\2s"+
		"t\7c\2\2tu\7w\2\2uv\7v\2\2vw\7q\2\2wx\7t\2\2x\30\3\2\2\2yz\7p\2\2z{\7"+
		"q\2\2{|\7o\2\2|}\7g\2\2}~\7?\2\2~\32\3\2\2\2\177\u0080\7e\2\2\u0080\u0081"+
		"\7q\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7v\2\2\u0085\u0086\7q\2\2\u0086\u0087\7?\2\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\7f\2\2\u0089\u008a\7g\2\2\u008a\u008b\7u\2\2\u008b\u008c\7e\2\2"+
		"\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7e\2\2\u008f\u0090"+
		"\7c\2\2\u0090\u0091\7q\2\2\u0091\u0092\7?\2\2\u0092\36\3\2\2\2\u0093\u0094"+
		"\7d\2\2\u0094\u0095\7n\2\2\u0095\u0096\7q\2\2\u0096\u0097\7i\2\2\u0097"+
		" \3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7x\2\2\u009a\"\3\2\2\2\u009b"+
		"\u009c\7r\2\2\u009c\u009d\7q\2\2\u009d\u009e\7u\2\2\u009e\u009f\7v\2\2"+
		"\u009f$\3\2\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7v\2"+
		"\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7?\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7"+
		"e\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7?\2\2\u00af(\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7o\2\2\u00b4*\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7z\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7t\2\2"+
		"\u00ba\u00bb\7k\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be"+
		"\7e\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7c\2\2\u00c0,\3\2\2\2\u00c1\u00c2"+
		"\7r\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7?\2\2"+
		"\u00c9.\3\2\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7i\2"+
		"\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1"+
		"\7|\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\u00d6\7?\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7c\2\2\u00d8"+
		"\u00d9\7v\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7x\2\2\u00db\u00dc\7k\2\2"+
		"\u00dc\u00dd\7f\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7f\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u00e1\7?\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7k\2\2\u00e7"+
		"\u00e8\7u\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7q\2\2"+
		"\u00eb\u00ec\7p\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7n\2\2\u00ee\64\3\2"+
		"\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3"+
		"\7e\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7q\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7n\2\2"+
		"\u00fa\66\3\2\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7"+
		"h\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7C\2\2\u0100\u0101\7f\2\2\u0101\u0102"+
		"\7k\2\2\u0102\u0103\7e\2\2\u0103\u0104\7k\2\2\u0104\u0105\7q\2\2\u0105"+
		"\u0106\7p\2\2\u0106\u0107\7c\2\2\u0107\u0108\7n\2\2\u01088\3\2\2\2\u0109"+
		"\u010d\t\2\2\2\u010a\u010c\t\3\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e:\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u0110\u0114\7$\2\2\u0111\u0113\n\4\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7$\2\2\u0118<\3\2\2\2\u0119\u011b"+
		"\4\62;\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d>\3\2\2\2\u011e\u0122\7}\2\2\u011f\u0121\n\5\2\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\177\2\2\u0126"+
		"\u0127\b \2\2\u0127@\3\2\2\2\u0128\u012c\7}\2\2\u0129\u012b\n\6\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\f\2\2\u0130"+
		"\u0131\b!\3\2\u0131B\3\2\2\2\u0132\u0134\n\4\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u013c\7B\2\2\u0139\u013b\n\4\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\60\2\2\u0140"+
		"\u0141\7e\2\2\u0141\u0142\7q\2\2\u0142\u0143\7o\2\2\u0143\u0147\3\2\2"+
		"\2\u0144\u0145\7\60\2\2\u0145\u0146\7d\2\2\u0146\u0148\7t\2\2\u0147\u0144"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148D\3\2\2\2\u0149\u014b\4\62;\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7\61\2\2\u014f\u0151\4\62;\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0156\7\61\2\2\u0155\u0157\4\62;\2\u0156"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159F\3\2\2\2\u015a\u015b\t\7\2\2\u015b\u015c\b$\4\2\u015cH\3\2"+
		"\2\2\u015d\u015e\13\2\2\2\u015e\u015f\b%\5\2\u015fJ\3\2\2\2\16\2\u010d"+
		"\u0114\u011c\u0122\u012c\u0135\u013c\u0147\u014c\u0152\u0158\6\3 \2\3"+
		"!\3\3$\4\3%\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}