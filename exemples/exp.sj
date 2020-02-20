import Small_Java.lang ;
import Small_Java.io ;

public class Exp {

    MainExp{
        float  facti := 1  ,  xi := 1 , N := 20  , x ;
        float exp := 1 ;
        
        x := 1 ;
        int i := 1 ;

        while (i < N) {
            xi := xi * x ;
            facti := facti * i ;
            exp := exp + (xi / facti) ;
            i := i + 1 ;
        }
        Out("Exp(%f) = %f .\n", x , exp);

    }
}
