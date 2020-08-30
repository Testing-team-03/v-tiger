package com.vtiger.testscripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class ExportServices extends BaseClass{
	@Test
	public void testCreateServices() throws InterruptedException {
		//Mousehover to more dropdown
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		TaskListPage t=new TaskListPage(driver);
		Reporter.log("clicking on servicelink",true);
	t.getServicesLink().click();
	Reporter.log("Clicking on Exportservices",true);
	t.getExportServices().click();
	Reporter.log("Exportservices",true);
	t.getExportservicesbtn().click();
	Thread.sleep(2000);
	
}
	}


