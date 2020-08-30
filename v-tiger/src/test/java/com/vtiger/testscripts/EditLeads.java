package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class EditLeads extends BaseClass {
@Test
public void testEditLeads() throws EncryptedDocumentException, InvalidFormatException, IOException {
	String EditedLastName = f.getExcelData("Create Lead", 1, 3);
	TaskListPage t=new TaskListPage(driver);
	
	Reporter.log("clicking on leadlink",true);
	t.getLeadsLink().click();
	
	Reporter.log("Selecting lead",true);
	t.getCheckbox().click();
	
	Reporter.log("clicking on edit link",true);
	t.getEditlink().click();
	
	Reporter.log("clearing old name",true);
	t.getLastNametxtfeild().clear();
	
	Reporter.log("editing lastname",true);
	t.getLastNametxtfeild().sendKeys(EditedLastName);
	t.getCreatenewsavebtn().click();
	
}
}


