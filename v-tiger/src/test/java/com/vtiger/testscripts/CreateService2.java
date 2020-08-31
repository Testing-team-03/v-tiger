package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ServicesPage;

public class CreateService2 extends BaseClass{

	@Test
	public void createService() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{			
		
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		
		Reporter.log("opening the service page", true);
		ServicesPage s=new ServicesPage(driver);
		s.getServices().click();
	
		Reporter.log("clicking on create service button",true);
		s.getCreateservice().click();
		
		Reporter.log("click on save button", true);
		s.getSavebtn().click();
		Reporter.log("error message popup should be displayed", true);
		Alert al=driver.switchTo().alert();
		String text = al.getText();
		al.accept();
		
		System.out.println(text);
	}
}
