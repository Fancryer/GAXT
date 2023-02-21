package GAXT.TokenUtils;

import GAXT.TokenUtils.Tokens.*;
import GAXT.TokenUtils.Tokens.Flow.*;
import GAXT.TokenUtils.Tokens.Label.TokenLabel_Load;
import GAXT.TokenUtils.Tokens.Label.TokenLabel_Save;
import GAXT.TokenUtils.Tokens.Logical.TokenLogical_Equal;
import GAXT.TokenUtils.Tokens.Logical.TokenLogical_Greater;
import GAXT.TokenUtils.Tokens.Logical.TokenLogical_Less;
import GAXT.TokenUtils.Tokens.Logical.TokenLogical_Nor;
import GAXT.TokenUtils.Tokens.Loop.TokenLoop_Repeat;
import GAXT.TokenUtils.Tokens.Loop.TokenLoop_Until;
import GAXT.TokenUtils.Tokens.Macro.TokenMacro_Call;
import GAXT.TokenUtils.Tokens.Macro.TokenMacro_Read;
import GAXT.TokenUtils.Tokens.Macro.TokenMacro_Write;
import GAXT.TokenUtils.Tokens.Math.*;
import GAXT.TokenUtils.Tokens.Print.TokenPrint_Number;
import GAXT.TokenUtils.Tokens.Print.TokenPrint_Symbol;
import GAXT.TokenUtils.Tokens.Service.TokenService_Finish;
import GAXT.TokenUtils.Tokens.Service.TokenService_Switch;
import GAXT.TokenUtils.Tokens.Stack.TokenStack_Assign;
import GAXT.TokenUtils.Tokens.Stack.TokenStack_Clear;
import GAXT.TokenUtils.Tokens.Stack.TokenStack_Reverse;
import GAXT.TokenUtils.Tokens.Stack.TokenStack_Shave;

public enum TokenType
{
	//Math
	T_Add,T_Subtract,T_Multiply,T_Divide,T_Concat,
	//Logical
	T_Nor,T_Less,T_Equal,T_Greater,
	//Print
	T_PrintInt,T_PrintChar,
	//Stack
	T_Assign,T_Reverse,T_Shave,T_Clear,
	//Flow
	T_If,T_Then,T_Else,T_Break,T_Continue,
	//Macro
	T_Read,T_Write,T_Call,
	//Loop
	T_Repeat,T_Until,
	//Mark
	T_Save,T_Load,
	//Service
	T_Switch,T_Finish,
	//Undefined
	T_Undefined,
	//Start
	T_Start,
	//Digits
	T_Digit,
	//Constants
	T_Constant,
	//Variables
	T_Variable;
	
	public static boolean isMath(TokenType token)
	{
		return TokenClass.fromToken(token)==TokenClass.Math;
	}
	
	public static TokenType fromChar(char c)
	{
		if(TokenUtils.isDigit(c)) return T_Digit;
		if(TokenUtils.isConstant(c)) return T_Constant;
		if(TokenUtils.isVariable(c)) return T_Variable;
		return switch(c)
				{
					case '+' -> T_Add;
					case '-' -> T_Subtract;
					case '*' -> T_Multiply;
					case '/' -> T_Divide;
					case '_' -> T_Concat;
					
					case '`' -> T_Nor;
					case '<' -> T_Less;
					case '=' -> T_Equal;
					case '>' -> T_Greater;
					
					case '?' -> T_PrintInt;
					case '$' -> T_PrintChar;
					
					case ':' -> T_Assign;
					case ';' -> T_Reverse;
					case '~' -> T_Shave;
					case '%' -> T_Clear;
					
					case '#' -> T_Switch;
					case '!' -> T_Finish;
					
					case '(' -> T_Read;
					case ')' -> T_Write;
					case '@' -> T_Call;
					
					case '.' -> T_Save;
					case ',' -> T_Load;
					
					case '[' -> T_Repeat;
					case ']' -> T_Until;
					
					case '{' -> T_If;
					case '|' -> T_Then;
					case '}' -> T_Else;
					case '\\' -> T_Break;
					case '^' -> T_Continue;
					
					default -> T_Undefined;
				};
		
	}
	
	
	public Class<? extends Token> getExecutorClass()
	{
		return switch(this)
				{
					case T_Add -> TokenMath_Add.class;
					case T_Subtract -> TokenMath_Subtract.class;
					case T_Multiply -> TokenMath_Multiply.class;
					case T_Divide -> TokenMath_Divide.class;
					case T_Concat -> TokenMath_Concat.class;
					
					case T_Nor -> TokenLogical_Nor.class;
					case T_Less -> TokenLogical_Less.class;
					case T_Equal -> TokenLogical_Equal.class;
					case T_Greater -> TokenLogical_Greater.class;
					
					case T_PrintInt -> TokenPrint_Number.class;
					case T_PrintChar -> TokenPrint_Symbol.class;
					
					case T_Assign -> TokenStack_Assign.class;
					case T_Reverse -> TokenStack_Reverse.class;
					case T_Shave -> TokenStack_Shave.class;
					case T_Clear -> TokenStack_Clear.class;
					
					case T_Read -> TokenMacro_Read.class;
					case T_Write -> TokenMacro_Write.class;
					case T_Call -> TokenMacro_Call.class;
					
					case T_Save -> TokenLabel_Save.class;
					case T_Load -> TokenLabel_Load.class;
					
					case T_Repeat -> TokenLoop_Repeat.class;
					case T_Until -> TokenLoop_Until.class;
					
					case T_Finish -> TokenService_Finish.class;
					case T_Switch -> TokenService_Switch.class;
					
					case T_If -> TokenFlow_If.class;
					case T_Then -> TokenFlow_Then.class;
					case T_Else -> TokenFlow_Else.class;
					case T_Break -> TokenFlow_Break.class;
					case T_Continue -> TokenFlow_Continue.class;
					
					case T_Variable -> TokenVariable.class;
					case T_Constant -> TokenConstant.class;
					case T_Digit -> TokenDigit.class;
					
					case T_Undefined -> TokenUndefined.class;
					default -> null;
				};
	}
	
	@Override
	public String toString()
	{
		return this==T_Start?"Start":super.toString();
	}
}