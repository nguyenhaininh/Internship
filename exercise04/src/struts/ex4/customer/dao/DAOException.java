package struts.ex4.customer.dao;

import java.io.Serializable;

import struts.ex4.exception.BaseException;
import struts.ex4.exception.ErrorLevel;

/**
 * @author NinhNH
 * @version 11/11/2015
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
@SuppressWarnings("serial")
public class DAOException extends BaseException
{

	public DAOException(Throwable aThrowable, String userMessageKey, Serializable[] valueReplacementArray, ErrorLevel level)
	{
		 super(aThrowable, userMessageKey, valueReplacementArray, level);
	}
}
