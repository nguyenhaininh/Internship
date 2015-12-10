package struts.ex9.customer.delegate;

import java.io.Serializable;

/**
 * Customer search Criteria.
 */
public class CustomerSearchCriteria implements Serializable {

  private static final long serialVersionUID = 1L;
  private String            lastName;

  public CustomerSearchCriteria(String theLastName) {

    this.lastName = theLastName;
  }

  public String getLastName() {

    return lastName;
  }
}
