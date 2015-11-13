package struts.ex4.customer;

import java.io.Serializable;

import struts.ex4.exception.ErrorLevel;
import struts.ex4.exception.LightweightBaseException;

@SuppressWarnings("serial")
public class CustomerServiceException extends LightweightBaseException
{
	/**
	 * @param userMessage
	 * @param anUniqueID
	 * @param anErrorLevel
	 */
	public CustomerServiceException(String userMessageKey, Serializable[] valueReplacementArray, String anUniqueID, ErrorLevel anErrorLevel)
	{
		super(userMessageKey, valueReplacementArray, anUniqueID, anErrorLevel);
	}
	
}