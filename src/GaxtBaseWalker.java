import GAXT.GaxtCommon;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class GaxtBaseWalker extends GAXTBaseVisitor<String>
{
	GaxtInterpreter_ANTLR interpreter;

	public GaxtBaseWalker(GaxtInterpreter_ANTLR interpreter)
	{
		this.interpreter=interpreter;
	}

	public GaxtBaseWalker()
	{
		this(null);
	}

	@Override public String visitExpression(GAXTParser.ExpressionContext ctx)
	{
		if(ctx.loop()!=null) return new GaxtLoopWalker(interpreter).visitLoop(ctx.loop());
		if(ctx.stack_op()!=null) return visitStack_op(ctx.stack_op());
		if(ctx.stack_push()!=null) return visitStack_push(ctx.stack_push());
		if(ctx.print()!=null) return visitPrint(ctx.print());
		if(ctx.store_macro()!=null) return new GaxtMacroWalker(interpreter).visitStore_macro(ctx.store_macro());
		if(ctx.call_macro()!=null) return new GaxtMacroWalker(interpreter).visitCall_macro(ctx.call_macro());
		if(ctx.direct_stack_op()!=null)
			return new GaxtDirectStackWalker(interpreter).visitDirect_stack_op(ctx.direct_stack_op());
		if(ctx.service()!=null) return visitService(ctx.service());
		if(ctx.TOKEN()!=null) return visitTerminal(ctx.TOKEN());
		if(ctx.flow()!=null) return new GaxtFlowWalker(interpreter).visitFlow(ctx.flow());
		throw new RuntimeException("Expression cannot be visited!");
	}

	@Override public String visitService(GAXTParser.ServiceContext ctx)
	{
		if(ctx.SWITCH()!=null)
		{
			interpreter.bUsesCalcStack=!interpreter.bUsesCalcStack;
			return "";
		}
		throw new RuntimeException();
	}

	@Override public String visitStack_op(GAXTParser.Stack_opContext ctx)
	{
		if(ctx.stack_math()!=null) return new GaxtMathWalker(interpreter).visitStack_math(ctx.stack_math());
		if(ctx.stack_logical()!=null) return new GaxtLogicalWalker(interpreter).visitStack_logical(ctx.stack_logical());
		throw new RuntimeException("Stack operation is invalid!");
	}

	@Override public String visitStack_push(GAXTParser.Stack_pushContext ctx)
	{
		if(ctx.string()!=null) return new GaxtStringWalker(interpreter).visitString(ctx.string());
		if(ctx.VARIABLE()!=null)//Push variable to varStack
		{
			var variableName=getTerminalNodeChar(ctx.VARIABLE());
			interpreter.pushVariable(variableName);
			return "";
		}
		if(ctx.CONSTANT()!=null)//Push constant to calcStack
		{
			var constantName=getTerminalNodeChar(ctx.CONSTANT());
			var constant=GaxtCommon.getConstants()[constantName-'A'];
			interpreter.pushNumber(constant);
			return "";
		}
		if(ctx.DIGIT()!=null)//Push digit to calcStack
		{
			var digit=getTerminalNodeChar(ctx.DIGIT());
			interpreter.pushNumber((long)Character.getNumericValue(digit));
			return "";
		}
		throw new RuntimeException("Cannot push to stack!");
	}

	@Override public String visitProgram(GAXTParser.ProgramContext ctx)
	{
		if(interpreter==null) interpreter=new GaxtInterpreter_ANTLR();
		//System.out.printf("Source: %n%s%n%n",ctx.getText());
		return super.visitProgram(ctx);
	}

	@Override public String visitTerminal(TerminalNode node)
	{
		//System.out.println(node.getSymbol().getText());
		return super.visitTerminal(node);
	}

	@Override public String visitPrint(GAXTParser.PrintContext ctx)
	{
		long toPrint=interpreter.peekFromStack();
		if(ctx.PRINT_CHAR()!=null)
		{
			interpreter.output.append((char)toPrint);
			System.out.printf("%c",(char)toPrint);
		}
		if(ctx.PRINT_INT()!=null)
		{
			interpreter.output.append(toPrint);
			System.out.printf("%d",toPrint);
		}
		return "";
	}


	public static List<Character> expressionContextToCharacters(List<GAXTParser.ExpressionContext> ctx)
	{
		return ctx.stream().map((e)->e.getText().charAt(0)).toList();
	}

	public static Character getTerminalNodeChar(TerminalNode term)
	{
		return term==null?null:term.getSymbol().getText().charAt(0);
	}
}