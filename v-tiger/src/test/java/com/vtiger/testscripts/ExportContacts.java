package com.vtiger.testscripts;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class ExportContacts extends BaseClass{
	@Test
	public void testExportContact() throws InterruptedException {
TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("Clicking on Contacts link",true);
		t.getContactsLink().click();
		Reporter.log("Clicking on Exportcontacts",true);
		t.getExportContacts().click();
		Reporter.log("Exportingcontacts",true);
		t.getExportcontactbtn().click();
		Thread.sleep(2000);
	}
}
