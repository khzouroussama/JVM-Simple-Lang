
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
    ldc 0 
    istore 5
    ldc 0.0
    fstore 6
    ; start excution ... 
    iload 2
    ldc 5
    imul
    iload 5
    i2f
    ldc 3.2
    fdiv
    return        ; return from main
.end method