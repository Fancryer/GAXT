package GAXT.ErrorUtils;

import GAXT.TokenUtils.TokenType;

public class GaxtException_Finish extends GaxtException
{
	public final boolean critical;
	
	public GaxtException_Finish(int position,boolean critical)
	{
		super(GaxtError.E_None,TokenType.T_Finish,position);
		this.critical=critical;
	}
	public GaxtException_Finish(int position)
	{
		this(position,false);
	}
}
