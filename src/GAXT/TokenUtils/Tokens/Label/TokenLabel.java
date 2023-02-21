package GAXT.TokenUtils.Tokens.Label;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.Tokens.Token;

public abstract class TokenLabel extends Token
{
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
		this.interpreter=interpreter;
		operateWithLabel();
	}
	
	public abstract void operateWithLabel() throws GaxtException;
	
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Label;
	}
}
