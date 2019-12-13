package LangElements;

import JVMHelpers.JVMinst;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Compiler {

    // table des Symboles

    public static LinkedList<Symbol> TS ;
    public static LinkedList<Quadreplet> Quads ;
    public static LinkedList<Err> compileERRS ;

    /**
     * the Compiler
     * Contains SymboleTable
     */
    public Compiler() {
        TS = new LinkedList<>();
        Quads =new LinkedList<>();
        compileERRS = new LinkedList<>();
    }

    // Console printer
    public static void printTS(){
        System.out.println(TS);
    }
    public static void printERR(){
        System.out.println(compileERRS);

    }
    public static void printQuads(){
        System.out.println( Quads );
    }

    public static String getQuadJson(){
        return "{ \"quads\" : " + Quads +"}";
    }

    public static boolean TScontains(String id){
        for (Symbol s: TS) if (s.getId().equals(id)) return true ;
        return false ;
    }


    /**
     *
     * @param id name of var (IDF) or a value it self
     * @return a symbol represntation (From TS if IDF , newConst otherwise)
     */
    public static Symbol TSget(String id){
        if (Symbol.isValue(id) != null)
            return Symbol._new_cnst_(id);
        else for (Symbol s: TS) if (s.getId().equals(id)) return s ;
        return null ;
    }


    public static Quadreplet QuadGet(int i){
        return Quads.get(i);
    }



    // function that transforms Quadreplet into JVMAssembly ( via jasmin )

    /**
     *
     * @param path
     * @return
     */
    public static LinkedList<String> GenerateObjectCode(String path){

        // JVM instructions ( as a start we will put every thing in the main )
        LinkedList<String> JVM_insts = new LinkedList<>();
        // using TS index as local variable names
        // Declaring variables
        JVM_insts.add("; variables Declaration goes here .. ");
        for (Symbol symbol:TS) {
            if (symbol.getType() != null)
            switch (symbol.getType()) {
                case INT:
                    JVM_insts.add("ldc 0 ");
                    JVM_insts.add("istore "+ symbol.getNum());
                    break;
                case FLOAT:
                    JVM_insts.add("ldc 0.0");
                    JVM_insts.add("fstore "+ symbol.getNum());
                    break;
                case STRING:
                    // TODO String type support
                    JVM_insts.add(";ldc \"\" \n");
                    JVM_insts.add(";astore "+ symbol.getNum());
                    break;
            }
        }

        JVM_insts.add("; start excution ... ");
        // now lets execute some Quads ...

        for (int i = 0; i < Quads.size(); i++) {
            Quadreplet thisQuad = Quads.get(i);
            switch (thisQuad.get()[0]) {
                case "+"  :
                    JVM_insts.addAll(JVMinst.add( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] )));
                    break;
                case "-" :
                    JVM_insts.addAll(JVMinst.sub( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] )));
                    break;
                case "*" :
                    JVM_insts.addAll(JVMinst.mul( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] )));
                    break;
                case "/" :
                    JVM_insts.addAll(JVMinst.div( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] )));
                    break;
            }
        }


        return JVM_insts;
    }


}
