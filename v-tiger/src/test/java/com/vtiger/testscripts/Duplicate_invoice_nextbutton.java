package com.vtiger.testscripts;

import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;

public class Duplicate_invoice_nextbutton extends BaseClass{
	@Test
	public void duplicatevoice() throws InterruptedException{
	Homepage h=new Homepage(driver);
	Invoice_page i=new Invoice_page(driver);
	h.getMore_majoretab().click();
	h.getInvoice_link().click();
	i.getSubject_list().click();
	i.getNext_button().click();
	i.getDuplicate_button().click();
	i.getSave2_button().click();

}
}