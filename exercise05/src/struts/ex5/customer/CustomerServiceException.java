package struts.ex5.customer;

import java.io.Serializable;

import struts.ex5.exception.ErrorLevel;
import struts.ex5.exception.LightweightBaseException;

@SuppressWarnings("serial")
public class CustomerServiceException extends LightweightBaseException {
	
  private static final long serialVersionUID = 1L;
  
  public CustomerServiceException(String userMessageKey,
      Serializable[] valueReplacementArray, String anUniqueId,
      ErrorLevel anErrorLevel) {

    super(userMessageKey, valueReplacementArray, anUniqueId, anErrorLevel);
  }
	
}