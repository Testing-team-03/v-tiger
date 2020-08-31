package com.vtiger.testscripts;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ServicesPage;

public class EditOpportunities extends BaseClass{

	@Test
	public void selectOpportunities() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
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
	
	Reporter.log("click on opportunities", true);
	s.getOpportunities().click();
	
	Reporter.log("click on opportunity", true);
	s.getSelectedopportunity().click();
	Reporter.log("click on edit button", true);
	s.getEditbtn().click();
	s.getOpportunityname().clear();
	String detail = "a";
	s.getOpportunityname().sendKeys(detail);
	Reporter.log("click on save button", true);
	s.getSavebtn().click();
	
	String editeddetail = s.getEditedname().getText();
	if(detail.equalsIgnoreCase(editeddetail))
	{
		System.out.println("opportunity is edited");
	}
	else
	{
		System.out.println("opportunity is not edited");
	}
	}
}
