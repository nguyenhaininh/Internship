/*
 * Created on Jul 1, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

package struts.ex5.exception;

import java.io.Serializable;

/**
 * @author Administrator
 *
 *         To change the template for this generated type comment go to
 *         Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and
 *         Comments.
 */
public abstract class LightweightBaseException extends Exception {

  private static final long serialVersionUID = 1L;
  private String            uniqueId;
  private ErrorLevel        level;
  private String            userMessageKey;
  private Serializable[]    valueReplacementArray;

  /**
   * Light weight base exeption.
   */
  public LightweightBaseException(String anUserMessageKey,
      Serializable[] anValueReplacementArray, String anUniqueId,
      ErrorLevel anErrorLevel) {

    this.userMessageKey = anUserMessageKey;
    this.valueReplacementArray = anValueReplacementArray;
    this.uniqueId = anUniqueId;
    this.level = anErrorLevel;
  }

  public Serializable[] getValueReplacementArray() {

    return valueReplacementArray;
  }

  protected void setValueReplacementArray(Serializable[] serializables) {

    valueReplacementArray = serializables;
  }

  public String getUserMessageKey() {

    return userMessageKey;
  }

  public ErrorLevel getLevel() {

    return level;
  }

  public String getUniqueId() {

    return uniqueId;
  }

}
