package com.vtiger.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ServicesPage;

public class DuplicateService extends BaseClass {
	@Test
	public void dupilcate() throws InterruptedException
	{
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();

		Reporter.log("opening the service page", true);
		ServicesPage s=new ServicesPage(driver);
		s.getServices().click();
		
		Reporter.log("clicking on the service name", true);
		s.getServiceName().click();
		
		String ExpectedserviceName = s.getVerifyservicetxt().getText();

		Reporter.log("clicking on duplicate button", true);
		s.getDupicatebtn().click();
		
		Reporter.log("click on save button", true);
		s.getSavebtn().click();
		
		Reporter.log("verify if the details are duplicated are not", true);
		Thread.sleep(5000);
		String DupicateServiceName = s.getVerifyservicetxt().getText();
		Assert.assertEquals(DupicateServiceName, ExpectedserviceName);
		
		
		}
}
