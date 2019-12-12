package LangElements;

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
        for (int i = 0; i < Quads.size(); i++) System.out.println("  Q-"+i+":"+Quads.get(i));

    }

    public static boolean TScontains(String id){
        for (Symbol s: TS) if (s.getId().equals(id)) return true ;
        return false ;
    }

    public static Symbol TSget(String id){
        for (Symbol s: TS) if (s.getId().equals(id)) return s ;
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
        // using TS
        // Declaring variables
        for (Symbol symbol:TS) {
            if (symbol.getType() != null)
            switch (symbol.getType()) {
                case INT:
                    JVM_insts.add("iconst_0 \n");
                    JVM_insts.add("istore "+ symbol.getNum()+"\n");
                    break;
                case FLOAT:
                    break;
                case STRING:
                    break;
            }
        }
        return JVM_insts;
    }

}
