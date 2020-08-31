package com.vtiger.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ServicesPage;

public class Services extends BaseClass{
@Test
	public void services()
	{
	WebElement more = driver.findElement(By.xpath("//a[.='More']"));
	Actions a=new Actions(driver);
	Reporter.log("move cursor to more", true);
	a.moveToElement(more).perform();
	
	Reporter.log("click on services link", true);
	ServicesPage s=new ServicesPage(driver);
	s.getServices().click();
	
	String hd = "Services";
	String txt = s.getServicehd().getText();
	
	Reporter.log("verify if Services page is displayed or not", true);
	Assert.assertEquals(txt, hd);
	
	}
}
