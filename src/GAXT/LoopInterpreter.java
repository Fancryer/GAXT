package GAXT;

import GAXT.ErrorUtils.GaxtException;
import GAXT.ErrorUtils.GaxtException_Finish;
import GAXT.Logs.GaxtLogger;
import Mutables.MutableInt;

public class LoopInterpreter extends Interpreter
{
	@Override
	public boolean isLoop()
	{
		return true;
	}
	
	public LoopInterpreter()
	{
		this("!");
	}
	
	public LoopInterpreter(String source,boolean run,boolean debug,boolean log) throws GaxtException
	{
		super(0,debug,log);
		this.source=tokenize(source);
		this.position=new MutableInt(-1);
		log("RAISED: ");
		try
		{
			staticCheck(source);
		}
		catch(GaxtException e)
		{
			System.err.println(e.getFullErrorMessage());
			GaxtLogger.logToFile(e.getFullErrorMessage());
			return;
		}
		clear();
		if(run)
		{
			try
			{
				interpret(source);
			}
			catch(GaxtException e)
			{
				System.err.println(e.getFullErrorMessage());
				GaxtLogger.logToFile(e.getFullErrorMessage());
			}
		}
	}
	
	public LoopInterpreter(String source,boolean run,boolean debug) throws GaxtException
	{
		this(source,run,debug,true);
	}
	
	public LoopInterpreter(String source) throws GaxtException{this(source,false,false);}
	
	public LoopInterpreter(Interpreter interpreter,boolean run) throws GaxtException
	{
		this(interpreter,interpreter.source,run);
	}
	
	public LoopInterpreter(Interpreter interpreter,String source,boolean run) throws GaxtException
	{
		super(interpreter.offset+1,interpreter.debug,true);
		calcStack=interpreter.calcStack;
		varStack=interpreter.varStack;
		constants=interpreter.constants;
		position=new MutableInt(0);
		bUsesCalcStack=interpreter.bUsesCalcStack;
		variables=interpreter.variables;
		log("RAISED: ");
		macros=interpreter.macros;
		labels=interpreter.labels;
		this.source=tokenize(source);
		if(run)
		{
			try
			{
				interpret(source);
			}
			catch(GaxtException e)
			{
				System.err.println(e.getFullErrorMessage());
				GaxtLogger.logToFile(e.getFullErrorMessage());
			}
		}
	}
	
	@Override
	public boolean interpret(String source) throws GaxtException
	{
		this.source=tokenize(source);
		System.out.println("Loop body: "+source);
		char[] str=source.toCharArray();
		for(;;)
		{
			while(position.getValue()<str.length)
			{
				if(debug) System.out.println(this);
				char c=str[position.getValue()];
				try
				{
					if(c=='\\')return true;
					exec(c,position);
				}
				catch(GaxtException_Finish e)
				{
					if(e.critical)return true;
					break;
				}
				catch(GaxtException e)
				{
					System.err.println(e.getFullErrorMessage());
					GaxtLogger.logToFile(e.getFullErrorMessage());
					return false;
				}
			}
			position.setValue(0);
		}
		//return true;
	}
	
	@Override
	public String toString()
	{
		return "LI "+super.toString();
	}
	
	@Override
	public void log(String header)
	{
		super.log(header);
	}
	
	@Override
	public String toLogContent()
	{
		return "LOOP_"+super.toLogContent();
	}
}
