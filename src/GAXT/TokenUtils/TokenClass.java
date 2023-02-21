package GAXT.TokenUtils;

public enum TokenClass
{
	Math,
	Logical,
	Print,
	Stack,
	Flow,
	Macro,
	Loop,
	Label,
	Service,
	Digits,
	Constants,
	Variables,
	Undefined;
	
	public static TokenClass fromToken(char c)
	{
		return fromToken(TokenType.fromChar(c));
	}
	
	public static TokenClass fromToken(TokenType token)
	{
		return switch(token)
				{
					case T_Add,T_Subtract,T_Multiply,T_Divide,T_Concat -> Math;
					case T_Nor,T_Less,T_Equal,T_Greater -> Logical;
					case T_PrintInt,T_PrintChar -> Print;
					case T_Assign,T_Reverse,T_Shave,T_Clear -> Stack;
					case T_If,T_Then,T_Else,T_Break,T_Continue -> Flow;
					case T_Read,T_Write,T_Call -> Macro;
					case T_Repeat,T_Until -> Loop;
					case T_Save,T_Load -> Label;
					case T_Switch,T_Finish -> Service;
					case T_Digit -> Digits;
					case T_Constant -> Constants;
					case T_Variable -> Variables;
					default -> Undefined;
				};
	}
}