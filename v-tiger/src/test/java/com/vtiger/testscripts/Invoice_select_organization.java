package com.vtiger.testscripts;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;

public class Invoice_select_organization extends BaseClass{
	@Test
	public void createsalesorder(){
		Homepage h=new Homepage(driver);
		Invoice_page i=new Invoice_page(driver);
		h.getMore_majoretab().click();
		h.getInvoice_link().click();
		i.getCreate_invoice_icon().click();
		
		i.getOrga_select_icon().click();
		String parentwh = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for(String wh:all){
		if(!(wh.equals(parentwh))){
			driver.switchTo().window(wh);
			}
		}
		i.getOrga_name().click();
		Alert a = driver.switchTo().alert();
		a.accept();
		for(String wh:all){
			if(wh.equals(parentwh)){
				driver.switchTo().window(wh);
				}
			}

}}
