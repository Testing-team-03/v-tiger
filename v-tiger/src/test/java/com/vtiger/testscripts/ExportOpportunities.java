package com.vtiger.testscripts;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class ExportOpportunities  extends BaseClass{
	@Test 
	public void testCreateOpportunities() throws InterruptedException  {
		TaskListPage t=new TaskListPage(driver);
		
		Reporter.log("Clicking on Opportunities link",true);
		t.getOpportunitieslink().click();
		Reporter.log("Clicking on Exportopportunities",true);
		t.getExportOpportunities().click();
		Reporter.log("Exportingopportunities",true);
		t.getExportopportunitiesbtn().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}

}
