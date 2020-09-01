package com.vtiger.testscripts;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.generics.FileLib;
import com.vtiger.pom.Createnew_purchaseorder;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Purchaseorder_page;
import com.vtiger.pom.Vendorpage;

public class Add_purchaseorder extends BaseClass {
	@Test
	public void add_purchase() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Reporter.log("Add purchase order",true);
		Purchaseorder_page p=new Purchaseorder_page(driver);
		Createnew_purchaseorder c=new Createnew_purchaseorder(driver);
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();
		h.getPurchaseorder_link().click();
		p.getVentor_link().click();
		Vendorpage v=new Vendorpage(driver);
		v.getMore_info_link().click();;
		v.getArrow_purchase_order().click();
		v.getAdd_purchaseorder_button().click();
		FileLib f=new FileLib();
		String data = f.getExcelData("cmr",3,0);
	    c.getSubject_textfield().sendKeys(data);
	    String data1 = f.getExcelData("cmr",4,0);
		c.getBilling_address().sendKeys(data1);
	    String data2= f.getExcelData("cmr",5,0);
		c.getShipping_address().sendKeys(data2);
		c.getProducts_icon().click();
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for(String wh:all){
			if(!(wh.equals(parent))){
				driver.switchTo().window(wh);
			}
		}
		c.getProduct_name().click();
		for(String wh:all){
			if(wh.equals(parent)){
				driver.switchTo().window(wh);
			}
		}
		
		c.getQuantity().sendKeys("9");
		c.getSave_button().click();
		h.getMore_majoretab().click();
		h.getPurchaseorder_link().click();
		String actual_tetx = "book";
	List<WebElement> subjects = driver.findElements(By.xpath("//a[@title='Purchase Order']"));
	int count=subjects.size();
	for(int i=0;i<count;i++){
		String text = subjects.get(i).getText();
		if(text.equals(actual_tetx)){
			Reporter.log("purchase order added",true);
		}
	}
	
		
	}
	


}
