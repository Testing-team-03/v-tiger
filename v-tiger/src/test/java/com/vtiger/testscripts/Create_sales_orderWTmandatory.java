package com.vtiger.testscripts;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Create_new_salesorder_page;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Salesorder_page;

public class Create_sales_orderWTmandatory extends BaseClass{
	@Test
	public void createsalesorder(){
		Reporter.log("creating sales order without filling mandatory fields",true);
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();h.getSalesorder_link().click();
		Salesorder_page s=new Salesorder_page(driver);
		s.getCreate_salesorder_icon().click();
		Create_new_salesorder_page c=new Create_new_salesorder_page(driver);
		c.getSubject_textfield().sendKeys("sales of vessels");
	    c.getSave_button().click();
	    Alert a = driver.switchTo().alert();
	    String text = a.getText();
	    a.accept();
	    String actual_text = "Organization Name cannot be none";
	    if(text.equals(actual_text)){
	    	System.out.println("Error message is displayed");
	    }
	    Reporter.log("sales order got created",true);
	    
 
}}

