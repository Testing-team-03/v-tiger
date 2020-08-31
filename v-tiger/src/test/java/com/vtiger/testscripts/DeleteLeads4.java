package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class DeleteLeads4 extends BaseClass {
	@Test
	public void testDeleteleadst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("clicking on leadlink",true);
		t.getLeadsLink().click();
		Reporter.log("Selecting lead",true);
		t.getCheckbox().click();
		
		Reporter.log("Deleting lead",true);
		t.getDeletebtn().click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
}
}
