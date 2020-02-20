package MyLang;

import AjaxWebGuiServer.AjaxBuild;
import JVMHelpers.JVMClassTemplate;
import LangElements.Err;
import LangElements.ErrTypes;
import LangElements.Types;
import org.antlr.v4.runtime.*;
import LangElements.Compiler;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.apache.catalina.core.ApplicationContext;
import org.apache.catalina.filters.ExpiresFilter;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.io.*;
import java.nio.file.Path;
import java.util.BitSet;

public class MyLangCompiler extends Compiler{


    public static void main(String[] args) throws Exception {
        Compile();
    }

    public static void Compile() throws Exception{


        // init the compiler TS QUAD ERRS
        Compiler compiler = new Compiler();
        // init compiler values


        myLangLexer lexer = new myLangLexer(new ANTLRFileStream(MyLangCompiler.class.getClassLoader().getResource("../../tests/programme.sj").getFile()));
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

        FileOutputStream outclass = new FileOutputStream(MyLangCompiler.class.getClassLoader().getResource("../../tests/quad.json").getFile());
        byte[] strToBytes = Compiler.getQuadJson().getBytes();
        outclass.write(strToBytes);
        outclass.close();
        // save generated
        outclass = new FileOutputStream(MyLangCompiler.class.getClassLoader().getResource("../../tests/programmeObject.j").getFile());
        strToBytes = JVMClassTemplate.jasminJVM.getBytes();
        outclass.write(strToBytes);
        outclass.close();

    }

}
