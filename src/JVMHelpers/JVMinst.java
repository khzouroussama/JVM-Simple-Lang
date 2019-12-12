package JVMHelpers;

import LangElements.Symbol;
import LangElements.Types;

import java.util.HashMap;
import java.util.LinkedList;

public class JVMinst {
    static HashMap<Types,String> instType = new HashMap<>() {{
        put(Types.INT, "i");
        put(Types.FLOAT, "f");
        put(Types.STRING, "a");
        put(Types.BOOLEAN, "i");  // use booleans as int
    }};

    public static String store(Symbol s){
        return instType.get(s.getType())+"store "+s.getNum();
    }

    public static String load(Symbol s){
        if (s.is_cnst_())  return "ldc "+s.get_cnst_value_() ;
        else return instType.get(s.getType())+"load "+s.getNum();
    }

    /**
     *
     * @param s1
     * @param s2
     * @return liste of JVM instructions of add operation
     */
    public static LinkedList<String> add(Symbol s1 , Symbol s2){
        LinkedList<String> JVMinsts = new LinkedList<>();

        if (s1.getType() == Types.FLOAT || s2.getType() ==Types.FLOAT ){
            JVMinsts.add(load(s1));
            if (s1.getType() == Types.INT )
                JVMinsts.add("i2f");

            JVMinsts.add(load(s2));
            if (s2.getType() == Types.INT )
                JVMinsts.add("i2f");
            JVMinsts.add("fadd");
        }

        if (s1.getType() == Types.INT && s2.getType() ==Types.INT ){
            JVMinsts.add(load(s1));
            JVMinsts.add(load(s2));
            JVMinsts.add("iadd");
        }

        return JVMinsts;
    }

    public static LinkedList<String> sub(Symbol s1 , Symbol s2){
        LinkedList<String> JVMinsts = new LinkedList<>();

        if (s1.getType() == Types.FLOAT || s2.getType() ==Types.FLOAT ){
            JVMinsts.add(load(s1));
            if (s1.getType() == Types.INT )
                JVMinsts.add("i2f");

            JVMinsts.add(load(s2));
            if (s2.getType() == Types.INT )
                JVMinsts.add("i2f");
            JVMinsts.add("fsub");
        }

        if (s1.getType() == Types.INT && s2.getType() ==Types.INT ){
            JVMinsts.add(load(s1));
            JVMinsts.add(load(s2));
            JVMinsts.add("isub");
        }

        return JVMinsts;
    }

    public static LinkedList<String> mul(Symbol s1 , Symbol s2){
        LinkedList<String> JVMinsts = new LinkedList<>();

        if (s1.getType() == Types.FLOAT || s2.getType() ==Types.FLOAT ){
            JVMinsts.add(load(s1));
            if (s1.getType() == Types.INT )
                JVMinsts.add("i2f");

            JVMinsts.add(load(s2));
            if (s2.getType() == Types.INT )
                JVMinsts.add("i2f");
            JVMinsts.add("fmul");
        }

        if (s1.getType() == Types.INT && s2.getType() ==Types.INT ){
            JVMinsts.add(load(s1));
            JVMinsts.add(load(s2));
            JVMinsts.add("imul");
        }

        return JVMinsts;
    }

    public static LinkedList<String> div(Symbol s1 , Symbol s2){
        LinkedList<String> JVMinsts = new LinkedList<>();

            JVMinsts.add(load(s1));
            if (s1.getType() == Types.INT )
                JVMinsts.add("i2f");

            JVMinsts.add(load(s2));
            if (s2.getType() == Types.INT )
                JVMinsts.add("i2f");
            JVMinsts.add("fdiv");

        return JVMinsts;
    }



}
