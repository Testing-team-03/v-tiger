package com.vtiger.testscripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Salesorder_page;

public class Massedit_sales_order extends BaseClass {
	@Test
	public void createsalesorder(){
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();h.getSalesorder_link().click();
		Salesorder_page s=new Salesorder_page(driver);
		s.getMassedit_button().click();
		String text = "Please select at least one entity";
		Alert alert = driver.switchTo().alert();
		String actual_text = alert.getText();
		if(actual_text.equals(text)){
			System.out.println("Alert message is displayed");
		}

}
}