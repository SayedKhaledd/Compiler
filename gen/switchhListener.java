// Generated from G:/Github/Compiler/src\switchh.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link switchhParser}.
 */
public interface switchhListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link switchhParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(switchhParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(switchhParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(switchhParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(switchhParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(switchhParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(switchhParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(switchhParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(switchhParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(switchhParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(switchhParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(switchhParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(switchhParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(switchhParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(switchhParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(switchhParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(switchhParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#exprfor}.
	 * @param ctx the parse tree
	 */
	void enterExprfor(switchhParser.ExprforContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#exprfor}.
	 * @param ctx the parse tree
	 */
	void exitExprfor(switchhParser.ExprforContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(switchhParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(switchhParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#assign_value}.
	 * @param ctx the parse tree
	 */
	void enterAssign_value(switchhParser.Assign_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#assign_value}.
	 * @param ctx the parse tree
	 */
	void exitAssign_value(switchhParser.Assign_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(switchhParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(switchhParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(switchhParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(switchhParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link switchhParser#chang}.
	 * @param ctx the parse tree
	 */
	void enterChang(switchhParser.ChangContext ctx);
	/**
	 * Exit a parse tree produced by {@link switchhParser#chang}.
	 * @param ctx the parse tree
	 */
	void exitChang(switchhParser.ChangContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(switchhParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(switchhParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(switchhParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(switchhParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(switchhParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(switchhParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(switchhParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(switchhParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(switchhParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(switchhParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(switchhParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(switchhParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(switchhParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(switchhParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(switchhParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(switchhParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(switchhParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(switchhParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(switchhParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(switchhParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(switchhParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(switchhParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(switchhParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(switchhParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(switchhParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(switchhParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(switchhParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(switchhParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(switchhParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(switchhParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(switchhParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(switchhParser.NilAtomContext ctx);
}