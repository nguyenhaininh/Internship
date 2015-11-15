package struts.ex7.search;

import org.apache.struts.action.ActionForm;
import org.apache.struts.util.ImageButtonBean;

/**
 * CustomerSearchForm is the object representation of the html form for entering
 * customer search parameters.
 *
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
 */
public class CustomerSearchForm extends ActionForm {

  private static final long serialVersionUID = 1L;
  private String            lastName;
  private ImageButtonBean   searchButton;

  public CustomerSearchForm() {

    init();
  }

  protected void init() {

    lastName = "";
    searchButton = new ImageButtonBean();
  }

  public String getLastName() {

    return lastName;
  }

  public void setLastName(String string) {

    lastName = string;
  }

  public ImageButtonBean getSearchButton() {

    return searchButton;
  }

}
