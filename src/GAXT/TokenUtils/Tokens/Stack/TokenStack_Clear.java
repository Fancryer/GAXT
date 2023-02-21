package GAXT.TokenUtils.Tokens.Stack;

import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

public class TokenStack_Clear extends TokenStack
{
	@Override
	public void operateOnStack() throws GaxtException
	{
		if(interpreter.bUsesCalcStack) interpreter.calcStack.clear();
		else interpreter.varStack.clear();
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Clear;
	}
}
