package struts.ex6;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import struts.ex6.customer.CustomerDetailObject;

public class CustomerFormAssembler {

  private CustomerFormAssembler() {

  }

  /**
   * create customer form.
   */
  public static final CustomerForm createCustomerForm(
      CustomerDetailObject customerDetail) {

    CustomerForm form = new CustomerForm();
    try {
      BeanUtils.copyProperties(form, customerDetail);
      BeanUtils.copyProperties(form.getAddress(), customerDetail.getAddress());
    } catch (InvocationTargetException ite) {
      ite.printStackTrace(); // do nothing for now
    } catch (IllegalAccessException iae) {
      iae.printStackTrace(); // do nothing for now
    }
    return form;
  }
}
