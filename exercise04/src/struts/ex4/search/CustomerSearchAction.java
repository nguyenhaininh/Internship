package struts.ex4.search;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.ex4.customer.delegate.CustomerListDelegate;
import struts.ex4.customer.list.CustomerSummaryObject;

/**
 *
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
 */
public class CustomerSearchAction extends Action 
{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ActionForward forward = null;
		CustomerSearchForm searchForm = (CustomerSearchForm) form;
		if (searchForm.getSearchButton().isSelected())
		{
			CustomerListDelegate delegate = new CustomerListDelegate();
			try{
			CustomerSummaryObject[] customers = delegate.findCustomers(searchForm.getLastName());
			request.setAttribute("CUSTOMER_SUMMARY_OBJECTS", customers);
      forward = mapping.findForward("success");
			}catch(Exception e ){
			  
			}
			
		}
		
		return forward;
	}

}