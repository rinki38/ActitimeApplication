package actitime.testScript;

import java.io.IOException;
//import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import actitime.elementRepository.TaskLocators;
import actitime.elementRepository.TimeTrackLocators;
import actitime.genericLib.BaseClass;
@Listeners(actitime.genericLib.ListenerImplementation.class)
public class CustomerCreation extends BaseClass {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
	String actual="rinki";
	String desc="i m a trainer";
	String customername=du.getDataFromExcelsheet("sheet1", 0, 1);
    int num=cu.getRandomNum();
	customername=customername+num;
	TimeTrackLocators tt=new TimeTrackLocators(driver);
	tt.clickTaskButton();
	TaskLocators tl=new TaskLocators(driver);
	tl.createCustomer(customername, desc);
	cu.explicitWait(driver,By.cssSelector(".titleEditButtonContainer>.title"), customername);
    String actualcusname=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
    Reporter.log(actualcusname,true);
    Assert.assertTrue( actualcusname.contains(actual));
    System.out.println("Tc pass");
}
}
