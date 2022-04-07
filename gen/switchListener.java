// Generated from G:/Github/Compiler/src\switchh.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link switchParser}.
 */
public interface switchListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link switchParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(switchParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(switchParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(switchParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(switchParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(switchParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(switchParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(switchParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(switchParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(switchParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(switchParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(switchParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(switchParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(switchParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(switchParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(switchParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(switchParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#exprfor}.
	 * @param ctx the parse tree
	 */
	void enterExprfor(switchParser.ExprforContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#exprfor}.
	 * @param ctx the parse tree
	 */
	void exitExprfor(switchParser.ExprforContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(switchParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(switchParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#assign_value}.
	 * @param ctx the parse tree
	 */
	void enterAssign_value(switchParser.Assign_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#assign_value}.
	 * @param ctx the parse tree
	 */
	void exitAssign_value(switchParser.Assign_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(switchParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(switchParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(switchParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(switchParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchParser#chang}.
	 * @param ctx the parse tree
	 */
	void enterChang(switchParser.ChangContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchParser#chang}.
	 * @param ctx the parse tree
	 */
	void exitChang(switchParser.ChangContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(switchParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(switchParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(switchParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(switchParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(switchParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(switchParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(switchParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(switchParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(switchParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(switchParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(switchParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(switchParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(switchParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(switchParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(switchParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(switchParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(switchParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(switchParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(switchParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link switchParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(switchParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(switchParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(switchParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(switchParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(switchParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(switchParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(switchParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(switchParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(switchParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(switchParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(switchParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(switchParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link switchParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(switchParser.NilAtomContext ctx);
}
