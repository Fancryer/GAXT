package GAXT.Loops;

import java.util.ArrayList;

public class Parser
{
	public static String copyFor(String str,int begin,int end)
	{
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=begin;i<end;++i)
		{
			stringBuilder.append(str.charAt(i));
		}
		return stringBuilder.toString();
	}
	
	public static ArrayList<MatchResult> parse(String source)
	{
		ArrayList<MatchResult> results=new ArrayList<>();
		StringBuilder temp=new StringBuilder();
		for(int i=0;i<source.length();++i)
		{
			char c=source.charAt(i);
			//Need to find matching bracket
			if(c!='[') temp.append(c);
			else
			{
				if(!temp.isEmpty())
				{
					results.add(new MatchResult(temp.toString(),false));
					temp.setLength(0);
				}
				int m=findMatchingBracketNonStack(source,i);
				if(m!=-1)
				{
					String tmp=source.substring(i,m);
					//results.add(new MatchResult(tmp,true));
					results.add(new MatchResult(copyFor(source,i,m),true));
					i=m;
				}
			}
		}
		results.add(new MatchResult(temp.toString(),false));
		return results;
	}
	
	public static void printNestedLoops(ArrayList<MatchResult> results)
	{
		printNestedLoops(results,0);
	}
	
	public static void printNestedLoops(ArrayList<MatchResult> results,int depth)
	{
		for(var res: results)
		{
			boolean bIsLoop=res.getIsLoop();
			System.out.printf("%c|%d\t",bIsLoop?'L':'E',depth);
			for(int i=0;i<depth;++i) System.out.print("  ");
			if(bIsLoop)
			{
				System.out.printf("%s] - PARSING\n",res.getSource());
				printNestedLoops(parse(res.getSource()),depth+1);
			}
			else System.out.printf("%s - EXECUTING\n",res.getSource());
		}
	}
	
	/**
	 * @param expression string where would be found the matching bracket
	 * @param index      begin index for search
	 * @param opening    brace pair opening character
	 * @param closing    brace pair closing character
	 * @return index of matching bracket, or -1 if not found
	 */
	public static int findMatchingBracketNonStack(String expression,int index,char opening,char closing)
	{
		if(expression==null) return -1;
		int i=index, count=0, length=expression.length();
		char c;
		if(expression.charAt(index)!=opening) return -1;
		for(;i<length;++i)
		{
			c=expression.charAt(i);
			if(c==opening) ++count;
			else
				if(c==closing&&--count==0) return i;
		}
		return -1;
	}
	
	public static int findMatchingBracketNonStack(String expression,int index)
	{
		return findMatchingBracketNonStack(expression,index,'[',']');
	}
}