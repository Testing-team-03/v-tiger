package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class EditOpportunities4 extends BaseClass{
	@Test 
	public void testEditOpportunities() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String Editedname = f.getExcelData("Opportunities", 1, 1);
		TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("Clicking on Opportunities link",true);
		t.getOpportunitieslink().click();
		
		
		Reporter.log("Selecting opportunity",true);
		t.getCheckbox().click();
		
		Reporter.log("clicking on edit link",true);
		t.getEditlink().click();
		
		Reporter.log("clearing old name",true);
		t.getOpportunityname().clear();
		
		Reporter.log("editing name",true);
		t.getOpportunityname().sendKeys(Editedname);
		t.getCreatenewsavebtn().click();
		
	}
}
