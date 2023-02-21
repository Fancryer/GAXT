package GAXT.MathUtils;

public class MathUtils
{
	private static int sInd(long a)
	{
		return -Long.signum(a)+1;
	}
	
	public static long concat(long a,long b) throws NumberFormatException
	{
		String[][] results=
				{
						{a+Long.toString(b),Long.toString(b),a+Long.toString(b)},
						{Long.toString(a),"0",Long.toString(a)},
						{-a+Long.toString(-b),Long.toString(b),-a+Long.toString(-b)}
				};
		return Long.parseLong(results[sInd(b)][sInd(a)]);
	}
}
