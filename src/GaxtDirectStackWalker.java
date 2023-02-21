public class GaxtDirectStackWalker extends GAXTBaseVisitor<String>
{
	GaxtInterpreter_ANTLR interpreter;

	public GaxtDirectStackWalker(GaxtInterpreter_ANTLR interpreter)
	{
		this.interpreter=interpreter;
	}

	private String performAssign()
	{
		long b;
		assert !(interpreter.bUsesCalcStack?interpreter.calcStack:interpreter.varStack).isEmpty();
		b=interpreter.bUsesCalcStack?interpreter.popFromStack():
				interpreter.getVariable(interpreter.varStack.peek());
		if(interpreter.bUsesCalcStack) interpreter.setVariable(interpreter.varStack.pop(),b);
		else
		{
			interpreter.popFromStack();
			interpreter.pushNumber(b);
		}
		return "";
	}

	private String performReverse()
	{
		interpreter.reverseStack();
		return "";
	}

	private String performShave()
	{
		interpreter.popFromStack();
		return "";
	}

	private String performClear()
	{
		interpreter.clearStack();
		return "";
	}

	@Override public String visitDirect_stack_op(GAXTParser.Direct_stack_opContext ctx)
	{
		if(ctx.ASSIGN()!=null) return performAssign();
		if(ctx.REVERSE()!=null) return performReverse();
		if(ctx.SHAVE()!=null) return performShave();
		if(ctx.CLEAR()!=null) return performClear();
		throw new RuntimeException("Wrong direct stack op!");
	}
}