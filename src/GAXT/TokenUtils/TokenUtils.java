package GAXT.TokenUtils;

import GAXT.ErrorUtils.GaxtException;

public class TokenUtils
{
	static boolean isDigit(char c)
	{
		return c>='0'&&c<='9';
	}
	
	static boolean isConstant(char c)
	{
		return c>='A'&&c<='Z';
	}
	
	static boolean isVariable(char c)
	{
		return c>='a'&&c<='z';
	}
	
	static TokenType sweepToNext(String source)
	{
		for(char c: source.toCharArray())
		{
			var t=TokenType.fromChar(c);
			if(t!=TokenType.T_Undefined) return t;
		}
		return TokenType.T_Undefined;
	}
	
	static boolean nextIsExpected(String source,TokenType type)
	{
		return sweepToNext(source)==type;
	}
	
	static boolean isNextOneOfExpected(String source,TokenType... types)
	{
		var t=sweepToNext(source);
		for(var expected: types)
		{
			if(t==expected) return true;
		}
		return false;
	}
	
	public static boolean isPrintableChar(long c,int position) throws GaxtException
	{
		return isPrintableChar((char)c,position);
	}
	
	public static boolean isPrintableChar(char c,int position) throws GaxtException
	{
		/*
		Character.UnicodeBlock block=Character.UnicodeBlock.of(c);
		return (!Character.isISOControl(c))&&
		       c!=KeyEvent.CHAR_UNDEFINED&&
		       block!=null&&
		       block!=Character.UnicodeBlock.SPECIALS;
		*/
		//if(c<=20||c>=127) throw new GaxtException(GaxtError.E_NotPrintableCharacter,TokenType.fromChar(c),position);
		return true;
	}
}