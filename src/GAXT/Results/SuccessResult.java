package GAXT.Results;

import GAXT.TokenUtils.TokenType;

public class SuccessResult extends ExecutionResult
{
	public SuccessResult(TokenType token,int position)
	{
		super(token,position);
	}
	
	@Override
	public String toString()
	{
		return String.format("Succeeded %s",super.toString());
	}
}