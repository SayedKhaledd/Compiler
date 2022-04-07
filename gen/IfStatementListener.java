// Generated from G:/Github/Compiler/src\IfStatement.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IfStatementParser}.
 */
public interface IfStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IfStatementParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(IfStatementParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatementParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(IfStatementParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatementParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(IfStatementParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatementParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(IfStatementParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(IfStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(IfStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatementParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(IfStatementParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatementParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(IfStatementParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatementParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(IfStatementParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatementParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(IfStatementParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatementParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(IfStatementParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatementParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(IfStatementParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatementParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(IfStatementParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatementParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(IfStatementParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IfStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IfStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(IfStatementParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(IfStatementParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(IfStatementParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(IfStatementParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(IfStatementParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(IfStatementParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(IfStatementParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(IfStatementParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(IfStatementParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(IfStatementParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(IfStatementParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(IfStatementParser.NilAtomContext ctx);
}