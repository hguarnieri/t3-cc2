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
		T__24=25, IDENT=26, CADEIA=27, NUM_INT=28, COMENTARIO=29, COMENTARIOERRO=30, 
		EMAIL=31, DATA=32, WS=33, ERROR=34;
	public static final int
		RULE_decl_site = 0, RULE_site = 1, RULE_parametros = 2, RULE_decl_autor = 3, 
		RULE_autor_id = 4, RULE_autor = 5, RULE_tiposite = 6, RULE_titulo = 7, 
		RULE_descricao = 8, RULE_nome = 9, RULE_conteudo = 10, RULE_contato = 11, 
		RULE_estruturas = 12, RULE_estruturablog = 13, RULE_post = 14, RULE_estruturacv = 15, 
		RULE_secoes = 16, RULE_secaoExperiencia = 17, RULE_tipoexperiencia = 18, 
		RULE_organizacao = 19, RULE_atividade = 20, RULE_periodo = 21, RULE_secaoAtividade = 22, 
		RULE_experiencia_id = 23;
	public static final String[] ruleNames = {
		"decl_site", "site", "parametros", "decl_autor", "autor_id", "autor", 
		"tiposite", "titulo", "descricao", "nome", "conteudo", "contato", "estruturas", 
		"estruturablog", "post", "estruturacv", "secoes", "secaoExperiencia", 
		"tipoexperiencia", "organizacao", "atividade", "periodo", "secaoAtividade", 
		"experiencia_id"
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
	public static class Decl_siteContext extends ParserRuleContext {
		public List<Decl_autorContext> decl_autor() {
			return getRuleContexts(Decl_autorContext.class);
		}
		public Decl_autorContext decl_autor(int i) {
			return getRuleContext(Decl_autorContext.class,i);
		}
		public SiteContext site() {
			return getRuleContext(SiteContext.class,0);
		}
		public Decl_siteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_site; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterDecl_site(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitDecl_site(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitDecl_site(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_siteContext decl_site() throws RecognitionException {
		Decl_siteContext _localctx = new Decl_siteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_decl_site);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==T__7) {
					{
					{
					setState(48);
					decl_autor();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				site();
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
		enterRule(_localctx, 2, RULE_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__0);
			setState(58);
			match(T__1);
			setState(59);
			parametros();
			setState(60);
			match(T__2);
			setState(61);
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
		public Autor_idContext autor_id() {
			return getRuleContext(Autor_idContext.class,0);
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
		enterRule(_localctx, 4, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__3);
			setState(64);
			tiposite();
			setState(65);
			match(T__4);
			setState(66);
			match(T__5);
			setState(67);
			titulo();
			setState(68);
			match(T__4);
			setState(69);
			match(T__6);
			setState(70);
			autor_id();
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

	public static class Decl_autorContext extends ParserRuleContext {
		public AutorContext autor() {
			return getRuleContext(AutorContext.class,0);
		}
		public SiteContext site() {
			return getRuleContext(SiteContext.class,0);
		}
		public Decl_autorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_autor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterDecl_autor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitDecl_autor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitDecl_autor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_autorContext decl_autor() throws RecognitionException {
		Decl_autorContext _localctx = new Decl_autorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_autor);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__7);
				setState(73);
				match(T__1);
				setState(74);
				autor();
				setState(75);
				match(T__2);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				site();
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

	public static class Autor_idContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(T3Parser.NUM_INT, 0); }
		public Autor_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autor_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterAutor_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitAutor_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitAutor_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Autor_idContext autor_id() throws RecognitionException {
		Autor_idContext _localctx = new Autor_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_autor_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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

	public static class AutorContext extends ParserRuleContext {
		public Autor_idContext autor_id() {
			return getRuleContext(Autor_idContext.class,0);
		}
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
			setState(82);
			match(T__8);
			setState(83);
			autor_id();
			setState(84);
			match(T__4);
			setState(85);
			match(T__9);
			setState(86);
			nome();
			setState(87);
			match(T__4);
			setState(88);
			match(T__10);
			setState(89);
			contato();
			setState(90);
			match(T__4);
			setState(91);
			match(T__11);
			setState(92);
			descricao();
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
		public String tipo;
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
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__12);
				 ((TipositeContext)_localctx).tipo =  "blog"; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__13);
				 ((TipositeContext)_localctx).tipo =  "cv"; 
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
			setState(100);
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
			setState(102);
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
			setState(104);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitConteudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConteudoContext conteudo() throws RecognitionException {
		ConteudoContext _localctx = new ConteudoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conteudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		enterRule(_localctx, 22, RULE_contato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
		enterRule(_localctx, 24, RULE_estruturas);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				estruturablog();
				}
				break;
			case T__17:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				estruturacv();
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
		enterRule(_localctx, 26, RULE_estruturablog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				post();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
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
		public Autor_idContext autor_id() {
			return getRuleContext(Autor_idContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public TerminalNode DATA() { return getToken(T3Parser.DATA, 0); }
		public ConteudoContext conteudo() {
			return getRuleContext(ConteudoContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_post);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__14);
			setState(120);
			match(T__1);
			setState(121);
			match(T__6);
			setState(122);
			autor_id();
			setState(123);
			match(T__4);
			setState(124);
			match(T__5);
			setState(125);
			titulo();
			setState(126);
			match(T__4);
			setState(127);
			match(T__15);
			setState(128);
			match(DATA);
			setState(129);
			match(T__4);
			setState(130);
			match(T__16);
			setState(131);
			conteudo();
			setState(132);
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
		enterRule(_localctx, 30, RULE_estruturacv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				secoes();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 || _la==T__23 );
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
		public SecaoAtividadeContext secaoAtividade() {
			return getRuleContext(SecaoAtividadeContext.class,0);
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
		enterRule(_localctx, 32, RULE_secoes);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				secaoExperiencia();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				secaoAtividade();
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
		public Experiencia_idContext experiencia_id() {
			return getRuleContext(Experiencia_idContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_secaoExperiencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__17);
			setState(144);
			match(T__1);
			setState(145);
			match(T__8);
			setState(146);
			experiencia_id();
			setState(147);
			match(T__4);
			setState(148);
			match(T__3);
			setState(149);
			tipoexperiencia();
			setState(150);
			match(T__4);
			setState(151);
			match(T__18);
			setState(152);
			periodo();
			setState(153);
			match(T__4);
			setState(154);
			match(T__19);
			setState(155);
			organizacao();
			setState(156);
			match(T__4);
			setState(157);
			match(T__20);
			setState(158);
			atividade();
			setState(159);
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
		enterRule(_localctx, 36, RULE_tipoexperiencia);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(T__21);
				 ((TipoexperienciaContext)_localctx).tipo =  1; 
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__22);
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
		enterRule(_localctx, 38, RULE_organizacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 40, RULE_atividade);
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
		enterRule(_localctx, 42, RULE_periodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(DATA);
			setState(172);
			match(T__4);
			setState(173);
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

	public static class SecaoAtividadeContext extends ParserRuleContext {
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public Experiencia_idContext experiencia_id() {
			return getRuleContext(Experiencia_idContext.class,0);
		}
		public SecaoAtividadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secaoAtividade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterSecaoAtividade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitSecaoAtividade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitSecaoAtividade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecaoAtividadeContext secaoAtividade() throws RecognitionException {
		SecaoAtividadeContext _localctx = new SecaoAtividadeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_secaoAtividade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__23);
			setState(176);
			match(T__1);
			setState(177);
			match(T__5);
			setState(178);
			titulo();
			setState(179);
			match(T__4);
			setState(180);
			match(T__11);
			setState(181);
			descricao();
			setState(182);
			match(T__4);
			setState(183);
			match(T__24);
			setState(184);
			experiencia_id();
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

	public static class Experiencia_idContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(T3Parser.NUM_INT, 0); }
		public Experiencia_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experiencia_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).enterExperiencia_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T3Listener ) ((T3Listener)listener).exitExperiencia_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T3Visitor ) return ((T3Visitor<? extends T>)visitor).visitExperiencia_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Experiencia_idContext experiencia_id() throws RecognitionException {
		Experiencia_idContext _localctx = new Experiencia_idContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_experiencia_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\5\2:\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\5\be\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16s"+
		"\n\16\3\17\6\17v\n\17\r\17\16\17w\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21\u008a\n\21\r\21\16\21"+
		"\u008b\3\22\3\22\5\22\u0090\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\5\24\u00a8\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\2\2"+
		"\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\4\2\35\35!"+
		"!\2\u00b0\29\3\2\2\2\4;\3\2\2\2\6A\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fT\3"+
		"\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2\30"+
		"n\3\2\2\2\32r\3\2\2\2\34u\3\2\2\2\36y\3\2\2\2 \u0089\3\2\2\2\"\u008f\3"+
		"\2\2\2$\u0091\3\2\2\2&\u00a7\3\2\2\2(\u00a9\3\2\2\2*\u00ab\3\2\2\2,\u00ad"+
		"\3\2\2\2.\u00b1\3\2\2\2\60\u00bd\3\2\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66:\3\2\2\2\67\65\3\2\2\28:\5"+
		"\4\3\29\65\3\2\2\298\3\2\2\2:\3\3\2\2\2;<\7\3\2\2<=\7\4\2\2=>\5\6\4\2"+
		">?\7\5\2\2?@\5\32\16\2@\5\3\2\2\2AB\7\6\2\2BC\5\16\b\2CD\7\7\2\2DE\7\b"+
		"\2\2EF\5\20\t\2FG\7\7\2\2GH\7\t\2\2HI\5\n\6\2I\7\3\2\2\2JK\7\n\2\2KL\7"+
		"\4\2\2LM\5\f\7\2MN\7\5\2\2NQ\3\2\2\2OQ\5\4\3\2PJ\3\2\2\2PO\3\2\2\2Q\t"+
		"\3\2\2\2RS\7\36\2\2S\13\3\2\2\2TU\7\13\2\2UV\5\n\6\2VW\7\7\2\2WX\7\f\2"+
		"\2XY\5\24\13\2YZ\7\7\2\2Z[\7\r\2\2[\\\5\30\r\2\\]\7\7\2\2]^\7\16\2\2^"+
		"_\5\22\n\2_\r\3\2\2\2`a\7\17\2\2ae\b\b\1\2bc\7\20\2\2ce\b\b\1\2d`\3\2"+
		"\2\2db\3\2\2\2e\17\3\2\2\2fg\7\35\2\2g\21\3\2\2\2hi\7\35\2\2i\23\3\2\2"+
		"\2jk\7\35\2\2k\25\3\2\2\2lm\7\35\2\2m\27\3\2\2\2no\t\2\2\2o\31\3\2\2\2"+
		"ps\5\34\17\2qs\5 \21\2rp\3\2\2\2rq\3\2\2\2s\33\3\2\2\2tv\5\36\20\2ut\3"+
		"\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\35\3\2\2\2yz\7\21\2\2z{\7\4\2\2"+
		"{|\7\t\2\2|}\5\n\6\2}~\7\7\2\2~\177\7\b\2\2\177\u0080\5\20\t\2\u0080\u0081"+
		"\7\7\2\2\u0081\u0082\7\22\2\2\u0082\u0083\7\"\2\2\u0083\u0084\7\7\2\2"+
		"\u0084\u0085\7\23\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7\5\2\2\u0087\37"+
		"\3\2\2\2\u0088\u008a\5\"\22\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c!\3\2\2\2\u008d\u0090\5"+
		"$\23\2\u008e\u0090\5.\30\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"#\3\2\2\2\u0091\u0092\7\24\2\2\u0092\u0093\7\4\2\2\u0093\u0094\7\13\2"+
		"\2\u0094\u0095\5\60\31\2\u0095\u0096\7\7\2\2\u0096\u0097\7\6\2\2\u0097"+
		"\u0098\5&\24\2\u0098\u0099\7\7\2\2\u0099\u009a\7\25\2\2\u009a\u009b\5"+
		",\27\2\u009b\u009c\7\7\2\2\u009c\u009d\7\26\2\2\u009d\u009e\5(\25\2\u009e"+
		"\u009f\7\7\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a1\5*\26\2\u00a1\u00a2\7"+
		"\5\2\2\u00a2%\3\2\2\2\u00a3\u00a4\7\30\2\2\u00a4\u00a8\b\24\1\2\u00a5"+
		"\u00a6\7\31\2\2\u00a6\u00a8\b\24\1\2\u00a7\u00a3\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a8\'\3\2\2\2\u00a9\u00aa\7\35\2\2\u00aa)\3\2\2\2\u00ab\u00ac"+
		"\7\35\2\2\u00ac+\3\2\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7\7\2\2\u00af"+
		"\u00b0\7\"\2\2\u00b0-\3\2\2\2\u00b1\u00b2\7\32\2\2\u00b2\u00b3\7\4\2\2"+
		"\u00b3\u00b4\7\b\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6\7\7\2\2\u00b6\u00b7"+
		"\7\16\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba\7\33\2"+
		"\2\u00ba\u00bb\5\60\31\2\u00bb\u00bc\7\5\2\2\u00bc/\3\2\2\2\u00bd\u00be"+
		"\7\36\2\2\u00be\61\3\2\2\2\13\659Pdrw\u008b\u008f\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}