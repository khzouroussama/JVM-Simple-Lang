package AjaxWebGuiServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AjaxRun extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Run a shell script to generate class file and run it and send the output back
            Process process = Runtime.getRuntime().exec("/home/oussama/IdeaProjects/AntlrExps/src/tests/jasmin_run.sh");

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));


            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);

                response.getWriter().print("{ \"out\" : \""+output.toString().replaceAll("\n","##")+"\" , \"runtime_err\" : false }");
                //System.exit(0);
            } else {
                System.out.println("Fail!");
                reader = new BufferedReader(
                        new InputStreamReader(process.getErrorStream()));
                line =""; output = new StringBuilder("");
                while ((line = reader.readLine()) != null) {
                    output.append(line + "\n");
                }

                response.getWriter().print("{ \"out\" : \""+
                        output.toString()
                                .replaceAll("[\n]","##")
                                .replaceAll("[\t]","    ")
                                .replaceAll("\"","\\\\\"")+
                        "\", \"runtime_err\": true } ");

                System.out.println(output);
                //abnormal...
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
