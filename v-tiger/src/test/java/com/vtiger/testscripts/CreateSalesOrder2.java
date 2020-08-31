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
import com.vtiger.pom.SalesOrderPage;
import com.vtiger.pom.ServicesPage;

public class CreateSalesOrder2 extends BaseClass{
	
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
		
		Reporter.log("clicking on create sales order", true);
		s.getCreateSalesOrderlink().click();
		SalesOrderPage SO=new SalesOrderPage(driver);
		
		Reporter.log("enter the subject", true);
		String subject = f.getExcelData("SalesOrder", 1, 1);
		SO.getSubject().sendKeys(subject);
				
		Reporter.log("Click on Organistion icon", true);
		SO.getOrganizationName().click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> i=allwh.iterator();
		String pid = i.next();//parent browser
		String cid = i.next();//child browser
		driver.switchTo().window(cid);
		
		Reporter.log("clicking on apporpriate organization name", true);
		SO.getOrganizationName1().click();
		driver.switchTo().alert().accept();
		driver.switchTo().window(pid);
		
		Reporter.log("enter shipping address", true);
		String shippingadd = f.getExcelData("SalesOrder", 1, 3);
		SO.getShippingAdd().sendKeys(shippingadd);

		Thread.sleep(2000);
		Reporter.log("click on save button", true);
		SO.getSavebtn().click();
		
		Reporter.log("error message should be displayed", true);
		Alert al=driver.switchTo().alert();
		String error = al.getText();
		System.out.println(error);
		al.accept();
	}
}
