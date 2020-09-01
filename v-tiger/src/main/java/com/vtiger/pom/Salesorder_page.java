package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Salesorder_page {
	@FindBy(xpath="//img[@title='Create Sales Order...']")
	private WebElement create_salesorder_icon;
	@FindBy(xpath="(//a[@title='Sales Order'])[1]")
	private WebElement subject_list;
	@FindBy(xpath="(//input[@type='button' and @class='crmbutton small edit'])[1]")
	private WebElement edit_button;
	@FindBy(id="customerno")
	private WebElement customernum_textfield;
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement save_button;
	@FindBy(xpath="(//input[@value='Mass Edit'])[1]")
	private WebElement massedit_button;
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	private WebElement delete_button;
	
	 public WebElement getDelete_button() {
		return delete_button;
	}

	public WebElement getMassedit_button() {
		return massedit_button;
	}

	public WebElement getSave_button() {
		return save_button;
	}

	public WebElement getCustomernum_textfield() {
		return customernum_textfield;
	}

	public WebElement getEdit_button() {
		return edit_button;
	}

	public WebElement getSubject_list() {
		return subject_list;
	}

	public WebElement getCreate_salesorder_icon() {
		return create_salesorder_icon;
	}

	public Salesorder_page(WebDriver driver){
		 PageFactory.initElements(driver, this);
	 }

}