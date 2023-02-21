package GAXT.TokenUtils.Tokens.Flow;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenType;

public class TokenFlow_Else extends TokenFlow
{
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
		this.interpreter=interpreter;
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Else;
	}
}
