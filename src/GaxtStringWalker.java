import org.antlr.v4.runtime.tree.TerminalNode;

public class GaxtStringWalker extends GAXTBaseVisitor<String>
{
	GaxtInterpreter_ANTLR interpreter;

	public GaxtStringWalker(GaxtInterpreter_ANTLR interpreter)
	{
		this.interpreter=interpreter;
	}

	public String insertFmt_variable(char c)
	{
		return "%d".formatted(interpreter.getVariable((char)(c-'a')));
	}

	@Override public String visitString_char(GAXTParser.String_charContext ctx)
	{
		if(ctx.expr_in_string()!=null) return ctx.expr_in_string().getText();
		if(ctx.formatter()!=null) return visitFormatter(ctx.formatter());
		throw new RuntimeException("Expression inside string is invalid!");
	}

	private char getTerminalChar(TerminalNode term)
	{
		return term.getText().charAt(0);
	}

	@Override public String visitFormatter(GAXTParser.FormatterContext ctx)
	{
		if(ctx.Fmt_variable()!=null) return insertFmt_variable(ctx.Fmt_variable().getText().charAt(1));
		if(ctx.Fmt_finish()!=null) return "!";
		if(ctx.Fmt_new_line()!=null) return "\n";
		if(ctx.Fmt_space()!=null) return " ";
		if(ctx.Fmt_tab()!=null) return "\t";
		if(ctx.fmt_expr()!=null) return visitFmt_expr(ctx.fmt_expr());
		throw new RuntimeException("String formatter is invalid!");
	}

	@Override public String visitFmt_expr(GAXTParser.Fmt_exprContext ctx)
	{
		if(ctx.expression()!=null)
		{
			var walker=new GaxtBaseWalker(interpreter);
			for(var expr:ctx.expression()) walker.visitExpression(expr);
			return "";
		}
		throw new RuntimeException("");
	}

	@Override public String visitString(GAXTParser.StringContext ctx)
	{
		if(ctx.string_char()!=null)
		{
			var sb=new StringBuilder();
			for(var ch: ctx.string_char()) sb.append(visitString_char(ch));
			var stringBody=new StringBuilder(sb).reverse().toString();
			var stringLength=stringBody.length();
			for(var token: stringBody.toCharArray()) interpreter.pushNumber((long)token);
			interpreter.pushNumber((long)stringLength);
			return "";
		}
		throw new RuntimeException("String body is undefined!");
	}
	//		var collected=ctx.expression().stream().map(RuleContext::getText).collect(Collectors.joining(""));
	//		var formatted=collected;
	//
	//
	//		var stringBody=new StringBuilder(formatted).reverse().toString();
	//		System.out.println(stringBody);
	//		var stringLength=stringBody.length();
	//		for(var token: stringBody.toCharArray()) interpreter.pushNumber((long)token);
	//		interpreter.pushNumber((long)stringLength);
}