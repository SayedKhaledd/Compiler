// Generated from G:/Github/Compiler/src\Loop.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LoopParser}.
 */
public interface LoopListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LoopParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LoopParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LoopParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(LoopParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(LoopParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LoopParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LoopParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(LoopParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(LoopParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(LoopParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(LoopParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LoopParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LoopParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(LoopParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(LoopParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#exprfor}.
	 * @param ctx the parse tree
	 */
	void enterExprfor(LoopParser.ExprforContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#exprfor}.
	 * @param ctx the parse tree
	 */
	void exitExprfor(LoopParser.ExprforContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(LoopParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(LoopParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(LoopParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(LoopParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#chang}.
	 * @param ctx the parse tree
	 */
	void enterChang(LoopParser.ChangContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#chang}.
	 * @param ctx the parse tree
	 */
	void exitChang(LoopParser.ChangContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(LoopParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(LoopParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(LoopParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(LoopParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(LoopParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(LoopParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(LoopParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(LoopParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LoopParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LoopParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(LoopParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(LoopParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(LoopParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(LoopParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(LoopParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(LoopParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(LoopParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(LoopParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LoopParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LoopParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(LoopParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(LoopParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(LoopParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(LoopParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(LoopParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(LoopParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(LoopParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(LoopParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(LoopParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(LoopParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(LoopParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link LoopParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(LoopParser.NilAtomContext ctx);
}