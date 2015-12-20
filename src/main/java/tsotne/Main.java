package tsotne; /**
 * Created by tsotne on 12/20/15.
 */
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tsotne.JSONtoXMLLexer;
import tsotne.JSONtoXMLParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static final String INPUT_JSON= "src/test/java/input.json";
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(INPUT_JSON);
            JSONtoXMLLexer lexer;
            try {
                lexer = new JSONtoXMLLexer(new ANTLRInputStream(fileInputStream));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                JSONtoXMLParser parser = new JSONtoXMLParser(tokens);

                ParserRuleContext ruleContext = parser.file();
                Trees.inspect(ruleContext, parser);

                JSONtoXMLprinter jsoNtoXMLprinter = new JSONtoXMLprinter();
                ParseTreeWalker treeWalker = new ParseTreeWalker();
                treeWalker.walk(jsoNtoXMLprinter, ruleContext);

            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input file not found.");
            return;
        }
    }
}