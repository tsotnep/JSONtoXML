package tsotne;

import java.util.*;

/**
 * Created by tsotne on 12/20/15.
 */
public class JSONtoXMLprinter extends JSONtoXMLBaseListener {
    ArrayList<Map<Integer, String>> row = new ArrayList<Map<Integer, String>>();
    int i=0;

    @Override
    public void enterFile(JSONtoXMLParser.FileContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(i++, "file");
        row.add(m);
        super.enterFile(ctx);
    }

    @Override
    public void exitFile(JSONtoXMLParser.FileContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(--i, "/file");
        row.add(m);

        for(Map<Integer, String> k : row){
            Iterator iterator = k.keySet().iterator();
            while(iterator.hasNext()){
                int mKey = (Integer) iterator.next();
                String mStr = '<' + k.get(mKey) + '>';
                while (mKey != 0) {
                    mKey--;
                    System.out.print('\t');
                }
                System.out.println(mStr);
            }
        }
        super.exitFile(ctx);
    }

    @Override
    public void enterObject(JSONtoXMLParser.ObjectContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(i++, "object");
        row.add(m);
        super.enterObject(ctx);
    }

    @Override
    public void exitObject(JSONtoXMLParser.ObjectContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(--i, "/object");
        row.add(m);
        super.exitObject(ctx);
    }

    @Override
    public void enterProperty(JSONtoXMLParser.PropertyContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(i++, "property");
        row.add(m);
        super.enterProperty(ctx);
    }

    @Override
    public void exitProperty(JSONtoXMLParser.PropertyContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(--i, "/property");
        row.add(m);
        super.exitProperty(ctx);
    }

    @Override
    public void enterKey(JSONtoXMLParser.KeyContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(i++, "key");
        row.add(m);
        super.enterKey(ctx);
    }

    @Override
    public void exitKey(JSONtoXMLParser.KeyContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(--i, "/key");
        row.add(m);
        super.exitKey(ctx);
    }

    @Override
    public void enterValue(JSONtoXMLParser.ValueContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(++i, "value");
        row.add(m);
        super.enterValue(ctx);
    }

    @Override
    public void exitValue(JSONtoXMLParser.ValueContext ctx) {
        HashMap<Integer, String> m = new HashMap<Integer, String> ();
        m.put(--i, "/value");
        row.add(m);
        super.exitValue(ctx);
    }
}
