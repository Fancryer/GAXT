package GAXT.TokenUtils.Tokens.Flow;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenType;

import static GAXT.ErrorUtils.GaxtError.E_UnexpectedToken;

public class TokenFlow_Continue extends TokenFlow
{
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
		this.interpreter=interpreter;
		if(!this.interpreter.isLoop())throw new GaxtException(E_UnexpectedToken,getTokenType(),getPosition());
		setPosition(0);
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Continue;
	}
}
