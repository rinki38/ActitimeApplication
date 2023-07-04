package actitime.testScript;

import java.io.IOException;
//import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import actitime.elementRepository.CreateTypeWorkLocators;
import actitime.elementRepository.TimeTrackLocators;
import actitime.genericLib.BaseClass;
//import actitime.genericLib.CommonUtility;
//import actitime.genericLib.Datautility;

public class AlertHandling extends BaseClass {
	@Test
	  public void handleAlert() throws EncryptedDocumentException, IOException, InterruptedException {
		String actual="Are you sure you want to cancel the Type of Work creation?";
      Thread.sleep(2000);
      TimeTrackLocators tt=new TimeTrackLocators(driver);
  	  tt.clickSettingButton();
  	  tt.clicktypeofwork();
  	  CreateTypeWorkLocators ctw=new CreateTypeWorkLocators(driver);
      ctw.typeOfWork(du.getDataFromExcelsheet("sheet1", 1, 1));
	  String msg=cu.alertGettext(driver);
	  Reporter.log(msg,true);
	  Assert.assertEquals(actual, msg);
	  System.out.println("Tc pass");
	  cu.alertCancel(driver);
	}
}
