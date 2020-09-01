
package com.vtiger.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Sales_order_info_page;
import com.vtiger.pom.Salesorder_page;

public class Sales_create_pdf extends BaseClass{
	@Test
	public void createpdf() throws AWTException{
		Reporter.log("sales order to pdf",true);
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();
		h.getSalesorder_link().click();
		Salesorder_page s=new Salesorder_page(driver);
		s.getSubject_list().click();
		Sales_order_info_page s2=new Sales_order_info_page(driver);
		s2.getExport_pdf_link().click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		Reporter.log("sales order is exported to pdf",true);
	}
}
