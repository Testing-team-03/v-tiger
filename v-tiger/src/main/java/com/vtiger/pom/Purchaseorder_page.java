package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchaseorder_page {
	@FindBy(xpath="(//input[@value='Mass Edit'])[1]")
	private WebElement massedit_button;
	@FindBy(xpath="(//a[@title='Purchase Order'])[1]")
	private WebElement subject;
	@FindBy(xpath="(//input[@value='Duplicate'])[1]")
	private WebElement duplicate_button;
	@FindBy(xpath="(//input[@type='submit' and @value='  Save  '])[1]")
	private WebElement save_button;
	@FindBy(xpath="//span[contains(text(),'Purchase Order Information')]")
	private WebElement purchaseorder_info_page;
	@FindBy(xpath="(//input[@type='button' and @value='Delete'])[1]")
	private WebElement delete_button;
	@FindBy(xpath="(//a[@title='Vendors'])[1]")
	private WebElement ventor_link;
	
	
	
	
	public WebElement getVentor_link() {
		return ventor_link;
	}
	public Purchaseorder_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getDelete_button() {
		return delete_button;
	}

	public WebElement getPurchaseorder_info_page() {
		return purchaseorder_info_page;
	}

	public WebElement getSave_button() {
		return save_button;
	}

	public WebElement getDuplicate_button() {
		return duplicate_button;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getMassedit_button() {
		return massedit_button;
	}
	

}