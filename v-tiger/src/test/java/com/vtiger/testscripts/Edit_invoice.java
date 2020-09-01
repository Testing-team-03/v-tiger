package com.vtiger.testscripts;

import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;

public class Edit_invoice extends BaseClass{
	@Test
	public void editinvoice(){
			Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();
			h.getInvoice_link().click();
			Invoice_page i=new Invoice_page(driver);
			i.getSubject_list().click();
			i.getEdit_button().click();
			i.getCustomerno_textbox().sendKeys("489567");
			i.getSave_button().click();

}
}