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
	 * Visit a parse tree produced by {@link T3Parser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(T3Parser.TituloContext ctx);
}