package struts.ex4.exception;

import java.io.Serializable;

/**
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
@SuppressWarnings("serial")
public abstract class LightweightBaseException extends Exception
{
  
  private String uniqueID;
  
  private ErrorLevel level;
  
  private String userMessageKey;
  
  private Serializable[] valueReplacementArray;
  
  public LightweightBaseException(String aUserMessageKey, Serializable[] aValueReplacementArray, String aUniqueID, ErrorLevel anErrorLevel)
  {
    this.userMessageKey = aUserMessageKey;
    this.valueReplacementArray = aValueReplacementArray;
    this.uniqueID = aUniqueID;
    this.level = anErrorLevel;
  }
  /**
   * @return
   */
  public Serializable[] getValueReplacementArray()
  {
    return valueReplacementArray;
  }

  /**
   * @param serializables
   */
  protected void setValueReplacementArray(Serializable[] serializables)
  {
    valueReplacementArray = serializables;
  }

  /**
   * @return
   */
  public String getUserMessageKey()
  {
    return userMessageKey;
  }

  /**
   * @return
   */
  public ErrorLevel getLevel()
  {
    return level;
  }

  /**
   * @return
   */
  public String getUniqueID()
  {
    return uniqueID;
  }

}