package MyLang;

import JVMHelpers.JVMClassTemplate;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import LangElements.Compiler;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.File;
import java.io.FileOutputStream;

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
