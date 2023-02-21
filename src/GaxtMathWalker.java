import GAXT.MathUtils.MathUtils;

import java.util.Objects;

public class GaxtMathWalker extends GAXTBaseVisitor<String>
{
	GaxtInterpreter_ANTLR interpreter;

	public GaxtMathWalker(GaxtInterpreter_ANTLR interpreter)
	{
		this.interpreter=interpreter;
	}

	private long performAdd(long a,long b)
	{
		return Math.addExact(a,b);
	}

	private long performSub(long a,long b)
	{
		return Math.subtractExact(a,b);
	}

	private long performMult(long a,long b)
	{
		return Math.multiplyExact(a,b);
	}

	private long performDiv(long a,long b)
	{
		return Math.divideExact(a,b);
	}

	private long performCat(long a,long b)
	{
		return MathUtils.concat(a,b);
	}

	private long performMathOp(long a,long b,char op)
	{
		return switch(op)
				{
					case '+' -> performAdd(a,b);
					case '-' -> performSub(a,b);
					case '*' -> performMult(a,b);
					case '/' -> performDiv(a,b);
					case '_' -> performCat(a,b);
					default -> throw new RuntimeException("Math operator is invalid!");
				};
	}

	@Override public String visitStack_math(GAXTParser.Stack_mathContext ctx)
	{
		interpreter.ensureStackCapacity();
		char mathOp=' ';

		if(ctx.ADD()!=null) mathOp='+';
		if(ctx.SUB()!=null) mathOp='-';
		if(ctx.MULT()!=null) mathOp='*';
		if(ctx.DIV()!=null) mathOp='/';
		if(ctx.CAT()!=null) mathOp='_';

		if(interpreter.bUsesCalcStack)
		{
			long b=interpreter.calcStack.pop();
			long a=interpreter.calcStack.pop();
			interpreter.calcStack.push(performMathOp(a,b,mathOp));
		}
		else
		{
			long b=interpreter.variables[interpreter.varStack.pop()-'a'];
			char variableName=(char)(Objects.requireNonNull(interpreter.varStack.peek())-'a');
			long a=interpreter.variables[variableName];
			this.interpreter.variables[variableName]=performMathOp(a,b,mathOp);
		}
		return "";
	}
}