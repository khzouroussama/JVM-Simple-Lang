// Generated from /home/oussama/IdeaProjects/AntlrExps/src/MyLang/myLang.g4 by ANTLR 4.7.2
package MyLang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myLangParser}.
 */
public interface myLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myLangParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(myLangParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(myLangParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(myLangParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(myLangParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#methode}.
	 * @param ctx the parse tree
	 */
	void enterMethode(myLangParser.MethodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#methode}.
	 * @param ctx the parse tree
	 */
	void exitMethode(myLangParser.MethodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(myLangParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(myLangParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(myLangParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(myLangParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(myLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(myLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#affect}.
	 * @param ctx the parse tree
	 */
	void enterAffect(myLangParser.AffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#affect}.
	 * @param ctx the parse tree
	 */
	void exitAffect(myLangParser.AffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(myLangParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(myLangParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#si_a}.
	 * @param ctx the parse tree
	 */
	void enterSi_a(myLangParser.Si_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#si_a}.
	 * @param ctx the parse tree
	 */
	void exitSi_a(myLangParser.Si_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#si_b}.
	 * @param ctx the parse tree
	 */
	void enterSi_b(myLangParser.Si_bContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#si_b}.
	 * @param ctx the parse tree
	 */
	void exitSi_b(myLangParser.Si_bContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(myLangParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(myLangParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#while_a}.
	 * @param ctx the parse tree
	 */
	void enterWhile_a(myLangParser.While_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#while_a}.
	 * @param ctx the parse tree
	 */
	void exitWhile_a(myLangParser.While_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#while_b}.
	 * @param ctx the parse tree
	 */
	void enterWhile_b(myLangParser.While_bContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#while_b}.
	 * @param ctx the parse tree
	 */
	void exitWhile_b(myLangParser.While_bContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(myLangParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(myLangParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(myLangParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(myLangParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(myLangParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(myLangParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(myLangParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(myLangParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#io_a}.
	 * @param ctx the parse tree
	 */
	void enterIo_a(myLangParser.Io_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#io_a}.
	 * @param ctx the parse tree
	 */
	void exitIo_a(myLangParser.Io_aContext ctx);
}