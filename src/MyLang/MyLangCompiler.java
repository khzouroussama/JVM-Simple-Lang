package MyLang;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import LangElements.Compiler;

public class MyLangCompiler extends Compiler{

    public static void main(String[] args) throws Exception {

            // init the compiler TS QUAD ERRS
            Compiler compiler = new Compiler();

            myLangLexer lexer = new myLangLexer(new ANTLRFileStream("src/tests/test2.myLang"));
            myLangParser parser = new myLangParser(new CommonTokenStream(lexer));
            // Start parsing


            parser.addParseListener(new SyntaxCheck());
            parser.addParseListener(new QuadMaker());

            parser.s();



    }

}
