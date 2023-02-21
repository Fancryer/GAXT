package Mutables;

import GAXT.Logs.GaxtLogger;

public class MutableInt
{
	private int value;
	
	public MutableInt(int value)
	{
		this.value=value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public MutableInt setValue(int value)
	{
		this.value=value;
		return this;
	}
	
	public MutableInt incr()
	{
		try{value=Math.incrementExact(value);}
		catch(ArithmeticException e){return null;}
		GaxtLogger.appendToFile("MUTABLE_INT INCREMENTED: \n"+this);
		return this;
	}
	
	public MutableInt decr()
	{
		try{value=Math.decrementExact(value);}
		catch(ArithmeticException e){return null;}
		return this;
	}
	
	public MutableInt add(int value)
	{
		int r;
		try{r=Math.addExact(this.value,value);}
		catch(ArithmeticException e){return null;}
		return new MutableInt(r);
	}
	
	public MutableInt sub(int value)
	{
		try{this.value=Math.subtractExact(this.value,value);}
		catch(ArithmeticException e){return null;}
		return this;
	}
	
	public MutableInt less(MutableInt value)
	{
		return value==null?null:this.less(value.getValue());
	}
	
	public MutableInt less(int value)
	{
		this.value=this.value<value?1:0;
		return this;
	}
	
	public boolean asBoolean()
	{
		return value!=0;
	}
	
	@Override
	public String toString()
	{
		return "MutableInt"+
		       "\n\t{"+
		       "\n\t\tvalue="+value+
		       "\n\t}";
	}
}