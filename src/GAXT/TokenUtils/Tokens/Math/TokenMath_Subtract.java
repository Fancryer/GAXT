package GAXT.TokenUtils.Tokens.Math;

import GAXT.TokenUtils.TokenType;

public class TokenMath_Subtract extends TokenMath
{
	@Override
	public long calculate(long a,long b) throws ArithmeticException, NumberFormatException
	{
		return Math.subtractExact(a,b);
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Subtract;
	}
}
