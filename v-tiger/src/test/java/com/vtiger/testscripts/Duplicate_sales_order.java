package com.vtiger.testscripts;

import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Sales_order_info_page;
import com.vtiger.pom.Salesorder_page;

public class Duplicate_sales_order extends BaseClass {
	@Test
	public void createsalesorder(){
		Homepage h=new Homepage(driver);
		
		Sales_order_info_page s1=new Sales_order_info_page(driver);
		h.getMore_majoretab().click();h.getSalesorder_link().click();
		Salesorder_page s=new Salesorder_page(driver);
		s.getSubject_list().click();
		s1.getDuplicate_button().click();
		Salesorder_page s2=new Salesorder_page(driver);
		s2.getSave_button().click();

}
}