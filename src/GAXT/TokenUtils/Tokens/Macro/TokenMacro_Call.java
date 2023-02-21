package GAXT.TokenUtils.Tokens.Macro;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.GaxtInterpreter;
import GAXT.TokenUtils.TokenType;

public class TokenMacro_Call extends TokenMacro
{
	private void executeMacro(String macro) throws GaxtException
	{
		new GaxtInterpreter(interpreter,macro,true);
	}
	
	@Override
	public void operateWithMacro() throws GaxtException
	{
		try
		{
			String macro=interpreter.macros.get((int)interpreter.getStackTop())+'!';
			//System.out.println('{'+macro+'}');
			executeMacro(macro);
		}
		catch(GaxtException|IndexOutOfBoundsException e)
		{
			throw new GaxtException(GaxtError.E_NoSuchMacro,getTokenType(),getPosition());
		}
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Call;
	}
}
