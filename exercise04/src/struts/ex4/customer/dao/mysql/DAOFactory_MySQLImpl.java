package struts.ex4.customer.dao.mysql;

import struts.ex4.customer.dao.CustomerDAO;
import struts.ex4.customer.dao.DAOFactory;

/**
 * This is a implementation of Factory Method
 * 
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
 */
public class DAOFactory_MySQLImpl extends DAOFactory 
{

	public CustomerDAO getCustomerDAO() 
	{
		return new CustomerDAO_MySQLImpl();
	}

}
