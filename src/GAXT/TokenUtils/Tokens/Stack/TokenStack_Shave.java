package GAXT.TokenUtils.Tokens.Stack;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

public class TokenStack_Shave extends TokenStack
{
	@Override
	public void operateOnStack() throws GaxtException
	{
		if(interpreter.isStackEmpty())
			throw new GaxtException(GaxtError.E_EmptyStackShaving,getTokenType(),getPosition());
		if(interpreter.bUsesCalcStack) interpreter.calcStack.pop();
		else interpreter.varStack.pop();
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Shave;
	}
}
