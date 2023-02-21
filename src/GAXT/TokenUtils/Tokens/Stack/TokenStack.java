package GAXT.TokenUtils.Tokens.Stack;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.Tokens.Token;

public abstract class TokenStack extends Token
{
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Stack;
	}
	
	public abstract void operateOnStack() throws GaxtException;
	
	@Override
	public void eval(Interpreter interpreter)
	{
		this.interpreter=interpreter;
		operateOnStack();
	}
}
