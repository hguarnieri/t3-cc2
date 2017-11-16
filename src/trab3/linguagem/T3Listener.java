// Generated from ../linguagem/T3.g4 by ANTLR 4.7
package trab3.linguagem;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link T3Parser}.
 */
public interface T3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link T3Parser#site}.
	 * @param ctx the parse tree
	 */
	void enterSite(T3Parser.SiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link T3Parser#site}.
	 * @param ctx the parse tree
	 */
	void exitSite(T3Parser.SiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link T3Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(T3Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T3Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(T3Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T3Parser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(T3Parser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link T3Parser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(T3Parser.TituloContext ctx);
}