package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {

	@FindBy(xpath="//input[@name='subject']")
	private WebElement subject;
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement VendorName;
	
	@FindBy(xpath="//a[.='lenovo']")
	private WebElement VendorName1;
	
	@FindBy(xpath="//a[.='samsung']")
	private WebElement VendorName2;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAdd;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement ShippingAdd;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement cancelbtn;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;

	@FindBy(xpath="//a[@name='Purchase Order']")
	private WebElement PurchaseOrderlink;
	
	@FindBy(xpath="(//a[@title='Purchase Order'])[last()]")
	private WebElement PurchaseOrder;
	
	public WebElement getPurchaseOrder() {
		return PurchaseOrder;
	}

	public void setPurchaseOrder(WebElement purchaseOrder) {
		PurchaseOrder = purchaseOrder;
	}

	public WebElement getPurchaseOrderlink() {
		return PurchaseOrderlink;
	}

	public void setPurchaseOrderlink(WebElement puchareOrderlink) {
		PurchaseOrderlink = puchareOrderlink;
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

	public WebElement getShippingAdd() {
		return ShippingAdd;
	}

	public void setShippingAdd(WebElement shippingAdd) {
		ShippingAdd = shippingAdd;
	}

	public WebElement getBillingAdd() {
		return BillingAdd;
	}

	public void setBillingAdd(WebElement billingAdd) {
		BillingAdd = billingAdd;
	}

	public WebElement getVendorName2() {
		return VendorName2;
	}

	public void setVendorName2(WebElement vendorName2) {
		VendorName2 = vendorName2;
	}

	public WebElement getVendorName1() {
		return VendorName1;
	}

	public void setVendorName1(WebElement vendorName1) {
		VendorName1 = vendorName1;
	}

	public WebElement getVendorName() {
		return VendorName;
	}

	public void setVendorName(WebElement vendorName) {
		VendorName = vendorName;
	}

	public PurchaseOrderPage(WebDriver driver)
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
