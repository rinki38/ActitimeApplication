package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTypeWorkLocators {

	public CreateTypeWorkLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Create Type of Work']")
	private WebElement creatework;
	@FindBy(id="name")
	private WebElement workName;
	@FindBy(xpath="//td[@id='ButtonPane']/input[@type='button']")
	private WebElement cancelButton;
	
	public WebElement getcreatework()
	{
		return creatework;
	}
	public WebElement getworkName()
	{
		return workName;
	}
	public WebElement getcancelButton()
	{
		return cancelButton;
	}
	
	public void typeOfWork(String name)
	{
		getcreatework().click();
		getworkName().sendKeys(name);
		getcancelButton().click();
	}
}

