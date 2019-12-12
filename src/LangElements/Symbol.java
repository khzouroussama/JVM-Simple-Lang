package LangElements;

public class Symbol {

    public static int numSymbol = 1;
    private int num ;
    private String id ;
    private Types type ;
    private int size ;
    private boolean declared ;

    public Symbol(String id, Types type, int size, boolean declared) {
        this.num = numSymbol++ ;
        this.id = id;
        this.type = type;
        this.size = size;
        this.declared = declared;
    }

    public Symbol(String id, Types type, int size) {
        this(id,type,size,false);
    }

    public String getId() {
        return id;
    }

    public Types getType() {
        return type;
    }


    public int getSize() {
        return size;
    }

    public int getNum() {
        return num;
    }

    public void setType(Types type) {
        this.type = type;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public boolean isDeclared() {
        return declared;
    }

    public void setDeclared(boolean declared) {
        this.declared = declared;
    }

    @Override
    public String toString() {
        return "\nSymbol{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", type=" + type +
                ", size=" + size +
                ", declared=" + declared +
                '}';
    }
}
