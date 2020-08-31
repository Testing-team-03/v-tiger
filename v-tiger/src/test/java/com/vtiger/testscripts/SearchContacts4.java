package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class SearchContacts4 extends BaseClass{
	
	@Test 
	public void testCreateContact() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		String FirstName = f.getExcelData("Create Contact", 1, 0);

				TaskListPage t=new TaskListPage(driver);
			Reporter.log("Clicking on Contacts link",true);
			t.getContactsLink().click();
			
			Reporter.log("searching contact",true);
			t.getSearchtextfeild().sendKeys(FirstName);
			WebElement listbox1=driver.findElement(By.xpath("//select[@name='search_field']"));
			Select s=new Select(listbox1);
			s.selectByValue("firstname");
			driver.findElement(By.id("alpha_19")).click();
			t.getSearchnowbtn().click();
			/*WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(" Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM"));*/
}
}