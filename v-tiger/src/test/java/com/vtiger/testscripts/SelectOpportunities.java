package com.vtiger.testscripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ServicesPage;

public class SelectOpportunities extends BaseClass{

	@Test
	public void selectOpportunities() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
	
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollTo(0,5000)");
	
	Reporter.log("click on opportunities", true);
	s.getOpportunities().click();
	s.getSelectopportunities().click();
	
	Set<String> allwh = driver.getWindowHandles();
	Iterator<String> i=allwh.iterator();
	String pid = i.next();//parent browser
	String cid = i.next();//child browser
	driver.switchTo().window(cid);
	
	Reporter.log("clicking on apporpriate opportunities", true);
	Thread.sleep(2000);
	String txt = s.getOpportunity().getText();
	s.getOpportunity().click();
	driver.switchTo().window(pid);
	
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.textToBePresentInElement(s.getSelectedopportunity(),txt));
	
	Reporter.log("verify if the appropriate opportunity is selected or not", true);
	String txt1 = s.getSelectedopportunity().getText();
	Assert.assertEquals(txt1, txt);
	}
}
