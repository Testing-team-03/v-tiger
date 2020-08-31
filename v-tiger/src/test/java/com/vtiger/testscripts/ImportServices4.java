package com.vtiger.testscripts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class ImportServices4 extends BaseClass{
	@Test
	public void testCreateServices() {
		//Mousehover to more dropdown
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		TaskListPage t=new TaskListPage(driver);
		Reporter.log("clicking on servicelink",true);
	t.getServicesLink().click();
	
	Reporter.log("Clicking on importServices",true);
	t.getImportservices().click();
	
	 Reporter.log("selecting file",true);
	 File f=new File("./data/aaa.vcf");
	 String path=f.getAbsolutePath();
	 t.getChoosefile().sendKeys(path);
	 t.getNextbutton().click();
	 
	 Reporter.log("Importing services",true);
	 WebElement listbox2=driver.findElement(By.xpath("//select[@name='mapped_fields']"));
		Select s=new Select(listbox2);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		s.selectByValue("servicename");
		t.getimportbtn().click();
	 t.getFinishbtn().click();
	
}

	}


