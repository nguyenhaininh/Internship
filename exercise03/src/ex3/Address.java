package ex3;

/**
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
*/
import java.io.Serializable;

public class Address implements Serializable 
{
	
	private String address1;
	
	private String address2;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	/**
	 * @return
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @return
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param string
	 */
	public void setAddress1(String string) {
		address1 = string;
	}

	/**
	 * @param string
	 */
	public void setAddress2(String string) {
		address2 = string;
	}

	/**
	 * @param string
	 */
	public void setCity(String string) {
		city = string;
	}

	/**
	 * @param string
	 */
	public void setState(String string) {
		state = string;
	}

	/**
	 * @param string
	 */
	public void setZip(String string) {
		zip = string;
	}

}
