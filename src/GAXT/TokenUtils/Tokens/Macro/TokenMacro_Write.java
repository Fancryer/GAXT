package GAXT.TokenUtils.Tokens.Macro;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

public class TokenMacro_Write extends TokenMacro
{
	@Override
	public void operateWithMacro() throws GaxtException
	{
		throw new GaxtException(GaxtError.E_UnbalancedBrackets,getTokenType(),getPosition());
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Write;
	}
}
