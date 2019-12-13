package AjaxWebGuiServer;

import LangElements.Compiler;
import MyLang.MyLangCompiler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AjaxBuild extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // store the user input in the file  src/tests/programme.sj
        String prgrm = request.getParameter("code");
        FileOutputStream outclass = new FileOutputStream("src/tests/programme.sj");
        byte[] strToBytes = prgrm.getBytes();
        outclass.write(strToBytes);
        outclass.close();

        // Compile the file
        try {
            MyLangCompiler.Compile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.getWriter().print(Compiler.getQuadJson());
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            MyLangCompiler.Compile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.getWriter().print(Compiler.getQuadJson());
    }
}
