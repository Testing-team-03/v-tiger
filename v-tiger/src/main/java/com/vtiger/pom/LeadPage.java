package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {

	@FindBy(xpath="(//a[@style='cursor:pointer;'])[1]")
	private WebElement lead;
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement selectedlead;
	
	@FindBy(xpath="//input[@title='Edit [Alt+E]']")
	private WebElement EditBtn;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(xpath="//a[.='Leads']")
	private WebElement Leadlink;
	
	@FindBy(xpath="//span[@id='dtlview_Last Name']")
	private WebElement editeddetail;
	
	@FindBy(xpath="//input[@title='Delete [Alt+D]']")
	private WebElement deletebtn;
	
	@FindBy(xpath="(//a[@title='Leads'])[1]")
	private WebElement leadname;
	
	public WebElement getLeadname() {
		return leadname;
	}

	public void setLeadname(WebElement leadname) {
		this.leadname = leadname;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public void setDeletebtn(WebElement deletebtn) {
		this.deletebtn = deletebtn;
	}

	public WebElement getEditeddetail() {
		return editeddetail;
	}

	public void setEditeddetail(WebElement editeddetail) {
		this.editeddetail = editeddetail;
	}

	public WebElement getLeadlink() {
		return Leadlink;
	}

	public void setLeadlink(WebElement leadlink) {
		Leadlink = leadlink;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		this.savebtn = savebtn;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getEditBtn() {
		return EditBtn;
	}

	public void setEditBtn(WebElement editBtn) {
		EditBtn = editBtn;
	}

	public WebElement getSelectedlead() {
		return selectedlead;
	}

	public void setSelectedlead(WebElement selectedlead) {
		this.selectedlead = selectedlead;
	}

	public LeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLead() {
		return lead;
	}

	public void setLead(WebElement lead) {
		this.lead = lead;
	}

}
