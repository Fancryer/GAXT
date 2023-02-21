package GAXT.TokenUtils.Tokens;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interfaces.IStorable;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.TokenType;

public class TokenConstant extends Token implements IStorable
{
	private final char value;
	
	public TokenConstant(char value)
	{
		this.value=value;
	}
	
	@Override
	public void store() throws GaxtException
	{
		this.interpreter.calcStack.push(this.interpreter.constants[value-'A']);
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
		return TokenType.T_Constant;
	}
	
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Constants;
	}
}
