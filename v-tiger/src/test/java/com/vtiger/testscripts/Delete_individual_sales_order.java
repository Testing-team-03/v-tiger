package com.vtiger.testscripts;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Sales_order_info_page;
import com.vtiger.pom.Salesorder_page;

public class Delete_individual_sales_order extends BaseClass{
	@Test
	public void deleteindividualsalesorder(){
		Reporter.log("deleting one sales order",true);
		Homepage h=new Homepage(driver);
		Sales_order_info_page s1=new Sales_order_info_page(driver);
		h.getMore_majoretab().click();h.getSalesorder_link().click();
		Salesorder_page s=new Salesorder_page(driver);
		s.getSubject_list().click();
		s1.getDelete_button().click();
		Alert a = driver.switchTo().alert();
		a.accept();
		Reporter.log("one sales order got deleted",true);

}
}