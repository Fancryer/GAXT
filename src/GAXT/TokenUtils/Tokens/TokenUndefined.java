package GAXT.TokenUtils.Tokens;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.TokenType;

public class TokenUndefined extends Token
{
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
	
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Undefined;
	}
	
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Undefined;
	}
}
