package AjaxWebGuiServer;

import LangElements.Compiler;
import MyLang.MyLangCompiler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;

public class AjaxBuild extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("application/json");

        StringBuilder sb = new StringBuilder();
        BufferedReader reader = request.getReader();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } finally {
            reader.close();
        }
        System.out.println(sb.toString() );
        // store the user input in the file  src/tests/programme.sj
        System.out.println(sb);
        FileOutputStream outclass = new FileOutputStream("/home/oussama/IdeaProjects/AntlrExps/src/tests/programme.sj");
        byte[] strToBytes = sb.toString().getBytes();
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
        response.setContentType("application/json");

        String prgrm = request.getParameter("code");
        System.out.println(prgrm);

        try {
            MyLangCompiler.Compile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.getWriter().print(Compiler.getQuadJson());
    }
}
