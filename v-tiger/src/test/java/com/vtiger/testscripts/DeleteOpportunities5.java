package com.vtiger.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class DeleteOpportunities5 extends BaseClass{
		@Test 
		public void testDeleteOpportunities()  {
			
			TaskListPage t=new TaskListPage(driver);
			
			Reporter.log("Clicking on Opportunities link",true);
			t.getOpportunitieslink().click();
			
			Reporter.log("Selecting opportunity",true);
			t.getCheckbox().click();
			
			Reporter.log("Deleting opportunity",true);
			t.getDeletebtn().click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Alert a=driver.switchTo().alert();
			a.accept();
		}
}

