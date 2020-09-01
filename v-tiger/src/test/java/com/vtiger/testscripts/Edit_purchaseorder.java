package com.vtiger.testscripts;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.generics.FileLib;
import com.vtiger.pom.Createnew_purchaseorder;
import com.vtiger.pom.Homepage;

public class Edit_purchaseorder extends BaseClass {
	@Test
	public void editpurchaseorder() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Homepage h=new Homepage(driver);
		Createnew_purchaseorder c=new Createnew_purchaseorder(driver);
		h.getMore_majoretab().click();
		h.getPurchaseorder_link().click();
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int	count=all.size();
	for(int i=0;i<count;i++){
		if(i==0)
		all.get(i).click();
	}
	c.getMassedit_button().click();
	String parent = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	for(String wh:allwh){
		if(!(wh.equals(parent))){
			driver.switchTo().window(wh);
		}
	}
	List<WebElement> all1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int	count1=all.size();
	for(int i=0;i<count1;i++){
		if(i==0)
		all1.get(i).click();
	}
	FileLib f=new FileLib();
	String data = f.getExcelData("cmr", 1, 1);
	c.getSubject_textfield2().sendKeys(data);
	
	c.getSave2_button().click();
}
      
}
