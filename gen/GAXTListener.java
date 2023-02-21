// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GAXTParser}.
 */
public interface GAXTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GAXTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GAXTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GAXTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GAXTParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GAXTParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(GAXTParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(GAXTParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#expr_in_string}.
	 * @param ctx the parse tree
	 */
	void enterExpr_in_string(GAXTParser.Expr_in_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#expr_in_string}.
	 * @param ctx the parse tree
	 */
	void exitExpr_in_string(GAXTParser.Expr_in_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#string_char}.
	 * @param ctx the parse tree
	 */
	void enterString_char(GAXTParser.String_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#string_char}.
	 * @param ctx the parse tree
	 */
	void exitString_char(GAXTParser.String_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#formatter}.
	 * @param ctx the parse tree
	 */
	void enterFormatter(GAXTParser.FormatterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#formatter}.
	 * @param ctx the parse tree
	 */
	void exitFormatter(GAXTParser.FormatterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#fmt_expr}.
	 * @param ctx the parse tree
	 */
	void enterFmt_expr(GAXTParser.Fmt_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#fmt_expr}.
	 * @param ctx the parse tree
	 */
	void exitFmt_expr(GAXTParser.Fmt_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#flow}.
	 * @param ctx the parse tree
	 */
	void enterFlow(GAXTParser.FlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#flow}.
	 * @param ctx the parse tree
	 */
	void exitFlow(GAXTParser.FlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#full_branch}.
	 * @param ctx the parse tree
	 */
	void enterFull_branch(GAXTParser.Full_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#full_branch}.
	 * @param ctx the parse tree
	 */
	void exitFull_branch(GAXTParser.Full_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#short_branch}.
	 * @param ctx the parse tree
	 */
	void enterShort_branch(GAXTParser.Short_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#short_branch}.
	 * @param ctx the parse tree
	 */
	void exitShort_branch(GAXTParser.Short_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#service}.
	 * @param ctx the parse tree
	 */
	void enterService(GAXTParser.ServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#service}.
	 * @param ctx the parse tree
	 */
	void exitService(GAXTParser.ServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#direct_stack_op}.
	 * @param ctx the parse tree
	 */
	void enterDirect_stack_op(GAXTParser.Direct_stack_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#direct_stack_op}.
	 * @param ctx the parse tree
	 */
	void exitDirect_stack_op(GAXTParser.Direct_stack_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GAXTParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GAXTParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#stack_op}.
	 * @param ctx the parse tree
	 */
	void enterStack_op(GAXTParser.Stack_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#stack_op}.
	 * @param ctx the parse tree
	 */
	void exitStack_op(GAXTParser.Stack_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#stack_logical}.
	 * @param ctx the parse tree
	 */
	void enterStack_logical(GAXTParser.Stack_logicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#stack_logical}.
	 * @param ctx the parse tree
	 */
	void exitStack_logical(GAXTParser.Stack_logicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#stack_math}.
	 * @param ctx the parse tree
	 */
	void enterStack_math(GAXTParser.Stack_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#stack_math}.
	 * @param ctx the parse tree
	 */
	void exitStack_math(GAXTParser.Stack_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#stack_push}.
	 * @param ctx the parse tree
	 */
	void enterStack_push(GAXTParser.Stack_pushContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#stack_push}.
	 * @param ctx the parse tree
	 */
	void exitStack_push(GAXTParser.Stack_pushContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(GAXTParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(GAXTParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(GAXTParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(GAXTParser.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#store_macro}.
	 * @param ctx the parse tree
	 */
	void enterStore_macro(GAXTParser.Store_macroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#store_macro}.
	 * @param ctx the parse tree
	 */
	void exitStore_macro(GAXTParser.Store_macroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAXTParser#call_macro}.
	 * @param ctx the parse tree
	 */
	void enterCall_macro(GAXTParser.Call_macroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAXTParser#call_macro}.
	 * @param ctx the parse tree
	 */
	void exitCall_macro(GAXTParser.Call_macroContext ctx);
}