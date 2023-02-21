package GAXT.Results;

import GAXT.TokenUtils.TokenType;

public class ExecutionResult
{
	public final TokenType token;
	public final int position;
	
	public ExecutionResult(TokenType token,int position)
	{
		this.token=token;
		this.position=position;
	}
	
	public boolean isTerminal()
	{
		return token==TokenType.T_Finish;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s at %d",token,position);
	}
}