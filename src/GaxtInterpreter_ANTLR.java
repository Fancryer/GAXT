import GAXT.GaxtCommon;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GaxtInterpreter_ANTLR
{
	public ArrayDeque<Long> calcStack=new ArrayDeque<>();
	public ArrayDeque<Character> varStack=new ArrayDeque<>();
	//Map<Long,Boolean> constants=new HashMap<>(26);
	public boolean bUsesCalcStack=true;
	public long[] variables=new long[26];
	public List<List<GAXTParser.ExpressionContext>> macros=new ArrayList<>();
	public ArrayList<Integer> labels=new ArrayList<>();
	public StringBuilder output=new StringBuilder();


	public void pushVariable(char variableName)
	{
		varStack.push(variableName);
	}

	public void pushNumber(Long number)
	{
		calcStack.push(number);
	}

	public long popFromStack()
	{
		ensureStackNotEmpty();
		return bUsesCalcStack?calcStack.pop():Long.valueOf(variables[varStack.pop()]);
	}

	public long peekFromStack()
	{
		if((bUsesCalcStack?calcStack:varStack).isEmpty())
		{
			System.out.println(this);
			throw new AssertionError("Trying to peek value from empty stack");
		}
		return bUsesCalcStack?calcStack.peek():getVariable((char)(varStack.peek()-'a'));
	}

	public long getVariable(char name)
	{
		return variables[name];
	}

	public long setVariable(char name,long value)
	{
		return variables[name-'a']=value;
	}

	public boolean stackIsEmpty()
	{
		return (bUsesCalcStack?calcStack:varStack).isEmpty();
	}

	@Override public String toString()
	{
		var format="""
		           GaxtInterpreter_ANTLR
		           {
		           	calcStack=%s,
		           	varStack=%s,
		           	bUsesCalcStack=%s,
		           	variables=%s,
		           	macros=%s,
		           	labels=%s,
		           	output="%s"
		           }
		           """;
		return format.formatted(calcStack,varStack,bUsesCalcStack,Arrays.toString(variables),macros,labels,output);
	}

	public void ensureStackNotEmpty()
	{
		assert !stackIsEmpty();
	}

	public void ensureStackCapacity()
	{
		assert (bUsesCalcStack?calcStack:varStack).size()>2;
	}

	public void reverseStack()
	{
		if(bUsesCalcStack) calcStack=GaxtCommon.reverseDeque(calcStack);
		else varStack=GaxtCommon.reverseDeque(varStack);
	}

	public void clearStack()
	{
		if(bUsesCalcStack) calcStack=new ArrayDeque<>();
		else varStack=new ArrayDeque<>();
	}
}