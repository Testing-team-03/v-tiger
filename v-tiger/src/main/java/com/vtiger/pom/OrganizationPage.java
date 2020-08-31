package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	@FindBy(xpath="//img[@id='show_Services_Accounts']")
	private WebElement organization;
	
	@FindBy(xpath="//input[@title='Select Organizations']")
	private WebElement selectorganization;
	
	@FindBy(xpath="(//a[@style='cursor:pointer;'])[1]")
	private WebElement organizationname;
	
	@FindBy(xpath="(//a[@style])[1]")
	private WebElement selectedOrg;
	
	@FindBy(xpath="//input[@title='Edit [Alt+E]']")
	private WebElement EditBtn;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement editdetail;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(id="mouseArea_Organization Name")
	private WebElement editedorg;
	
	@FindBy(xpath="//a[.='Organizations']")
	private WebElement orglink;
	
	public WebElement getOrglink() {
		return orglink;
	}

	public void setOrglink(WebElement orglink) {
		this.orglink = orglink;
	}

	public WebElement getEditedorg() {
		return editedorg;
	}

	public void setEditedorg(WebElement editedorg) {
		this.editedorg = editedorg;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		this.savebtn = savebtn;
	}

	public WebElement getEditdetail() {
		return editdetail;
	}

	public void setEditdetail(WebElement editdetail) {
		this.editdetail = editdetail;
	}

	public WebElement getEditBtn() {
		return EditBtn;
	}

	public void setEditBtn(WebElement editBtn) {
		EditBtn = editBtn;
	}

	public WebElement getSelectedOrg() {
		return selectedOrg;
	}

	public void setSelectedOrg(WebElement selectedOrg) {
		this.selectedOrg = selectedOrg;
	}

	public WebElement getOrganizationname() {
		return organizationname;
	}

	public void setOrganizationname(WebElement organizationname) {
		this.organizationname = organizationname;
	}

	public WebElement getSelectorganization() {
		return selectorganization;
	}

	public void setSelectorganization(WebElement selectorganization) {
		this.selectorganization = selectorganization;
	}

	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganization() {
		return organization;
	}

	public void setOrganization(WebElement organization) {
		this.organization = organization;
	}
}
