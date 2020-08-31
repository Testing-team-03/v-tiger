package com.vtiger.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ContactPage;
import com.vtiger.pom.ServicesPage;

public class EditContact extends BaseClass{

	@Test
	public void editContact()
	{
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		
		Reporter.log("opening the service page", true);
		ServicesPage s=new ServicesPage(driver);
		s.getServices().click();
		
		Reporter.log("clicking on the service name", true);
		s.getServiceName().click();
		
		Reporter.log("click on more information link", true);
		s.getMoreinfolink().click();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,5000)");
		
		Reporter.log("click on organization", true);
		ContactPage c=new ContactPage(driver);
		
		c.getContact().click();
		Reporter.log("select the organization to be edited",true);
		c.getSelectedcontact().click();
		
		
	}
		

}
