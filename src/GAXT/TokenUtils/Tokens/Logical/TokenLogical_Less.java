package GAXT.TokenUtils.Tokens.Logical;

import GAXT.GaxtCommon;
import GAXT.TokenUtils.TokenType;

public class TokenLogical_Less extends TokenLogical
{
	@Override
	public TokenType getTokenType()
	{
		return null;
	}
	
	@Override
	public long calculate(long a,long b) throws ArithmeticException, NumberFormatException
	{
		return GaxtCommon.booleanToLong(a<b);
	}
}
