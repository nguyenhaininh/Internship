package struts.ex4.customer.delegate;

import java.io.Serializable;

/**
 *
 * @author NinhNH
 * @version 11/11/2015
 */
@SuppressWarnings("serial")
public class CustomerSearchCriteria implements Serializable 
{

  private String lastName;
  
  public CustomerSearchCriteria(String theLastName)
  {
    this.lastName = theLastName;
  }
  
  public String getLastName()
  {
    return lastName;
  }
}