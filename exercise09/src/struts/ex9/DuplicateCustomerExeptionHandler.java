package struts.ex9;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;

import struts.ex9.customer.dao.DuplicateCustomerException;

public class DuplicateCustomerExeptionHandler extends ExceptionHandler {

  @Override
  public ActionForward execute(Exception ex, ExceptionConfig ae,
      ActionMapping mapping, ActionForm formInstance,
      HttpServletRequest request, HttpServletResponse response)
      throws ServletException {

    ActionForward forward = mapping.getInputForward();
    ActionErrors errors = new ActionErrors();
    DuplicateCustomerException dup = (DuplicateCustomerException) ex;
    ActionError error = new ActionError(dup.getUserMessageKey(),
        dup.getValueReplacementArray());
    errors.add("emailAddress", error);
    // Store the ActionsErrors in request
    request.setAttribute(Globals.ERROR_KEY, errors);
    // Store the Exception in request
    request.setAttribute(Globals.EXCEPTION_KEY, ex);
    // TODO Auto-generated method stub
    return forward;
  }
}