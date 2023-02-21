package GAXT.TokenUtils.Tokens.Flow;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.GaxtCommon;
import GAXT.GaxtInterpreter;
import GAXT.Interpreter;
import GAXT.Loops.Parser;
import GAXT.TokenUtils.TokenType;

public class TokenFlow_If extends TokenFlow
{
	@Override
	public void eval(Interpreter interpreter) throws GaxtException
	{
		this.interpreter=interpreter;
		int elseIndex=Parser.findMatchingBracketNonStack(this.interpreter.source,getPosition(),'{','}');
		if(elseIndex==-1) throw new GaxtException(GaxtError.E_UnbalancedBrackets,getTokenType(),getPosition());
		
		var bIsTrue=GaxtCommon.longToBoolean(this.interpreter.getStackTopCopy());
		
		int thenIndex=this.interpreter.source.indexOf('|',getPosition());
		String statement;
		if(thenIndex!=-1)
		{
			var trueBranch=this.interpreter.source.substring(getPosition()+1,thenIndex);
			var falseBranch=this.interpreter.source.substring(thenIndex+1,elseIndex);
			if(this.interpreter.debug)
			{
				System.out.println("True branch: "+trueBranch);
				System.out.println("False branch: "+falseBranch);
			}
			statement=bIsTrue?trueBranch:falseBranch;
			setPosition(bIsTrue?getPosition()+1:thenIndex+1);
		}
		else
		{
			if(bIsTrue)
			{
				if(this.interpreter.debug)
					System.out.println("Whole branch: "+this.interpreter.source.substring(getPosition()+1,elseIndex));
				statement=this.interpreter.source.substring(getPosition()+1,elseIndex);
				interpreter.position.incr();
			}
			else
			{
				if(this.interpreter.debug) System.out.println("Skipped branch");
				return;
			}
		}
		if(this.interpreter.debug) System.out.println(statement);
		new GaxtInterpreter(statement+'!',false,this.interpreter.debug).interpret();
		if(this.interpreter.debug) System.out.println(this.interpreter.source.substring(elseIndex+1));
		setPosition(elseIndex+1);
		/*
		 *  If it has "then" ('|'):
		 *       If true:
		 *           run trueBranch
		 *       If false:
		 *           run falseBranch
		 *   If it doesn't have"then" ('|'):
		 *       If true:
		 *           run substring before "if" and "else"
		 *   move to elseIndex+1
		 * */
		//setPosition(elseIndex);
	}
	
	@Override
	public TokenType getTokenType()
	{
		return TokenType.T_If;
	}
}
