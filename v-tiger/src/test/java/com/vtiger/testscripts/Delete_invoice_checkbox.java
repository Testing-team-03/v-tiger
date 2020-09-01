package com.vtiger.testscripts;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;

public class Delete_invoice_checkbox extends BaseClass{
	@Test
	public void deleteinvoice() throws InterruptedException{
		Reporter.log("deleting invoice",true);
	Homepage h=new Homepage(driver);
	Invoice_page i=new Invoice_page(driver);
	h.getMore_majoretab().click();
	h.getInvoice_link().click();
	i.getDelete_button().click();
	String text = "Please select at least one entity";
	Alert a = driver.switchTo().alert();
	String actual_text = a.getText();
	a.accept();
	if(actual_text.equals(text)){
		Reporter.log("Alert popup is displayed",true);
	}

}
}