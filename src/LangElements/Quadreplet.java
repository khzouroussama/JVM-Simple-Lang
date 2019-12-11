package LangElements;

import MyLang.QuadMaker;

import java.util.Arrays;

public class Quadreplet {

    private String[] elt ;

    public Quadreplet(String[] elt) {
        this.elt = elt;
    }

    public static Quadreplet QuadBuilder(String e1 , String e2 , String e3 ,String e4){
        return new Quadreplet(new String[]{e1, e2, e3, e4});
    }
    public static Quadreplet QuadBuilder(){
        return  QuadBuilder("", "", "", "");
    }

    public static Quadreplet QuadBuilder(String s){
        return  QuadBuilder(s, "", "", "");
    }

    @Override
    public String toString() {
        return "" +
                "" + Arrays.toString(elt);
    }

    public void set1(String elt) {
        this.elt[0] = elt;
    }
    public void set2(String elt) {
        this.elt[1] = elt;
    }
    public void set3(String elt) {
        this.elt[2] = elt;
    }
    public void set4(String elt) {
        this.elt[3] = elt;
    }
}
