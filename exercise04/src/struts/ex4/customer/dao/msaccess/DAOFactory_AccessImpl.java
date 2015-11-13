package struts.ex4.customer.dao.msaccess;

import struts.ex4.customer.dao.CustomerDAO;
import struts.ex4.customer.dao.DAOFactory;

/**
 * This is a implementation of Factory Method
 * 
 * @author NinhNH
 * @version 11/11/2015
 */
public class DAOFactory_AccessImpl extends DAOFactory 
{

	public CustomerDAO getCustomerDAO() 
	{
		return new CustomerDAO_AccessImpl();
	}

}
