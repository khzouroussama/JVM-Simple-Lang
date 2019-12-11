package LangElements;

import java.util.HashMap;
import java.util.LinkedList;

public class Compiler {

    // table des Symboles

    public static LinkedList<Symbol> TS ;
    public static LinkedList<Quadreplet> Quads ;
    public static LinkedList<Err> compileERRS ;

    public Compiler() {
        TS = new LinkedList<>();
        Quads =new LinkedList<>();
        compileERRS = new LinkedList<>();
    }

    public static void printTS(){
        System.out.println(TS);
    }
    public static void printERR(){
        System.out.println(compileERRS);

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

}
