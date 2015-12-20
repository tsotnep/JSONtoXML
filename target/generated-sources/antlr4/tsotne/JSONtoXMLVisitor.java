// Generated from tsotne/JSONtoXML.g4 by ANTLR 4.5.1
package tsotne;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONtoXMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONtoXMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(JSONtoXMLParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(JSONtoXMLParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(JSONtoXMLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(JSONtoXMLParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JSONtoXMLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JSONtoXMLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(JSONtoXMLParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JSONtoXMLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#doublee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublee(JSONtoXMLParser.DoubleeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONtoXMLParser#intt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntt(JSONtoXMLParser.InttContext ctx);
}