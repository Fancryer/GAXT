package GAXT.TokenUtils.Tokens.Print;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;
import GAXT.TokenUtils.TokenUtils;

import java.util.EmptyStackException;

public class TokenPrint_Symbol extends TokenPrint
{
	@Override
	public void print() throws GaxtException
	{
		long pc;
		try
		{
			if(interpreter.bUsesCalcStack)
			{
				assert interpreter.calcStack.peek()!=null;
				pc=interpreter.calcStack.peek();
			}
			else
			{
				assert interpreter.varStack.peek()!=null;
				pc=Long.valueOf(interpreter.varStack.peek());
			}
		}
		catch(EmptyStackException e)
		{
			throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
		}
		try
		{
			if(!TokenUtils.isPrintableChar(pc,getPosition()))
				throw new GaxtException(GaxtError.E_NotPrintableCharacter,getTokenType(),getPosition());
			System.out.printf("%c",(char)pc);
		}
		catch(AssertionError e)
		{
			throw new GaxtException(GaxtError.E_EmptyStackAccessing,getTokenType(),getPosition());
		}
	}

	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_PrintChar;
	}
}
