package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoice_page {
@FindBy(xpath="//img[@title='Create Invoice...']")
private WebElement create_invoice_icon;
@FindBy(name="subject")
private WebElement subject_textfield;
@FindBy(xpath="(//img[@title='Select'])[3]")
private WebElement orga_select_icon;
@FindBy(xpath="//a[text()='education12']")
private WebElement orga_name;
@FindBy(name="bill_street")
private WebElement billing_address;
@FindBy(name="ship_street")
private WebElement shipping_address;
@FindBy(id="searchIcon1")
private WebElement product_icon;
@FindBy(id="popup_product_6")
private WebElement product_name;
@FindBy(id="qty1")
private WebElement quantity_textbox;
@FindBy(xpath="(//input[@value='  Save  '])[2]")
private WebElement save_button;
@FindBy(xpath="(//img[@title='Select'])[1]")
private WebElement select_sales_order;
@FindBy(xpath="(//a[text()='educationg'])[1]")
private WebElement sales_order_subject;
@FindBy(xpath="(//a[@title='Invoice'])[1]")
private WebElement subject_list;
@FindBy(xpath="(//input[@class='crmbutton small edit'])[1]")
private WebElement edit_button;
@FindBy(id="customerno")
private WebElement customerno_textbox;
@FindBy(xpath="(//input[@value='Mass Edit'])[1]")
private WebElement mass_edit_button;
@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement save2_button;
@FindBy(xpath="(//input[@value='Delete'])[1]")
private WebElement delete_button;
@FindBy(xpath="(//input[@value='Duplicate'])[1]")
private WebElement duplicate_button;
@FindBy(xpath="(//img[@title='Next'])[1]")
private WebElement next_button;
@FindBy(xpath="//a[text()='Export To PDF']")
private WebElement export_to_pdf;
@FindBy(xpath="(//input[@value='  Cancel  '])[1]")
private WebElement cancel_button;



public WebElement getCancel_button() {
	return cancel_button;
}

public WebElement getExport_to_pdf() {
	return export_to_pdf;
}

public WebElement getNext_button() {
	return next_button;
}

public WebElement getDuplicate_button() {
	return duplicate_button;
}

public WebElement getDelete_button() {
	return delete_button;
}

public WebElement getSave2_button() {
	return save2_button;
}

public WebElement getMass_edit_button() {
	return mass_edit_button;
}

public WebElement getCustomerno_textbox() {
	return customerno_textbox;
}

public WebElement getEdit_button() {
	return edit_button;
}

public WebElement getSubject_list() {
	return subject_list;
}

public WebElement getSales_order_subject() {
	return sales_order_subject;
}

public WebElement getSelect_sales_order() {
	return select_sales_order;
}

public WebElement getCreate_invoice_icon() {
	return create_invoice_icon;
}

public WebElement getSubject_textfield() {
	return subject_textfield;
}

public WebElement getOrga_select_icon() {
	return orga_select_icon;
}

public WebElement getOrga_name() {
	return orga_name;
}

public WebElement getBilling_address() {
	return billing_address;
}

public WebElement getShipping_address() {
	return shipping_address;
}

public WebElement getProduct_icon() {
	return product_icon;
}

public WebElement getProduct_name() {
	return product_name;
}

public WebElement getQuantity_textbox() {
	return quantity_textbox;
}

public WebElement getSave_button() {
	return save_button;
}

public Invoice_page(WebDriver driver){
	PageFactory.initElements(driver, this);
}

}