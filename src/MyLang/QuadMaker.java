package MyLang;

import LangElements.Compiler;
import LangElements.Quadreplet;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;
import java.util.zip.CheckedOutputStream;

public class QuadMaker extends myLangBaseListener {
    private int tmpNb = 0 ; // E1 E2
    int tmpNb2 = 0 ; // letat pass  E4
    private int qc = 0 ;
    private Stack<Integer> tmpStack = new Stack<>(){{push(0);}};

    @Override
    public void exitS(myLangParser.SContext ctx) {
        Compiler.Quads.add( new Quadreplet(new String[]{"END","","",""}));
        System.out.println(Compiler.Quads);
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
        if ( ctx.getChildCount() == 3 ) {      // only exp with 3 children
            // Build an empty quad
            Quadreplet quad = Quadreplet.QuadBuilder();
            // update the quad operator
                 if (ctx.PLUS()  != null ) quad.set1("+");
            else if (ctx.MINUS() != null ) quad.set1("-");
            else if (ctx.MUL()   != null ) quad.set1("*");
            else if (ctx.DIV()   != null ) quad.set1("/");
            else
                 if (ctx.EQ()  != null ) quad.set1("=");
            else if (ctx.NEQ() != null ) quad.set1("!=");
            else if (ctx.GT()  != null ) quad.set1(">");
            else if (ctx.GET() != null ) quad.set1(">=");
            else if (ctx.LT()  != null ) quad.set1("<");
            else if (ctx.LET() != null ) quad.set1("<=");

            else if (ctx.PAR_D() != null || ctx.PAR_D() != null) return; // do nothing

            //-----
            if (ctx.getChild(0).getChildCount() == 1) {
                quad.set2( ctx.getChild(0).getText() );
            }
            else quad.set2( "#T"+tmpStack.pop());

            if (ctx.getChild(2).getChildCount() == 1) {
                quad.set3( ctx.getChild(2).getText() );
            }else  quad.set3( "#T"+tmpStack.pop());

            // Always temp at the end of EXP
            quad.set4( "#T"+(tmpNb));
            // Store the temp in the stack
            tmpStack.push( tmpNb++ );
            // store the cuurent quad to use it in the affect routin
            qc = Compiler.Quads.size() ;
            Compiler.Quads.add(quad);
        }
    }


    @Override
    public void exitSi_a(myLangParser.Si_aContext ctx) {
        Compiler.Quads.add(Quadreplet.QuadBuilder(""));
    }
}
