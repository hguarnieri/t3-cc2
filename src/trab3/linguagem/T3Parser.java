// Generated from ../linguagem/T3.g4 by ANTLR 4.7
package trab3.linguagem;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class T3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, CADEIA=20, NUM_INT=21, COMENTARIO=22, COMENTARIOERRO=23, 
		WS=24, ERROR=25;
	public static final int
		RULE_site = 0, RULE_parametros = 1, RULE_titulo = 2, RULE_tiposite = 3, 
		RULE_descricao = 4, RULE_infopessoal = 5, RULE_nome = 6, RULE_contato = 7, 
		RULE_email = 8, RULE_telefone = 9, RULE_endereco = 10, RULE_box = 11, 
		RULE_tipobox = 12, RULE_data = 13, RULE_conteudo = 14, RULE_local = 15, 
		RULE_curso = 16, RULE_aviso = 17;
	public static final String[] ruleNames = {
		"site", "parametros", "titulo", "tiposite", "descricao", "infopessoal", 
		"nome", "contato", "email", "telefone", "endereco", "box", "tipobox", 
		"data", "conteudo", "local", "curso", "aviso"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'('", "')'", "','", "'blog'", "'cv'", "'descricao'", 
		"'infopessoal'", "'@'", "'.com'", "'.br'", "'box'", "'post'", "'educacao'", 
		"'experiencias'", "'itens'", "'conteudo'", "'\"'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "CADEIA", "NUM_INT", "COMENTARIO", 
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

	@Override
	public String getGrammarFileName() { return "T3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public T3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SiteContext extends ParserRuleContext {
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public SiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_site; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterSite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitSite(this);
		}
	}

	public final SiteContext site() throws RecognitionException {
		SiteContext _localctx = new SiteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(T__1);
			setState(38);
			parametros();
			setState(39);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public TipositeContext tiposite() {
			return getRuleContext(TipositeContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			tiposite();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(42);
				match(T__3);
				setState(43);
				titulo();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitTitulo(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipositeContext extends ParserRuleContext {
		public TipositeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiposite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterTiposite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitTiposite(this);
		}
	}

	public final TipositeContext tiposite() throws RecognitionException {
		TipositeContext _localctx = new TipositeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tiposite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescricaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitDescricao(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__6);
			setState(51);
			match(T__1);
			setState(52);
			match(CADEIA);
			setState(53);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfopessoalContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public EnderecoContext endereco() {
			return getRuleContext(EnderecoContext.class,0);
		}
		public ContatoContext contato() {
			return getRuleContext(ContatoContext.class,0);
		}
		public InfopessoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infopessoal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterInfopessoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitInfopessoal(this);
		}
	}

	public final InfopessoalContext infopessoal() throws RecognitionException {
		InfopessoalContext _localctx = new InfopessoalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_infopessoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__7);
			setState(56);
			match(T__1);
			setState(57);
			nome();
			setState(58);
			match(T__3);
			setState(59);
			data();
			setState(60);
			match(T__3);
			setState(61);
			endereco();
			setState(62);
			match(T__3);
			setState(63);
			contato();
			setState(64);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitNome(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContatoContext extends ParserRuleContext {
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public TelefoneContext telefone() {
			return getRuleContext(TelefoneContext.class,0);
		}
		public ContatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterContato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitContato(this);
		}
	}

	public final ContatoContext contato() throws RecognitionException {
		ContatoContext _localctx = new ContatoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contato);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__1);
				setState(69);
				email();
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				telefone();
				setState(71);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmailContext extends ParserRuleContext {
		public List<TerminalNode> CADEIA() { return getTokens(T3Parser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(T3Parser.CADEIA, i);
		}
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitEmail(this);
		}
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_email);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CADEIA);
			setState(76);
			match(T__8);
			setState(77);
			match(CADEIA);
			setState(78);
			match(T__9);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(79);
				match(T__10);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TelefoneContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(T3Parser.NUM_INT, 0); }
		public TelefoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telefone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterTelefone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitTelefone(this);
		}
	}

	public final TelefoneContext telefone() throws RecognitionException {
		TelefoneContext _localctx = new TelefoneContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_telefone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnderecoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public EnderecoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endereco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterEndereco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitEndereco(this);
		}
	}

	public final EnderecoContext endereco() throws RecognitionException {
		EnderecoContext _localctx = new EnderecoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_endereco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoxContext extends ParserRuleContext {
		public TipositeContext tiposite() {
			return getRuleContext(TipositeContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public ConteudoContext conteudo() {
			return getRuleContext(ConteudoContext.class,0);
		}
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public TipoboxContext tipobox() {
			return getRuleContext(TipoboxContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public CursoContext curso() {
			return getRuleContext(CursoContext.class,0);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public BoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitBox(this);
		}
	}

	public final BoxContext box() throws RecognitionException {
		BoxContext _localctx = new BoxContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_box);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__11);
				setState(87);
				match(T__1);
				setState(88);
				tiposite();
				setState(89);
				match(T__3);
				setState(90);
				titulo();
				setState(91);
				match(T__3);
				setState(92);
				conteudo();
				setState(93);
				match(T__3);
				setState(94);
				data();
				setState(95);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__11);
				setState(98);
				match(T__1);
				setState(99);
				tiposite();
				setState(100);
				match(T__3);
				setState(101);
				tipobox();
				setState(102);
				match(T__3);
				setState(103);
				data();
				setState(104);
				match(T__3);
				setState(105);
				data();
				setState(106);
				match(T__3);
				setState(107);
				local();
				setState(108);
				match(T__3);
				setState(109);
				curso();
				setState(110);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(T__11);
				setState(113);
				match(T__1);
				setState(114);
				tiposite();
				setState(115);
				match(T__3);
				setState(116);
				tipobox();
				setState(117);
				match(T__3);
				setState(118);
				data();
				setState(119);
				match(T__3);
				setState(120);
				data();
				setState(121);
				match(T__3);
				setState(122);
				local();
				setState(123);
				match(T__3);
				setState(124);
				curso();
				setState(125);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(T__11);
				setState(128);
				match(T__1);
				setState(129);
				tiposite();
				setState(130);
				match(T__3);
				setState(131);
				tipobox();
				setState(132);
				match(T__3);
				setState(133);
				titulo();
				setState(134);
				match(T__3);
				setState(135);
				descricao();
				setState(136);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(T__11);
				setState(139);
				match(T__1);
				setState(140);
				tiposite();
				setState(141);
				match(T__3);
				setState(142);
				tipobox();
				setState(143);
				match(T__3);
				setState(144);
				titulo();
				setState(145);
				match(T__3);
				setState(146);
				conteudo();
				setState(147);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoboxContext extends ParserRuleContext {
		public TipoboxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipobox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterTipobox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitTipobox(this);
		}
	}

	public final TipoboxContext tipobox() throws RecognitionException {
		TipoboxContext _localctx = new TipoboxContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipobox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(T3Parser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(T3Parser.NUM_INT, i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitData(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__17);
			setState(154);
			match(NUM_INT);
			setState(155);
			match(T__18);
			setState(156);
			match(NUM_INT);
			setState(157);
			match(T__18);
			setState(158);
			match(NUM_INT);
			setState(159);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConteudoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public ConteudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conteudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterConteudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitConteudo(this);
		}
	}

	public final ConteudoContext conteudo() throws RecognitionException {
		ConteudoContext _localctx = new ConteudoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conteudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitLocal(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CursoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public CursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterCurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitCurso(this);
		}
	}

	public final CursoContext curso() throws RecognitionException {
		CursoContext _localctx = new CursoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_curso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__1);
			setState(166);
			match(CADEIA);
			setState(167);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvisoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public AvisoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aviso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterAviso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitAviso(this);
		}
	}

	public final AvisoContext aviso() throws RecognitionException {
		AvisoContext _localctx = new AvisoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_aviso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\n\3\n\5\nS\n\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$\2\4\4\2\3\3\7\b\3\2\17\23\2\u00a2\2&\3\2\2\2\4+\3\2\2\2\6\60\3"+
		"\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f9\3\2\2\2\16D\3\2\2\2\20K\3\2\2\2\22"+
		"M\3\2\2\2\24T\3\2\2\2\26V\3\2\2\2\30\u0097\3\2\2\2\32\u0099\3\2\2\2\34"+
		"\u009b\3\2\2\2\36\u00a3\3\2\2\2 \u00a5\3\2\2\2\"\u00a7\3\2\2\2$\u00ab"+
		"\3\2\2\2&\'\7\3\2\2\'(\7\4\2\2()\5\4\3\2)*\7\5\2\2*\3\3\2\2\2+.\5\b\5"+
		"\2,-\7\6\2\2-/\5\6\4\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60\61\7\26\2\2\61"+
		"\7\3\2\2\2\62\63\t\2\2\2\63\t\3\2\2\2\64\65\7\t\2\2\65\66\7\4\2\2\66\67"+
		"\7\26\2\2\678\7\5\2\28\13\3\2\2\29:\7\n\2\2:;\7\4\2\2;<\5\16\b\2<=\7\6"+
		"\2\2=>\5\34\17\2>?\7\6\2\2?@\5\26\f\2@A\7\6\2\2AB\5\20\t\2BC\7\5\2\2C"+
		"\r\3\2\2\2DE\7\26\2\2E\17\3\2\2\2FG\7\4\2\2GL\5\22\n\2HI\5\24\13\2IJ\7"+
		"\5\2\2JL\3\2\2\2KF\3\2\2\2KH\3\2\2\2L\21\3\2\2\2MN\7\26\2\2NO\7\13\2\2"+
		"OP\7\26\2\2PR\7\f\2\2QS\7\r\2\2RQ\3\2\2\2RS\3\2\2\2S\23\3\2\2\2TU\7\27"+
		"\2\2U\25\3\2\2\2VW\7\26\2\2W\27\3\2\2\2XY\7\16\2\2YZ\7\4\2\2Z[\5\b\5\2"+
		"[\\\7\6\2\2\\]\5\6\4\2]^\7\6\2\2^_\5\36\20\2_`\7\6\2\2`a\5\34\17\2ab\7"+
		"\5\2\2b\u0098\3\2\2\2cd\7\16\2\2de\7\4\2\2ef\5\b\5\2fg\7\6\2\2gh\5\32"+
		"\16\2hi\7\6\2\2ij\5\34\17\2jk\7\6\2\2kl\5\34\17\2lm\7\6\2\2mn\5 \21\2"+
		"no\7\6\2\2op\5\"\22\2pq\7\5\2\2q\u0098\3\2\2\2rs\7\16\2\2st\7\4\2\2tu"+
		"\5\b\5\2uv\7\6\2\2vw\5\32\16\2wx\7\6\2\2xy\5\34\17\2yz\7\6\2\2z{\5\34"+
		"\17\2{|\7\6\2\2|}\5 \21\2}~\7\6\2\2~\177\5\"\22\2\177\u0080\7\5\2\2\u0080"+
		"\u0098\3\2\2\2\u0081\u0082\7\16\2\2\u0082\u0083\7\4\2\2\u0083\u0084\5"+
		"\b\5\2\u0084\u0085\7\6\2\2\u0085\u0086\5\32\16\2\u0086\u0087\7\6\2\2\u0087"+
		"\u0088\5\6\4\2\u0088\u0089\7\6\2\2\u0089\u008a\5\n\6\2\u008a\u008b\7\5"+
		"\2\2\u008b\u0098\3\2\2\2\u008c\u008d\7\16\2\2\u008d\u008e\7\4\2\2\u008e"+
		"\u008f\5\b\5\2\u008f\u0090\7\6\2\2\u0090\u0091\5\32\16\2\u0091\u0092\7"+
		"\6\2\2\u0092\u0093\5\6\4\2\u0093\u0094\7\6\2\2\u0094\u0095\5\36\20\2\u0095"+
		"\u0096\7\5\2\2\u0096\u0098\3\2\2\2\u0097X\3\2\2\2\u0097c\3\2\2\2\u0097"+
		"r\3\2\2\2\u0097\u0081\3\2\2\2\u0097\u008c\3\2\2\2\u0098\31\3\2\2\2\u0099"+
		"\u009a\t\3\2\2\u009a\33\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d\7\27"+
		"\2\2\u009d\u009e\7\25\2\2\u009e\u009f\7\27\2\2\u009f\u00a0\7\25\2\2\u00a0"+
		"\u00a1\7\27\2\2\u00a1\u00a2\7\24\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7\26"+
		"\2\2\u00a4\37\3\2\2\2\u00a5\u00a6\7\26\2\2\u00a6!\3\2\2\2\u00a7\u00a8"+
		"\7\4\2\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa\7\5\2\2\u00aa#\3\2\2\2\u00ab"+
		"\u00ac\7\26\2\2\u00ac%\3\2\2\2\6.KR\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}