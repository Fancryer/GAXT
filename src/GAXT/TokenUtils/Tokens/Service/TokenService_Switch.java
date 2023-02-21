package GAXT.TokenUtils.Tokens.Service;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenType;

public class TokenService_Switch extends TokenService
{
	@Override
	public void eval(Interpreter interpreter)
	{
		try
		{
			this.interpreter=interpreter;
			this.interpreter.bUsesCalcStack=!this.interpreter.bUsesCalcStack;
		}
		catch(NullPointerException e)
		{
			throw new GaxtException(GaxtError.E_UndefinedToken,getTokenType(),getPosition());
		}
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Switch;
	}
}
