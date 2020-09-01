package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.generics.FileLib;
import com.vtiger.pom.Calendar_page;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Purchaseorder_info_page;
import com.vtiger.pom.Purchaseorder_page;

public class Activities_edit extends BaseClass{
	@Test
	public void edit() throws EncryptedDocumentException,IOException, InvalidFormatException{
		Homepage h=new Homepage(driver);
		Reporter.log("creating one Activity",true);
		h.getMore_majoretab().click();
		h.getPurchaseorder_link().click();
		Purchaseorder_page p=new Purchaseorder_page(driver);
		Calendar_page c=new Calendar_page(driver);
		Purchaseorder_info_page p1=new Purchaseorder_info_page(driver);
		p.getSubject().click();
		
		p1.getMoreinfo_link().click();
		
		p1.getArrow_icon().click();
		
		p1.getEdit_link().click();
		
		FileLib f=new FileLib();
		String data = f.getExcelData("cmr", 0, 0);
		c.getTodo_textareafield().sendKeys(data);
		c.getSave_button().click();
		Reporter.log("Activity got edited",true);
	}

}
