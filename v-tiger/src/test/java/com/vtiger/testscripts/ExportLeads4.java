package com.vtiger.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.TaskListPage;

public class ExportLeads4 extends BaseClass{
		@Test
		public void testExportLead() throws InterruptedException {
	TaskListPage t=new TaskListPage(driver);
			
			Reporter.log("Clicking on Leads link",true);
			t.getLeadsLink().click();
			Reporter.log("Clicking on Exportleads",true);
			t.getExportLeads().click();
			Reporter.log("Exportingleads",true);
			t.getExportLeadsbtn().click();
			Thread.sleep(2000);
		}
	}


