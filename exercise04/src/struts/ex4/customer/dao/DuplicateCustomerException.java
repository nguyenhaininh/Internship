package struts.ex4.customer.dao;

import struts.ex4.exception.ErrorLevel;
import struts.ex4.exception.LightweightBaseException;

/**
 *
 * @author NinhNH
 * @version 11/11/2015
 */
@SuppressWarnings("serial")
public class DuplicateCustomerException extends LightweightBaseException 
{

	/**
	 * @param userMessage
	 * @param anUniqueID
	 * @param anErrorLevel
	 */
	public DuplicateCustomerException(String userMessageKey, String email, String anUniqueID, ErrorLevel anErrorLevel)
	{
		super(userMessageKey, null, anUniqueID, anErrorLevel);
		String[] vArray = { email };
		setValueReplacementArray(vArray);
	}
	
}
