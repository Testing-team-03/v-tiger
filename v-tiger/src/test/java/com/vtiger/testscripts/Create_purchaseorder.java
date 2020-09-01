package com.vtiger.testscripts;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.generics.FileLib;
import com.vtiger.pom.Createnew_purchaseorder;
import com.vtiger.pom.Homepage;

public class Create_purchaseorder extends BaseClass{
	@Test
	public void createpurchaseorder() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Reporter.log("create purchase order",true);
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();
		h.getPurchaseorder_link().click();
		Createnew_purchaseorder c=new Createnew_purchaseorder(driver);
		c.getCreate_purchaseorder_icon().click();
		FileLib f=new FileLib();
		String data = f.getExcelData("cmr",6,0);
		c.getSubject_textfield().sendKeys(data);
		c.getVerdor_name_icon().click();
		String parentwh = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for(String wh:all){
		if(!(wh.equals(parentwh))){
			driver.switchTo().window(wh);
			
		}
		}
		c.getVendor_name().click();
		for(String wh:all){
			if((wh.equals(parentwh))){
				driver.switchTo().window(wh);	
			}
			}
		String data1 = f.getExcelData("cmr",7,0);
		c.getBilling_address().sendKeys(data1);
		String data2 = f.getExcelData("cmr",8,0);
		c.getShipping_address().sendKeys(data2);
		c.getProducts_icon().click();
		String parentwh1 = driver.getWindowHandle();
		Set<String> all1 = driver.getWindowHandles();
		for(String wh:all1){
			if(!(wh.equals(parentwh1))){
				driver.switchTo().window(wh);	
			}
			}
		c.getProduct_name().click();
		for(String wh:all1){
			if((wh.equals(parentwh1))){
				driver.switchTo().window(wh);	
			}
			
			c.getQuantity().sendKeys("5");
			}
		
		c.getSave_button().click();
		Reporter.log("purchase order got created",true);
		
	}

}
