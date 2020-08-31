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
import com.vtiger.pom.QuotePage;
import com.vtiger.pom.ServicesPage;

public class CreateQuote1 extends BaseClass{

	@Test
	public void createInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	WebElement more = driver.findElement(By.xpath("//a[.='More']"));
	Actions a=new Actions(driver);
	a.moveToElement(more).perform();
	
	Reporter.log("opening the service page", true);
	ServicesPage s=new ServicesPage(driver);
	s.getServices().click();
	
	Reporter.log("clicking on the service name", true);
	s.getServiceName().click();
	
	Reporter.log("clicking on create quote link", true);
	s.getCreateQuotelink().click();
	
	Reporter.log("enter the subject", true);
	String subject = f.getExcelData("Quote", 2, 1);
	QuotePage qp=new QuotePage(driver);
	qp.getSubject().sendKeys(subject);
	
	Reporter.log("clicking on organization icon", true);
	qp.getOrganizationName().click();
	
	Thread.sleep(2000);
	Set<String> allwh = driver.getWindowHandles();
	Iterator<String> i=allwh.iterator();
	String pid = i.next();//parent browser
	String cid = i.next();//child browser
	driver.switchTo().window(cid);
	
	Reporter.log("clicking on apporpriate organization name", true);
	qp.getOrganizationName1().click();
	driver.switchTo().alert().accept();
	driver.switchTo().window(pid);
	
	Reporter.log("enter billing address", true);
	String billingadd = f.getExcelData("Invoice", 2, 2);
	Thread.sleep(5000);
	qp.getBillingAdd().sendKeys(billingadd);
	Reporter.log("enter shipping address", true);
	String shippingadd = f.getExcelData("Invoice", 2, 3);
	qp.getShippingAdd().sendKeys(shippingadd);
	
	Thread.sleep(2000);
	Reporter.log("click on cancel button", true);
	qp.getCancelbtn().click();
	Thread.sleep(5000);
	s.getMorelink().click();
	
	Reporter.log("click on Quote link", true);
	qp.getQuotelink().click();
	
	Reporter.log("verify if the Quote is created or not", true);
	String subject1 = qp.getQuote().getText();
	Assert.assertNotEquals(subject, subject1);
	}
	
}
