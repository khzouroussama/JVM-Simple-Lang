package MyLang;

import JVMHelpers.JVMClassTemplate;
import LangElements.Err;
import LangElements.ErrTypes;
import LangElements.Types;
import org.antlr.v4.runtime.*;
import LangElements.Compiler;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.*;
import java.util.BitSet;

public class MyLangCompiler extends Compiler{

    public static void main(String[] args) throws Exception {
        Compile();
    }

    public static void Compile() throws Exception{

        // init the compiler TS QUAD ERRS
        Compiler compiler = new Compiler();
        // init compiler values

        myLangLexer lexer = new myLangLexer(new ANTLRFileStream("/home/temp/IdeaProjects/AntlrExps/src/tests/programme.sj"));
        myLangParser parser = new myLangParser(new CommonTokenStream(lexer));
        // Start parsing

        parser.addParseListener(new SyntaxCheck());
        parser.addParseListener(new QuadMaker());
        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
                Compiler.compileERRS.add(new Err(i, ErrTypes.SYNT , s));
            }

            @Override
            public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

            }
        });

        parser.s();

        JVMClassTemplate template = new JVMClassTemplate("Test" , Compiler.GenerateObjectCode(""),true,10);

        //TODO save quads as json

        FileOutputStream outclass = new FileOutputStream("/home/temp/IdeaProjects/AntlrExps/src/tests/quad.json");
        byte[] strToBytes = Compiler.getQuadJson().getBytes();
        outclass.write(strToBytes);
        outclass.close();
        // save generated
        outclass = new FileOutputStream("/home/temp/IdeaProjects/AntlrExps/src/tests/programmeObject.j");
        strToBytes = JVMClassTemplate.jasminJVM.getBytes();
        outclass.write(strToBytes);
        outclass.close();

    }

}
