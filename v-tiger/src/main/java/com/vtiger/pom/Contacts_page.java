package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts_page {
	
	@FindBy(xpath="//a[text()='ayesha siddiqa']")
	private WebElement name_link;
	
	public Contacts_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getName_link() {
		return name_link;
	}

}