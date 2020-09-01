package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_new_salesorder_page {
	@FindBy(name="subject")
	private WebElement subject_textfield;
	@FindBy(xpath="(//img[@alt='Select'])[4]")
	private WebElement orga_name_icon;
	@FindBy(name="bill_street")
	private WebElement billing_address_textfield;
	@FindBy(name="ship_street")
	private WebElement shipping_address_textfield;
	@FindBy(id="searchIcon1")
	private WebElement product_icon;
	@FindBy(id="qty1")
	private WebElement quantity_txfield;
	@FindBy(xpath="//a[text()='education12']")
	private WebElement orga_name_link;
	@FindBy(id="popup_product_6")
	private WebElement product_name_link;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement save_button;
	
	public WebElement getSave_button() {
		return save_button;
	}

	public WebElement getOrga_name_link() {
		return orga_name_link;
	}

	public WebElement getProduct_name_link() {
		return product_name_link;
	}

	public Create_new_salesorder_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubject_textfield() {
		return subject_textfield;
	}

	public WebElement getOrga_name_icon() {
		return orga_name_icon;
	}

	public WebElement getBilling_address_textfield() {
		return billing_address_textfield;
	}

	public WebElement getShipping_address_textfield() {
		return shipping_address_textfield;
	}

	public WebElement getProduct_icon() {
		return product_icon;
	}

	public WebElement getQuantity_txfield() {
		return quantity_txfield;
	}
	

}