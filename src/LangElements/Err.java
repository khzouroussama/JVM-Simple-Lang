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
        String errMsg ="> line : "+ligne +" :";
        switch (this.type){
            case BIB_SMALL_JAVA_IO:case BIB_SMALL_JAVA_LANG:
                errMsg += " Erreur Syntaxique : "+ context ;
                break;
            case VAR_DOUBLE_DEC:
                errMsg += " "+context + " est doublement declarer !" ;
                break;
            case VAR_INCOMPTATIBLE:
                errMsg += " "+"type incomptatible "+context;
                break;
            case VAR_NOT_DEC:
                errMsg += " " +context+" est non decclarer" ;
                break;
            case BIB_NOT_FOUND:
                errMsg += " Library :"+context+" not Found ";
                break;
            case SYNT:
                errMsg += " Erreur Syntaxic :"+context;
                break;
            case CLASS_CAPITAL_START:
                errMsg += " "+context;
                break;

        }
        errMsg = "\"" + errMsg.replaceAll("\"","\\\\\"") + "\"" ;
        return errMsg;
    }
}
