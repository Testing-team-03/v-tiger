package com.vtiger.testscripts;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Compose_mail_page;
import com.vtiger.pom.Contacts_page;
import com.vtiger.pom.Purchaseorder_info_page;

public class Send_email_pdf extends BaseClass{
	@Test
	public void sendemail(){
		Purchaseorder_info_page p=new Purchaseorder_info_page(driver);
		Contacts_page c1=new Contacts_page(driver);
		Compose_mail_page c=new Compose_mail_page(driver);
		p.getSend_emailwithPdf_link().click();
		String parentwh = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for(String wh:all){
		if(!(wh.equals(parentwh))){
			driver.switchTo().window(wh);
			
		}
		}
		c.getSelect_contact_icon().click();
		String parentwh1 = driver.getWindowHandle();
		Set<String> all1 = driver.getWindowHandles();
		for(String wh:all1){
		if(!(wh.equals(parentwh1))){
			driver.switchTo().window(wh);
			
		}
		}
		c1.getName_link().click();
		c.getSave_button().click();
		String text = "Please configure your outgoing mailserver under Settings ---> Outgoing Server link";
	Alert a = driver.switchTo().alert();
	String actual_text = a.getText();
	if(actual_text.equals(text)){
		System.out.println("Alert message is displayed");
	}
	}

}
