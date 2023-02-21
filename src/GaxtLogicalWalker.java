import GAXT.GaxtCommon;

import java.util.Objects;

import static GAXT.GaxtCommon.booleanToLong;
import static GAXT.GaxtCommon.longToBoolean;

public class GaxtLogicalWalker extends GAXTBaseVisitor<String>
{
	GaxtInterpreter_ANTLR interpreter;

	public GaxtLogicalWalker(GaxtInterpreter_ANTLR interpreter)
	{
		this.interpreter=interpreter;
	}

	private long performNor(long a,long b)
	{
		return booleanToLong(!(longToBoolean(a)||longToBoolean(b)));
	}

	private long performLess(long a,long b)
	{
		return GaxtCommon.booleanToLong(a<b);
	}

	private long performEqual(long a,long b)
	{
		return GaxtCommon.booleanToLong(a==b);
	}

	private long performGreater(long a,long b)
	{
		return GaxtCommon.booleanToLong(a>b);
	}

	private long performLogicalOp(long a,long b,char op)
	{
		return switch(op)
				{
					case '`' -> performNor(a,b);
					case '<' -> performLess(a,b);
					case '=' -> performEqual(a,b);
					case '>' -> performGreater(a,b);
					default -> throw new RuntimeException("Math operator is invalid!");
				};
	}

	@Override public String visitStack_logical(GAXTParser.Stack_logicalContext ctx)
	{
		interpreter.ensureStackCapacity();
		char logicalOp=' ';

		if(ctx.NOR()!=null) logicalOp='`';
		if(ctx.LESS()!=null) logicalOp='<';
		if(ctx.EQUAL()!=null) logicalOp='=';
		if(ctx.GREATER()!=null) logicalOp='>';

		if(interpreter.bUsesCalcStack)
		{
			var b=interpreter.popFromStack();
			var a=interpreter.popFromStack();
			interpreter.pushNumber(performLogicalOp(a,b,logicalOp));
		}
		else
		{
			var b=interpreter.getVariable(interpreter.varStack.pop());
			char variableName=(char)(Objects.requireNonNull(interpreter.varStack.peek())-'a');
			var a=interpreter.getVariable(variableName);
			interpreter.setVariable(variableName,performLogicalOp(a,b,logicalOp));
		}
		return "";
	}
}