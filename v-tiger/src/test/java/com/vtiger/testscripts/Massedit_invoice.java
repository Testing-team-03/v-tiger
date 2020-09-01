package com.vtiger.testscripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;

public class Massedit_invoice extends BaseClass{
	@Test
	public void massedit_invoice(){
		Homepage h=new Homepage(driver);
	h.getMore_majoretab().click();
		h.getInvoice_link().click();
		Invoice_page i=new Invoice_page(driver);
		i.getMass_edit_button().click();
		String text = "Please select at least one entity";
		Alert a = driver.switchTo().alert();
		String actual_text = a.getText();
		if(actual_text.equals(text)){
			System.out.println("Error message is displayed");
		}

}
}