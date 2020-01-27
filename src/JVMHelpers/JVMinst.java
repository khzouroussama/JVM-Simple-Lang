package JVMHelpers;

import LangElements.Symbol;
import LangElements.Types;

import java.util.Collection;
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

    // TODO support for boolean types /string ...
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
    public static LinkedList<String> add(Symbol s1 , Symbol s2 , Symbol s3){
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

        JVMinsts.add(store(s3));

        return JVMinsts;
    }

    public static LinkedList<String> sub(Symbol s1 , Symbol s2, Symbol s3){
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

        JVMinsts.add(store(s3));

        return JVMinsts;
    }

    public static LinkedList<String> mul(Symbol s1 , Symbol s2, Symbol s3){
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

        JVMinsts.add(store(s3));

        return JVMinsts;
    }

    public static LinkedList<String> div(Symbol s1 , Symbol s2 , Symbol s3){
        LinkedList<String> JVMinsts = new LinkedList<>();

            JVMinsts.add(load(s1));
            if (s1.getType() == Types.INT &&  s2.getType() == Types.FLOAT )
                JVMinsts.add("i2f");

            JVMinsts.add(load(s2));
            if (s1.getType() == Types.FLOAT && s2.getType() == Types.INT )
                JVMinsts.add("i2f");

            if (s1.getType() == Types.INT &&  s2.getType() == Types.INT )
                JVMinsts.add("idiv");
            else
                JVMinsts.add("fdiv");

        JVMinsts.add(store(s3));

        return JVMinsts;
    }


    //TODO support dynamic class name
    public static LinkedList<String> printL(String s){
        LinkedList<String> JVMinsts = new LinkedList<>();

        JVMinsts.add("ldc "+s);
        JVMinsts.add("invokestatic Test.print(Ljava/lang/String;)V");
        return JVMinsts;
    }

    public static LinkedList<String> print(Symbol s){
        LinkedList<String> JVMinsts = new LinkedList<>();

        JVMinsts.add(load(s));

        switch (s.getType()){
            case INT:
                JVMinsts.add("invokestatic Test.print(I)V");
                break;
            case FLOAT:
                JVMinsts.add("invokestatic Test.print(F)V");
                break;
            case STRING:
                JVMinsts.add("invokestatic Test.print(Ljava/lang/String;)V");
                break;
        }

        return JVMinsts;
    }

    public static LinkedList<String> assigne(Symbol s1 , Symbol s2){
        LinkedList<String> JVMinsts = new LinkedList<>();


        JVMinsts.add(load(s2));
        if (s2.getType() == Types.INT && s1.getType() == Types.FLOAT)
            JVMinsts.add("i2f");
        if (s2.getType() == Types.FLOAT && s1.getType() == Types.INT)
            JVMinsts.add("f2i");
        JVMinsts.add(store(s1));

        return JVMinsts;
    }

    public static LinkedList<String> unary_minus(Symbol s1 , Symbol s3){
        LinkedList<String> JVMinsts = new LinkedList<>();

        if (s1.getType() == Types.FLOAT ){
            JVMinsts.add(load(Symbol._new_cnst_("-1.0")));
            JVMinsts.add(load(s1));
            JVMinsts.add("fmul");
        }

        if (s1.getType() == Types.INT  ){
            JVMinsts.add(load(Symbol._new_cnst_("-1")));
            JVMinsts.add(load(s1));
            JVMinsts.add("imul");
        }

        JVMinsts.add(store(s3));

        return JVMinsts;
    }


    public static LinkedList<String> and(Symbol s1 , Symbol s2 , Symbol s3){
        LinkedList<String> JVMinsts = new LinkedList<>();

        if (s1.getType() == Types.BOOLEAN || s2.getType() ==Types.BOOLEAN ){
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

        }
        JVMinsts.add("iand");
        JVMinsts.add(store(s3));

        return JVMinsts;
    }
}
