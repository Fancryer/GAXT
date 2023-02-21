package GAXT.TokenUtils.Tokens.Stack;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

import java.util.EmptyStackException;

public class TokenStack_Assign extends TokenStack
{
	@Override
	public void operateOnStack() throws GaxtException
	{
		long b;
		try
		{
			if(interpreter.calcStack.isEmpty()||interpreter.varStack.isEmpty())
			{
				System.out.println(interpreter);
				throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
			}
			if(interpreter.bUsesCalcStack) b=interpreter.calcStack.pop();
			else b=interpreter.variables[interpreter.varStack.peek()-'a'];
		}
		catch(EmptyStackException e)
		{
			throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
		}
		if(interpreter.bUsesCalcStack)
		{
			interpreter.variables[interpreter.varStack.pop()-'a']=b;
		}
		else
		{
			interpreter.varStack.pop();
			interpreter.calcStack.push(b);
		}
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Assign;
	}
}
