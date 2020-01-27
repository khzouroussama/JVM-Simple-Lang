package LangElements;

import JVMHelpers.JVMClassTemplate;
import JVMHelpers.JVMinst;
import MyLang.QuadMaker;

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
        Symbol.numSymbol = 0 ;
        QuadMaker.init();
        JVMinst.labelNb = 0;
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

    /*
    REsults As JSON to use by the web client
    The methode name is so wrong TODO change getQuadJson() methode name
     */
    public static String getQuadJson(){
        if (!compileERRS.isEmpty()) return "{ \"quads\" : [] , \"JVM\" : \"\", \"errs\" : " + Compiler.compileERRS + "}";
        else return "{ \"quads\" : " + Quads +"  ,"+
                " \"JVM\" : " + '\"'+new JVMClassTemplate("Test" , Compiler.GenerateObjectCode(""),true,10).jasminJVM.replaceAll("\n","##").replaceAll("\"","\\\\\"") +'\"' +","+
                " \"errs\" : " + Compiler.compileERRS +','+
                " \"TS\" : " + Compiler.TS +
                "}"
                ;
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





    /**
     * function that transforms Quadreplet into JVMAssembly ( via JASMIN  )
     * goto http://jasmin.sourceforge.net/ for information
     * @param path
     * @return
     */
    public static LinkedList<String> GenerateObjectCode(String path){
        LinkedList<Integer> quad_labels =new LinkedList<>();

        // JVM instructions ( as a start we will put every thing in the main )
        LinkedList<String> JVM_insts = new LinkedList<>();
        // using TS index as local variable names
        // Declaring variables
        JVM_insts.add("; variables Declaration goes here .. ");
        for (Symbol symbol:TS) {
            if (symbol.getType() != null)
            switch (symbol.getType()) {
                case INT:
                case BOOLEAN:
                    JVM_insts.add("ldc 0 ");
                    JVM_insts.add("istore "+ symbol.getNum());
                    break;
                case FLOAT:
                    JVM_insts.add("ldc 0.0");
                    JVM_insts.add("fstore "+ symbol.getNum());
                    break;
                case STRING:
                    // TODO String type support
                    JVM_insts.add("ldc \"\" ");
                    JVM_insts.add("astore "+ symbol.getNum());
                    break;
            }
        }

        JVM_insts.add("; start excution ... ");
        // now lets execute some Quads ...

        for (int i = 0; i < Quads.size(); i++){
            Quadreplet thisQuad = Quads.get(i);
            if( thisQuad.get()[0].equals("BR") || thisQuad.get()[0].equals("JZ"))
                quad_labels.add(Integer.parseInt(thisQuad.get()[3]));
        }

        for (int i = 0; i < Quads.size(); i++) {
            if (quad_labels.contains(i)) JVM_insts.add( "qlbl"+i+":" );
            Quadreplet thisQuad = Quads.get(i);
            switch (thisQuad.get()[0]) {
                case "+"  :
                    JVM_insts.addAll(JVMinst.add( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] ) ,TSget(thisQuad.get()[3]) ) );
                    break;
                case "-" :
                    JVM_insts.addAll(JVMinst.sub( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] ) ,TSget(thisQuad.get()[3]) ) );
                    break;
                case "*" :
                    JVM_insts.addAll(JVMinst.mul( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] ) ,TSget(thisQuad.get()[3]) ) );
                    break;
                case "/" :
                    JVM_insts.addAll(JVMinst.div( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] ) ,TSget(thisQuad.get()[3]) ) );
                    break;
                case "printL":
                    JVM_insts.addAll(JVMinst.printL( thisQuad.get()[1]));
                    break;
                case "print":
                    JVM_insts.addAll(JVMinst.print( TSget(thisQuad.get()[1]) ));
                    break;
                case ":=":
                    JVM_insts.addAll(JVMinst.assigne(  TSget(thisQuad.get()[3])  ,TSget(thisQuad.get()[1])  ) );
                    break;
                case "MINUS":
                    JVM_insts.addAll(JVMinst.unary_minus(  TSget(thisQuad.get()[1])  ,TSget(thisQuad.get()[3])  ) );
                    break;
                case "and":
                    JVM_insts.addAll(JVMinst.and( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] ) ,TSget(thisQuad.get()[3]) ) );
                    break;
                case "or":
                    JVM_insts.addAll(JVMinst.or( TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] ) ,TSget(thisQuad.get()[3]) ) );
                    break;
                    // INStructions de comparison mettre la resultat de comparison dans
                case ">":case ">=": case "<" : case "<=" :case "=" : case "!=" :
                    JVM_insts.addAll(JVMinst.compare(thisQuad.get()[0] ,TSget(thisQuad.get()[1])  , TSget(thisQuad.get()[2] ) ,TSget(thisQuad.get()[3]) ) );
                    break;
                    //instruction de branchement
                case "JZ" :
                    JVM_insts.addAll( JVMinst.JZ(TSget(thisQuad.get()[1]) , Integer.parseInt(thisQuad.get()[3]) )) ;
                    break;
                case "BR" :
                    JVM_insts.add( "goto qlbl"+thisQuad.get()[3] );
                    break;
            }

        }

        return JVM_insts;
    }


}
