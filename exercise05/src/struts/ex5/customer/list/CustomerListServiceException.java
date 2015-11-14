package struts.ex5.customer.list;

import struts.ex5.exception.ErrorLevel;
import struts.ex5.exception.LightweightBaseException;

import java.io.Serializable;

/**
 * @author Administrator
 *
 *         To change the template for this generated type comment go to
 *         Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and
 *         Comments.
 */
public class CustomerListServiceException extends LightweightBaseException {

  private static final long serialVersionUID = 1L;

  public CustomerListServiceException(String userMessageKey,
      Serializable[] anValueReplacementArray, String anUniqueId,
      ErrorLevel anErrorLevel) {

    super(userMessageKey, anValueReplacementArray, anUniqueId, anErrorLevel);
  }

}
