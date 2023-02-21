package GAXT.TokenUtils.Tokens;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interfaces.IStorable;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.TokenType;

public class TokenVariable extends Token implements IStorable
{
	protected final char value;
	
	public TokenVariable(char value)
	{
		this.value=value;
	}
	
	public void store() throws GaxtException
	{
		this.interpreter.varStack.push(value);
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
		return TokenType.T_Variable;
	}
	
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Variables;
	}
}