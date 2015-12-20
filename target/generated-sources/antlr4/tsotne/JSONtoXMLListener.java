// Generated from tsotne/JSONtoXML.g4 by ANTLR 4.5.1
package tsotne;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONtoXMLParser}.
 */
public interface JSONtoXMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JSONtoXMLParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JSONtoXMLParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JSONtoXMLParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JSONtoXMLParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(JSONtoXMLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(JSONtoXMLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(JSONtoXMLParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(JSONtoXMLParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JSONtoXMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JSONtoXMLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONtoXMLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONtoXMLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JSONtoXMLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JSONtoXMLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(JSONtoXMLParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(JSONtoXMLParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JSONtoXMLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JSONtoXMLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#doublee}.
	 * @param ctx the parse tree
	 */
	void enterDoublee(JSONtoXMLParser.DoubleeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#doublee}.
	 * @param ctx the parse tree
	 */
	void exitDoublee(JSONtoXMLParser.DoubleeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONtoXMLParser#intt}.
	 * @param ctx the parse tree
	 */
	void enterIntt(JSONtoXMLParser.InttContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONtoXMLParser#intt}.
	 * @param ctx the parse tree
	 */
	void exitIntt(JSONtoXMLParser.InttContext ctx);
}