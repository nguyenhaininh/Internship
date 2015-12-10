package struts.ex10.search;

import org.apache.struts.action.ActionForm;
import org.apache.struts.util.ImageButtonBean;
import org.apache.struts.validator.ValidatorForm;

/**
 * CustomerSearchForm is the object representation of the html form for entering
 * customer search parameters.
 *
 * @author Srikanth Shenoy
 * @version $Revision: $ $Date: $
 */
@SuppressWarnings({ "unused", "serial" })
public class CustomerSearchForm extends ValidatorForm 
{

	private String lastName;
	
	private ImageButtonBean searchButton;
	
	public CustomerSearchForm()
	{
		init();
	}
	
	protected void init()
	{
		lastName = "";
		searchButton = new ImageButtonBean();
	}
	
	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String string) 
	{
		lastName = string;
	}

	public ImageButtonBean getSearchButton()
	{
		return searchButton;
	}

}
