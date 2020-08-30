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

public class SearchLeads extends BaseClass{
		 @Test
		 public void testCreateLead() throws EncryptedDocumentException, InvalidFormatException, IOException {
		 	String FirstName = f.getExcelData("Create Lead", 1, 0);
		 	TaskListPage t=new TaskListPage(driver);
		 	
			Reporter.log("clicking on leadlink",true);
			t.getLeadsLink().click();
			
			Reporter.log("searching lead",true);
			t.getSearchtextfeild().sendKeys(FirstName);
			WebElement listbox1=driver.findElement(By.xpath("//select[@name='search_field']"));
			Select s=new Select(listbox1);
			s.selectByValue("firstname");
			driver.findElement(By.id("alpha_10")).click();
			t.getSearchnowbtn().click();
}
}
