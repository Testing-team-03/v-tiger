package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ServicesPage;

public class SearchServiceCate extends BaseClass{

	@Test
	public void searchService() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	WebElement more = driver.findElement(By.xpath("//a[.='More']"));
	Actions a=new Actions(driver);
	a.moveToElement(more).perform();
	
	Reporter.log("opening the service page", true);
	ServicesPage s=new ServicesPage(driver);
	s.getServices().click();
	
	Reporter.log("selecting category from the dropdown", true);
	s.getInDropDown().click();
	WebElement search = s.getInDropDown();
	Select select=new Select(search);
	select.selectByVisibleText("Category");
	
	Reporter.log("enter the valid category", true);
	String ExpectedCategory = f.getExcelData("Sheetname", 6, 3);
	s.getSearchFeild().sendKeys(ExpectedCategory);
	
	Reporter.log("click on search now button", true);
	s.getSearchnowbtn().click();
	
	Reporter.log("Verify if the appropriate service based on category is successfully displayed or not", true);
	Thread.sleep(5000);
	String category = s.getServiceCategory().getText();
	if(ExpectedCategory.equalsIgnoreCase(category))
	{
		System.out.println("service based on category is displayed");
	}
	
	}
}
