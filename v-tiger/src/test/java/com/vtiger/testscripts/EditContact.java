package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class EditContact extends BaseClass {
@Test
public void testEditContact() throws EncryptedDocumentException, InvalidFormatException, IOException {
	String EditedLastName = f.getExcelData("Create Contact", 1, 4);
	TaskListPage t=new TaskListPage(driver);
	
	Reporter.log("Clicking on Contacts link",true);
	t.getContactsLink().click();
	
	Reporter.log("Selecting contact",true);
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
