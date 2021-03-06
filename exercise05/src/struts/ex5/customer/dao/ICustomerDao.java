package struts.ex5.customer.dao;

import struts.ex5.customer.CustomerDetailObject;
import struts.ex5.customer.list.CustomerSummaryObject;

public interface ICustomerDao {

  public CustomerDetailObject fetchDetail(String emailAddress)
      throws DaoException;

  public CustomerSummaryObject[] find(String lastName) throws DaoException;

  public int create(CustomerDetailObject customer) throws DaoException,
      DuplicateCustomerException;

  public void update(CustomerDetailObject customer) throws DaoException,
      DuplicateCustomerException;

  public void delete(int id) throws DaoException;

}
