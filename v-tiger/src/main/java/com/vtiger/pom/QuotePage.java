package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotePage {

	@FindBy(xpath="//input[@name='subject']")
	private WebElement subject;
	
	@FindBy(xpath="(//img[@title='Select'])[3]")
	private WebElement OrganizationName;
	
	@FindBy(xpath="(//a[@href='javascript:window.close();'])[1]")
	private WebElement OrganizationName1;
	
	@FindBy(xpath="(//a[@href='javascript:window.close();'])[2]")
	private WebElement OrganizationName2;
	
	@FindBy(xpath="//a[.='Quotes']")
	private WebElement Quotelink;
	
	@FindBy(xpath="(//a[@title='Quotes'])[last()]")
	private WebElement Quote;
	
	public WebElement getQuote() {
		return Quote;
	}

	public void setQuote(WebElement quote) {
		Quote = quote;
	}

	public WebElement getQuotelink() {
		return Quotelink;
	}

	public void setQuotelink(WebElement quotelink) {
		Quotelink = quotelink;
	}

	public WebElement getBillingAdd() {
		return BillingAdd;
	}

	public void setBillingAdd(WebElement billingAdd) {
		BillingAdd = billingAdd;
	}

	public WebElement getShippingAdd() {
		return ShippingAdd;
	}

	public void setShippingAdd(WebElement shippingAdd) {
		ShippingAdd = shippingAdd;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public void setCancelbtn(WebElement cancelbtn) {
		this.cancelbtn = cancelbtn;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		this.savebtn = savebtn;
	}

	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAdd;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement ShippingAdd;

	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement cancelbtn;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;

	
	public WebElement getOrganizationName1() {
		return OrganizationName1;
	}

	public void setOrganizationName1(WebElement organizationName1) {
		OrganizationName1 = organizationName1;
	}

	public WebElement getOrganizationName2() {
		return OrganizationName2;
	}

	public void setOrganizationName2(WebElement organizationName2) {
		OrganizationName2 = organizationName2;
	}

	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public void setOrganizationName(WebElement organizationName) {
		OrganizationName = organizationName;
	}

	public QuotePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubject() {
		return subject;
	}

	public void setSubject(WebElement subject) {
		this.subject = subject;
	}

}
