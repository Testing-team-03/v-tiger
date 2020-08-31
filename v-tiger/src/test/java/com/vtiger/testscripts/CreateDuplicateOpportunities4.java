package com.vtiger.testscripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class CreateDuplicateOpportunities4 extends BaseClass{
	@Test 
	public void testCreateDuplicateOpportunities() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String Opportunityname = f.getExcelData("Opportunities", 1, 0);
		TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("Clicking on Opportunities link",true);
		t.getOpportunitieslink().click();
		
		Reporter.log("Clicking on add new button",true);
		t.getAddopportunitybtn().click();
		
		Reporter.log("Creating Opportunity",true);
		t.getOpportunityname().sendKeys(Opportunityname);
		
		WebElement listbox1=driver.findElement(By.xpath("//select[@name='related_to_type']"));
		Select s=new Select(listbox1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s.selectByValue("Contacts");
		
		t.getSelectbtn1().click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> i = allwh.iterator();
		String parentid = i.next();
		String Childid = i.next();
		driver.switchTo().window(Childid);
		driver.findElement(By.xpath("//a[.='Sneha Shekar']")).click();
		driver.switchTo().window(parentid);
		t.getMasseditSavebtn1().click();
		
		Reporter.log("clicking on duplicate button",true);
		t.getDuplicatebtn().click();
		
		Reporter.log("Creating duplicate Opportunities",true);
		t.getOpportunityname().sendKeys(Opportunityname);
		t.getMasseditSavebtn1().click();
		
	}

}
