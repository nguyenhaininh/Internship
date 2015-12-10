package struts.ex10;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import struts.ex10.customer.CustomerDetailObject;
import struts.ex10.customer.CustomerServiceException;
import struts.ex10.customer.delegate.CustomerDelegate;

public class ShowCustomerAction extends DispatchAction {

  /*
   * Add edit method.
   */
  public ActionForward Edit(ActionMapping mapping, ActionForm form,
      HttpServletRequest request, HttpServletResponse response)
      throws CustomerServiceException {

    ActionForward forward = null;

    CustomerDelegate delegate = new CustomerDelegate();
    CustomerDetailObject customer = delegate.getCustomerDetail(request
        .getParameter("email"));
    CustomerForm custForm = CustomerFormAssembler.createCustomerForm(customer);
    request.setAttribute("CustomerForm", custForm);
    forward = mapping.findForward("customerFormPage");
    return forward;
  }

  /*
   * Add create method.
   */
  public ActionForward Create(ActionMapping mapping, ActionForm form,
      HttpServletRequest request, HttpServletResponse response) {

    ActionForward forward = null;
    forward = mapping.findForward("customerFormPage");
    return forward;
  }
}