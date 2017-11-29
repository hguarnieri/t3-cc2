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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, CADEIA=24, 
		NUM_INT=25, COMENTARIO=26, COMENTARIOERRO=27, EMAIL=28, DATA=29, WS=30, 
		ERROR=31;
	public static final int
		RULE_site = 0, RULE_parametros = 1, RULE_autor = 2, RULE_tiposite = 3, 
		RULE_titulo = 4, RULE_descricao = 5, RULE_nome = 6, RULE_contato = 7, 
		RULE_estruturas = 8, RULE_estruturablog = 9, RULE_post = 10, RULE_estruturasite = 11, 
		RULE_item = 12, RULE_estruturacv = 13, RULE_secoes = 14, RULE_secaoExperiencia = 15, 
		RULE_tipoexperiencia = 16, RULE_organizacao = 17, RULE_atividade = 18, 
		RULE_periodo = 19, RULE_secaoInfoAdicional = 20;
	public static final String[] ruleNames = {
		"site", "parametros", "autor", "tiposite", "titulo", "descricao", "nome", 
		"contato", "estruturas", "estruturablog", "post", "estruturasite", "item", 
		"estruturacv", "secoes", "secaoExperiencia", "tipoexperiencia", "organizacao", 
		"atividade", "periodo", "secaoInfoAdicional"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'('", "')'", "'tipo='", "','", "'titulo='", "'autor='", 
		"'nome='", "'contato='", "'descricao='", "'blog'", "'cv'", "'post'", "'data='", 
		"'conteudo='", "'item'", "'experiencia'", "'periodo='", "'organizacao='", 
		"'atividade='", "'profissional'", "'educacional'", "'infoAdicional'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"CADEIA", "NUM_INT", "COMENTARIO", "COMENTARIOERRO", "EMAIL", "DATA", 
		"WS", "ERROR"
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
		public EstruturasContext estruturas() {
			return getRuleContext(EstruturasContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitSite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiteContext site() throws RecognitionException {
		SiteContext _localctx = new SiteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(T__1);
			setState(44);
			parametros();
			setState(45);
			match(T__2);
			setState(46);
			estruturas();
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
		public AutorContext autor() {
			return getRuleContext(AutorContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__3);
			setState(49);
			tiposite();
			setState(50);
			match(T__4);
			setState(51);
			match(T__5);
			setState(52);
			titulo();
			setState(53);
			match(T__4);
			setState(54);
			match(T__6);
			setState(55);
			autor();
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

	public static class AutorContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public ContatoContext contato() {
			return getRuleContext(ContatoContext.class,0);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public AutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterAutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitAutor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitAutor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutorContext autor() throws RecognitionException {
		AutorContext _localctx = new AutorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_autor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__1);
			setState(58);
			match(T__7);
			setState(59);
			nome();
			setState(60);
			match(T__4);
			setState(61);
			match(T__8);
			setState(62);
			contato();
			setState(63);
			match(T__4);
			setState(64);
			match(T__9);
			setState(65);
			descricao();
			setState(66);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitTiposite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipositeContext tiposite() throws RecognitionException {
		TipositeContext _localctx = new TipositeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tiposite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitDescricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
		public TerminalNode EMAIL() { return getToken(T3Parser.EMAIL, 0); }
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitContato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContatoContext contato() throws RecognitionException {
		ContatoContext _localctx = new ContatoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==CADEIA || _la==EMAIL) ) {
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

	public static class EstruturasContext extends ParserRuleContext {
		public EstruturablogContext estruturablog() {
			return getRuleContext(EstruturablogContext.class,0);
		}
		public EstruturasiteContext estruturasite() {
			return getRuleContext(EstruturasiteContext.class,0);
		}
		public EstruturacvContext estruturacv() {
			return getRuleContext(EstruturacvContext.class,0);
		}
		public EstruturasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterEstruturas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitEstruturas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitEstruturas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturasContext estruturas() throws RecognitionException {
		EstruturasContext _localctx = new EstruturasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_estruturas);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				estruturablog();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				estruturasite();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				estruturacv();
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

	public static class EstruturablogContext extends ParserRuleContext {
		public List<PostContext> post() {
			return getRuleContexts(PostContext.class);
		}
		public PostContext post(int i) {
			return getRuleContext(PostContext.class,i);
		}
		public EstruturablogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturablog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterEstruturablog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitEstruturablog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitEstruturablog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturablogContext estruturablog() throws RecognitionException {
		EstruturablogContext _localctx = new EstruturablogContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_estruturablog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(83);
				post();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PostContext extends ParserRuleContext {
		public List<TerminalNode> CADEIA() { return getTokens(T3Parser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(T3Parser.CADEIA, i);
		}
		public TerminalNode DATA() { return getToken(T3Parser.DATA, 0); }
		public PostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterPost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitPost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitPost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostContext post() throws RecognitionException {
		PostContext _localctx = new PostContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_post);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__12);
			setState(90);
			match(T__1);
			setState(91);
			match(T__5);
			setState(92);
			match(CADEIA);
			setState(93);
			match(T__4);
			setState(94);
			match(T__13);
			setState(95);
			match(DATA);
			setState(96);
			match(T__4);
			setState(97);
			match(T__14);
			setState(98);
			match(CADEIA);
			setState(99);
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

	public static class EstruturasiteContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public EstruturasiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturasite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterEstruturasite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitEstruturasite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitEstruturasite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturasiteContext estruturasite() throws RecognitionException {
		EstruturasiteContext _localctx = new EstruturasiteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_estruturasite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(101);
				item();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ItemContext extends ParserRuleContext {
		public List<TerminalNode> CADEIA() { return getTokens(T3Parser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(T3Parser.CADEIA, i);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__15);
			setState(108);
			match(T__1);
			setState(109);
			match(T__5);
			setState(110);
			match(CADEIA);
			setState(111);
			match(T__4);
			setState(112);
			match(T__9);
			setState(113);
			match(CADEIA);
			setState(114);
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

	public static class EstruturacvContext extends ParserRuleContext {
		public List<SecoesContext> secoes() {
			return getRuleContexts(SecoesContext.class);
		}
		public SecoesContext secoes(int i) {
			return getRuleContext(SecoesContext.class,i);
		}
		public EstruturacvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturacv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterEstruturacv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitEstruturacv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitEstruturacv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturacvContext estruturacv() throws RecognitionException {
		EstruturacvContext _localctx = new EstruturacvContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_estruturacv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				secoes();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 || _la==T__22 );
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

	public static class SecoesContext extends ParserRuleContext {
		public SecaoExperienciaContext secaoExperiencia() {
			return getRuleContext(SecaoExperienciaContext.class,0);
		}
		public SecaoInfoAdicionalContext secaoInfoAdicional() {
			return getRuleContext(SecaoInfoAdicionalContext.class,0);
		}
		public SecoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterSecoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitSecoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitSecoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecoesContext secoes() throws RecognitionException {
		SecoesContext _localctx = new SecoesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_secoes);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				secaoExperiencia();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				secaoInfoAdicional();
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

	public static class SecaoExperienciaContext extends ParserRuleContext {
		public TipoexperienciaContext tipoexperiencia() {
			return getRuleContext(TipoexperienciaContext.class,0);
		}
		public PeriodoContext periodo() {
			return getRuleContext(PeriodoContext.class,0);
		}
		public OrganizacaoContext organizacao() {
			return getRuleContext(OrganizacaoContext.class,0);
		}
		public AtividadeContext atividade() {
			return getRuleContext(AtividadeContext.class,0);
		}
		public SecaoExperienciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secaoExperiencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterSecaoExperiencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitSecaoExperiencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitSecaoExperiencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecaoExperienciaContext secaoExperiencia() throws RecognitionException {
		SecaoExperienciaContext _localctx = new SecaoExperienciaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_secaoExperiencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__16);
			setState(126);
			match(T__1);
			setState(127);
			match(T__3);
			setState(128);
			tipoexperiencia();
			setState(129);
			match(T__4);
			setState(130);
			match(T__17);
			setState(131);
			periodo();
			setState(132);
			match(T__4);
			setState(133);
			match(T__18);
			setState(134);
			organizacao();
			setState(135);
			match(T__4);
			setState(136);
			match(T__19);
			setState(137);
			atividade();
			setState(138);
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

	public static class TipoexperienciaContext extends ParserRuleContext {
		public int tipo;
		public TipoexperienciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoexperiencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterTipoexperiencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitTipoexperiencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitTipoexperiencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoexperienciaContext tipoexperiencia() throws RecognitionException {
		TipoexperienciaContext _localctx = new TipoexperienciaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipoexperiencia);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__20);
				 ((TipoexperienciaContext)_localctx).tipo =  1; 
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__21);
				 ((TipoexperienciaContext)_localctx).tipo =  2; 
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

	public static class OrganizacaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public OrganizacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_organizacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterOrganizacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitOrganizacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitOrganizacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrganizacaoContext organizacao() throws RecognitionException {
		OrganizacaoContext _localctx = new OrganizacaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_organizacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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

	public static class AtividadeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(T3Parser.CADEIA, 0); }
		public AtividadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atividade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterAtividade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitAtividade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitAtividade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtividadeContext atividade() throws RecognitionException {
		AtividadeContext _localctx = new AtividadeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atividade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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

	public static class PeriodoContext extends ParserRuleContext {
		public List<TerminalNode> DATA() { return getTokens(T3Parser.DATA); }
		public TerminalNode DATA(int i) {
			return getToken(T3Parser.DATA, i);
		}
		public PeriodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterPeriodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitPeriodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitPeriodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodoContext periodo() throws RecognitionException {
		PeriodoContext _localctx = new PeriodoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_periodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(DATA);
			setState(151);
			match(T__4);
			setState(152);
			match(DATA);
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

	public static class SecaoInfoAdicionalContext extends ParserRuleContext {
		public List<TerminalNode> CADEIA() { return getTokens(T3Parser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(T3Parser.CADEIA, i);
		}
		public SecaoInfoAdicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secaoInfoAdicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterSecaoInfoAdicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitSecaoInfoAdicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitSecaoInfoAdicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecaoInfoAdicionalContext secaoInfoAdicional() throws RecognitionException {
		SecaoInfoAdicionalContext _localctx = new SecaoInfoAdicionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_secaoInfoAdicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__22);
			setState(155);
			match(T__1);
			setState(156);
			match(T__5);
			setState(157);
			match(CADEIA);
			setState(158);
			match(T__4);
			setState(159);
			match(T__9);
			setState(160);
			match(CADEIA);
			setState(161);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\nT\n\n\3\13"+
		"\7\13W\n\13\f\13\16\13Z\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\7\ri\n\r\f\r\16\rl\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\6\17x\n\17\r\17\16\17y\3\20\3\20\5\20~\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\5\22\u0093\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\4\4\2\3\3\r\16\4\2\32\32\36\36\2"+
		"\u0097\2,\3\2\2\2\4\62\3\2\2\2\6;\3\2\2\2\bF\3\2\2\2\nH\3\2\2\2\fJ\3\2"+
		"\2\2\16L\3\2\2\2\20N\3\2\2\2\22S\3\2\2\2\24X\3\2\2\2\26[\3\2\2\2\30j\3"+
		"\2\2\2\32m\3\2\2\2\34w\3\2\2\2\36}\3\2\2\2 \177\3\2\2\2\"\u0092\3\2\2"+
		"\2$\u0094\3\2\2\2&\u0096\3\2\2\2(\u0098\3\2\2\2*\u009c\3\2\2\2,-\7\3\2"+
		"\2-.\7\4\2\2./\5\4\3\2/\60\7\5\2\2\60\61\5\22\n\2\61\3\3\2\2\2\62\63\7"+
		"\6\2\2\63\64\5\b\5\2\64\65\7\7\2\2\65\66\7\b\2\2\66\67\5\n\6\2\678\7\7"+
		"\2\289\7\t\2\29:\5\6\4\2:\5\3\2\2\2;<\7\4\2\2<=\7\n\2\2=>\5\16\b\2>?\7"+
		"\7\2\2?@\7\13\2\2@A\5\20\t\2AB\7\7\2\2BC\7\f\2\2CD\5\f\7\2DE\7\5\2\2E"+
		"\7\3\2\2\2FG\t\2\2\2G\t\3\2\2\2HI\7\32\2\2I\13\3\2\2\2JK\7\32\2\2K\r\3"+
		"\2\2\2LM\7\32\2\2M\17\3\2\2\2NO\t\3\2\2O\21\3\2\2\2PT\5\24\13\2QT\5\30"+
		"\r\2RT\5\34\17\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\23\3\2\2\2UW\5\26\f\2"+
		"VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\25\3\2\2\2ZX\3\2\2\2[\\\7\17"+
		"\2\2\\]\7\4\2\2]^\7\b\2\2^_\7\32\2\2_`\7\7\2\2`a\7\20\2\2ab\7\37\2\2b"+
		"c\7\7\2\2cd\7\21\2\2de\7\32\2\2ef\7\5\2\2f\27\3\2\2\2gi\5\32\16\2hg\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\31\3\2\2\2lj\3\2\2\2mn\7\22\2\2"+
		"no\7\4\2\2op\7\b\2\2pq\7\32\2\2qr\7\7\2\2rs\7\f\2\2st\7\32\2\2tu\7\5\2"+
		"\2u\33\3\2\2\2vx\5\36\20\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\35"+
		"\3\2\2\2{~\5 \21\2|~\5*\26\2}{\3\2\2\2}|\3\2\2\2~\37\3\2\2\2\177\u0080"+
		"\7\23\2\2\u0080\u0081\7\4\2\2\u0081\u0082\7\6\2\2\u0082\u0083\5\"\22\2"+
		"\u0083\u0084\7\7\2\2\u0084\u0085\7\24\2\2\u0085\u0086\5(\25\2\u0086\u0087"+
		"\7\7\2\2\u0087\u0088\7\25\2\2\u0088\u0089\5$\23\2\u0089\u008a\7\7\2\2"+
		"\u008a\u008b\7\26\2\2\u008b\u008c\5&\24\2\u008c\u008d\7\5\2\2\u008d!\3"+
		"\2\2\2\u008e\u008f\7\27\2\2\u008f\u0093\b\22\1\2\u0090\u0091\7\30\2\2"+
		"\u0091\u0093\b\22\1\2\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0093#\3"+
		"\2\2\2\u0094\u0095\7\32\2\2\u0095%\3\2\2\2\u0096\u0097\7\32\2\2\u0097"+
		"\'\3\2\2\2\u0098\u0099\7\37\2\2\u0099\u009a\7\7\2\2\u009a\u009b\7\37\2"+
		"\2\u009b)\3\2\2\2\u009c\u009d\7\31\2\2\u009d\u009e\7\4\2\2\u009e\u009f"+
		"\7\b\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\7\f\2\2"+
		"\u00a2\u00a3\7\32\2\2\u00a3\u00a4\7\5\2\2\u00a4+\3\2\2\2\bSXjy}\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}