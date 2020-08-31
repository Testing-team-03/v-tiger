package com.vtiger.testscripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;
@Listeners(com.vtiger.generics.ListenerImplementation.class)
public class CreateDuplicateContact4 extends BaseClass {
	@Test 
	public void testCreateDuplicateContact() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		String FirstName = f.getExcelData("Create Contact", 1, 0);
		String LastName = f.getExcelData("Create Contact", 1, 1);
		TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("Clicking on Contacts link",true);
		t.getContactsLink().click();
		
		Reporter.log("Clicking on add new button",true);
		t.getAddNewBtn().click();
		
		WebElement listbox1=driver.findElement(By.name("salutationtype"));
		Select s=new Select(listbox1);
		Thread.sleep(2000);
		s.selectByValue("Mrs.");
		
		Reporter.log("Entering Firstname",true);
		t.getFirstNametxtfeild().sendKeys(FirstName);
		
		Reporter.log("Entering Lastname",true);
		t.getLastNametxtfeild().sendKeys(LastName);
	
		Reporter.log("Clicking on Save btn",true);
		t.getCreatenewsavebtn().click();
		
		Reporter.log("clicking on duplicate button",true);
		t.getDuplicatebtn().click();
		
		Reporter.log("creating duplicate contact",true);
		WebElement listbox2=driver.findElement(By.name("salutationtype"));
		Select s1=new Select(listbox2);
		Thread.sleep(2000);
		s1.selectByValue("Mrs.");
		
		Reporter.log("Entering Firstname",true);
		t.getFirstNametxtfeild().sendKeys(FirstName);
		
		Reporter.log("Entering Lastname",true);
		t.getLastNametxtfeild().sendKeys(LastName);
	
		Reporter.log("Clicking on Save btn",true);
		t.getCreatenewsavebtn().click();
		
	}

}
