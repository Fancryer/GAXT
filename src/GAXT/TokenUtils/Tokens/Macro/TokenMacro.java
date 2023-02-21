package GAXT.TokenUtils.Tokens.Macro;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.Tokens.Token;

public abstract class TokenMacro extends Token
{
	public abstract void operateWithMacro() throws GaxtException;
	
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
		this.interpreter=interpreter;
		operateWithMacro();
	}
	
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Macro;
	}
}
