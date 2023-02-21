package GAXT.TokenUtils.Tokens.Loop;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.LoopInterpreter;
import GAXT.Loops.Parser;
import GAXT.TokenUtils.TokenType;

public class TokenLoop_Repeat extends TokenLoop
{
	@Override
	public void operateWithLoop() throws GaxtException
	{
		try
		{
			int untilIndex=Parser.findMatchingBracketNonStack(interpreter.source,getPosition());
			//Empty loop
			if(untilIndex-getPosition()==1)
			{
				setPosition(untilIndex+1);
				return;
			}
			if(untilIndex==-1) throw new GaxtException(GaxtError.E_UnbalancedBrackets,getTokenType(),getPosition());
			runNestedLoops(interpreter.source.substring(getPosition()+1,untilIndex));
		}
		catch(IndexOutOfBoundsException e)
		{
			throw new GaxtException(GaxtError.E_UnbalancedBrackets,getTokenType(),getPosition());
		}
	}

	public void runNestedLoops(String source)
	{
		for(var loop: Parser.parse(source))
		{
			//System.out.println("|__ "+source.length()+" __|");if(loop.isEmpty())return;
			if(loop.getIsLoop()) runNestedLoops(loop.getSource());
			else
			{
				//System.out.println(loop.getSource().contains("\\"));
				new LoopInterpreter(interpreter,loop.getSource(),true);
			}
		}
	}

	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_Repeat;
	}
}
