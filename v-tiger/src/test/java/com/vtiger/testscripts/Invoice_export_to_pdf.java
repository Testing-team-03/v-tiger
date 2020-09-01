package com.vtiger.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;

public class Invoice_export_to_pdf extends BaseClass{
	@Test
	public void exporttopdf() throws AWTException {
		Reporter.log("Exporting invoice to pdf",true);
	Homepage h=new Homepage(driver);
	Invoice_page i=new Invoice_page(driver);
	h.getMore_majoretab().click();
	h.getInvoice_link().click();
	i.getSubject_list().click();
	i.getExport_to_pdf().click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_ALT);
	Reporter.log("invoice exported to pdf",true);
	

}
}