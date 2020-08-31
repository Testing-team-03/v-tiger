package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ServicesPage;

public class SearchServiceName extends BaseClass {

	@Test
	public void searchService() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	WebElement more = driver.findElement(By.xpath("//a[.='More']"));
	Actions a=new Actions(driver);
	a.moveToElement(more).perform();
	
	Reporter.log("opening the service page", true);
	ServicesPage s=new ServicesPage(driver);
	s.getServices().click();
	
	Reporter.log("selecting service name from the drop down", true);
	s.getInDropDown().click();
	WebElement search = s.getInDropDown();
	Select select=new Select(search);
	select.selectByVisibleText("Service Name");
	
	Reporter.log("enter the valid service name", true);
	String ExpectedserviceNum = f.getExcelData("Sheetname", 3, 1);
	s.getSearchFeild().sendKeys(ExpectedserviceNum);
	
	Reporter.log("click on search now button", true);
	s.getSearchnowbtn().click();
	
	
	Reporter.log("Verify the service name is successfully displayed or not", true);
	Thread.sleep(5000);
	String name = s.getServiceName().getText();
	Assert.assertEquals(name, ExpectedserviceNum);
	}
}
