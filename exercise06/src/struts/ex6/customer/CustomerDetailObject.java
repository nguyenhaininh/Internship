package struts.ex6.customer;

import java.io.Serializable;

public class CustomerDetailObject implements Serializable {

  private static final long serialVersionUID = 1L;
  private int               id;
  private String            firstName;
  private String            lastName;
  private String            emailAddress;
  private String            preferredCarrier;
  private boolean           receiveEmail;
  private Address           address;

  public Address getAddress() {

    return address;
  }

  public String getEmailAddress() {

    return emailAddress;
  }

  public String getFirstName() {

    return firstName;
  }

  public int getId() {

    return id;
  }

  public String getLastName() {

    return lastName;
  }

  public String getPreferredCarrier() {

    return preferredCarrier;
  }

  public boolean getReceiveEmail() {

    return receiveEmail;
  }

  public void setAddress(Address address) {

    this.address = address;
  }

  public void setEmailAddress(String string) {

    emailAddress = string;
  }

  public void setFirstName(String string) {

    firstName = string;
  }

  public void setId(int ident) {

    id = ident;
  }

  public void setLastName(String string) {

    lastName = string;
  }

  public void setPreferredCarrier(String string) {

    preferredCarrier = string;
  }

  public void setReceiveEmail(boolean bool) {

    receiveEmail = bool;
  }

  @Override
  public String toString() {

    return "[CustomerDetailObject = firstName=" + firstName + ", Last Name="
        + lastName + ", Email=" + emailAddress + "]";
  }
}
