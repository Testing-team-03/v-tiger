package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ServicesPage;

public class EditService1 extends BaseClass{
	@Test
	public void editservice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();

		Reporter.log("opening the service page", true);
		ServicesPage s=new ServicesPage(driver);
		s.getServices().click();

		Reporter.log("clicking on the service name", true);
		s.getServiceName().click();

		Reporter.log("click on edit button", true);
		s.getEditbtn().click();

		s.getServicename().clear();
		String ExpectedserviceName = f.getExcelData("Sheetname", 2, 1);
		Reporter.log("editing the details", true);
		s.getServicename().sendKeys(ExpectedserviceName);
		
		Reporter.log("click on cancel button", true);
		s.getCancelbtn().click();
		
		Reporter.log("details should not be edited", true);
		Thread.sleep(5000);
		String ActualServiceCreated = s.getVerifyservicetxt().getText();
		Assert.assertNotEquals(ActualServiceCreated, ExpectedserviceName);
	}
}
