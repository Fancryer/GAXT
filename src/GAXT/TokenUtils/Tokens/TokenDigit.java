package GAXT.TokenUtils.Tokens;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interfaces.IStorable;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.TokenType;

public class TokenDigit extends Token implements IStorable
{
	private final char value;
	
	public TokenDigit(char value)
	{
		this.value=value;
	}
	
	@Override
	public void store() throws GaxtException
	{
		this.interpreter.calcStack.push((long)Character.getNumericValue(value));
	}
	
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
		this.interpreter=interpreter;
		store();
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Digit;
	}
	
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Digits;
	}
}
