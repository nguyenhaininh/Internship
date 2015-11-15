package struts.ex7.customer.dao.mysql;

import struts.ex7.customer.dao.DaoFactoryAbstract;
import struts.ex7.customer.dao.ICustomerDao;

/**
 * This is a implementation of Factory Method.
 */
public class DaoFactoryMysqlImpl extends DaoFactoryAbstract {

  public ICustomerDao getCustomerDao() {

    return new CustomerDaoMysqlImpl();
  }

}
