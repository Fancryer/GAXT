package GAXT.Results;

import GAXT.ErrorUtils.GaxtError;
import GAXT.TokenUtils.TokenType;

public class ErrorResult extends ExecutionResult
{
	final GaxtError error;
	final boolean isCritical;
	
	public ErrorResult(GaxtError error,TokenType token,int position)
	{
		super(token,position);
		this.error=error;
		this.isCritical=error!=GaxtError.E_None;
	}
	
	public String getFullErrorMessage()
	{
		return String.format("ERROR: [%s] on %s",error.getMessage(),super.toString());
	}
	
	@Override
	public String toString()
	{
		return getFullErrorMessage();
	}
}
