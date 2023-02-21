package GAXT.TokenUtils.Tokens.Service;

import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.Tokens.Token;

public abstract class TokenService extends Token
{
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Service;
	}
}
