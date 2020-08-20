package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministratorPage {

	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement logout;
	
	public AdministratorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickLogout()
	{
		logout.click();
	}

}
