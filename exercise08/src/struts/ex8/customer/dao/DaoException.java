package struts.ex8.customer.dao;

import struts.ex8.exception.BaseException;
import struts.ex8.exception.ErrorLevel;

import java.io.Serializable;

public class DaoException extends BaseException {

  private static final long serialVersionUID = 1L;

  public DaoException(Throwable canThrowable, String userMessageKey,
      Serializable[] valueReplacementArray, ErrorLevel level) {

    super(canThrowable, userMessageKey, valueReplacementArray, level);
  }
}
