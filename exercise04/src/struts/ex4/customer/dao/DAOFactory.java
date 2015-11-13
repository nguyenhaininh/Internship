package struts.ex4.customer.dao;

import struts.ex4.customer.dao.msaccess.DAOFactory_AccessImpl;
import struts.ex4.customer.dao.mysql.DAOFactory_MySQLImpl;

/**
 * This is a implementation of Abstract Factory
 * @author NinhNH
 * @version 11/11/2015
 */
public abstract class DAOFactory 
{

	public static final int MS_ACCESS = 0;
	
	public static final int ORACLE = 1;
	
	public static final int DB2 = 2;
	
	public static final int MYSQL = 3;
	
	public abstract CustomerDAO getCustomerDAO();
	
	public static DAOFactory getDAOFactory(int whichDAO)
	{
		DAOFactory daoFactory = null;
		switch(whichDAO)
		{
			case MS_ACCESS:
				daoFactory = new DAOFactory_AccessImpl();
				break;
			case ORACLE:
			case DB2:
			case MYSQL:
				daoFactory = new DAOFactory_MySQLImpl();
				break;
			default:
				throw new UnsupportedOperationException("On MS Access DAO Factories are currently supported"); 
		}
		return daoFactory;
	}

}