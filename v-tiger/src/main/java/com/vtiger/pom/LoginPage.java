package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="user_name")
	private WebElement untxb;
	
	@FindBy(name="user_password")
	private WebElement pwdtxb;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pwd)
	{
		untxb.sendKeys(un);
		pwdtxb.sendKeys(pwd);
		loginbtn.click();
	}
}
