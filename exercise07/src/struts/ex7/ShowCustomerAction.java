package struts.ex7;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import struts.ex7.customer.CustomerDetailObject;
import struts.ex7.customer.CustomerServiceException;
import struts.ex7.customer.delegate.CustomerDelegate;

public class ShowCustomerAction extends DispatchAction {

  /*
   * Use DispathAction otherwise this.
   */
  /*
   * @Override public ActionForward execute(ActionMapping mapping, ActionForm
   * form, HttpServletRequest request, HttpServletResponse response) throws
   * Exception { ActionForward nextPage = null; if
   * ("Create".equals(request.getParameter("action"))) { nextPage =
   * mapping.findForward("customerFormPage"); } else if
   * ("Edit".equals(request.getParameter("action"))) { CustomerDelegate delegate
   * = new CustomerDelegate(); CustomerDetailObject customer =
   * delegate.getCustomerDetail(request .getParameter("email")); CustomerForm
   * custForm = CustomerFormAssembler .createCustomerForm(customer);
   * request.setAttribute("CustomerForm", custForm); nextPage =
   * mapping.findForward("customerFormPage"); } // TODO Auto-generated method
   * stub return nextPage; }
   */

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
