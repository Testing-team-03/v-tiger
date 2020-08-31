package com.vtiger.testscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class CreateContact4 extends BaseClass{
	@Test 
	public void testCreateContact() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		String FirstName = f.getExcelData("Create Contact", 1, 0);
		String LastName = f.getExcelData("Create Contact", 1, 1);
		String title = f.getExcelData("Create Contact", 1, 2);
		String department = f.getExcelData("Create Contact", 1, 3);
		String Email=f.getExcelData("Create Contact", 1,5);
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
		
		Reporter.log("Selecting Organaisation",true);
		t.getSelectbtn1().click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> i = allwh.iterator();
		String parentid = i.next();
		String Childid = i.next();
		driver.switchTo().window(Childid);
		driver.findElement(By.xpath("//a[.='abc']")).click();
		driver.switchTo().window(parentid);
		
		WebElement listbox2=driver.findElement(By.xpath("//select[@name='leadsource']"));
		Select s1=new Select(listbox2);
		Thread.sleep(2000);
		s1.selectByValue("Existing Customer");
		
		Reporter.log("Entering title",true);
		t.getTitle().sendKeys(title);
		
		Reporter.log("Entering Department",true);
		t.getDepartment().sendKeys(department);
		
		Reporter.log("Entering E-mail",true);
		t.getEmailtextfeild().sendKeys(Email);
		
		Reporter.log("Clicking on Save btn",true);
		t.getCreatenewsavebtn().click();
	}

}
