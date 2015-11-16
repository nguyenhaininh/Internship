package struts.ex8.customer.dao;

import struts.ex8.customer.dao.msaccess.DaoFactoryAccessImpl;
import struts.ex8.customer.dao.mysql.DaoFactoryMysqlImpl;

public abstract class DaoFactoryAbstract {

  public static final int MS_ACCESS = 0;
  public static final int ORACLE    = 1;
  public static final int DB2       = 2;
  // Customer
  public static final int MYSQL     = 3;

  public abstract ICustomerDao getCustomerDao();

  /**
   * choose database to use.
   * 
   * @param whichDao
   *          choose database
   */
  public static DaoFactoryAbstract getDaoFactory(int whichDao) {

    DaoFactoryAbstract daoFactory = null;
    switch (whichDao) {
      case MS_ACCESS:
        daoFactory = new DaoFactoryAccessImpl();
        break;
      case ORACLE:
      case DB2:
      case MYSQL:
        daoFactory = new DaoFactoryMysqlImpl();
        break;
      default:
        throw new UnsupportedOperationException(
            "On MS Access Dao Factories are currently supported");
    }
    return daoFactory;
  }

}
