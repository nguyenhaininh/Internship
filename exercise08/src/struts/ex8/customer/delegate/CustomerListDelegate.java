package struts.ex8.customer.delegate;

import struts.ex8.customer.list.CustomerListService;
import struts.ex8.customer.list.CustomerListServiceException;
import struts.ex8.customer.list.CustomerSummaryObject;

/**
 *
 * @author Srikanth Shenoy.
 * @version $Revision: $ $Date: $
 */
public class CustomerListDelegate {

  public CustomerListDelegate() {
  }

  /**
   * find customer with lasname.
   */
  public CustomerSummaryObject[] findCustomers(String lastName)
      throws CustomerListServiceException {
    // Generally a EJB lookup on ServiceLocator goes here.
    // For simplicity, Customer List Service is just a POJO in our case
    CustomerListService custListService = new CustomerListService();
    return custListService.findCustomers(lastName);
  }
}
