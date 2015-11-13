package struts.ex4.exception;

/**
 * 
 * @author NinhNH
 * @version 11/11/2015
 */
public class ErrorLevel 
{
  @SuppressWarnings("unused")
  private int x;

  public static final ErrorLevel INFO = new ErrorLevel(0);
    
  public static final ErrorLevel WARNING = new ErrorLevel(0);
  
  public static final ErrorLevel ERROR = new ErrorLevel(0);
  
  public static final ErrorLevel FATAL = new ErrorLevel(0);
  
  private ErrorLevel(int a)
  {
    x = a;
  }

}