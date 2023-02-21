package GAXT.TokenUtils.Tokens.Label;

import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

public class TokenLabel_Save extends TokenLabel
{
	@Override
	public void operateWithLabel() throws GaxtException
	{
		/*
		var pos=getPosition();
		for(var i: interpreter.labels) if(i==pos) return;
		interpreter.labels.add(pos);
		*/
		//System.out.println("SAVED: "+pos);
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Save;
	}
}
