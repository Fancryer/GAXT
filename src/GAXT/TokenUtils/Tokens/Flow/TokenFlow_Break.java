package GAXT.TokenUtils.Tokens.Flow;

import GAXT.ErrorUtils.GaxtException;
import GAXT.ErrorUtils.GaxtException_Finish;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenType;

import static GAXT.ErrorUtils.GaxtError.E_UnexpectedToken;

public class TokenFlow_Break extends TokenFlow
{
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
		this.interpreter=interpreter;
		if(interpreter.isLoop()) throw new GaxtException_Finish(getPosition(),true);
		throw new GaxtException(E_UnexpectedToken,getTokenType(),getPosition());
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Break;
	}
}
