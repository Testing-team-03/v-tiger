package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchaseorder_info_page {
	@FindBy(xpath="//a[text()='Activities']")
	private WebElement activities;
	@FindBy(xpath="(//a[text()='edit'])[1]")
	private WebElement edit_link;
	@FindBy(xpath="(//a[text()='del'])[1]")
	private WebElement delete_link;
	@FindBy(xpath="//a[text()='Send Email With PDF']")
	private WebElement send_emailwithPdf_link;
	
	public WebElement getSend_emailwithPdf_link() {
		return send_emailwithPdf_link;
	}

	public WebElement getDelete_link() {
		return delete_link;
	}

	public WebElement getEdit_link() {
		return edit_link;
	}

	@FindBy(xpath="(//a[text()='More Information'])[2]")
	private WebElement moreinfo_link;
	
	public WebElement getMoreinfo_link() {
		return moreinfo_link;
	}

	@FindBy(xpath="//input[@title='New To Do']")
	private WebElement addtodo_bitton;
	
	public WebElement getAddtodo_bitton() {
		return addtodo_bitton;
	}
	
	@FindBy(xpath="(//img[@alt='Display' and @title='Display'])[1]")
	private WebElement arrow_icon;

	public WebElement getArrow_icon() {
		return arrow_icon;
	}

	public Purchaseorder_info_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getActivities() {
		return activities;
	}

}