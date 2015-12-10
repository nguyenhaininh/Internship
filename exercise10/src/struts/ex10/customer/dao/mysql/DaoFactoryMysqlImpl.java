package struts.ex10.customer.dao.mysql;

import struts.ex10.customer.dao.DaoFactoryAbstract;
import struts.ex10.customer.dao.ICustomerDao;

/**
 * This is a implementation of Factory Method.
 */
public class DaoFactoryMysqlImpl extends DaoFactoryAbstract {

  public ICustomerDao getCustomerDao() {

    return new CustomerDaoMysqlImpl();
  }

}
