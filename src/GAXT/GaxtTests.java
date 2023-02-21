package GAXT;

import GAXT.ErrorUtils.GaxtException;
import GAXT.Logs.GaxtLogger;

public class GaxtTests
{
	String[] testPaths;
	
	public GaxtTests(String... testPaths)
	{
		this.testPaths=testPaths;
	}
	
	public void run() throws GaxtException
	{
		int i=0;
		for(var test: testPaths)
		{
			String last=test.substring(test.lastIndexOf('/')+1);
			String name;
			try
			{
				name=last.substring(0,last.indexOf('.'));
			}
			catch(IndexOutOfBoundsException e)
			{
				System.err.println("File doesn't have an extension!");
				return;
			}
			System.out.println("________________________________________"+
			                   "TEST %d: %s%n%n".formatted(++i,name)+
			                   "----------------------------------------");
			String source;
			try
			{
				source=GaxtCommon.readFile(test);
			}
			catch(GaxtException e)
			{
				System.err.println(e.getFullErrorMessage());
				GaxtLogger.logToFile(e.getFullErrorMessage());
				return;
			}
			GaxtInterpreter interpreter=new GaxtInterpreter(source);
			boolean runIsSuccessful=interpreter.interpret();
			System.out.printf("%n----------------------------------------%n"+
			                  (runIsSuccessful?"Test is succeed!%n":"Test failed!%n")+
			                  "________________________________________");
			interpreter.clear();
		}
	}
}