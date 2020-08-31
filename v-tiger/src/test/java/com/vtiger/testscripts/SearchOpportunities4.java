package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class SearchOpportunities4 extends BaseClass{
	 @Test
	 public void testSearchOpportunities()throws EncryptedDocumentException, InvalidFormatException, IOException {
	 	String OpportunityName = f.getExcelData("Opportunities", 1, 0);
	 	TaskListPage t=new TaskListPage(driver);
	 	
		Reporter.log("clicking on Opportunitylink",true);
		t.getOpportunitieslink().click();
		
		Reporter.log("searching opportunities",true);
		t.getSearchtextfeild().sendKeys(OpportunityName);
		WebElement listbox1=driver.findElement(By.xpath("//select[@name='search_field']"));
		Select s=new Select(listbox1);
		s.selectByValue("potentialname");
		driver.findElement(By.id("alpha_19")).click();
		t.getSearchnowbtn().click();
	 }

}
