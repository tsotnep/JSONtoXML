package tsotne;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by tsotne on 12/20/15.
 */
public class JSONtoXMLprinter extends JSONtoXMLBaseListener {
    ArrayList<Map<Integer, String>> row = new ArrayList<Map<Integer, String>>();
    int i = 0;
    FileWriter writer;
    public JSONtoXMLprinter() throws IOException{
        writer = new FileWriter("output.xml");
    }

    @Override
    public void enterFile(JSONtoXMLParser.FileContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(i++, "books");
        row.add(m);

    }

    @Override
    public void exitFile(JSONtoXMLParser.FileContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(--i, "/books");
        row.add(m);
        for (Map<Integer, String> k : row) {
            Iterator iterator = k.keySet().iterator();
            while (iterator.hasNext()) {
                int mKeyOriginal = (Integer) iterator.next();
                int mKey = mKeyOriginal;
                //print tab
                while (mKey != 0 && mKey != 100) {
                    mKey--;
                    try {
                        writer.append('\t');
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                String mStr = k.get(mKeyOriginal).toString();
                mStr = mStr.replaceAll("\"", "");

                //if it's not value, add XML tags
                mStr = (mKeyOriginal < 100) ? '<' + mStr + '>' : mStr;
                try {
                    writer.append(mStr + '\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterObject(JSONtoXMLParser.ObjectContext ctx) {
        //starting
        HashMap<Integer, String> m1 = new HashMap<Integer, String>();
        m1.put(i++, "book");
        row.add(m1);

        super.enterObject(ctx);
    }

    @Override
    public void exitObject(JSONtoXMLParser.ObjectContext ctx) {
        //        //ending
        HashMap<Integer, String> m5 = new HashMap<Integer, String>();
        m5.put(--i, "/book");
        row.add(m5);
        super.exitObject(ctx);
    }



    @Override
    public void enterProperty(JSONtoXMLParser.PropertyContext ctx) {

        if (ctx.value().getChild(0) instanceof JSONtoXMLParser.ArrayContext
                || ctx.value().getChild(0) instanceof JSONtoXMLParser.ObjectContext){
            return;
        }


        //opening XML
        HashMap<Integer, String> m2 = new HashMap<Integer, String>();
        m2.put(i++, ctx.getChild(0).getChild(0).getText());
        row.add(m2);

        //value
        HashMap<Integer, String> m3 = new HashMap<Integer, String>();
        m3.put(100 + i, ctx.getChild(2).getChild(0).getText());
        row.add(m3);

        //closing XML
        HashMap<Integer, String> m4 = new HashMap<Integer, String>();
        m4.put(--i, "/" + ctx.getChild(0).getChild(0).getText());
        row.add(m4);



    }
}
