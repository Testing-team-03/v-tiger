package com.vtiger.testscripts;

import java.io.IOException;



import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class CreateLeads extends BaseClass{
@Test
public void testCreateLead() throws EncryptedDocumentException, InvalidFormatException, IOException {
	String FirstName = f.getExcelData("Create Lead", 1, 0);
	String LastName = f.getExcelData("Create Lead", 1, 1);
	String Company = f.getExcelData("Create Lead", 1, 2);
	TaskListPage t=new TaskListPage(driver);
	Reporter.log("clicking on leadlink",true);
	t.getLeadsLink().click();
	Reporter.log("clickin on addnew button",true);
	t.getPlusbtn().click();
	Reporter.log("creating lead",true);
	t.getFirstNametxtfeild().sendKeys(FirstName);
	t.getLastNametxtfeild().sendKeys(LastName);
	t.getCompanyName().sendKeys(Company);
	t.getCreatenewsavebtn().click();
	
}
}
