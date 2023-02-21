package GAXT.TokenUtils.Tokens.Print;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.Tokens.Token;

import java.util.EmptyStackException;

public abstract class TokenPrint extends Token
{
	public abstract void print() throws GaxtException;
	
	@Override
	public void eval(Interpreter interpreter)
	{
		this.interpreter=interpreter;
		try
		{
			print();
		}
		catch(EmptyStackException|NullPointerException e)
		{
			throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
		}
	}
	
	@Override
	public TokenClass getTokenClass()
	{
		return TokenClass.Print;
	}
}