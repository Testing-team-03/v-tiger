package com.vtiger.testscripts;

import java.util.Iterator;
import java.util.Set;

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
import com.vtiger.pom.ContactPage;
import com.vtiger.pom.ServicesPage;

public class SelectContact extends BaseClass{
	@Test
	public void selectContact() throws InterruptedException
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
		
		Reporter.log("click on conatct", true);
		ContactPage c=new ContactPage(driver);
		c.getContact().click();
		
		Reporter.log("click on select contact", true);
		c.getSelectcontact().click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> i=allwh.iterator();
		String pid = i.next();//parent browser
		String cid = i.next();//child browser
		driver.switchTo().window(cid);
		
		Reporter.log("clicking on contact", true);
		String contact = c.getContact1().getText();
		c.getContact1().click();
		driver.switchTo().window(pid);
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.textToBePresentInElement(c.getSelectedcontact(), contact));
		Reporter.log("verify if the appropriate contact is selected", true);
		String contact1 = c.getSelectedcontact().getText();
		Assert.assertEquals(contact, contact1);
		
	}
}
