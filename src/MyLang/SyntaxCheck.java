package MyLang;
import LangElements.*;
import LangElements.Compiler;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SyntaxCheck extends myLangBaseListener {

    // a shared variable that can be used between listners (Quad Maker // syntax check)
    // the actual exp type stored in typeOP1
    static Types typeOP1 , typesOP2 ;

    int nbop = 0 ;


    @Override
    public void exitS(myLangParser.SContext ctx) {
        // verify that class name starts by Capital letter
        if ( ! Character.isUpperCase(ctx.IDF().getText().charAt(0)) )
            Compiler.compileERRS.add(new Err(ctx.start.getLine() , ErrTypes.CLASS_CAPITAL_START , "Class name <"+ctx.IDF().getText()+"> must start by a capital letter."));


        System.out.println("<Fin de Compilation> With  " +Compiler.compileERRS.size()+" Erreurs");
        Compiler.printTS();
        Compiler.printERR();

    }

    @Override
    public void exitImports(myLangParser.ImportsContext ctx) {
        if (ctx.BIB().getText().equals("Small_Java.lang") && !Compiler.TScontains("BIB1"))
                Compiler.TS.add(new Symbol("BIB1",null,10,true));
        else if (ctx.BIB().getText().equals("Small_Java.io") && !Compiler.TScontains("BIB2"))
            Compiler.TS.add(new Symbol("BIB2",null,10,true));
        else Compiler.compileERRS.add(new Err(ctx.start.getLine() , ErrTypes.BIB_NOT_FOUND , "Bib <"+ctx.BIB().getText()+"> not found ."));
    }


    @Override
    public void exitDec(myLangParser.DecContext ctx) {
        for (myLangParser.AffectContext c:ctx.affect()) {
            if (! Compiler.TScontains(c.IDF().getText()))
                Compiler.TS.add(new Symbol(
                        c.IDF().getText()
                        ,getType(ctx.type().getText())
                        ,10
                        ,true
                ));
            else Compiler.compileERRS.add(new Err(ctx.start.getLine(), ErrTypes.VAR_DOUBLE_DEC , "var :"+ c.IDF().getText() ));
        }


        for (TerminalNode c:ctx.IDF()) {
            if (! Compiler.TScontains(c.getText()))
                Compiler.TS.add(new Symbol(
                        c.getText()
                        ,getType(ctx.type().getText())
                        ,10
                        ,true
                ));
            else Compiler.compileERRS.add(new Err(ctx.start.getLine(), ErrTypes.VAR_DOUBLE_DEC , "var :"+ c.getText() ));
        }
        super.exitDec(ctx);
    }

    @Override
    public void exitAffect(myLangParser.AffectContext ctx) {
//        if (ctx.parent.getRuleContext() instanceof myLangParser.DecContext)
//            System.out.println(ctx.getText()+"->is from dec");

        // TEST if this assigne is not from a declaration to Generate VAR_NOT_DEC
        if (ctx.parent.getRuleContext() instanceof myLangParser.InstContext)
            if (!Compiler.TScontains(ctx.IDF().getText())) {
                Compiler.compileERRS.add(new Err(ctx.start.getLine(), ErrTypes.VAR_NOT_DEC, "var :" + ctx.IDF().getText()));
                Compiler.TS.add(new Symbol(ctx.IDF().getText() ,null ,10 ));
            }

        Types idfType = null;
        if (Compiler.TScontains(ctx.IDF().getText())) {
            idfType = Compiler.TSget(ctx.IDF().getText()).getType();
        }

        if (idfType != null ){
            typesOP2 = idfType ;
            if (checkType() == null)
                Compiler.compileERRS.add(new Err(ctx.start.getLine() , ErrTypes.VAR_INCOMPTATIBLE , "var :"+ ctx.IDF().getText() ));
        }

        typesOP2 = typeOP1 = null ;
        nbop = 0;

        super.exitAffect(ctx);
    }

    @Override
    public void enterExp(myLangParser.ExpContext ctx) {
        if (! Compiler.TScontains("BIB1") ) Compiler.compileERRS.add(new Err(ctx.start.getLine() , ErrTypes.BIB_SMALL_JAVA_LANG ,"Bib <Small_Java.lang> is required " ) );
    }

    @Override
    public void exitExp(myLangParser.ExpContext ctx) {
        nbop = 1 ;
    }


    @Override
    public void exitTerminal(myLangParser.TerminalContext ctx) {

        //System.out.println(ctx.start.getText() +"-"+ nbop);
        if (nbop == 0)
            typeOP1 = getTokenType(ctx.start);
        if (nbop == 1 )
            typesOP2 = getTokenType(ctx.start);
        nbop ++ ;
        if (nbop == 2 ) {
            typeOP1 = checkType() ; // mettre la resultat dans
            if (typeOP1 == null) Compiler.compileERRS.add(
                    new Err(ctx.start.getLine() , ErrTypes.VAR_INCOMPTATIBLE , ctx.getText() + " de type" + getTokenType(ctx.start)));
            nbop = 1 ;
        }
    }


    @Override
    public void enterOutput(myLangParser.OutputContext ctx) {
        if (! Compiler.TScontains("BIB2") ) Compiler.compileERRS.add(new Err(ctx.start.getLine() , ErrTypes.BIB_SMALL_JAVA_IO ,"Bib <Small_Java.io> is required " ) );
    }

    @Override
    public void enterInput(myLangParser.InputContext ctx) {
        if (! Compiler.TScontains("BIB2") ) Compiler.compileERRS.add(new Err(ctx.start.getLine() , ErrTypes.BIB_SMALL_JAVA_IO ,"Bib <Small_Java.io> is required " ) );
    }

    /**
     * Tools
     */
    Types getType(String type){
        switch (type){
            case "sj_int": return Types.INT ;
            case "sj_float": return Types.FLOAT ;
            case "sj_string": return Types.STRING ;
        }
        return null;
    }

    Types checkType(){
        if (typeOP1 == null) return null ;
        else
        switch (typeOP1){
            case INT: return ( typesOP2 == Types.INT )? Types.INT : ( typesOP2 == Types.FLOAT )? Types.FLOAT: null ;
            case FLOAT: return (typesOP2 == Types.FLOAT || typesOP2 == Types.INT )? Types.FLOAT : null ;
            case STRING:  return (typesOP2 == Types.STRING )? Types.STRING : null ;
            case BOOLEAN: return (typesOP2 == Types.BOOLEAN )? Types.BOOLEAN : null ;
        }
        return null;
    }

    Types getTokenType(Token token){
        switch (token.getType()){
            case myLangParser.INT : return Types.INT;
            case myLangParser.FLOAT:  return Types.FLOAT;
            case myLangParser.STRING:  return Types.STRING;
            case myLangParser.TRUE:
            case myLangParser.FALSE:
                return Types.BOOLEAN;
            // IDF get from TSligne=11, type=VAR_INCOMPTATIBLE, context='var :y'}]
            case myLangParser.IDF : return (Compiler.TScontains(token.getText()))?Compiler.TSget(token.getText()).getType() : null;
        }
        return null ;
    }

}
