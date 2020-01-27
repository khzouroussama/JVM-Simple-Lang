package JVMHelpers;

import LangElements.Compiler;
import LangElements.Symbol;
import LangElements.Types;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class JVMinst {
    // to assert unique label for each branch
    public static int labelNb = 0;
    public static int getLabel(){return labelNb++; }

    static HashMap<Types,String> instType = new HashMap<>() {{
        put(Types.INT, "i");
        put(Types.FLOAT, "f");
        put(Types.STRING, "a");
        put(Types.BOOLEAN, "i");  // use booleans as int
    }};

    static HashMap<String,String> cmpOps = new HashMap<>(){{
        put("=","if_icmpeq ");
        put(">=","if_icmpge ");
        put(">","if_icmpgt ");
        put("<=","if_icmple ");
        put("<","if_icmplt ");
        put("!=","if_icmpne ");
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

        JVMinsts.add(load(s1));
        JVMinsts.add(load(s2));
        JVMinsts.add("iand");
        JVMinsts.add(store(s3));

        return JVMinsts;
    }

    public static LinkedList<String> or(Symbol s1 , Symbol s2 , Symbol s3){
        LinkedList<String> JVMinsts = new LinkedList<>();

        JVMinsts.add(load(s1));
        JVMinsts.add(load(s2));
        JVMinsts.add("ior");
        JVMinsts.add(store(s3));

        return JVMinsts;
    }

    /*
    compare operations
    As the JVM can only do cmpJMP with integers (no float) i had to multiply by 10^i to do the comparision [i is the error reduction factor]
    goto  www.bricolage.com for more informations
    TODO a cleaner way to do this
     */
    public static LinkedList<String> compare(String op,Symbol s1 , Symbol s2 , Symbol s3){
        LinkedList<String> JVMinsts = new LinkedList<>();

        // if one of op1 op2 is FLOAT
        //      stack >> op1*10^i >> op2*10^i
        if ( !(s1.getType() == Types.INT && s2.getType() ==Types.INT) ){
            JVMinsts.add(load(s1));
            if (s1.getType() == Types.FLOAT )
                JVMinsts.add("f2i");
            JVMinsts.add( load(Symbol._new_cnst_("100")) ); //
            JVMinsts.add("imul");

            JVMinsts.add(load(s2));
            if (s2.getType() == Types.FLOAT )
                JVMinsts.add("f2i");
            JVMinsts.add( load(Symbol._new_cnst_("100")) ); //
            JVMinsts.add("imul");
        }else {
            // else just stack >> op1 >> op2
            JVMinsts.add(load(s1));
            JVMinsts.add(load(s2));
        }
        /**
         * stack >> op1 >> op2
         * if_icomp* lb1
         * ldc 0
         * goto lb2
         * lb1:
         * ldc 1
         * lb2:
         * ...
         */
        // reserve 2 labels
        int label1 =getLabel();
        int label2 =getLabel();
        // do the comparison
        JVMinsts.add(cmpOps.get(op)+"lbcomp"+label1);
        JVMinsts.add( load(Symbol._new_cnst_("0")) );
        JVMinsts.add("goto "+"lbcomp"+label2);
        JVMinsts.add("lbcomp"+label1+":");
        JVMinsts.add( load(Symbol._new_cnst_("1")) );
        JVMinsts.add("lbcomp"+label2+":");

        if (s3.getType() == Types.FLOAT) Compiler.TSget(s3.getId()).setType(Types.INT); // DANGEROUS STUFF
        JVMinsts.add(store(s3));

        return JVMinsts;
    }



    public static LinkedList<String> JZ(Symbol s2,int index){
        LinkedList<String> JVMinsts = new LinkedList<>();

        JVMinsts.add(load(s2));

        JVMinsts.add("ifeq qlbl"+index);

        return JVMinsts;
    }
}
