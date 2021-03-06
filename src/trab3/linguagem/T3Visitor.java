// Generated from ../linguagem/T3.g4 by ANTLR 4.7
package trab3.linguagem;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link T3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface T3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link T3Parser#decl_site}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_site(T3Parser.Decl_siteContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#site}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSite(T3Parser.SiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(T3Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#decl_autor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_autor(T3Parser.Decl_autorContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#autor_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutor_id(T3Parser.Autor_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#autor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutor(T3Parser.AutorContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#tiposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiposite(T3Parser.TipositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(T3Parser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#descricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescricao(T3Parser.DescricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(T3Parser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#conteudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConteudo(T3Parser.ConteudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#contato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContato(T3Parser.ContatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#estruturas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturas(T3Parser.EstruturasContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#estruturablog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturablog(T3Parser.EstruturablogContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#post}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost(T3Parser.PostContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#estruturacv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturacv(T3Parser.EstruturacvContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#secoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecoes(T3Parser.SecoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#secaoExperiencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecaoExperiencia(T3Parser.SecaoExperienciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#tipoexperiencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoexperiencia(T3Parser.TipoexperienciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#organizacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrganizacao(T3Parser.OrganizacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#atividade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtividade(T3Parser.AtividadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#periodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodo(T3Parser.PeriodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#secaoAtividade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecaoAtividade(T3Parser.SecaoAtividadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link T3Parser#experiencia_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExperiencia_id(T3Parser.Experiencia_idContext ctx);
}