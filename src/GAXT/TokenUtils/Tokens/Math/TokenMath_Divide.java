package GAXT.TokenUtils.Tokens.Math;

import GAXT.TokenUtils.TokenType;

public class TokenMath_Divide extends TokenMath
{
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Divide;
	}
	
	@Override
	public long calculate(long a,long b) throws ArithmeticException, NumberFormatException
	{
		return Math.divideExact(a,b);
	}
}
