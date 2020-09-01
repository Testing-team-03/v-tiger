package com.vtiger.testscripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.generics.FileLib;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;


public class Create_invoice extends BaseClass{
	@Test
	public void createinvoice() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Reporter.log("create invoice",true);
		Homepage h=new Homepage(driver);
		Invoice_page i=new Invoice_page(driver);
		h.getMore_majoretab().click();
		h.getInvoice_link().click();
		i.getCreate_invoice_icon().click();
		FileLib f=new FileLib();
		String data = f.getExcelData("cmr",6,0);
		i.getSubject_textfield().sendKeys(data);
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
		String data1 = f.getExcelData("cmr", 7, 0);
		i.getBilling_address().sendKeys(data1);
		String data2 = f.getExcelData("cmr", 8, 0);
		i.getShipping_address().sendKeys(data2);
		i.getProduct_icon().click();
		String parentwh1 = driver.getWindowHandle();
		Set<String> all1 = driver.getWindowHandles();
		for(String wh:all1){
			if(!(wh.equals(parentwh1))){
				driver.switchTo().window(wh);
				}
			}
		i.getProduct_name().click();
		for(String wh:all1){
			if(wh.equals(parentwh1)){
				driver.switchTo().window(wh);
				}
			}
		String data3 = f.getExcelData("cmr", 9, 0);
		i.getQuantity_textbox().sendKeys(data3);
		i.getSave_button().click();
		Reporter.log("invoice got created",true);

}
}