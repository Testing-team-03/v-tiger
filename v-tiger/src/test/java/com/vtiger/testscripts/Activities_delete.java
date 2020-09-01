package com.vtiger.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Purchaseorder_info_page;

public class Activities_delete extends BaseClass {
	@Test
	public void delete(){
		Reporter.log("deleting one activity",true);
		Purchaseorder_info_page p=new Purchaseorder_info_page(driver);
		p.getDelete_link().click();
		Reporter.log("one activities got deleted",true);
		


	}

}
