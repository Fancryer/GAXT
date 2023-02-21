package GAXT.TokenUtils.Tokens.Stack;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class TokenStack_Reverse extends TokenStack
{
	@Override
	public void operateOnStack() throws GaxtException
	{
		try
		{
			if(interpreter.bUsesCalcStack)
			{
				var cs=new ArrayList<>(interpreter.calcStack.stream().toList());
				Collections.reverse(cs);
				interpreter.calcStack=new ArrayDeque<>(cs);
			}
			else
			{
				var vs=new ArrayList<>(interpreter.varStack.stream().toList());
				Collections.reverse(vs);
				interpreter.varStack=new ArrayDeque<>(vs);
			}
		}
		catch(NullPointerException e)
		{
			throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
		}
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Reverse;
	}
}
