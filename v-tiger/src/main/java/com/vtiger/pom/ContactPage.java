package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage{

	@FindBy(xpath="//img[@id='show_Services_Contacts']")
	private WebElement contact;
	
	@FindBy(xpath="(//a[@style='cursor:pointer;'])[1]")
	private WebElement contact1;
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement selectedcontact;
	
	@FindBy(xpath="//input[@title='Select Contacts']")
	private WebElement selectcontact;
	
	@FindBy(xpath="//input[@title='Edit [Alt+E]']")
	private WebElement EditBtn;

	
	public WebElement getEditBtn() {
		return EditBtn;
	}

	public void setEditBtn(WebElement editBtn) {
		EditBtn = editBtn;
	}

	public WebElement getSelectcontact() {
		return selectcontact;
	}

	public void setSelectcontact(WebElement selectcontact) {
		this.selectcontact = selectcontact;
	}

	public WebElement getSelectedcontact() {
		return selectedcontact;
	}

	public void setSelectedcontact(WebElement selectedcontact) {
		this.selectedcontact = selectedcontact;
	}

	public WebElement getContact1() {
		return contact1;
	}

	public void setContact1(WebElement contact1) {
		this.contact1 = contact1;
	}

	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getContact() {
		return contact;
	}

	public void setContact(WebElement contact) {
		this.contact = contact;
	}

}
