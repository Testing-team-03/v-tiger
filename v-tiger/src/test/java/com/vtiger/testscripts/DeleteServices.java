package com.vtiger.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class DeleteServices extends BaseClass{
	@Test
	public void testCreateServices()  {
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		TaskListPage t=new TaskListPage(driver);
		Reporter.log("clicking on servicelink",true);
	t.getServicesLink().click();
	
	Reporter.log("Selecting service",true);
	t.getCheckbox().click();
	
	Reporter.log("Deleting service",true);
	t.getDeletebtn().click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert a1=driver.switchTo().alert();
	a1.accept();
	
	
}
	
}
