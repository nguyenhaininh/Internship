package struts.ex8.customer.list;

import java.io.Serializable;

/**
 *
 * @author Srikanth Shenoy.
 * @version $Revision: $ $Date: $
 */
public class CustomerSummaryObject implements Serializable {

  private static final long serialVersionUID = 1L;
  private int               id;
  private String            firstName;
  private String            lastName;
  private String            emailAddress;

  public String getEmailAddress() {

    return emailAddress;
  }

  public String getFirstName() {

    return firstName;
  }

  public String getLastName() {

    return lastName;
  }

  public void setEmailAddress(String string) {

    emailAddress = string;
  }

  public void setFirstName(String string) {

    firstName = string;
  }

  public void setLastName(String string) {

    lastName = string;
  }

  public int getId() {

    return id;
  }

  public void setId(int ident) {

    id = ident;
  }

}
