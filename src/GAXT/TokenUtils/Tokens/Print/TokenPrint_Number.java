package GAXT.TokenUtils.Tokens.Print;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

import java.util.EmptyStackException;

public class TokenPrint_Number extends TokenPrint
{
	@Override
	public void print() throws GaxtException
	{
		long b;
		if(interpreter.bUsesCalcStack)
		{
			if(interpreter.calcStack.isEmpty())
			{
				throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
			}
			b=interpreter.calcStack.peek();
		}
		else try
		{
			b=interpreter.variables[interpreter.varStack.peek()-'a'];
		}
		catch(EmptyStackException e)
		{
			throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
		}
		System.out.printf("%d",b);
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_PrintInt;
	}
}
