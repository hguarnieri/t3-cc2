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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, IDENT=28, CADEIA=29, NUM_INT=30, COMENTARIO=31, 
		COMENTARIOERRO=32, EMAIL=33, DATA=34, WS=35, ERROR=36;
	public static final int
		RULE_site = 0, RULE_parametros = 1, RULE_identificador = 2, RULE_var = 3, 
		RULE_tipo_var = 4, RULE_autor = 5, RULE_tiposite = 6, RULE_titulo = 7, 
		RULE_descricao = 8, RULE_nome = 9, RULE_contato = 10, RULE_estruturas = 11, 
		RULE_estruturablog = 12, RULE_post = 13, RULE_estruturasite = 14, RULE_item = 15, 
		RULE_estruturacv = 16, RULE_secoes = 17, RULE_secaoExperiencia = 18, RULE_tipoexperiencia = 19, 
		RULE_organizacao = 20, RULE_atividade = 21, RULE_periodo = 22, RULE_secaoInfoAdicional = 23;
	public static final String[] ruleNames = {
		"site", "parametros", "identificador", "var", "tipo_var", "autor", "tiposite", 
		"titulo", "descricao", "nome", "contato", "estruturas", "estruturablog", 
		"post", "estruturasite", "item", "estruturacv", "secoes", "secaoExperiencia", 
		"tipoexperiencia", "organizacao", "atividade", "periodo", "secaoInfoAdicional"
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(48);
				var();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__0);
			setState(55);
			match(T__1);
			setState(56);
			parametros();
			setState(57);
			match(T__2);
			setState(58);
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
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
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
			setState(60);
			match(T__3);
			setState(61);
			tiposite();
			setState(62);
			match(T__4);
			setState(63);
			match(T__5);
			setState(64);
			titulo();
			setState(65);
			match(T__4);
			setState(66);
			match(T__6);
			setState(67);
			identificador();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(T3Parser.IDENT, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IDENT);
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

	public static class VarContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Tipo_varContext tipo_var() {
			return getRuleContext(Tipo_varContext.class,0);
		}
		public AutorContext autor() {
			return getRuleContext(AutorContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(72);
			identificador();
			setState(73);
			match(T__8);
			setState(74);
			tipo_var();
			setState(75);
			match(T__9);
			{
			setState(76);
			autor();
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

	public static class Tipo_varContext extends ParserRuleContext {
		public int tipo;
		public Tipo_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterTipo_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitTipo_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitTipo_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_varContext tipo_var() throws RecognitionException {
		Tipo_varContext _localctx = new Tipo_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__10);
			 ((Tipo_varContext)_localctx).tipo = 1; 
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
		enterRule(_localctx, 10, RULE_autor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__1);
			setState(82);
			match(T__11);
			setState(83);
			nome();
			setState(84);
			match(T__4);
			setState(85);
			match(T__12);
			setState(86);
			contato();
			setState(87);
			match(T__4);
			setState(88);
			match(T__13);
			setState(89);
			descricao();
			setState(90);
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
		enterRule(_localctx, 12, RULE_tiposite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		enterRule(_localctx, 16, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		enterRule(_localctx, 18, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 20, RULE_contato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 22, RULE_estruturas);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				estruturablog();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				estruturasite();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
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
		enterRule(_localctx, 24, RULE_estruturablog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(107);
				post();
				}
				}
				setState(112);
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
		enterRule(_localctx, 26, RULE_post);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__16);
			setState(114);
			match(T__1);
			setState(115);
			match(T__5);
			setState(116);
			match(CADEIA);
			setState(117);
			match(T__4);
			setState(118);
			match(T__17);
			setState(119);
			match(DATA);
			setState(120);
			match(T__4);
			setState(121);
			match(T__18);
			setState(122);
			match(CADEIA);
			setState(123);
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
		enterRule(_localctx, 28, RULE_estruturasite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(125);
				item();
				}
				}
				setState(130);
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
		enterRule(_localctx, 30, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__19);
			setState(132);
			match(T__1);
			setState(133);
			match(T__5);
			setState(134);
			match(CADEIA);
			setState(135);
			match(T__4);
			setState(136);
			match(T__13);
			setState(137);
			match(CADEIA);
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
		enterRule(_localctx, 32, RULE_estruturacv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				secoes();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 || _la==T__26 );
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
		enterRule(_localctx, 34, RULE_secoes);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				secaoExperiencia();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
		enterRule(_localctx, 36, RULE_secaoExperiencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__20);
			setState(150);
			match(T__1);
			setState(151);
			match(T__3);
			setState(152);
			tipoexperiencia();
			setState(153);
			match(T__4);
			setState(154);
			match(T__21);
			setState(155);
			periodo();
			setState(156);
			match(T__4);
			setState(157);
			match(T__22);
			setState(158);
			organizacao();
			setState(159);
			match(T__4);
			setState(160);
			match(T__23);
			setState(161);
			atividade();
			setState(162);
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
		enterRule(_localctx, 38, RULE_tipoexperiencia);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__24);
				 ((TipoexperienciaContext)_localctx).tipo =  1; 
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__25);
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
		enterRule(_localctx, 40, RULE_organizacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		enterRule(_localctx, 42, RULE_atividade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		enterRule(_localctx, 44, RULE_periodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(DATA);
			setState(175);
			match(T__4);
			setState(176);
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
		enterRule(_localctx, 46, RULE_secaoInfoAdicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__26);
			setState(179);
			match(T__1);
			setState(180);
			match(T__5);
			setState(181);
			match(CADEIA);
			setState(182);
			match(T__4);
			setState(183);
			match(T__13);
			setState(184);
			match(CADEIA);
			setState(185);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\5\rl\n\r\3\16\7\16o\n\16\f\16\16\16r\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\7\20"+
		"\u0081\n\20\f\20\16\20\u0084\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\6\22\u0090\n\22\r\22\16\22\u0091\3\23\3\23\5\23\u0096"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00ab\n\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\2\2"+
		"\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\4\2\3\3\21"+
		"\22\4\2\37\37##\2\u00ad\2\65\3\2\2\2\4>\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2"+
		"\nP\3\2\2\2\fS\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22b\3\2\2\2\24d\3\2\2\2"+
		"\26f\3\2\2\2\30k\3\2\2\2\32p\3\2\2\2\34s\3\2\2\2\36\u0082\3\2\2\2 \u0085"+
		"\3\2\2\2\"\u008f\3\2\2\2$\u0095\3\2\2\2&\u0097\3\2\2\2(\u00aa\3\2\2\2"+
		"*\u00ac\3\2\2\2,\u00ae\3\2\2\2.\u00b0\3\2\2\2\60\u00b4\3\2\2\2\62\64\5"+
		"\b\5\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2"+
		"\2\2\67\65\3\2\2\289\7\3\2\29:\7\4\2\2:;\5\4\3\2;<\7\5\2\2<=\5\30\r\2"+
		"=\3\3\2\2\2>?\7\6\2\2?@\5\16\b\2@A\7\7\2\2AB\7\b\2\2BC\5\20\t\2CD\7\7"+
		"\2\2DE\7\t\2\2EF\5\6\4\2F\5\3\2\2\2GH\7\36\2\2H\7\3\2\2\2IJ\7\n\2\2JK"+
		"\5\6\4\2KL\7\13\2\2LM\5\n\6\2MN\7\f\2\2NO\5\f\7\2O\t\3\2\2\2PQ\7\r\2\2"+
		"QR\b\6\1\2R\13\3\2\2\2ST\7\4\2\2TU\7\16\2\2UV\5\24\13\2VW\7\7\2\2WX\7"+
		"\17\2\2XY\5\26\f\2YZ\7\7\2\2Z[\7\20\2\2[\\\5\22\n\2\\]\7\5\2\2]\r\3\2"+
		"\2\2^_\t\2\2\2_\17\3\2\2\2`a\7\37\2\2a\21\3\2\2\2bc\7\37\2\2c\23\3\2\2"+
		"\2de\7\37\2\2e\25\3\2\2\2fg\t\3\2\2g\27\3\2\2\2hl\5\32\16\2il\5\36\20"+
		"\2jl\5\"\22\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\31\3\2\2\2mo\5\34\17\2nm"+
		"\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\33\3\2\2\2rp\3\2\2\2st\7\23\2"+
		"\2tu\7\4\2\2uv\7\b\2\2vw\7\37\2\2wx\7\7\2\2xy\7\24\2\2yz\7$\2\2z{\7\7"+
		"\2\2{|\7\25\2\2|}\7\37\2\2}~\7\5\2\2~\35\3\2\2\2\177\u0081\5 \21\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\37\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\26\2\2\u0086\u0087"+
		"\7\4\2\2\u0087\u0088\7\b\2\2\u0088\u0089\7\37\2\2\u0089\u008a\7\7\2\2"+
		"\u008a\u008b\7\20\2\2\u008b\u008c\7\37\2\2\u008c\u008d\7\5\2\2\u008d!"+
		"\3\2\2\2\u008e\u0090\5$\23\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092#\3\2\2\2\u0093\u0096\5&\24\2"+
		"\u0094\u0096\5\60\31\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096%"+
		"\3\2\2\2\u0097\u0098\7\27\2\2\u0098\u0099\7\4\2\2\u0099\u009a\7\6\2\2"+
		"\u009a\u009b\5(\25\2\u009b\u009c\7\7\2\2\u009c\u009d\7\30\2\2\u009d\u009e"+
		"\5.\30\2\u009e\u009f\7\7\2\2\u009f\u00a0\7\31\2\2\u00a0\u00a1\5*\26\2"+
		"\u00a1\u00a2\7\7\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\5,\27\2\u00a4\u00a5"+
		"\7\5\2\2\u00a5\'\3\2\2\2\u00a6\u00a7\7\33\2\2\u00a7\u00ab\b\25\1\2\u00a8"+
		"\u00a9\7\34\2\2\u00a9\u00ab\b\25\1\2\u00aa\u00a6\3\2\2\2\u00aa\u00a8\3"+
		"\2\2\2\u00ab)\3\2\2\2\u00ac\u00ad\7\37\2\2\u00ad+\3\2\2\2\u00ae\u00af"+
		"\7\37\2\2\u00af-\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2\7\7\2\2\u00b2"+
		"\u00b3\7$\2\2\u00b3/\3\2\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\7\4\2\2"+
		"\u00b6\u00b7\7\b\2\2\u00b7\u00b8\7\37\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba"+
		"\7\20\2\2\u00ba\u00bb\7\37\2\2\u00bb\u00bc\7\5\2\2\u00bc\61\3\2\2\2\t"+
		"\65kp\u0082\u0091\u0095\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}