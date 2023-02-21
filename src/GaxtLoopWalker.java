import GAXT.GaxtCommon;

public class GaxtLoopWalker extends GAXTBaseVisitor<String>
{
	GaxtInterpreter_ANTLR interpreter;

	public GaxtLoopWalker(GaxtInterpreter_ANTLR interpreter)
	{
		this.interpreter=interpreter;
	}

	@Override public String visitLoop(GAXTParser.LoopContext ctx)
	{
		do
		{
			for(var exp: ctx.expression())
			{
				if(exp.flow()!=null)
				{
					if(exp.flow().BREAK()!=null) return "";
					if(exp.flow().CONTINUE()!=null) break;
				}
				new GaxtBaseWalker(interpreter).visitExpression(exp);
			}
		}
		while(!interpreter.stackIsEmpty()&&GaxtCommon.longToBoolean(interpreter.peekFromStack()));
		return super.visitLoop(ctx);
	}
}