package struts.ex6.customer.dao;

import struts.ex6.exception.BaseException;
import struts.ex6.exception.ErrorLevel;

import java.io.Serializable;

public class DaoException extends BaseException {

  private static final long serialVersionUID = 1L;

  public DaoException(Throwable canThrowable, String userMessageKey,
      Serializable[] valueReplacementArray, ErrorLevel level) {

    super(canThrowable, userMessageKey, valueReplacementArray, level);
  }
}
