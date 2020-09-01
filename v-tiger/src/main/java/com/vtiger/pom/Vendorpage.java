package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendorpage {
	@FindBy(xpath="(//a[text()='More Information'])[1]")
	private WebElement more_info_link;
	@FindBy(xpath="(//a[text()='Purchase Order'])[2]")
	private WebElement purchaseorder_link;
	@FindBy(xpath="//input[@title='Add Purchase Order']")
	private WebElement add_purchaseorder_button;
	@FindBy(id="show_Vendors_PurchaseOrder")
	private WebElement arrow_purchase_order;
	
	public WebElement getArrow_purchase_order() {
		return arrow_purchase_order;
	}
	public WebElement getAdd_purchaseorder_button() {
		return add_purchaseorder_button;
	}
	public WebElement getPurchaseorder_link() {
		return purchaseorder_link;
	}
	public Vendorpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public WebElement getMore_info_link() {
		return more_info_link;
	}

}