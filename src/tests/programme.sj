import Small_Java.lang ;
import Small_Java.io ;

protected sj_class SmallJava {

    MainSj{
        sj_int x := 5 , x2  ;
        sj_float z := 5;
        sj_string y := "Hello!";
        x2:= 40;
        x := x * 5.2 ;
        sj_Out("%s \nla Valeur de variable x+x2 = %d \n est la valeur de z = %f \n", y, x+x2, z);
    }
}
