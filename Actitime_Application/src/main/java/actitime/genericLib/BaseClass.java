package actitime.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import actitime.elementRepository.LoginLocators;
//import org.testng.annotations.Parameters;
import actitime.elementRepository.TimeTrackLocators;

public class BaseClass {
	public WebDriver driver;
	public Datautility du=new Datautility();
	public CommonUtility cu=new CommonUtility();
	public static WebDriver listenerdriver; 
	@BeforeClass(alwaysRun=true)
	public void launchBrowser()
	{
    driver=new ChromeDriver();
    listenerdriver=driver;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperties("Url"));
		LoginLocators ll=new LoginLocators(driver);
		ll.loginApp(du.getDataFromProperties("Username"),du.getDataFromProperties("Password"));
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		TimeTrackLocators tt=new TimeTrackLocators(driver);
		tt.logoutApp();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
		{
		   driver.quit();
		}
	
}
