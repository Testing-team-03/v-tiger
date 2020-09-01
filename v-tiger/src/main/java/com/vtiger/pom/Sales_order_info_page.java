package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sales_order_info_page {
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	private WebElement delete_button;
	@FindBy(xpath="(//input[@value='Duplicate'])[1]")
	private WebElement duplicate_button;
	@FindBy(xpath="//a[text()='Export To PDF']")
	private WebElement export_pdf_link;
	
	
	public WebElement getExport_pdf_link() {
		return export_pdf_link;
	}


	public WebElement getDuplicate_button() {
		return duplicate_button;
	}


	public WebElement getDelete_button() {
		return delete_button;
	}


	public Sales_order_info_page(WebDriver driver){
		 PageFactory.initElements(driver, this);
	}

}