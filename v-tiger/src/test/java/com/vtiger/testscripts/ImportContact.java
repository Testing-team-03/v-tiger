package com.vtiger.testscripts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class ImportContact extends BaseClass {
	@Test
	public void testimportContact() throws InterruptedException{
TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("Clicking on Contacts link",true);
		t.getContactsLink().click();
		
		Reporter.log("Clicking on importcontacts",true);
		t.getImportcontacts().click();
		
		 Reporter.log("selecting file",true);
		 File f=new File("./data/aaa.vcf");
		 String path=f.getAbsolutePath();
		 t.getChoosefile().sendKeys(path);
		 t.getNextbutton().click();
		 
		 Reporter.log("Importing contacts",true);
		 WebElement listbox2=driver.findElement(By.xpath("//select[@name='mapped_fields']"));
			Select s=new Select(listbox2);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			s.selectByValue("lastname");
			t.getimportbtn().click();
		 t.getFinishbtn().click();
		
	}

}
