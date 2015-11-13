package struts.ex4.util;
/**
 * @author NinhNH
 * @version 11/11/2015
 */
public class ServiceLocator 
{
  private static ServiceLocator instance = new ServiceLocator();

  //private   
  private ServiceLocator() 
  { 
  }
  
  public static ServiceLocator getInstance()
  {
    return instance;
  }
  
  
}