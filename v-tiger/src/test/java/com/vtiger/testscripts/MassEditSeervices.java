package com.vtiger.testscripts;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class MassEditSeervices extends BaseClass{
	@Test
	public void testCreateServices() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String Editedname=f.getExcelData("Services", 1, 1);
		//Mousehover to more dropdown
				WebElement more = driver.findElement(By.xpath("//a[.='More']"));
				Actions a=new Actions(driver);
				a.moveToElement(more).perform();
				TaskListPage t=new TaskListPage(driver);
				Reporter.log("clicking on servicelink",true);
			t.getServicesLink().click(); 
			
			Reporter.log("Selecting multiple checkbox",true);
			List<WebElement> checkbox = driver.findElements(By.xpath("//input[@onclick='check_object(this)']"));
		int count=checkbox.size();
		for(int i=1;i<count;i++) {
			WebElement cb = checkbox.get(i);
			cb.click();
		}
			Reporter.log("clicking on MassEditbutton",true);
			t.getMassEditbtn().click();
			Reporter.log("Editing Servicename",true);
			t.getServicenametxtfeild().click();
			t.getServicenametxtfeild().sendKeys(Editedname);
			t.getMasseditSavebtn1().click();
		}


}
