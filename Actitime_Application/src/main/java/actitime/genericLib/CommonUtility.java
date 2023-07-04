package actitime.genericLib;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {
  public int getRandomNum()
  {
	  Random r =new Random();
      int num=r.nextInt(10000);
      return num;
  }
  public String alertGettext(WebDriver driver)
  {
	  Alert alt=driver.switchTo().alert();
	  String msg=alt.getText();
	  return msg;
  }
  public void alertCancel(WebDriver driver)
  {
	  Alert alt=driver.switchTo().alert();
	  alt.dismiss();
  }
  public void alertAccept(WebDriver driver)
  {
	  Alert alt=driver.switchTo().alert();
	  alt.accept();
  }
  public void alertPassValue(WebDriver driver,String value)
  {
	  Alert alt=driver.switchTo().alert();
	  alt.sendKeys(value);
  }
  public void explicitWait(WebDriver driver,By locator,String customername)
  {
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	     wait.until(ExpectedConditions.textToBePresentInElementLocated(locator,customername));
  }
  public void getselectbyVisibleText(WebElement dropdown,String visibleText)
  {
	
	Select s=new Select(dropdown);
	s.selectByVisibleText(visibleText);
  }
  public void getselectbyIndex(WebElement dropdown,int index)
  {
	
	Select s=new Select(dropdown);
	s.selectByIndex(index);
  }
  public void getselectbyvalue(WebElement dropdown,String value)
  {
	
	Select s=new Select(dropdown);
	s.selectByValue(value);
  }
  public void GetOptionMethod(WebElement drop)
  {
	  Select s=new Select(drop);
	  List<WebElement> allopt=s.getOptions();
	  for(WebElement all:allopt)
	  {
		  String msg=all.getText();
		  System.out.println(msg);
	  }
	  
  }
  public void getDoubleClick(WebDriver driver,WebElement element)
  {
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
  }
  public void getMoveToelement(WebDriver driver,WebElement element)
  {
	  Actions act=new Actions(driver);
	  act.moveToElement(element).perform();
  }
  
  
  
  
  
  
  
}
//getoption
//doubleclick
//movetoelement