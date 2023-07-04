package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskLocators {
	public TaskLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(className="plusIcon")
	private WebElement addNewOption; 
	@FindBy(className="createNewCustom")
	private WebElement newCustomer;
	@FindBy(className="inputNameField")
	private WebElement customernameTB;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionTB;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerButton;
	
	public WebElement getaddNewOption()
	{
		return addNewOption;
	}
	public WebElement getnewCustomer()
	{
		return newCustomer;
	}
	public WebElement getcustomernameTB()
	{
		return  customernameTB;
	}
	public WebElement getdescriptionTB()
	{
		return descriptionTB;
	}
	public WebElement getcreateCustomerButton()
	{
		return createCustomerButton;
	}
   public void createCustomer(String customername,String desc)
   {
	   getaddNewOption().click();
	   getnewCustomer().click();
	   getcustomernameTB().sendKeys(customername);
	   getdescriptionTB().sendKeys(desc);
	   getcreateCustomerButton().click();
   }
	
	
}
