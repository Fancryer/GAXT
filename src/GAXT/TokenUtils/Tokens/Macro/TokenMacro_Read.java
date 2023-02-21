package GAXT.TokenUtils.Tokens.Macro;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.Loops.Parser;
import GAXT.TokenUtils.TokenType;

public class TokenMacro_Read extends TokenMacro
{
	@Override
	public void operateWithMacro() throws GaxtException
	{
		try
		{
			int writeIndex=Parser.findMatchingBracketNonStack(interpreter.source,getPosition(),'(',')');
			if(writeIndex-getPosition()==1) return;
			if(writeIndex==-1)return;
			var s=interpreter.source.substring(getPosition()+1,writeIndex);
			interpreter.position.setValue(writeIndex);
			//System.out.println(s);
			if(interpreter.macros.contains(s)) return;
			interpreter.macros.add(s);
		}
		catch(IndexOutOfBoundsException e)
		{
			throw new GaxtException(GaxtError.E_UnbalancedBrackets,getTokenType(),getPosition());
		}
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Read;
	}
}