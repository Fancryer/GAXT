package GAXT.ErrorUtils;

public enum GaxtError
{
	E_None,
	E_EmptyStackAccessing,
	E_EmptyStackShaving,
	E_MissingFinishToken,
	E_NumberOverflow,
	E_NotPrintableCharacter,
	E_UndefinedToken,
	E_UnbalancedBrackets,
	E_SecondOperandNotFound,
	E_StackCorruption,
	E_WrongArithmetic,
	E_OutOfMemory,
	E_NoSuchMacro,
	E_NoSuchLabel,
	E_UnexpectedToken,
	E_FileNotFound;
	
	public String getMessage()
	{
		return switch(this)
				{
					case E_EmptyStackShaving -> "Trying to shave empty stack!";
					case E_EmptyStackAccessing -> "Trying to access empty stack!";
					case E_MissingFinishToken -> "Source does not contain finish '!' token!";
					case E_NumberOverflow -> "Number overflow!";
					case E_NotPrintableCharacter -> "Trying to print not printable char!";
					case E_UndefinedToken -> "Undefined token!";
					case E_UnbalancedBrackets -> "Brackets are not balanced!";
					case E_WrongArithmetic -> "Wrong arithmetic operation!";
					case E_OutOfMemory -> "Out of memory!";
					case E_NoSuchMacro -> "Trying to call macro at invalid index!";
					case E_NoSuchLabel -> "Trying to load label at invalid index!";
					case E_UnexpectedToken -> "Unexpected token!";
					case E_FileNotFound -> "Trying to run invalid file!";
					case E_StackCorruption -> "Stack is corrupted!";
					case E_SecondOperandNotFound -> "Cannot perform math on one operand!";
					default -> "";
				};
	}
}