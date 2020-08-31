package com.vtiger.testscripts;

import java.io.IOException;

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
public class AddEventContacts4 extends BaseClass {
	@Test 
	public void testAddeventContact() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		String FirstName = f.getExcelData("Create Contact", 1, 0);
		String LastName = f.getExcelData("Create Contact", 1, 1);
		String Eventname=f.getExcelData("Create Contact", 1, 7);
		String Eventlocation=f.getExcelData("Create Contact", 1, 8);
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
		
		Reporter.log("clicking on addevent link",true);
		t.getAddeventlink().click();
		Reporter.log("creating an event",true);
		t.getEventname().sendKeys(Eventname);
		t.getEventlocation().sendKeys(Eventlocation);
		t.getStartdate().click();
		driver.findElement(By.xpath("//td[.='2']")).click();
		
		t.getMasseditSavebtn1().click();
	}
		
}
