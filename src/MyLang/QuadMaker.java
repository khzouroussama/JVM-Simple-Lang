package MyLang;

import LangElements.Compiler;
import LangElements.Quadreplet;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;
import java.util.zip.CheckedOutputStream;

public class QuadMaker extends myLangBaseListener {
    private static int tmpNb = 0 ;
    private int qc = 0 ;
    private Stack<Integer> tmpStack = new Stack<>(){{push(0);}};
    private Stack<Quadreplet> ifStack = new Stack<>();
    private Stack<Quadreplet> elseStack = new Stack<>();

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


    public static int getTmpNb() {
        return tmpNb;
    }
}
