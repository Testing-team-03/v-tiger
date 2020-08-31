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
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class CreateSalesOrder4 extends BaseClass{
	@Test
	public void testCreateSalesorder() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String Subject=f.getExcelData("Services", 1, 2);
		String Address=f.getExcelData("Services", 1, 3);
		//Mousehover to more dropdown
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		TaskListPage t=new TaskListPage(driver);
		Reporter.log("clicking on servicelink",true);
	t.getServicesLink().click();
	 
	Reporter.log("selecting service",true);
	driver.findElement(By.xpath("(//a[@title='Services'])[1]")).click();
	
	Reporter.log("creating salesorder",true);
	t.getSalesorder().click();
	t.getSubjecttextfeild().sendKeys(Subject);
	driver.findElement(By.xpath("(//img[@title='Select'])[4]")).click();
	Set<String> allwh = driver.getWindowHandles();
	Iterator<String> i = allwh.iterator();
	String parentid = i.next();
	String Childid = i.next();
	driver.switchTo().window(Childid);
	driver.findElement(By.xpath("//a[.='abc']")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Alert a2=driver.switchTo().alert();
	a2.accept();
	driver.switchTo().window(parentid);
	t.getBillingadress().sendKeys(Address);
	t.getAdressradiobtn().click();
	
	t.getMasseditSavebtn1().click();
}

}
