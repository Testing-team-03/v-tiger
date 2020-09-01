package com.vtiger.testscripts;

import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Salesorder_page;

public class Edit_sales_order extends BaseClass{
	@Test
	public void createsalesorder(){
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();h.getSalesorder_link().click();
		Salesorder_page s=new Salesorder_page(driver);
		s.getSubject_list().click();
		s.getEdit_button().click();
		s.getCustomernum_textfield().sendKeys("89567");
		s.getSave_button().click();

}
}