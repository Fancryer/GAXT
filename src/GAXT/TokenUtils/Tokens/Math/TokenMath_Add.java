package GAXT.TokenUtils.Tokens.Math;

import GAXT.TokenUtils.TokenType;

public class TokenMath_Add extends TokenMath
{
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Add;
	}
	
	@Override
	public long calculate(long a,long b)
	{
		return Math.addExact(a,b);
	}
}
