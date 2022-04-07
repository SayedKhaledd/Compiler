// Generated from G:/Github/Compiler/src\switchh.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link switchhParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface switchhVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link switchhParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(switchhParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(switchhParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(switchhParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(switchhParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(switchhParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(switchhParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(switchhParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(switchhParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#exprfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprfor(switchhParser.ExprforContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(switchhParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#assign_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_value(switchhParser.Assign_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(switchhParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(switchhParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link switchhParser#chang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChang(switchhParser.ChangContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(switchhParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(switchhParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(switchhParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(switchhParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(switchhParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(switchhParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(switchhParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(switchhParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(switchhParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link switchhParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(switchhParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(switchhParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(switchhParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(switchhParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(switchhParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(switchhParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link switchhParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(switchhParser.NilAtomContext ctx);
}