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
import com.vtiger.pom.PurchaseOrderPage;
import com.vtiger.pom.ServicesPage;

public class CreatePurchaseOrder extends BaseClass{
	@Test
	public void createPurchaseOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		
		Reporter.log("opening the service page", true);
		ServicesPage s=new ServicesPage(driver);
		s.getServices().click();
		
		Reporter.log("clicking on the service name", true);
		s.getServiceName().click();
		
		Reporter.log("clicking on create purchase order", true);
		s.getCreatePurchaseorderlink().click();
		PurchaseOrderPage p=new PurchaseOrderPage(driver);
		Reporter.log("click on vendor name icon", true);
		p.getVendorName().click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> i=allwh.iterator();
		String pid = i.next();//parent browser
		String cid = i.next();//child browser
		driver.switchTo().window(cid);
		Reporter.log("clicking on apporpriate vendor", true);
		p.getVendorName1().click();
		driver.switchTo().window(pid);
		Reporter.log("enter the subject", true);
		String subject = f.getExcelData("PurchaseOrder", 1, 1);
		p.getSubject().sendKeys(subject);
		Reporter.log("enter billing address", true);
		String billingadd = f.getExcelData("PurchaseOrder", 1, 2);
		p.getBillingAdd().sendKeys(billingadd);
		Reporter.log("enter shipping address", true);
		String shippingadd = f.getExcelData("PurchaseOrder", 1, 3);
		p.getShippingAdd().sendKeys(shippingadd);
		p.getSavebtn().click();
		
		s.getMorelink().click();
		
		Reporter.log("click on purchase order link", true);
		p.getPurchaseOrderlink().click();
		
		Reporter.log("verify if the purchase order is created or not", true);
		String subject1 = p.getPurchaseOrder().getText();
		Assert.assertEquals(subject, subject1);

		
	}
}
