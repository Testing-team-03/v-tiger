package com.vtiger.testscripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class CreateInvoice4 extends BaseClass{
	@Test 
	public void testCreateInvoiceOpportunities() throws EncryptedDocumentException, InvalidFormatException, IOException{
		String Subject=f.getExcelData("Opportunities", 2, 2);
		String Opportunityname = f.getExcelData("Opportunities", 1, 0);
		String Billingaddress=f.getExcelData("Opportunities", 2, 3);
		String Quantity=f.getExcelData("Opportunities", 2, 4);
		TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("Clicking on Opportunities link",true);
		t.getOpportunitieslink().click();
        t.getAddopportunitybtn().click();
		
		Reporter.log("Creating Opportunity",true);
		t.getOpportunityname().sendKeys(Opportunityname);
		
		WebElement listbox1=driver.findElement(By.xpath("//select[@name='related_to_type']"));
		Select s=new Select(listbox1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s.selectByValue("Contacts");
		
		t.getSelectbtn1().click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> i = allwh.iterator();
		String parentid = i.next();
		String Childid = i.next();
		driver.switchTo().window(Childid);
		t.getSelectContact().click();
		driver.switchTo().window(parentid);
		t.getMasseditSavebtn1().click();
		
		Reporter.log("creating invoice",true);
		t.getCreateinvoiceLink().click();
		t.getSubjecttextfeild().sendKeys(Subject);
		driver.findElement(By.xpath("(//img[@title='Select'])[3]")).click();
		Set<String> allwh2 = driver.getWindowHandles();
		Iterator<String> i2 = allwh2.iterator();
		String parentid2 = i2.next();
		String Childid2 = i2.next();
		driver.switchTo().window(Childid2);
		t.getSelectOrganaisation().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.switchTo().window(parentid2);
		t.getBillingadress().sendKeys(Billingaddress);
		t.getAdressradiobtn().click();
		t.getSearchicon().click();
		Set<String> allwh1 = driver.getWindowHandles();
		Iterator<String> i1 = allwh1.iterator();
		String parentid1 = i1.next();
		String Childid1 = i1.next();
		driver.switchTo().window(Childid1);
		t.getSelectProduct().click();
		driver.switchTo().window(parentid1);
		t.getQuantity().sendKeys(Quantity);
		t.getMasseditSavebtn1().click();
	}
}
		
		
		
		
