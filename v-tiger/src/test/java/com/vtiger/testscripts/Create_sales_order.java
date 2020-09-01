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
import com.vtiger.pom.Create_new_salesorder_page;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Salesorder_page;

public class Create_sales_order extends BaseClass{
	@Test
	public void createsalesorder() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Reporter.log("create sales order",true);
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();
		h.getSalesorder_link().click();
		Salesorder_page s=new Salesorder_page(driver);
		s.getCreate_salesorder_icon().click();
		Create_new_salesorder_page c=new Create_new_salesorder_page(driver);
		FileLib f=new FileLib();
		String data = f.getExcelData("cmr",9,0);
		c.getSubject_textfield().sendKeys(data);
		c.getOrga_name_icon().click();
		String parentwh = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for(String wh:all){
		if(!(wh.equals(parentwh))){
			driver.switchTo().window(wh);
			}
		}
		c.getOrga_name_link().click();
		Alert a = driver.switchTo().alert();
		a.accept();
		for(String wh:all){
			if(wh.equals(parentwh)){
				driver.switchTo().window(wh);
				}
			}
		String data1 = f.getExcelData("cmr", 3, 0);
		String data2 = f.getExcelData("cmr", 4, 0);
		c.getBilling_address_textfield().sendKeys(data1);
		c.getShipping_address_textfield().sendKeys(data2);
		c.getProduct_icon().click();
		String parentwh1 = driver.getWindowHandle();
		Set<String> all1 = driver.getWindowHandles();
		for(String wh:all1){
			if(!(wh.equals(parentwh1))){
				driver.switchTo().window(wh);
				}
			}
		c.getProduct_name_link().click();
		for(String wh:all1){
			if(wh.equals(parentwh1)){
				driver.switchTo().window(wh);
				}
			}
		
		c.getQuantity_txfield().sendKeys("8");
		c.getSave_button().click();
		Reporter.log("sales order created",true);
	}

}
