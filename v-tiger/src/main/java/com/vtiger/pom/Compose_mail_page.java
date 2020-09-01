package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compose_mail_page {
	@FindBy(xpath="//img[@align='absmiddle' and @title='Select']")
	private WebElement select_contact_icon;
	@FindBy(name="subject")
	private WebElement subject_textareafield;
	@FindBy(xpath="(//input[@value='  Save '])[1]")
	private WebElement save_button;
	
	public WebElement getSave_button() {
		return save_button;
	}

	public WebElement getSubject_textareafield() {
		return subject_textareafield;
	}

	public Compose_mail_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect_contact_icon() {
		return select_contact_icon;
	}

}