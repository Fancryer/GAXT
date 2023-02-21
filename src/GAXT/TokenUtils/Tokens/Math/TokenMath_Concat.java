package GAXT.TokenUtils.Tokens.Math;

import GAXT.MathUtils.MathUtils;
import GAXT.TokenUtils.TokenType;

public class TokenMath_Concat extends TokenMath
{
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Concat;
	}
	
	@Override
	public long calculate(long a,long b) throws ArithmeticException, NumberFormatException
	{
		return MathUtils.concat(a,b);
	}
}
