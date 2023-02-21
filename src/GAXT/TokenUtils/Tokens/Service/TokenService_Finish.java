package GAXT.TokenUtils.Tokens.Service;

import GAXT.ErrorUtils.GaxtException_Finish;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenType;

public class TokenService_Finish extends TokenService
{
	@Override
	public void eval(Interpreter interpreter) throws GaxtException_Finish
	{
		this.interpreter=interpreter;
		throw new GaxtException_Finish(getPosition());
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Finish;
	}
}
