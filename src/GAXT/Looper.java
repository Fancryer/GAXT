package GAXT;

import GAXT.Results.ExecutionResult;
import GAXT.TokenUtils.TokenType;

public class Looper
{
	public String source;
	public GaxtInterpreter interpreter;
	public int offset;
	
	public Looper(GaxtInterpreter interpreter,String source)
	{
		this(interpreter,source,0);
	}
	
	public Looper(GaxtInterpreter interpreter,String source,int offset)
	{
		this.interpreter=interpreter;
		this.source=source;
		this.offset=offset;
	}
	
	public ExecutionResult loop()
	{
		int i=0;
		for(char c:source.toCharArray())
		{
			interpreter.exec(c,interpreter.position.add(i));
			//if(result instanceof Interpreter.Results.ErrorResult)return result;
		}
		return new ExecutionResult(TokenType.fromChar(']'),offset+source.length());
	}
}
