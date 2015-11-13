package struts.ex4.customer.list;

import java.io.Serializable;

import struts.ex4.exception.ErrorLevel;
import struts.ex4.exception.LightweightBaseException;

/**
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
@SuppressWarnings("serial")
public class CustomerListServiceException extends LightweightBaseException
{
	
	public CustomerListServiceException(String userMessageKey, Serializable[] aValueReplacementArray, String aUniqueID, ErrorLevel anErrorLevel)
	{
		super(userMessageKey, aValueReplacementArray, aUniqueID, anErrorLevel);
	}

}