package struts.ex9.customer.dao;

import struts.ex9.exception.ErrorLevel;
import struts.ex9.exception.LightweightBaseException;

public class DuplicateCustomerException extends LightweightBaseException {

  private static final long serialVersionUID = 1L;

  /**
   * Duplicate customer exeption.
   */
  public DuplicateCustomerException(String userMessageKey, String email,
      String anUniqueId, ErrorLevel anErrorLevel) {

    super(userMessageKey, null, anUniqueId, anErrorLevel);
    String[] valueArray = { email };
    setValueReplacementArray(valueArray);
  }

}
