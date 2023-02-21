package GAXT.TokenUtils.Tokens.Loop;

import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

public class TokenLoop_Until extends TokenLoop
{
	@Override
	public void operateWithLoop() throws GaxtException{}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Until;
	}
}
