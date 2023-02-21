package GAXT.Loops;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets
{
	private static boolean isOpeningBracket(char c)
	{
		return c=='('||c=='['||c=='{';
	}
	
	private static boolean isClosingBracket(char c)
	{
		return c==')'||c==']'||c=='}';
	}
	
	private static boolean isBracket(char c)
	{
		return isOpeningBracket(c)||isClosingBracket(c);
	}
	
	public static boolean areBracketsBalanced(String expr) throws GaxtException
	{
		//Using ArrayDeque is faster than using Stack class
		Deque<Character> stack=new ArrayDeque<>();
		for(char c: expr.toCharArray())
		{
			if(!isBracket(c)) continue;
			if(isOpeningBracket(c))
			{
				try
				{
					stack.push(c);
					continue;
				}
				catch(IllegalStateException e)
				{
					throw new GaxtException(GaxtError.E_OutOfMemory,TokenType.fromChar(c),-1);
				}
			}
			//If current character is not opening bracket, then it must be closing. So stack cannot be empty at this
			//point.
			if(stack.isEmpty()) return false;
			char check;
			switch(c)
			{
				case ')' ->
				{
					check=stack.pop();
					if(check=='{'||check=='[') return false;
				}
				case '}' ->
				{
					check=stack.pop();
					if(check=='('||check=='[') return false;
				}
				case ']' ->
				{
					check=stack.pop();
					if(check=='('||check=='{') return false;
				}
			}
		}
		return stack.isEmpty();
	}
}