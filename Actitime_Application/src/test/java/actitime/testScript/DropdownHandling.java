package actitime.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import actitime.elementRepository.TimeTrackLocators;
import actitime.genericLib.BaseClass;

public class DropdownHandling extends BaseClass{
	@Test
	public void handleDropdown()
	{
		  String actual="MODIFICATIONS NOT SAVED";
		  TimeTrackLocators tt=new TimeTrackLocators(driver);
	  	  tt.clickSettingButton();
	  	  tt.clickgeneralSetting();
          WebElement dropdown1=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	      cu.getselectbyvalue(dropdown1, "4");
	      String msg=driver.findElement(By.id("FormModifiedTextCell")).getText();
	      Reporter.log(msg,true);
	      Assert.assertEquals(actual, msg);
	      System.out.println("tc pass");
	}
}
