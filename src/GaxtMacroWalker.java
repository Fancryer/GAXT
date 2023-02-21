public class GaxtMacroWalker extends GAXTBaseVisitor<String>
{
	GaxtInterpreter_ANTLR interpreter;

	public GaxtMacroWalker(GaxtInterpreter_ANTLR interpreter)
	{
		this.interpreter=interpreter;
	}

	@Override public String visitMacro(GAXTParser.MacroContext ctx)
	{
		if(ctx.store_macro()!=null) return visitStore_macro(ctx.store_macro());
		if(ctx.call_macro()!=null) return visitCall_macro(ctx.call_macro());
		return super.visitMacro(ctx);
	}

	@Override public String visitStore_macro(GAXTParser.Store_macroContext ctx)
	{
		var expList=ctx.expression();//GaxtBaseWalker.expressionContextToCharacters(ctx.expression());
		//var macroBody=expList.stream().map(String::valueOf).collect(Collectors.joining());
		interpreter.macros.add(expList);
		return "";
	}

	@Override public String visitCall_macro(GAXTParser.Call_macroContext ctx)
	{
		var macroIndex=Math.toIntExact(interpreter.popFromStack());
		var macroBody=interpreter.macros.get(macroIndex);
		var walker=new GaxtBaseWalker(interpreter);
		for(var exp: macroBody) walker.visitExpression(exp);
		return super.visitCall_macro(ctx);
	}
}