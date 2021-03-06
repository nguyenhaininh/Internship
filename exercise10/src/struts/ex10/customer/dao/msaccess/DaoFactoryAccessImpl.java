package struts.ex10.customer.dao.msaccess;

import struts.ex10.customer.dao.DaoFactoryAbstract;
import struts.ex10.customer.dao.ICustomerDao;

/**
 * This is a implementation of Factory Method.
 * 
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
 */
public class DaoFactoryAccessImpl extends DaoFactoryAbstract {

  public ICustomerDao getCustomerDao() {

    return new CustomerDaoAccessImpl();
  }

}
