package com.vtiger.testscripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.Homepage;
import com.vtiger.pom.Invoice_page;

public class Edit_invoice_checkbox extends BaseClass {
	@Test
	public void editinvoice() throws InterruptedException{
		Reporter.log("Editing invoice",true);
	Homepage h=new Homepage(driver);
	Invoice_page i=new Invoice_page(driver);
	h.getMore_majoretab().click();
		h.getInvoice_link().click();
		List<WebElement> allckbx = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int	count=allckbx.size();
	for(int s=0;s<count;s++){
		if(s!=count-1){
		allckbx.get(s).click();
		}
	}
	i.getMass_edit_button().click();
	String parentwh = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	for(String wh:all){
	if(!(wh.equals(parentwh))){
		driver.switchTo().window(wh);	
	}
	}
	List<WebElement> allckbx1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int	count1=allckbx.size();
	for(int s=0;s<count1;s++){
		if(s==2){
			System.out.println("hi");
		allckbx1.get(s).click();
		}
		
		//i.getSave2_button().click();
		}
	Reporter.log("invoice got edited",true);
	}}
	
