package JVMHelpers;

import java.util.LinkedList;

public class JVMClassTemplate {

    public static String jasminJVM ;

    public JVMClassTemplate(String className , LinkedList<String> instruction, boolean IO , int locals) {
        String classTemplateHead = "\n"+
                ".class public "+ className +"\n"+
                ".super java/lang/Object\n"+
                ".method public <init>()V \n"+
                "    aload_0 \n"+
                "    invokespecial java/lang/Object/<init>()V \n"+
                "    return \n"+
                ".end method \n"+
                "\n";

        StringBuilder ClassMainInstructions = new StringBuilder();
        for (String s : instruction) ClassMainInstructions.append("    "+s+"\n");

        String ClassTemplateMain =
                ".method public static main([Ljava/lang/String;)V \n"+
                "    .limit stack 5 \n"+
                "    .limit locals 100 \n"+
                        //instruction----
                        ClassMainInstructions  +
                        //---------------
                "    return        ; return from main\n"+
                ".end method" ;

        jasminJVM = classTemplateHead +
                    (IO ? ClassTemplateIO :"") +
                    ClassTemplateMain ;

    }



    private String ClassTemplateIO = "; int read() \n"+
            ".method public static read()I\n"+
            "    .limit locals 10 \n"+
            "    .limit stack 10 \n"+
            "    ldc 0 \n"+
            "    istore 1  ; this will hold our final integer \n"+
            "Label1: \n"+
            "    getstatic java/lang/System/in Ljava/io/InputStream; \n"+
            "    invokevirtual java/io/InputStream/read()I \n"+
            "    istore 2 \n"+
            "    iload 2 \n"+
            "    ldc 10   ; the newline delimiter \n"+
            "    isub \n"+
            "    ifeq Label2 \n"+
            "    iload 2 \n"+
            "    ldc 32   ; the space delimiter \n"+
            "    isub \n"+
            "    ifeq Label2 \n"+
            "    iload 2 \n"+
            "    ldc 48   ; we have our digit in ASCII, have to subtract it from 48 \n"+
            "    isub \n"+
            "    ldc 10 \n"+
            "    iload 1 \n"+
            "    imul \n"+
            "    iadd \n"+
            "    istore 1 \n"+
            "    goto Label1 \n"+
            "Label2: \n"+
            "    ;when we come here we have our integer computed in Local Variable 1 \n"+
            "    iload 1 \n"+
            "    ireturn \n"+
            ".end method \n"+
            "\n";




}
