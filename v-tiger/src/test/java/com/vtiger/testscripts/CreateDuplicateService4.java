package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;
@Listeners(com.vtiger.generics.ListenerImplementation.class)
public class CreateDuplicateService4 extends BaseClass{
	@Test
	public void testCreateServices() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String Servicename=f.getExcelData("Services", 1, 0);
		//Mousehover to more dropdown
				WebElement more = driver.findElement(By.xpath("//a[.='More']"));
				Actions a=new Actions(driver);
				a.moveToElement(more).perform();
				TaskListPage t=new TaskListPage(driver);
				Reporter.log("clicking on servicelink",true);
			t.getServicesLink().click();
			
			Reporter.log("Creating service",true);
			t.getAddservicesbtn().click();
			t.getServicenametxtfeild().sendKeys(Servicename);
			t.getMasseditSavebtn1().click();
			
			Reporter.log("clicking on duplicate button",true);
			t.getDuplicatebtn().click();
			
			Reporter.log("creating duplicate service",true);
			
			t.getServicenametxtfeild().sendKeys(Servicename);
		
			Reporter.log("Clicking on Save btn",true);
			t.getMasseditSavebtn1().click();
			
			
			}

}
