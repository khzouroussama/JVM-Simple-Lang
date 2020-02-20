package MyLang;

import LangElements.*;
import LangElements.Compiler;
import org.apache.catalina.tribes.util.Arrays;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class QuadMaker extends myLangBaseListener {
    private static int tmpNb = 0 ;
    private int qc = 0 ;
    private Stack<Integer> tmpStack = new Stack<>(){{push(0);}};
    private Stack<Quadreplet> ifStack = new Stack<>();
    private Stack<Quadreplet> elseStack = new Stack<>();

    private Stack<Integer> whileStartStack = new Stack<>();
    private Stack<Quadreplet> whileStack = new Stack<>();

    private Types[] outputTypes ;
    private String[] outoutStrings ;

    public static void init(){
        tmpNb =0 ;
    }

    @Override
    public void exitS(myLangParser.SContext ctx) {
        Compiler.Quads.add( new Quadreplet(new String[]{"END","","",""}));
        Compiler.printQuads();
        System.out.println(Compiler.GenerateObjectCode(""));

    }

    @Override
    public void exitAffect(myLangParser.AffectContext ctx) {
        if (ctx.exp().getChildCount() == 1 )
            Compiler.Quads.add(Quadreplet.QuadBuilder(":=",ctx.exp().terminal().getText(),"",ctx.IDF().getText()));
        else
            Compiler.Quads.add(Quadreplet.QuadBuilder(":=","#T"+tmpStack.pop(),"",ctx.IDF().getText()));
    }

    @Override
    public void exitExp(myLangParser.ExpContext ctx) {
        // Quad Factory
        // create the qqquad using the state of the Exp Context
        if ( ctx.getChildCount() == 3 || ctx.getChildCount() == 2) {      // only exp with 3/2 children
            // Build an empty quad
            Quadreplet quad = Quadreplet.QuadBuilder();
            // update the quad operator
                 if (ctx.PLUS()  != null ) quad.set1("+");
            else if (ctx.MINUS() != null && ctx.getChildCount()==3) quad.set1("-");
            else if (ctx.MINUS() != null && ctx.getChildCount() == 2) quad.set1("MINUS");
            else if (ctx.MUL()   != null ) quad.set1("*");
            else if (ctx.DIV()   != null ) quad.set1("/");
            else
                if (ctx.EQ()  != null ) quad.set1("=");
            else if (ctx.NEQ() != null ) quad.set1("!=");
            else if (ctx.GT()  != null ) quad.set1(">");
            else if (ctx.GET() != null ) quad.set1(">=");
            else if (ctx.LT()  != null ) quad.set1("<");
            else if (ctx.LET() != null ) quad.set1("<=");
            else
                if (ctx.AND() != null ) quad.set1("and");
            else if (ctx.OR() != null ) quad.set1("or");
            else if (ctx.NOT() != null ) quad.set1("not");

            else if (ctx.PAR_D() != null || ctx.PAR_D() != null) return; // do nothing

            //-----
            if (ctx.getChildCount() == 2 ){
                // START WITH UNARY OPERATIONS
                if (ctx.getChild(1).getChildCount() == 1) {
                    quad.set2( ctx.getChild(1).getText() );
                }
                else quad.set2( "#T"+tmpStack.pop());
                //TODO LOGICAL NOT
            }else {
                // BINARY OPERATIONS
                if (ctx.getChild(0).getChildCount() == 1) {
                    quad.set2(ctx.getChild(0).getText());
                } else quad.set2("#T" + tmpStack.pop());

                if (ctx.getChild(2).getChildCount() == 1) {
                    quad.set3(ctx.getChild(2).getText());
                } else quad.set3("#T" + tmpStack.pop());
            }

            // Always temp at the end of EXP
            quad.set4( "#T"+(tmpNb));
            // Add the tmp into TS (symbole table)
            Compiler.TS.add(new Symbol("#T"+tmpNb , SyntaxCheck.typeOP1 , 10,true) );
            // Store the temp in the stack
            tmpStack.push( tmpNb++ );
            // store the cuurent quad to use it in the affect routin
            qc = Compiler.Quads.size() ;
            Compiler.Quads.add(quad);
        }

    }


    // les routines de SI
    @Override
    public void exitSi_a(myLangParser.Si_aContext ctx) {
        Quadreplet ifQuad = Quadreplet.QuadBuilder("JZ","#T"+tmpStack.pop(),"","");
        Compiler.Quads.add(ifQuad);
        ifStack.push(ifQuad);
    }

    @Override
    public void exitSi_b(myLangParser.Si_bContext ctx) {
        Quadreplet elseQuad= Quadreplet.QuadBuilder("BR","","","") ;
        Compiler.Quads.add(elseQuad);
        elseStack.push(elseQuad);
        ifStack.pop().set4(Compiler.Quads.size() +"");
    }

    @Override
    public void exitSi(myLangParser.SiContext ctx) {
        elseStack.pop().set4(Compiler.Quads.size()+"");
    }

    // les routines de WHILE

    @Override
    public void exitWhile_a(myLangParser.While_aContext ctx) {
        whileStartStack.push(Compiler.Quads.size());
    }

    @Override
    public void exitWhile_b(myLangParser.While_bContext ctx) {
        Quadreplet whileQuad = Quadreplet.QuadBuilder("JZ","#T"+tmpStack.pop(),"","");
        Compiler.Quads.add(whileQuad);
        whileStack.push(whileQuad);
    }

    @Override
    public void exitWhile_(myLangParser.While_Context ctx) {
        Quadreplet whileQuadEND= Quadreplet.QuadBuilder("BR","","",whileStartStack.pop()+"") ;
        Compiler.Quads.add(whileQuadEND);
        whileStack.pop().set4(Compiler.Quads.size()+"");
    }
    // FIn routins de while


    private static Types[] outputType(String[] s){
        Types[] t = new Types[s.length] ;
        for (int i =0 ; i < s.length; i++ ) {
            switch (s[i]){
                case "%d" : t[i] = Types.INT; break;
                case "%s" : t[i] = Types.STRING; break;
                case "%f" : t[i] = Types.FLOAT; break;
            }
        }

        return t;
    }

    @Override
    public void exitOutput(myLangParser.OutputContext ctx) {
        String txt2print = ctx.STRING().getText().substring(1,ctx.STRING().getText().length()-1);
        String[] output = Pattern.compile("%[fds]")
                .matcher(ctx.STRING().getText())
                .results()
                .map(MatchResult::group)
                .toArray(String[]::new);

        outoutStrings = txt2print.split("%[dfs]") ;
        outputTypes = outputType(output);

        for (Types t:
             outputTypes) {
            System.out.println(t + "-");
        }

        if (outputTypes.length != ctx.exp().size())
            Compiler.compileERRS.add(new Err(ctx.start.getLine(), ErrTypes.BAD_FORMAT_IO, "Sj_out(...)"+outputTypes.length +"-"+ ctx.exp().size()));
        else {
            int printState = -1 ,startWith = -1 ;
            if (txt2print.startsWith("%d") || txt2print.startsWith("%s") || txt2print.startsWith("%"))
                printState = startWith = 1 ;
            Collections.reverse(tmpStack);
            if (! tmpStack.empty()) tmpStack.pop(); // get rid of stupid 0
            for (int i = 0 , j = 0 ; i < ctx.exp().size() || j < outoutStrings.length  ; printState = -printState ){
                if (printState ==1){
                    if (i < ctx.exp().size() ) {
                        if (ctx.exp(i).getChildCount() == 3) {
                            //TODO rah ypeeki mor ma ypopii !!!
                            if (checkType(  Compiler.TSget("#T"+tmpStack.peek()).getType() , outputTypes[i]) == null)
                                Compiler.compileERRS.add(new Err(ctx.start.getLine(), ErrTypes.BAD_FORMAT_IO, "Sj_out(...)"+outputTypes[i] +""));
                            else
                                Compiler.Quads.add(Quadreplet.QuadBuilder("print","#T"+tmpStack.pop(),"","" ) );
                        }
                        else
                            if(Compiler.TSget(ctx.exp(i).getText()) != null)
                            if (checkType(  Compiler.TSget(ctx.exp(i).getText()).getType() , outputTypes[i]) == null)
                                Compiler.compileERRS.add(new Err(ctx.start.getLine(), ErrTypes.BAD_FORMAT_IO, "Sj_out(...)"+outputTypes[i] +""));
                            else
                                Compiler.Quads.add(Quadreplet.QuadBuilder("print",ctx.exp(i).getText(),"",""));
                        i++;
                    }
                }
                else if (j < outoutStrings.length) {
                       while (outoutStrings[j].equals("") ) j++;
                       Compiler.Quads.add(Quadreplet.QuadBuilder("printL","\""+outoutStrings[j++]+"\"","",""));
                }
            }


        }


    }

    //                        if (checkType(  Compiler.TSget("#T"+tmpStack.peek()).getType() , outputTypes[i]) == null)
//                        Compiler.compileERRS.add(new Err(ctx.start.getLine(), ErrTypes.BAD_FORMAT_IO, "Sj_out(...)"+outputTypes[i] +""));
//                        else
//
//
//                        if (checkType(  Compiler.TSget(ctx.exp(i).getText()).getType() , outputTypes[i]) == null)
////                            Compiler.compileERRS.add(new Err(ctx.start.getLine(), ErrTypes.BAD_FORMAT_IO, "Sj_out(...)"+outputTypes[i] +""));
////                        else
    public static int getTmpNb() {
        return tmpNb;
    }



    public Types checkType(Types typeOP1, Types typesOP2){
            switch (typeOP1){
                case INT: return ( typesOP2 == Types.INT )? Types.INT :  null ;
                case FLOAT: return (typesOP2 == Types.FLOAT )? Types.FLOAT : null ;
                case STRING:  return (typesOP2 == Types.STRING )? Types.STRING : null ;
                case BOOLEAN: return (typesOP2 == Types.BOOLEAN )? Types.BOOLEAN : null ;
            }
        return null;
    }
}
