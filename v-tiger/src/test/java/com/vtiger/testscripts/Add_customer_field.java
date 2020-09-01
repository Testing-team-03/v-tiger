package com.vtiger.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.generics.FileLib;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Module_manager_SOrder;
//import com.vtiger.pom.Sales_order_info_page;

public class Add_customer_field extends BaseClass{
	@Test
	public void addcustomerfield() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Homepage h=new Homepage(driver);
		Reporter.log("Adding customer field",true);
		Module_manager_SOrder m=new Module_manager_SOrder(driver);
		
		h.getMore_majoretab().click();
		h.getSalesorder_link().click();
		h.getSales_order_settings().click();
		m.getLayout_editor_link().click();
		m.getAdd_customer_field().click();
		m.getPercentage().click();
		FileLib f=new FileLib();
		String data = f.getExcelData("cmr", 1, 0);
		m.getLabel_textfield().sendKeys(data);
		Reporter.log("customer field got added successfully",true);

}
}
