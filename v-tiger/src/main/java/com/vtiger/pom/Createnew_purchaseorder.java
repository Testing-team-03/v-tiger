package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnew_purchaseorder {
	@FindBy(name="subject")
	private WebElement subject_textfield;
	@FindBy(xpath="//img[@alt='Create Purchase Order...']")
	private WebElement create_purchaseorder_icon;
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement verdor_name_icon;
	@FindBy(xpath="//a[.='tayota']")
	private WebElement vendor_name;
	@FindBy(name="bill_street")
	private WebElement billing_address;
	@FindBy(name="ship_street")
	private WebElement shipping_address;
	@FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
	private WebElement save_button;
	@FindBy(id="searchIcon1")
	private WebElement products_icon;
	@FindBy(id="popup_product_6")
	private WebElement product_name;
	@FindBy(id="qty1")
	private WebElement quantity;
	@FindBy(xpath="(//input[@value='Mass Edit'])[1]")
	private WebElement massedit_button;
	@FindBy(name="subject")
	private WebElement subject_textfield2;
	@FindBy(xpath="//input[@type='submit' and @class='crmbutton small save']")
	private WebElement save2_button;
	
	
	public Createnew_purchaseorder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getSave2_button() {
		return save2_button;
	}
	public WebElement getMassedit_button() {
		return massedit_button;
	}
	public WebElement getSubject_textfield2() {
		return subject_textfield2;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getProduct_name() {
		return product_name;
	}
	public WebElement getProducts_icon() {
		return products_icon;
	}
	
	public WebElement getSubject_textfield() {
		return subject_textfield;
	}
	public WebElement getVerdor_name_icon() {
		return verdor_name_icon;
	}
	public WebElement getVendor_name() {
		return vendor_name;
	}
	public WebElement getBilling_address() {
		return billing_address;
	}
	public WebElement getShipping_address() {
		return shipping_address;
	}
	public WebElement getSave_button() {
		return save_button;
	}
	public WebElement getCreate_purchaseorder_icon() {
		return create_purchaseorder_icon;
	}

}