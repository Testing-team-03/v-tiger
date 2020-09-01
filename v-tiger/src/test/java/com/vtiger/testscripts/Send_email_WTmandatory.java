package com.vtiger.testscripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Compose_mail_page;

import com.vtiger.pom.Purchaseorder_info_page;

public class Send_email_WTmandatory extends BaseClass {

	@Test
	public void sendemail(){
		Purchaseorder_info_page p=new Purchaseorder_info_page(driver);
	Compose_mail_page c=new Compose_mail_page(driver);
		p.getSend_emailwithPdf_link().click();
		c.getSave_button().click();
		String text ="No recepients specified";
		Alert a = driver.switchTo().alert();
		String actual_text = a.getText();
		if(actual_text.equals(text)){
			System.out.println("Alert message is displayed");
		}
}
}