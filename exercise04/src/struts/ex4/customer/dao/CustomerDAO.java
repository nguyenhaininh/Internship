package struts.ex4.customer.dao;

import struts.ex4.customer.CustomerDetailObject;
import struts.ex4.customer.list.CustomerSummaryObject;

/**
 * @author NinhNH
 * @version 11/11/2015
 */
public interface CustomerDAO 
{

	public CustomerDetailObject fetchDetail(String emailAddress) throws DAOException;
	
	public CustomerSummaryObject[] find(String lastName) throws DAOException;
		
	public int create(CustomerDetailObject customer) throws DAOException, DuplicateCustomerException;
	
	public void update(CustomerDetailObject customer) throws DAOException, DuplicateCustomerException;
	
	public void delete(int id) throws DAOException;

}