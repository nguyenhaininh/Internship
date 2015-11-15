package struts.ex7.search;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.ex7.customer.delegate.CustomerListDelegate;
import struts.ex7.customer.list.CustomerSummaryObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Srikanth Shenoy.
 * @version $Revision: $ $Date: $
 */
public class CustomerSearchAction extends Action {

  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form,
      HttpServletRequest request, HttpServletResponse response)
      throws Exception {

    ActionForward forward = null;
    CustomerSearchForm searchForm = (CustomerSearchForm) form;
    if (searchForm.getSearchButton().isSelected()) {
      CustomerListDelegate delegate = new CustomerListDelegate();
      CustomerSummaryObject[] customers = delegate.findCustomers(searchForm
          .getLastName());
      request.setAttribute("CUSTOMER_SUMMARY_OBJECTS", customers);
      forward = mapping.findForward("success");
    }

    return forward;
  }

}
