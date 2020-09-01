package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	@FindBy(xpath="//a[text()='More']")
	private WebElement more_majoretab;
	
	@FindBy(name="Purchase Order")
	private WebElement purchaseorder_link;
	
	@FindBy(name="Sales Order")
	private WebElement salesorder_link;
	
	@FindBy(xpath="//img[@title='Sales Order Settings']")
	private WebElement sales_order_settings_icon;
	
	public WebElement getInvoice_link() {
		return invoice_link;
	}
	@FindBy(name="Invoice")
	private WebElement invoice_link;
	
	
	
	public WebElement getSales_order_settings() {
		return sales_order_settings_icon;
	}
	public WebElement getSalesorder_link() {
		return salesorder_link;
	}
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getMore_majoretab() {
		return more_majoretab;
	}
	public WebElement getPurchaseorder_link() {
		return purchaseorder_link;
	}
	
	

}