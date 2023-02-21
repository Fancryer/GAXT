package GAXT.TokenUtils.Tokens;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Interpreter;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.TokenType;

public abstract class Token
{
	public Interpreter interpreter;
	
	public abstract void eval(Interpreter interpreter) throws GaxtException;
	
	public abstract TokenType getTokenType();
	
	public abstract TokenClass getTokenClass();
	
	public int getPosition()
	{
		return interpreter.position.getValue();
	}
	
	public int setPosition(int pos)
	{
		int lastPos=getPosition();
		interpreter.position.setValue(pos);
		return lastPos;
	}
}