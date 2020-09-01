package com.vtiger.testscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Calendar_page;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Purchaseorder_info_page;
import com.vtiger.pom.Purchaseorder_page;

public class Activities extends BaseClass {
	@Test
	public void activities(){
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
		p1.getAddtodo_bitton().click();
		c.getTodo_textareafield().sendKeys("order");
		c.getSave_button().click();
		Reporter.log("Activity got created",true);
		
	}
}
