package com.vtiger.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class DeleteContact  extends BaseClass {
	@Test
	public void testDeleteContact() throws InterruptedException {
		TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("Clicking on Contacts link",true);
		t.getContactsLink().click();
		
		Reporter.log("Selecting contact",true);
		t.getCheckbox().click();
		
		Reporter.log("Deleting Contact",true);
		t.getDeletebtn().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Alert a=driver.switchTo().alert();
		a.accept();
		
		
}
}