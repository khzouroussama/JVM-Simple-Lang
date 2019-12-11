package LangElements;

public class Err {
    private int ligne ;
    private ErrTypes type ;
    private String context;

    public Err(int ligne, ErrTypes type ) {
        this.ligne = ligne;
        this.type = type;
    }

    public Err(int ligne, ErrTypes type, String context) {
        this.ligne = ligne;
        this.type = type;
        this.context = context;
    }

    @Override
    public String toString() {
        return "\nErr{\n" +
                "ligne=" + ligne +
                ", type=" + type +
                ", context='" + context + '\'' +
                '}';
    }
}
