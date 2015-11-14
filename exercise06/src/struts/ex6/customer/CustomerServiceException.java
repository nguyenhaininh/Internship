package struts.ex6.customer;

import struts.ex6.exception.ErrorLevel;
import struts.ex6.exception.LightweightBaseException;

import java.io.Serializable;

public class CustomerServiceException extends LightweightBaseException {

  private static final long serialVersionUID = 1L;

  public CustomerServiceException(String userMessageKey,
      Serializable[] valueReplacementArray, String anUniqueId,
      ErrorLevel anErrorLevel) {

    super(userMessageKey, valueReplacementArray, anUniqueId, anErrorLevel);
  }

}
