package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ServicesPage;

@Listeners(com.vtiger.generics.ListenerImplementation.class)

public class CreateService extends BaseClass{
	@Test
	public void createService() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{			
		
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		
		Reporter.log("opening the service page", true);
		ServicesPage s=new ServicesPage(driver);
		s.getServices().click();
		
		Reporter.log("clicking on create service button",true);
		s.getCreateservice().click();
		
		String ExpectedserviceName = f.getExcelData("Sheetname", 1, 1);
		
		Reporter.log("entering the service name", true);
		s.getServicename().sendKeys(ExpectedserviceName);
		
		Reporter.log("clicking on save button", true);
		s.getSavebtn().click();
		
		
		Reporter.log("Verify the service is successfully created or not", true);
		Thread.sleep(5000);
		String ActualServiceCreated = s.getVerifyservicetxt().getText();
		Assert.assertEquals(ActualServiceCreated, ExpectedserviceName);
	}
		
}
