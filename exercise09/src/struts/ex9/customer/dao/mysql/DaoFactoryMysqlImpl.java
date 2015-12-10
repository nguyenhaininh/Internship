package struts.ex9.customer.dao.mysql;

import struts.ex9.customer.dao.DaoFactoryAbstract;
import struts.ex9.customer.dao.ICustomerDao;

/**
 * This is a implementation of Factory Method.
 */
public class DaoFactoryMysqlImpl extends DaoFactoryAbstract {

  public ICustomerDao getCustomerDao() {

    return new CustomerDaoMysqlImpl();
  }

}
