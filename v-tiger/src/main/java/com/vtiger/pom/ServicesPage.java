package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
	
	@FindBy(xpath="//a[@class='hdrLink']")
	private WebElement servicehd;

	public WebElement getServicehd() {
		return servicehd;
	}

	public void setServicehd(WebElement servicehd) {
		this.servicehd = servicehd;
	}

	@FindBy(xpath="//a[.='Services']")
	private WebElement services;
	
	@FindBy(xpath="//img[contains(@title,'Create Service...')]")
	private WebElement createservice;
	
	@FindBy(xpath="//input[@name='servicename']")
	private WebElement servicename;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(xpath="//a[.='Services']")
	private WebElement servicestab;
	
	@FindBy(xpath="//span[@id='dtlview_Service Name']")
	private WebElement verifyservicetxt;
	
	@FindBy(xpath="(//a[contains(@title,'Services')])[4]")
	private WebElement serviceName;
	
	@FindBy(xpath="//input[@title='Delete [Alt+D]']")
	private WebElement deletebtn;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement cancelbtn;
	
	@FindBy(xpath="//input[@title='Duplicate [Alt+U]']")
	private WebElement dupicatebtn;
	
	@FindBy(xpath="(//a[.='Services'])[1]")
	private WebElement servicelink;
	
	@FindBy(xpath="//select[@id='bas_searchfield'][1]")
	private WebElement InDropDown;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchFeild;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchnowbtn;
	
	@FindBy(xpath="//input[@name='selected_id']/../../td[.='SER9 ']")
	private WebElement serviceNo;
	
	
	@FindBy(xpath="//span[@class='genHeaderSmall']")
	private WebElement NoServiceFound;
	
	@FindBy(xpath="//a[.='Create Purchase Order']")
	private WebElement CreatePurchaseorderlink;
	
	@FindBy(xpath="//a[.='More']")
	private WebElement morelink;
	
	@FindBy(xpath="//a[.='Create Sales Order']")
	private WebElement CreateSalesOrderlink;
	
	@FindBy(xpath="//a[.='Create Invoice']")
	private WebElement CreateInvoicelink;
	
	@FindBy(xpath="//a[.='Create Quote']")
	private WebElement createQuotelink;
	
	@FindBy(xpath="//a[.='More Information']")
	private WebElement moreinfolink;
	
	@FindBy(xpath="//img[@id='show_Services_Leads']")
	private WebElement leads;
	
	@FindBy(xpath="//input[@title='Select Leads']")
	private WebElement selectleads;
	
	@FindBy(xpath="(//span[@vtfieldname='service_no'])[last()]")
	private WebElement serviceno;
	
	@FindBy(xpath="(//a[.='Services'])[1]")
	private WebElement ServiceLink;
	
	@FindBy(xpath="(//a[@title='Services'])[last()]")
	private WebElement lastservice;
	
	@FindBy(xpath="//td[.='Training '] ")
	private WebElement ServiceCategory;
	
	
	@FindBy(xpath="//img[@id='show_Services_Potentials']")
	private WebElement opportunities;
	
	@FindBy(xpath="//input[@title='Select Opportunities']")
	private WebElement selectopportunities;
	
	@FindBy(xpath="(//a[@style='cursor:pointer;'])[1]")
	private WebElement opportunity;
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement selectedopportunity;
	
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement opportunityname;
	
	@FindBy(xpath="//span[@id='dtlview_Opportunity Name']")
	private WebElement editedname;
	
	public WebElement getEditedname() {
		return editedname;
	}

	public void setEditedname(WebElement editedname) {
		this.editedname = editedname;
	}

	public WebElement getOpportunityname() {
		return opportunityname;
	}

	public void setOpportunityname(WebElement opportunityname) {
		this.opportunityname = opportunityname;
	}

	public WebElement getSelectedopportunity() {
		return selectedopportunity;
	}

	public void setSelectedopportunity(WebElement selectedopportunity) {
		this.selectedopportunity = selectedopportunity;
	}

	public WebElement getOpportunity() {
		return opportunity;
	}

	public void setOpportunity(WebElement opportunity) {
		this.opportunity = opportunity;
	}

	public WebElement getSelectopportunities() {
		return selectopportunities;
	}

	public void setSelectopportunities(WebElement selectopportunities) {
		this.selectopportunities = selectopportunities;
	}

	public WebElement getServiceCategory() {
		return ServiceCategory;
	}

	public void setServiceCategory(WebElement serviceCategory) {
		ServiceCategory = serviceCategory;
	}

	public WebElement getLastservice() {
		return lastservice;
	}

	public void setLastservice(WebElement lastservice) {
		this.lastservice = lastservice;
	}

	public WebElement getServiceLink() {
		return ServiceLink;
	}

	public void setServiceLink(WebElement serviceLink) {
		ServiceLink = serviceLink;
	}

	public WebElement getServiceno() {
		return serviceno;
	}

	public void setServiceno(WebElement serviceno) {
		this.serviceno = serviceno;
	}

	public WebElement getSelectleads() {
		return selectleads;
	}

	public void setSelectleads(WebElement selectleads) {
		this.selectleads = selectleads;
	}

	public WebElement getLeads() {
		return leads;
	}

	public void setLeads(WebElement leads) {
		this.leads = leads;
	}

	public WebElement getMoreinfolink() {
		return moreinfolink;
	}

	public void setMoreinfolink(WebElement moreinfolink) {
		this.moreinfolink = moreinfolink;
	}

	public WebElement getCreateQuotelink() {
		return createQuotelink;
	}

	public void setCreateQuotelink(WebElement createQuotelink) {
		this.createQuotelink = createQuotelink;
	}

	public WebElement getCreateInvoicelink() {
		return CreateInvoicelink;
	}

	public void setCreateInvoicelink(WebElement createInvoicelink) {
		CreateInvoicelink = createInvoicelink;
	}

	public WebElement getCreateSalesOrderlink() {
		return CreateSalesOrderlink;
	}

	public void setCreateSalesOrderlink(WebElement createSalesOrderlink) {
		CreateSalesOrderlink = createSalesOrderlink;
	}

	public WebElement getMorelink() {
		return morelink;
	}

	public void setMorelink(WebElement morelink) {
		this.morelink = morelink;
	}

	public WebElement getCreatePurchaseorderlink() {
		return CreatePurchaseorderlink;
	}

	public void setCreatePurchaseorderlink(WebElement createPurchaseorderlink) {
		CreatePurchaseorderlink = createPurchaseorderlink;
	}

	public WebElement getNoServiceFound() {
		return NoServiceFound;
	}

	public void setNoServiceFound(WebElement noServiceFound) {
		NoServiceFound = noServiceFound;
	}

	public WebElement getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(WebElement seviceNo) {
		this.serviceNo = seviceNo;
	}

	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}

	public void setSearchnowbtn(WebElement searchnowbtn) {
		this.searchnowbtn = searchnowbtn;
	}

	public WebElement getInDropDown() {
		return InDropDown;
	}

	public void setInDropDown(WebElement inDropDown) {
		InDropDown = inDropDown;
	}

	public WebElement getSearchFeild() {
		return searchFeild;
	}

	public void setSearchFeild(WebElement searchFeild) {
		this.searchFeild = searchFeild;
	}

	public WebElement getServicelink() {
		return servicelink;
	}

	public void setServicelink(WebElement servicelink) {
		this.servicelink = servicelink;
	}

	public WebElement getDupicatebtn() {
		return dupicatebtn;
	}

	public void setDupicatebtn(WebElement dupicatebtn) {
		this.dupicatebtn = dupicatebtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public void setCancelbtn(WebElement cancelbtn) {
		this.cancelbtn = cancelbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public void setDeletebtn(WebElement deletebtn) {
		this.deletebtn = deletebtn;
	}

	public WebElement getServiceName() {
		return serviceName;
	}

	public void setServiceName(WebElement serviceName) {
		this.serviceName = serviceName;
	}

	@FindBy(xpath="//input[@title='Edit [Alt+E]']")
	private WebElement editbtn;
	
	public WebElement getEditbtn() {
		return editbtn;
	}

	public void setEditbtn(WebElement editbtn) {
		this.editbtn = editbtn;
	}

	public WebElement getVerifyservicetxt() {
		return verifyservicetxt;
	}

	public void setVerifyservicetxt(WebElement verifyservicetxt) {
		this.verifyservicetxt = verifyservicetxt;
	}

	public WebElement getServicestab() {
		return servicestab;
	}

	public void setServicestab(WebElement servicestab) {
		this.servicestab = servicestab;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		this.savebtn = savebtn;
	}

	public WebElement getServicename() {
		return servicename;
	}

	public void setServicename(WebElement servicename) {
		this.servicename = servicename;
	}

	public ServicesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateservice() {
		return createservice;
	}

	public void setCreateservice(WebElement createservice) {
		this.createservice = createservice;
	}


	public WebElement getServices() {
		return services;
	}

	public void setServices(WebElement services) {
		this.services = services;
	}

	public WebElement getOpportunities() {
		return opportunities;
	}

	public void setOpportunities(WebElement opportunities) {
		this.opportunities = opportunities;
	}
}
