package com.vtiger.testscripts;

import java.util.Set;

import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;

public class Invoice_select_salesorder extends BaseClass {
	@Test
	public void selectsalesorder(){
		Homepage h=new Homepage(driver);
		Invoice_page i=new Invoice_page(driver);
		h.getMore_majoretab().click();
		h.getInvoice_link().click();
		i.getCreate_invoice_icon().click();
		i.getSelect_sales_order().click();
		String parentwh = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for(String wh:all){
		if(!(wh.equals(parentwh))){
			driver.switchTo().window(wh);
			}
		}
		i.getSales_order_subject().click();
		for(String wh:all){
			if(wh.equals(parentwh)){
				driver.switchTo().window(wh);
				}
			}
		i.getCancel_button().click();
		System.out.println("Sales order got selected");
		
}
	
}