package com.vtiger.testscripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.LeadPage;
import com.vtiger.pom.ServicesPage;

public class SelectLeads extends BaseClass{

	@Test
	public void selectLeads() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	WebElement more = driver.findElement(By.xpath("//a[.='More']"));
	Actions a=new Actions(driver);
	a.moveToElement(more).perform();
	
	Reporter.log("opening the service page", true);
	ServicesPage s=new ServicesPage(driver);
	s.getServices().click();
	
	Reporter.log("clicking on the service name", true);
	s.getServiceName().click();
	
	Reporter.log("click on more information link", true);
	s.getMoreinfolink().click();
	
	Reporter.log("click on leads", true);
	s.getLeads().click();
	s.getSelectleads().click();
	
	Set<String> allwh = driver.getWindowHandles();
	Iterator<String> i=allwh.iterator();
	String pid = i.next();//parent browser
	String cid = i.next();//child browser
	driver.switchTo().window(cid);
	
	Reporter.log("clicking on apporpriate lead", true);
	LeadPage l=new LeadPage(driver);
	String lead = l.getLead().getText();
	l.getLead().click();
	driver.switchTo().window(pid);
	
	Reporter.log("verify if the appropriate lead is selected", true);
	String lead1 = l.getSelectedlead().getText();
	Assert.assertEquals(lead, lead1);
	}

}
