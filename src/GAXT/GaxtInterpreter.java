package GAXT;

import GAXT.ErrorUtils.GaxtException;
import GAXT.ErrorUtils.GaxtException_Finish;
import GAXT.Logs.GaxtLogger;
import Mutables.MutableInt;

public class GaxtInterpreter extends Interpreter
{
	public GaxtInterpreter()
	{
		this("!");
	}

	public GaxtInterpreter(String source,boolean run,boolean debug,boolean log)
	{
		super(0,debug,log);
		this.source=tokenize(source);
		//System.out.println(this.source);
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
		saveLabels(source.toCharArray());
		if(run)
		{
			try
			{
				interpret(source);
			}
			catch(GaxtException e)
			{
				System.err.println(e.getFullErrorMessage());
				GaxtLogger.appendToFile(e.getFullErrorMessage());
			}
		}
	}

	public GaxtInterpreter(String source,boolean run,boolean debug)
	{
		this(source,run,debug,true);
	}

	@Override
	public void log(String header)
	{
		super.log(header);
	}

	public GaxtInterpreter(Interpreter interpreter,String source,boolean run)
	{
		super(interpreter.offset+1,interpreter.debug,true);
		calcStack=interpreter.calcStack;
		varStack=interpreter.varStack;
		constants=interpreter.constants;
		position=new MutableInt(0);
		bUsesCalcStack=interpreter.bUsesCalcStack;
		variables=interpreter.variables;
		macros=interpreter.macros;
		labels=interpreter.labels;
		this.source=tokenize(source);
		log("RAISED: ");
		try
		{
			staticCheck(source);
		}
		catch(GaxtException e)
		{
			System.err.println(e.getFullErrorMessage());
			GaxtLogger.appendToFile(e.getFullErrorMessage());
			return;
		}
		if(run)
		{
			try
			{
				interpret(source);
			}
			catch(GaxtException e)
			{
				System.err.println(e.getFullErrorMessage());
				GaxtLogger.appendToFile(e.getFullErrorMessage());
			}
		}
	}

	public GaxtInterpreter(String source){this(source,false,false);}

	public GaxtInterpreter(Interpreter interpreter,boolean run)
	{
		this(interpreter,interpreter.source,run);
	}

	@Override
	public boolean isLoop()
	{
		return false;
	}

	public boolean interpret(String source) throws GaxtException
	{
		this.source=tokenize(source);
		char[] str=source.toCharArray();
		while(position.getValue()<str.length)
		{
			char c=str[position.getValue()];
			if(c>127)
			{
				position.incr();
				continue;
			}
			try
			{
				exec(c,position);
			}
			catch(GaxtException_Finish e)
			{
				break;
			}
			catch(GaxtException e)
			{
				System.err.println(e.getFullErrorMessage());
				GaxtLogger.logToFile(e.getFullErrorMessage());
				return false;
			}
		}
		return true;
	}

	public boolean interpret() throws GaxtException{return interpret(this.source);}

	@Override
	public String toString()
	{
		return "GI "+super.toString();
	}

	@Override
	public String toLogContent()
	{
		return "GAXT_"+super.toLogContent();
	}
}