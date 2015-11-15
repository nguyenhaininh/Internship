package struts.ex7.customer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import struts.ex7.customer.dao.DaoException;
import struts.ex7.customer.dao.DaoFactoryAbstract;
import struts.ex7.customer.dao.DuplicateCustomerException;
import struts.ex7.customer.dao.ICustomerDao;

import struts.ex7.exception.ErrorLevel;

/**
 * In real projects, CustomerControllerService object is often implemented as
 * Session EJB. It represents a Business Service and is Session Facade pattern
 * (Core J2EE Patterns)
 * 
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
 */
public class CustomerControllerService {

  /**
   * 
   * @param emailAddress
   *          email of customer.
   * @throws CustomerServiceException
   *           customer service have error
   */
  public CustomerDetailObject getCustomerDetail(String emailAddress)
      throws CustomerServiceException {

    CustomerDetailObject customer = null;
    try {
      DaoFactoryAbstract daoFactory = DaoFactoryAbstract
          .getDaoFactory(DaoFactoryAbstract.MYSQL);
      ICustomerDao dao = daoFactory.getCustomerDao();
      customer = dao.fetchDetail(emailAddress);
    } catch (DaoException de) {
      if (!de.isLogged()) {
        Log log = LogFactory.getLog("CustomerFetchService");
        de.log(log);
      }
      throw new CustomerServiceException(de.getUserMessageKey(),
          de.getValueReplacementArray(), de.getUniqueId(), ErrorLevel.ERROR);
    }

    return customer;
  }

  /**
   * 
   * @param customer
   *          object customer.
   * @throws CustomerServiceException
   *           customer serive have error
   * @throws DuplicateCustomerException
   *           duplicate customer
   * 
   */
  public void createCustomer(CustomerDetailObject customer)
      throws CustomerServiceException, DuplicateCustomerException {

    try {
      customer.getAddress().setAddress1("N/A");
      customer.getAddress().setAddress2("N/A");
      DaoFactoryAbstract daoFactory = DaoFactoryAbstract
          .getDaoFactory(DaoFactoryAbstract.MYSQL);
      ICustomerDao dao = daoFactory.getCustomerDao();
      dao.create(customer);
    } catch (DaoException de) {
      if (!de.isLogged()) {
        Log log = LogFactory.getLog("CustomerInsertService");
        de.log(log);
      }
      throw new CustomerServiceException(de.getUserMessageKey(),
          de.getValueReplacementArray(), de.getUniqueId(), ErrorLevel.ERROR);
    }
  }

  /**
   * 
   * @param customer
   *          object customer.
   * @throws CustomerServiceException
   *           customer serive have error
   * @throws DuplicateCustomerException
   *           duplicate customer
   */
  public void updateCustomer(CustomerDetailObject customer)
      throws CustomerServiceException, DuplicateCustomerException {

    try {
      customer.getAddress().setAddress1("N/A");
      customer.getAddress().setAddress2("N/A");
      DaoFactoryAbstract daoFactory = DaoFactoryAbstract
          .getDaoFactory(DaoFactoryAbstract.MYSQL);
      ICustomerDao dao = daoFactory.getCustomerDao();
      dao.update(customer);
    } catch (DaoException de) {
      if (!de.isLogged()) {
        Log log = LogFactory.getLog("CustomerUpdateService");
        de.log(log);
      }
      throw new CustomerServiceException(de.getUserMessageKey(),
          de.getValueReplacementArray(), de.getUniqueId(), ErrorLevel.ERROR);
    }
  }

  /**
   * 
   * @param id
   *          id of customer.
   * @throws CustomerServiceException
   *           duplicate customer
   */
  public void deleteCustomer(int id) throws CustomerServiceException {

    try {
      DaoFactoryAbstract daoFactory = DaoFactoryAbstract
          .getDaoFactory(DaoFactoryAbstract.MYSQL);
      ICustomerDao dao = daoFactory.getCustomerDao();
      dao.delete(id);
    } catch (DaoException de) {
      if (!de.isLogged()) {
        Log log = LogFactory.getLog("CustomerDeleteService");
        de.log(log);
      }
      throw new CustomerServiceException(de.getUserMessageKey(),
          de.getValueReplacementArray(), de.getUniqueId(), ErrorLevel.ERROR);
    }
  }

}
