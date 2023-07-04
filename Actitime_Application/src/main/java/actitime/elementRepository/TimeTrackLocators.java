package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackLocators {
	public TimeTrackLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="container_tasks")
	private WebElement taskButton;
	
	@FindBy(css=".popup_menu_button.popup_menu_button_settings")
	private WebElement settingButton;
	
	@FindBy(linkText="Types of Work")
	private WebElement typeOfWork;
	
	@FindBy(xpath="//div[text()='Manage system settings & configure actiTIME']")
	private WebElement generalSetting;
	
	 @FindBy(id="logoutLink")
	 private WebElement logoutButton;
	 
	 public WebElement getsettingButton()
		{
			return settingButton;
		}
	 public WebElement gettaskButton()
		{
			return taskButton;
		}
	 public WebElement gettypeOfWork()
	 {
		 return typeOfWork;
	 }
	 public WebElement getgeneralSetting()
	 {
		 return generalSetting;
	 }
	 public WebElement getlogoutButton()
		{
			return logoutButton;
		}
	 public void logoutApp() 
	 {
		
		 getlogoutButton().click();
	 }
	 public void clickTaskButton()
	 {
		 gettaskButton().click(); 
	 }
	 public void clickSettingButton()
	 {
		 getsettingButton().click();
	 }
	 public void clicktypeofwork()
	 {
		 gettypeOfWork().click();
	 }
	 public void clickgeneralSetting()
	 {
		 getgeneralSetting().click();
	 }
}
