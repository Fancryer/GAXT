package GAXT.Loops;

public class MatchResult
{
	String source;
	boolean isLoop;
	
	public MatchResult(String source,boolean isLoop)
	{
		this.source=source;
		this.isLoop=isLoop;
	}
	
	public String getSource()
	{
		return source;
	}
	
	public boolean getIsLoop(){return isLoop;}
	
	public boolean isEmpty(){return source.isEmpty();}
}
