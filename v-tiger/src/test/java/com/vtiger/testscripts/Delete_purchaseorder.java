package com.vtiger.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Purchaseorder_page;

public class Delete_purchaseorder extends BaseClass {
	@Test
	public void delete(){
		Homepage h=new Homepage(driver);
		h.getMore_majoretab().click();
		h.getPurchaseorder_link().click();
		Purchaseorder_page p=new Purchaseorder_page (driver);
		p.getSubject().click();
		p.getDelete_button().click();
		Alert a = driver.switchTo().alert();
		a.accept();
		String text = p.getSubject().getText();
		String text_deleted = driver.findElement(By.xpath("(//a[@title='Purchase Order'])[1]")).getText();
		if(!(text.equals(text_deleted))){
			System.out.println("purchase order deleted");
		}
	}

}
