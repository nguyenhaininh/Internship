package struts.ex4.customer.dao.msaccess;

import struts.ex4.customer.dao.CustomerDAO;
import struts.ex4.customer.dao.DAOFactory;

/**
 * This is a implementation of Factory Method
 * 
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
 */
public class DAOFactory_AccessImpl extends DAOFactory 
{

	public CustomerDAO getCustomerDAO() 
	{
		return new CustomerDAO_AccessImpl();
	}

}
