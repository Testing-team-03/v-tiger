package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Module_manager_SOrder {
	@FindBy(xpath="//a[contains(text(),'Layout Editor')]")
	private WebElement layout_editor_link;
	@FindBy(xpath="(//img[@alt='Add Custom Field'])[1]")
	private WebElement add_customer_field;
	public WebElement getPercentage() {
		return percentage;
	}

	public WebElement getLabel_textfield() {
		return label_textfield;
	}

	@FindBy(id="field2_61")
	private WebElement percentage;
	@FindBy(id="fldLabel_61")
	private WebElement label_textfield;
	
	public WebElement getAdd_customer_field() {
		return add_customer_field;
	}

	public  Module_manager_SOrder(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getLayout_editor_link() {
		return layout_editor_link;
	}

}