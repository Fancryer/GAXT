import GAXT.GaxtCommon;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		String source;
		source=GaxtCommon.readFile(args.length>=1?args[0]:"tests\\BottlesInterpolated.gaxt");
		GAXTLexer lexer=new GAXTLexer(CharStreams.fromString(source));
		CommonTokenStream tokens=new CommonTokenStream(lexer);
		GAXTParser parser=new GAXTParser(tokens);
		ParseTree tree=parser.program();
		//ParseTreeWalker walker=new ParseTreeWalker();
		var walker=new GaxtBaseWalker();
		walker.visit(tree);
		//System.out.println("\n\n"+walker.interpreter);
	}
	
	public static List<Integer> countStringOffsets(String src)
	{
		List<Integer> offsets=new ArrayList<>();
		for(var i=1;i<src.length();++i) offsets.add(src.charAt(i)-src.charAt(i-1));
		return offsets;
	}
}

/*
abcdefghijklmnopqrstuvwxyz  V
ABCDEFGHIJKLMNOPQRSTUVWXYZ  V
0123456789                  V
+-/*                        V
`<=>                        V
?$                          V
:;~%                        V
{|}                         X   Branch
()@                         X   Macro
[]\^                        X   Loop
.,                          X   Label
#!                          V
*/