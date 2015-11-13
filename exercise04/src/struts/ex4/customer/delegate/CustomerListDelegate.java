package struts.ex4.customer.delegate;

import struts.ex4.customer.list.CustomerListService;
import struts.ex4.customer.list.CustomerListServiceException;
import struts.ex4.customer.list.CustomerSummaryObject;

/**
 *
 * @author NinhNH
 * @version 11/11/2015
 */
public class CustomerListDelegate 
{

	public CustomerListDelegate() 
	{
	}

	public CustomerSummaryObject[] findCustomers(String lastName) throws CustomerListServiceException
	{
		//Generally a EJB lookup on ServiceLocator goes here.
		//For simplicity, Customer List Service is just a POJO in our case
		
		CustomerListService custListService = new CustomerListService();
		return custListService.findCustomers(lastName);
	}
}