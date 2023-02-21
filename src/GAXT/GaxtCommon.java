package GAXT;

import GAXT.ErrorUtils.GaxtError;
import GAXT.ErrorUtils.GaxtException;
import GAXT.TokenUtils.TokenType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class GaxtCommon
{
	final static Long[] constants=new Long[]
			{
					10L,20L,30L,40L,50L,
					60L,70L,80L,90L,100L,
					200L,300L,400L,500L,
					600L,700L,800L,900L,
					1000L,2000L,3000L,4000L,
					5000L,6000L,7000L,8000L
			};

	public static Long[] getConstants()
	{
		return Arrays.copyOf(constants,constants.length);
	}

	public static boolean longToBoolean(long l)
	{
		return l!=0L;
	}

	public static <T> ArrayDeque<T> reverseDeque(ArrayDeque<T> deque)
	{
		var rev=new ArrayList<>(deque.stream().toList());
		Collections.reverse(rev);
		return new ArrayDeque<>(rev);
	}

	public static long booleanToLong(boolean b)
	{
		return b?1L:0L;
	}

	public static void writeFile(String path,String header,String content)
	{
		writeFile(path,"",content,StandardOpenOption.WRITE);
	}

	public static void writeFile(String path,String header,String content,StandardOpenOption openOption)
	{
		var border="=".repeat(32);
		try
		{
			//Files.write(Paths.get(path),("\n%s\n%s".formatted("=".repeat(32),content)).getBytes(),openOption);
			Files.write(Paths.get(path),
			            (("%s\n%s\n%s\n%s").formatted(border,Objects.equals(header,"")?"HEADER":header,border,
			                                          content)).getBytes(),openOption
			           );
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			throw new GaxtException(GaxtError.E_FileNotFound,TokenType.T_Start,-1);
		}
	}

	private static String removeWhitespaces(){return "";}

	public static String readFile(String path) throws GaxtException
	{
		String source;
		try
		{
			source=Files.readString(Path.of(path));//.replaceAll("[^\\x00-\\x7F]","");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			throw new GaxtException(GaxtError.E_FileNotFound,TokenType.T_Start,-1);
		}
		return source;
	}
}
