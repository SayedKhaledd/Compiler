// Generated from G:/Github/Compiler/src\IfStatement.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IfStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IfStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IfStatementParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(IfStatementParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatementParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(IfStatementParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(IfStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatementParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(IfStatementParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatementParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(IfStatementParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatementParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(IfStatementParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatementParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(IfStatementParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IfStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(IfStatementParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(IfStatementParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(IfStatementParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(IfStatementParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(IfStatementParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link IfStatementParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(IfStatementParser.NilAtomContext ctx);
}