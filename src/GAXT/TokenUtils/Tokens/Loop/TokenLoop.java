package GAXT.TokenUtils.Tokens.Loop;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.Tokens.Token;

public abstract class TokenLoop extends Token
{
	public abstract void operateWithLoop() throws GaxtException;
	
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
		this.interpreter=interpreter;
		operateWithLoop();
	}
	
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Loop;
	}
}
