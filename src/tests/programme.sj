import Small_Java.lang ;
import Small_Java.io ;

protected sj_class SmallJava {

    MainSj{
        sj_int x := 5+-5 , x2  ;
        sj_float z := 5;
        sj_string y := "Hello!";
        x2:= 40;
        x := x * 5.2 ;
        sj_Out("%s \nla Valeur de variable x+x2 = %d \n est la valeur de z = %f\n", y, x and x2, z);

        si (x = 1) alors {
            y := "Hello1" ;
        }sinon{
            y := "Hello1" ;
        }

        sj_Out("%s !!!\n", y);

    }
}
