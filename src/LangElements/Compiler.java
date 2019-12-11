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

    public static void GenerateObjectCode(String path){


    }

}
