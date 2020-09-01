package com.vtiger.testscripts;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;

public class Delete_invoice_nextbutton extends BaseClass{
	@Test
	public void deleteinvoice() {
		Reporter.log("deleting invoice going to next button",true);
	Homepage h=new Homepage(driver);
	Invoice_page i=new Invoice_page(driver);
	h.getMore_majoretab().click();
	h.getInvoice_link().click();
	i.getSubject_list().click();
	i.getNext_button().click();
	i.getDelete_button().click();
	Alert a = driver.switchTo().alert();
	a.accept();
	Reporter.log("invoice got deleted",true);

}}
