package GAXT.TokenUtils.Tokens.Math;

import GAXT.TokenUtils.TokenType;

public class TokenMath_Multiply extends TokenMath
{
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Multiply;
	}
	
	@Override
	public long calculate(long a,long b) throws ArithmeticException, NumberFormatException
	{
		return Math.multiplyExact(a,b);
	}
}
