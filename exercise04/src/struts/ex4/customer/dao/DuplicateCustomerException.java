package struts.ex4.customer.dao;

import struts.ex4.exception.ErrorLevel;
import struts.ex4.exception.LightweightBaseException;

/**
 *
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
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
