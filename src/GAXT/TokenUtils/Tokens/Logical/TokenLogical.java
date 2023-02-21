package GAXT.TokenUtils.Tokens.Logical;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.Tokens.Token;

import java.util.EmptyStackException;

public abstract class TokenLogical extends Token
{
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Math;
	}

	@Override
	public void eval(Interpreter interpreter)
	{
		this.interpreter=interpreter;
		long b, a, r;
		Character vs=null;
		try
		{
			if(interpreter.getStackSize()<2) throw new EmptyStackException();
			if(interpreter.bUsesCalcStack)
			{
				b=interpreter.calcStack.pop();
				a=interpreter.calcStack.pop();
			}
			else
			{
				b=interpreter.variables[interpreter.varStack.pop()-'a'];

				vs=interpreter.varStack.peek();
				assert vs!=null;
				a=interpreter.variables[vs-'a'];
			}
			r=calculate(a,b);
		}
		catch(EmptyStackException|AssertionError e)
		{
			throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
		}
		catch(NumberFormatException e)
		{
			throw new GaxtException(GaxtError.E_NumberOverflow,getTokenType(),getPosition());
		}
		catch(ArithmeticException e)
		{
			throw new GaxtException(GaxtError.E_WrongArithmetic,getTokenType(),getPosition());
		}
		if(interpreter.bUsesCalcStack) interpreter.calcStack.push(r);
		else
		{
			try
			{
				assert vs!=null;
				interpreter.variables[vs-'a']=r;
			}
			catch(AssertionError e)
			{
				throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
			}
		}
	}

	public abstract long calculate(long a,long b) throws ArithmeticException, NumberFormatException;
}
