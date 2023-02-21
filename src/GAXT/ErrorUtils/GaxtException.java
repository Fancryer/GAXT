package GAXT.ErrorUtils;

import GAXT.Interfaces.ILoggable;
import GAXT.TokenUtils.TokenType;

public class GaxtException extends RuntimeException implements ILoggable
{
	public final GaxtError error;
	public final TokenType type;
	public final int position;
	
	public GaxtException(GaxtError error,TokenType type,int position)
	{
		this.error=error;
		this.type=type;
		this.position=position;
	}
	
	public String getFullErrorMessage()
	{
		return type==TokenType.T_Start?"STATIC_ERROR: ["+error.getMessage()+"]":
		       "ERROR: ["+error.getMessage()+"] on "+type+" at "+position;
	}
	
	@Override
	public String toString()
	{
		return getFullErrorMessage();
	}
	
	@Override
	public String toLogContent()
	{
		return getFullErrorMessage();
	}
}
