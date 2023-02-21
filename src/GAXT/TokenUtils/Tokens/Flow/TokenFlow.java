package GAXT.TokenUtils.Tokens.Flow;

import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.Tokens.Token;

public abstract class TokenFlow extends Token
{
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Flow;
	}
}
