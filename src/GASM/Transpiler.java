package GASM;

import GAXT.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Transpiler
{
	private final Map<String,Character> transpileMap;
	
	private String getTokens()
	{
		return "+-*/_`<=>?$:;~%()@.,[]!#{|}\\^";
	}
	
	public Transpiler(String... binds)
	{
		var defaultBindings=getDefaultBindings();
		var tokens=getTokens();
		transpileMap=new HashMap<>(defaultBindings.length);
		for(int i=0;i<defaultBindings.length;++i)
		{
			transpileMap.put(defaultBindings[i],tokens.charAt(i));
		}
		//transpileMap=new HashMap<>();
		//int i=0;
		//for(var bind: binds) transpileMap.put(bind,tokens.charAt(i++));
		//for(;i<tokens.length();++i) transpileMap.put(getDefaultBindings()[i],tokens.charAt(i));
		/*
		int i=0;
		for(var t:tokens.toCharArray())
		{
			transpileMap.put(getDefaultBindings()[i++],t);
		}
		*/
	}
	
	public Transpiler()
	{
		this(getDefaultBindings());
	}
	
	private static String[] getDefaultBindings()
	{
		return new String[]
				{
						"Add","Subtract","Multiply","Divide","Concatenate","Nor","Less","Equal","Greater",
						"PrintInt","PrintChar","Assign","Reverse","Shave","Clear","Read","Write","Call","Save",
						"Load","Repeat","Until","Finish","Switch","If","Then","fI","Break","Continue"
				};
	}
	
	public String transpile(String source,boolean tokenize)
	{
		/*
		for(var row: transpileMap.keySet())
		{
			//source=source.replaceAll("\\s*(%s)\\s*".formatted(row),String.valueOf(transpileMap.get(row)));
			source=source.replaceAll(row,String.valueOf(transpileMap.get(row)));
		}
		*/
		var tokens=getTokens();
		for(int i=0;i<getDefaultBindings().length;++i)
		{
			//if(source.contains())
		}
		if(tokenize) source=Interpreter.tokenize(source);
		return source;
	}
	
	public String transpile(String source)
	{
		return transpile(source,false);
	}
}
