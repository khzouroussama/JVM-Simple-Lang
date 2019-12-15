
.class public Test
.super java/lang/Object
.method public <init>()V 
    aload_0 
    invokespecial java/lang/Object/<init>()V 
    return 
.end method 

; int read() 
.method public static read()I
    .limit locals 10 
    .limit stack 10 
    ldc 0 
    istore 1  ; this will hold our final integer 
Label1: 
    getstatic java/lang/System/in Ljava/io/InputStream; 
    invokevirtual java/io/InputStream/read()I 
    istore 2 
    iload 2 
    ldc 10   ; the newline delimiter 
    isub 
    ifeq Label2 
    iload 2 
    ldc 32   ; the space delimiter 
    isub 
    ifeq Label2 
    iload 2 
    ldc 48   ; we have our digit in ASCII, have to subtract it from 48 
    isub 
    ldc 10 
    iload 1 
    imul 
    iadd 
    istore 1 
    goto Label1 
Label2: 
    ;when we come here we have our integer computed in Local Variable 1 
    iload 1 
    ireturn 
.end method 

; void print(int) 
.method public static print(I)V 
    .limit locals 5 
    .limit stack 5 
    iload 0 
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap 
    invokevirtual java/io/PrintStream/print(I)V 
    return 
.end method

; void print(float) 
.method public static print(F)V 
    .limit locals 5 
    .limit stack 5 
    fload 0 
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap 
    invokevirtual java/io/PrintStream/print(F)V 
    return 
.end method

; void print(string)
.method public static print(Ljava/lang/String;)V
    .limit locals 5 
    .limit stack 5 
    aload 0
    getstatic java/lang/System/out Ljava/io/PrintStream; 
    swap 
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
    return 
.end method
.method public static main([Ljava/lang/String;)V 
    .limit stack 5 
    .limit locals 100 
    ; variables Declaration goes here .. 
    ldc 0 
    istore 2
    ldc 0 
    istore 3
    ldc 0.0
    fstore 4
    ldc "" 
    astore 5
    ldc 0.0
    fstore 6
    ldc 0 
    istore 7
    ; start excution ... 
    ldc 5
    istore 2
    ldc 5
    i2f
    fstore 4
    ldc "Hello!"
    astore 5
    ldc 40
    istore 3
    iload 2
    i2f
    ldc 5.2
    fmul
    fstore 6
    fload 6
    f2i
    istore 2
    iload 2
    iload 3
    iadd
    istore 7
    aload 5
    invokestatic Test.print(Ljava/lang/String;)V
    ldc " \nla Valeur de variable x+x2 = "
    invokestatic Test.print(Ljava/lang/String;)V
    iload 7
    invokestatic Test.print(I)V
    ldc " \n est la valeur de z = "
    invokestatic Test.print(Ljava/lang/String;)V
    fload 4
    invokestatic Test.print(F)V
    ldc " \n"
    invokestatic Test.print(Ljava/lang/String;)V
    return        ; return from main
.end method