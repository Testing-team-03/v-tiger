package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendar_page {
	@FindBy(name="subject")
	private WebElement todo_textareafield;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement save_button;
	
	public WebElement getSave_button() {
		return save_button;
	}

	public Calendar_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getTodo_textareafield() {
		return todo_textareafield;
	}

}