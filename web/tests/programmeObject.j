
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
    ldc 0 
    istore 4
    ldc 0 
    istore 5
    ldc 0 
    istore 6
    ldc 0 
    istore 7
    ; start excution ... 
    ldc 8
    istore 2
    ldc 12
    istore 3
    ldc "Le PGCD de "
    invokestatic Test.print(Ljava/lang/String;)V
    iload 2
    invokestatic Test.print(I)V
    ldc " et "
    invokestatic Test.print(Ljava/lang/String;)V
    iload 3
    invokestatic Test.print(I)V
    ldc " : \n->"
    invokestatic Test.print(Ljava/lang/String;)V
    qlbl7:
    iload 2
    iload 3
    if_icmpne lbcomp8
    ldc 0
    goto lbcomp9
    lbcomp8:
    ldc 1
    lbcomp9:
    istore 4
    iload 4
    ifeq qlbl17
    iload 2
    iload 3
    if_icmpgt lbcomp10
    ldc 0
    goto lbcomp11
    lbcomp10:
    ldc 1
    lbcomp11:
    istore 5
    iload 5
    ifeq qlbl14
    iload 2
    iload 3
    isub
    istore 6
    iload 6
    istore 2
    goto qlbl16
    qlbl14:
    iload 3
    iload 2
    isub
    istore 7
    iload 7
    istore 3
    qlbl16:
    goto qlbl7
    qlbl17:
    iload 2
    invokestatic Test.print(I)V
    return        ; return from main
.end method