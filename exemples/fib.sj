import Small_Java.lang ;
import Small_Java.io ;

protected class Fibbonaci {

    MainFib{
        int fib := 0, x := 0 , y  , N := 10 , i;
        y := 1 ;
        i := 0 ;

        while (i < N) {
            fib := fib + x ;
            x := y ;
            y := fib ;
            i := i + 1 ;
            Out("Fib[%d] = %d .\n", i , fib);
        }
    }
}
