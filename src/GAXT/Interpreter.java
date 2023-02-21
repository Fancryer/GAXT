package GAXT;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.ErrorUtils.GaxtException_Finish;
import GAXT.Interfaces.ILoggable;
import GAXT.Interfaces.ILogging;
import GAXT.Logs.GaxtLogger;
import GAXT.Loops.BalancedBrackets;
import GAXT.TokenUtils.TokenClass;
import GAXT.TokenUtils.TokenType;
import GAXT.TokenUtils.Tokens.TokenConstant;
import GAXT.TokenUtils.Tokens.TokenDigit;
import GAXT.TokenUtils.Tokens.TokenVariable;
import Mutables.MutableInt;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static GAXT.GaxtCommon.getConstants;

public abstract class Interpreter implements ILoggable, ILogging
{
	public final boolean debug;
	public final boolean log;
	protected final int offset;
	public ArrayDeque<Long> calcStack=new ArrayDeque<>();
	//Stack<Long> calcStack=new Stack<>();
	public ArrayDeque<Character> varStack=new ArrayDeque<>();
	//Map<Long,Boolean> constants=new HashMap<>(26);
	public Long[] constants=new Long[26];
	public boolean bUsesCalcStack=true;
	public long[] variables=new long[26];
	public String source;
	public MutableInt position;
	public ArrayList<String> macros;
	public ArrayList<Integer> labels;
	
	protected Interpreter(int offset,boolean debug,boolean log)
	{
		this.offset=offset;
		this.debug=debug;
		this.log=log;
	}
	
	public static String tokenize(String str)
	{

//		var r="[^a-zA-Z0-9_+\\-*/`<=>?$:;~%{|}^\\\\()@\\[\\].,#!\"&']+";
		return str.replaceAll("\"[^\\\\x20-\\\\x7E]\"","");
	}
	
	public static String normalizeBranches(String str)
	{
		var r="[^{}]+";
		return str.replaceAll(r,"");
	}
	
	public abstract boolean isLoop();
	
	public boolean isStackEmpty()
	{
		return bUsesCalcStack?calcStack.isEmpty():varStack.isEmpty();
	}
	
	public long getStackTopCopy() throws GaxtException
	{
		long t;
		if(bUsesCalcStack)
		{
			if(calcStack.isEmpty())
				throw new GaxtException(GaxtError.E_EmptyStackAccessing,TokenType.T_Start,position.getValue());
			t=calcStack.peek();
		}
		else
		{
			if(varStack.isEmpty())
				throw new GaxtException(GaxtError.E_EmptyStackAccessing,TokenType.T_Start,position.getValue());
			t=variables[varStack.peek()];
		}
		return t;
	}
	
	public long getStackTop() throws GaxtException
	{
		long t;
		try
		{
			t=bUsesCalcStack?calcStack.pop():variables[varStack.pop()-'a'];
		}
		catch(EmptyStackException|NoSuchElementException e)
		{
			throw new GaxtException(GaxtError.E_EmptyStackAccessing,TokenType.T_Undefined,position.getValue());
		}
		return t;
	}
	
	public int getStackSize()
	{
		return bUsesCalcStack?calcStack.size():varStack.size();
	}
	
	public void saveLabels(char[] str)
	{
		for(int i=0;i<str.length;++i)
		{
			if(TokenType.fromChar(str[i])==TokenType.T_Save) labels.add(i);
		}
	}
	
	public void clear()
	{
		this.position=new MutableInt(0);
		this.calcStack=new ArrayDeque<>();
		this.varStack=new ArrayDeque<>();
		Arrays.fill(variables,0);
		this.constants=getConstants();
		this.macros=new ArrayList<>();
		this.labels=new ArrayList<>();
		log("INTERPRETER_CLEARED");
	}
	
	@Override
	public void log(String header)
	{
		if(log) GaxtLogger.appendToFile(header,toLogContent());
	}
	
	void staticCheck(String source) throws GaxtException
	{
		if(!source.contains("!"))
			throw new GaxtException(GaxtError.E_MissingFinishToken,TokenType.T_Start,position.getValue());
		if(!BalancedBrackets.areBracketsBalanced(source))
			throw new GaxtException(GaxtError.E_UnbalancedBrackets,TokenType.T_Start,position.getValue());
	}
	
	public abstract boolean interpret(String source) throws GaxtException;
	
	public void exec(char c) throws GaxtException
	{
		exec(c,position);
	}
	
	public void exec(char c,MutableInt position)
	{
		if(position.getValue()==-1) return;
		GaxtLogger.appendToFile("EXECUTION STARTED");
		var token=TokenType.fromChar(c);
		var tokenClass=TokenClass.fromToken(token);
		/*
		if(token==TokenType.T_Undefined)
		{
			position.incr();
			return;
		}
		*/
		switch(tokenClass)
		{
			case Variables -> new TokenVariable(c).eval(this);
			case Digits -> new TokenDigit(c).eval(this);
			case Constants -> new TokenConstant(c).eval(this);
			default ->
			{
				try
				{
					token.getExecutorClass().getDeclaredConstructor().newInstance().eval(this);
				}
				catch(NoSuchMethodException|InvocationTargetException|InstantiationException|
				      IllegalAccessException ignored)
				{
				
				}
			}
			
		}
		if(debug) System.out.println(token+" "+this);
		position.incr();
		GaxtLogger.appendToFile("EXECUTION FINISHED");
	}
	
	public boolean run(String rawSource) throws GaxtException
	{
		GaxtLogger.appendToFile("RAW_RUN STARTED");
		for(var c: rawSource.toCharArray())
		{
			try
			{
				exec(c);
			}
			catch(GaxtException_Finish e)
			{
				break;
			}
		}
		GaxtLogger.appendToFile("RAW_RUN FINISHED");
		return true;
	}
	
	/*
	@Override
	public String toString()
	{
		return "%d_P %d_O: %s%s %s %s".formatted(position.getValue(),offset,bUsesCalcStack?"CS ":"VS ",calcStack,
		                                         varStack,Arrays.toString(variables));
	}
	*/
	
	@Override
	public String toString()
	{
		return "Interpreter"+
		       "\n{"+
		       "\n\tdebug="+debug+
		       ", \n\toffset="+offset+
		       ", \n\tcalcStack="+calcStack+
		       ", \n\tvarStack="+varStack+
		       ", \n\tconstants="+Arrays.toString(constants)+
		       ", \n\tbUsesCalcStack="+bUsesCalcStack+
		       ", \n\tvariables="+Arrays.toString(variables)+
		       ", \n\tsource=\""+source+'\"'+
		       ", \n\tposition="+position+
		       ", \n\tmacros="+macros+
		       ", \n\tlabels="+labels+
		       "\n}";
	}
	
	@Override
	public String toLogContent()
	{
		return this.toString();
	}
}