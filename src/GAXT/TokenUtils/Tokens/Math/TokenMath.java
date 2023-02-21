package GAXT.TokenUtils.Tokens.Math;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.TokenType;
import GAXT.TokenUtils.Tokens.Token;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class TokenMath extends Token
{
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Math;
	}
	
	private void wrapException(GaxtError error)
	{
		throw new GaxtException(error,getTokenType(),getPosition());
	}
	
	public void performMathCalc()
	throws NoSuchElementException, NullPointerException, ArithmeticException, NumberFormatException
	{
		if(interpreter.calcStack.size()<2) throw new EmptyStackException();
		long b=interpreter.calcStack.pop();
		interpreter.calcStack.push(calculate(interpreter.calcStack.pop(),b));
	}
	
	public void performMathVar()
	throws NoSuchElementException, NullPointerException, ArithmeticException, NumberFormatException
	{
		if(this.interpreter.varStack.size()<2) throw new EmptyStackException();
		long b=interpreter.variables[interpreter.varStack.pop()-'a'];
		char variableName=(char)(Objects.requireNonNull(interpreter.varStack.peek())-'a');
		long a=interpreter.variables[variableName];
		this.interpreter.variables[variableName]=calculate(a,b);
	}
	
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
		this.interpreter=interpreter;
		try
		{
			if(this.interpreter.bUsesCalcStack) performMathCalc();
			else performMathVar();
		}
		catch(EmptyStackException e)
		{
			wrapException(GaxtError.E_EmptyStackAccessing);
		}
		catch(NumberFormatException e)
		{
			wrapException(GaxtError.E_NumberOverflow);
		}
		catch(ArithmeticException e)
		{
			wrapException(GaxtError.E_WrongArithmetic);
		}
		catch(NullPointerException e)
		{
			wrapException(GaxtError.E_StackCorruption);
		}
	}
	
	@Override
	public TokenType getTokenType()
	{
		return null;
	}
	
	public long calculate(long a,long b) throws ArithmeticException, NumberFormatException
	{
		return 0;
	}
}