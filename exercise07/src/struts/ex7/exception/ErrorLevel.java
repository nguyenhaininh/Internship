package struts.ex7.exception;

/**
 * 
 * @author Srikanth Shenoy.
 * @version $Revision: $ $Date: $
 */
public class ErrorLevel {

  @SuppressWarnings("unused")
  private int                    x;
  public static final ErrorLevel INFO    = new ErrorLevel(0);
  public static final ErrorLevel WARNING = new ErrorLevel(0);
  public static final ErrorLevel ERROR   = new ErrorLevel(0);
  public static final ErrorLevel FATAL   = new ErrorLevel(0);

  private ErrorLevel(int level) {

    x = level;
  }

}
