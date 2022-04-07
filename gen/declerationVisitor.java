// Generated from G:/Github/Compiler/src\Decleration.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link declerationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface declerationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link declerationParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(declerationParser.StartContext ctx);
}
