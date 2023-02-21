package GAXT.TokenUtils.Tokens.Label;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

public class TokenLabel_Load extends TokenLabel
{
	@Override
	public void operateWithLabel() throws GaxtException
	{
		int ind;
		try
		{
			ind=interpreter.labels.get((int)interpreter.getStackTop());
		}
		catch(IndexOutOfBoundsException e)
		{
			throw new GaxtException(GaxtError.E_NoSuchLabel,getTokenType(),getPosition());
		}
		//System.out.println("LOADED: "+ind+" of "+interpreter.labels.size());
		interpreter.position.setValue(ind);
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Load;
	}
}
