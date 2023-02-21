// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GAXTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GAXTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GAXTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GAXTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GAXTParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GAXTParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#expr_in_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_in_string(GAXTParser.Expr_in_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#string_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_char(GAXTParser.String_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#formatter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatter(GAXTParser.FormatterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#fmt_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFmt_expr(GAXTParser.Fmt_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow(GAXTParser.FlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#full_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_branch(GAXTParser.Full_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#short_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort_branch(GAXTParser.Short_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService(GAXTParser.ServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#direct_stack_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_stack_op(GAXTParser.Direct_stack_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GAXTParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#stack_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_op(GAXTParser.Stack_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#stack_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_logical(GAXTParser.Stack_logicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#stack_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_math(GAXTParser.Stack_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#stack_push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_push(GAXTParser.Stack_pushContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(GAXTParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro(GAXTParser.MacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#store_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore_macro(GAXTParser.Store_macroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GAXTParser#call_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_macro(GAXTParser.Call_macroContext ctx);
}