package com.vtiger.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
//import com.vtiger.pom.Createnew_purchaseorder;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Purchaseorder_page;

public class Duplicate_purchaseorder extends BaseClass{
	@Test
	public void duplicate(){
		Reporter.log("duplicating purchase order",true);
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();
		h.getPurchaseorder_link().click();
		Purchaseorder_page p=new Purchaseorder_page(driver);
		p.getSubject().click();
		p.getDuplicate_button().click();
		p.getSave_button().click();
		String text = p.getPurchaseorder_info_page().getText();
		if(text.equalsIgnoreCase("[ PO6 ] hbi - Purchase Order Information")){
			System.out.println("duplicate purchase order is created");
		}
		Reporter.log("purchase order got duolicate",true);
	}

}
