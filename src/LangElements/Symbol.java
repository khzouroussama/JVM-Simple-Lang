package LangElements;

public class Symbol {

    public static int numSymbol = 1;
    private int num ;
    private String id ;
    private Types type ;
    private int size ;
    private boolean declared ;

    // used only for const values (members of TS dont have those attributes)
    private boolean _cnst_ = false ;
    private String _cnst_value_ ;

    public static Symbol _new_cnst_(String _cnst_value_) {
        return new Symbol("",isValue(_cnst_value_) ,10){{set_cnst_(true);set_cnst_value_(_cnst_value_);}};
    }

    public boolean is_cnst_() {
        return _cnst_;
    }

    public String get_cnst_value_() {
        return _cnst_value_;
    }

    public void set_cnst_(boolean _cnst_) {
        this._cnst_ = _cnst_;
    }

    public void set_cnst_value_(String _cnst_value_) {
        this._cnst_value_ = _cnst_value_;
    }

    // helper function that check if a token is var or value (returns it's type if true)
    public static Types isValue(String s) {
        if (Character.isDigit(s.charAt(0)))
            return (s.contains(".") ? Types.FLOAT : Types.INT );
        else if (s.startsWith("\"")) return Types.STRING ;
        return null;
    }
    //================================================================

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
