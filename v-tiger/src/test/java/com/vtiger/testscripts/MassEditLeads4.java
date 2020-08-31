package com.vtiger.testscripts;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class MassEditLeads4 extends BaseClass {
	@Test
	public void testMassEditContact() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String EditedLastName = f.getExcelData("Create Lead", 1, 3);
		TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("clicking on leadlink",true);
		t.getLeadsLink().click();
		Reporter.log("Selecting multiple checkbox",true);
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@onclick='check_object(this)']"));
	int count=checkbox.size();
	for(int i=1;i<count;i++) {
		WebElement cb = checkbox.get(i);
		cb.click();
	}
		Reporter.log("clicking on MassEditbutton",true);
		t.getMassEditbtn().click();
		Reporter.log("Editing lastname",true);
		t.getLastnamecheckbox().click();
		t.getLastNametxtfeild().sendKeys(EditedLastName);
		t.getMasseditSavebtn1().click();
	}
}
