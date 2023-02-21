package GAXT.TokenUtils.Tokens.Logical;

import GAXT.TokenUtils.TokenType;

import static GAXT.GaxtCommon.booleanToLong;
import static GAXT.GaxtCommon.longToBoolean;

public class TokenLogical_Nor extends TokenLogical
{
	@Override
	public TokenType getTokenType()
	{
		return null;
	}
	
	@Override
	public long calculate(long a,long b) throws ArithmeticException, NumberFormatException
	{
		return booleanToLong(!(longToBoolean(a)||longToBoolean(b)));
	}
}
