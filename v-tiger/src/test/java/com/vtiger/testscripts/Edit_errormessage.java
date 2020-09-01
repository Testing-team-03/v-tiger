package com.vtiger.testscripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Purchaseorder_page;

public class Edit_errormessage extends BaseClass {
	@Test
	public void editpurchaseorder(){
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();
		h.getPurchaseorder_link().click();
		Purchaseorder_page p=new Purchaseorder_page(driver);
		p.getMassedit_button().click();
	Alert a = driver.switchTo().alert();
	String text=a.getText();
	if(text.equalsIgnoreCase("Please select at least one entity")){
		System.out.println("error message is displayed");
	}

}
}