package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class CreateServices extends BaseClass{
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
	
	}

}
