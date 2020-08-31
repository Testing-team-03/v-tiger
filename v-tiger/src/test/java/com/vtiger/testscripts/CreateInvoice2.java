package com.vtiger.testscripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.InvoicePage;
import com.vtiger.pom.ServicesPage;

public class CreateInvoice2 extends BaseClass{

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
	
	Reporter.log("clicking on create invoice link", true);
	s.getCreateInvoicelink().click();
	InvoicePage invoice=new InvoicePage(driver);
	
	Reporter.log("clicking on organization icon", true);
	invoice.getOrganizationName().click();
	
	Thread.sleep(2000);
	Set<String> allwh = driver.getWindowHandles();
	Iterator<String> i=allwh.iterator();
	String pid = i.next();//parent browser
	String cid = i.next();//child browser
	driver.switchTo().window(cid);
	
	Reporter.log("clicking on apporpriate organization name", true);
	invoice.getOrganizationName1().click();
	driver.switchTo().alert().accept();
	driver.switchTo().window(pid);
	
	Thread.sleep(2000);
	Reporter.log("click on save button", true);
	invoice.getSavebtn().click();
	Reporter.log("error message should be displayed", true);
	Alert al=driver.switchTo().alert();
	String error = al.getText();
	System.out.println(error);
	al.accept();
	
	}
}
