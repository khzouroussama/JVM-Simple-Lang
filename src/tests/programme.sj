import Small_Java.lang ;
import Small_Java.io ;

protected sj_class PGCD {

    MainSj{
        sj_int a := 8, b  ;
        b := 12 ;

        sj_Out("Le PGCD de %d et %d : \n->", a , b);

        while (a != b) {
            si (a > b) alors {
                a := a - b ;
            } sinon {
                b := b - a ;
            }
        }
        sj_Out("%d", a);

    }
}
