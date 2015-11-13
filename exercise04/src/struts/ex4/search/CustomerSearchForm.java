package struts.ex4.search;

import org.apache.struts.action.ActionForm;
import org.apache.struts.util.ImageButtonBean;

/**
 * CustomerSearchForm is the object representation of the html form for entering 
 * customer search parameters.
 *
  * @author NinhNH
 * @version 11/0112015
 */
@SuppressWarnings("serial")
public class CustomerSearchForm extends ActionForm 
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