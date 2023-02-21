package GAXT.Logs;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GaxtLogger
{
	public static String logPath;
	
	static
	{
		logPath=".\\logs\\"+new SimpleDateFormat("yyyy.MM.dd").format(Calendar.getInstance().getTime())+".gal";
	}
	
	public static void appendToFile(String message)
	{
		appendToFile("",message);
	}
	
	public static void appendToFile(String header,String message)
	{
		//GaxtCommon.writeFile(logPath,header,"\n"+message,StandardOpenOption.APPEND);
	}
	
	public static void logToFile(String message)
	{
		logToFile("",message);
	}
	
	public static void logToFile(String header,String message)
	{
		//GaxtCommon.writeFile(logPath,header,message);
	}
}
