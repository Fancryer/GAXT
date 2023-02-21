import GAXT.GaxtCommon;

public class GaxtFlowWalker extends GAXTBaseVisitor<String>
{
	GaxtInterpreter_ANTLR interpreter;

	public GaxtFlowWalker(GaxtInterpreter_ANTLR interpreter)
	{
		this.interpreter=interpreter;
	}

	@Override public String visitFlow(GAXTParser.FlowContext ctx)
	{
		if(ctx.full_branch()!=null) return visitFull_branch(ctx.full_branch());
		if(ctx.short_branch()!=null) return visitShort_branch(ctx.short_branch());
		throw new RuntimeException("Flow token is invalid!");
	}


	//cond from stack top{true-branch|false-branch}
	@Override public String visitFull_branch(GAXTParser.Full_branchContext ctx)
	{
		return new GaxtBaseWalker(interpreter).visitExpression(getCondition()?ctx.true_branch:ctx.false_branch);
	}


	//cond from stack top{true-branch}
	@Override public String visitShort_branch(GAXTParser.Short_branchContext ctx)
	{
		if(getCondition()) return new GaxtBaseWalker(interpreter).visitExpression(ctx.true_branch);
		return super.visitShort_branch(ctx);
	}

	private boolean getCondition()
	{
		return GaxtCommon.longToBoolean(interpreter.peekFromStack());
	}
}