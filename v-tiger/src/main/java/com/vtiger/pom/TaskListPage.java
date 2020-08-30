package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//a[@name='Services']")
	private WebElement ServicesLink;
	
	@FindBy(xpath="//a[.='Contacts']")
	private WebElement ContactsLink;
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement AddNewBtn;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstNametxtfeild;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastNametxtfeild;
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement Selectbtn1;
	
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement Addopportunitybtn;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement Title;
	
	@FindBy(xpath="//input[@name='department']")
	private WebElement Department;
	

	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement Createnewsavebtn;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement MasseditSavebtn1;
	
	@FindBy(xpath="(//input[@onclick='check_object(this)'])[1]")
	private WebElement Checkbox;
	
	@FindBy(xpath="(//a[.='edit'])[1]")
	private WebElement Editlink;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement Deletebtn;
	
	@FindBy(xpath="//img[@title='Import Contacts']")
	private WebElement Importcontacts;
	
	@FindBy(xpath="//input[@name='import_file']")
	private WebElement Choosefile;
	
	@FindBy(xpath="//input[@name='next']")
	private WebElement Nextbutton;
	
	@FindBy(xpath="//input[@name='import']")
	private WebElement importbtn;
	
	@FindBy(xpath="//input[@name='cancel']")
	private WebElement Finishbtn;
	
	@FindBy(xpath="//img[@title='Export Contacts']")
	private WebElement ExportContacts;
	
	@FindBy(xpath="//input[@name='Export']")
	private WebElement Exportcontactbtn;
	
	@FindBy(xpath="//img[@title='Export Services']")
	private WebElement ExportServices;
	
	@FindBy(xpath="//input[@value='Mass Edit']")
	private WebElement MassEditbtn;
	
	@FindBy(name="lastname_mass_edit_check")
	private WebElement Lastnamecheckbox;
	
	@FindBy(xpath="(//a[.='Leads'])[1]")
	private WebElement LeadsLink;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement CompanyName;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Emailtextfeild;
	
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement Plusbtn;
	
	@FindBy(xpath="//img[@title='Import Leads']")
	private WebElement ImportLeads;
	
	@FindBy(xpath="//img[@title='Export Leads']")
	private WebElement ExportLeads;
	
	@FindBy(xpath="//input[@value='Export Leads ']")
	private WebElement ExportLeadsbtn;
	
	@FindBy(xpath="//input[@title='Duplicate [Alt+U]']")
	private WebElement Duplicatebtn;
	
	@FindBy(xpath="//a[.='Add Event']")
	private WebElement Addeventlink;
	
	@FindBy(xpath="//a[.='Create Purchase Order']")
	private WebElement Purchaseorder;
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement Eventname;
	
	@FindBy(xpath="//input[@name='location']")
	private WebElement Eventlocation;
	
	@FindBy(xpath="//img[@id='jscal_trigger_date_start']")
	private WebElement Startdate;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement Searchtextfeild;
	
	@FindBy(xpath="//a[.='Opportunities']")
	private WebElement Opportunitieslink;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement Searchnowbtn;
	
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement Opportunityname;
	
	@FindBy(xpath="//input[@name='servicename']")
	private WebElement Servicenametxtfeild;
	
	@FindBy(xpath="//img[@title='Import Opportunities']")
	private WebElement Importopportunities;
	
	@FindBy(xpath="//img[@title='Export Opportunities']")
	private WebElement ExportOpportunities;
	
	@FindBy(xpath="//a[.='Create Sales Order']")
	private WebElement Salesorder;
	
	@FindBy(xpath="//input[@value='Export Opportunities ']")
	private WebElement Exportopportunitiesbtn;
	
	@FindBy(xpath="//a[.='Create Invoice']")
	private WebElement Createinvoicelink;
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement Subjecttextfeild;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement Billingadress;
	
	@FindBy(xpath="//input[@name='qty1']")
	private WebElement Quantity;
	
	@FindBy(xpath="//img[@title='Create Service...']")
	private WebElement Addservicesbtn;
	
	@FindBy(xpath="//img[@title='Import Services']")
	private WebElement Importservices;
	
	@FindBy(xpath="//input[@value='Export Services ']")
	private WebElement Exportservicesbtn;
	
	@FindBy(xpath="//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement Adressradiobtn;
	
	@FindBy(id="searchIcon1")
	private WebElement Searchicon;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getContactsLink() {
		return ContactsLink;
	}

	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}
		
		public WebElement getFirstNametxtfeild() {
			return FirstNametxtfeild;
		}
		
		public WebElement getLastNametxtfeild() {
			return LastNametxtfeild;
		}
			
			public WebElement getSelectbtn1() {
				return Selectbtn1;
			}
			
			public WebElement getAddopportunitybtn() {
				return Addopportunitybtn;
			}
			public WebElement getTitle() {
				return Title;
			}
			public WebElement getDepartment() {
				return Department;
			}
			public WebElement getCreatenewsavebtn() {
				return Createnewsavebtn;
			}
			public WebElement getMasseditSavebtn1() {
				return MasseditSavebtn1;
			}
			public WebElement getCheckbox() {
				return Checkbox;
			}
			public WebElement getEditlink() {
				return Editlink;
			}
			public WebElement getServicesLink() {
				return ServicesLink;
			}
			
			public WebElement getDeletebtn() {
				return Deletebtn;
			}
			public WebElement getImportcontacts() {
				return Importcontacts;
			}
			public WebElement getChoosefile() {
				return Choosefile;
			}
			public WebElement getNextbutton() {
				return Nextbutton;
			}
			public WebElement getimportbtn() {
				return importbtn;
			}
			public WebElement getFinishbtn() {
				return Finishbtn;
			}
			public WebElement getExportContacts() {
				return ExportContacts;
				}
			public WebElement getExportcontactbtn() {
				return Exportcontactbtn;
				}
			public WebElement getMassEditbtn() {
				return MassEditbtn;
				}
			public WebElement getLastnamecheckbox() {
				return Lastnamecheckbox;
				}
			public WebElement getLeadsLink() {
				return LeadsLink;
				}
			public WebElement getCompanyName() {
				return CompanyName;
				}
			public WebElement getEmailtextfeild() {
				return Emailtextfeild;
				}
			public WebElement getPlusbtn() {
				return Plusbtn;
				}
			public WebElement getExportLeads() {
				return ExportLeads;
				}
			public WebElement getImportLeads() {
				return ImportLeads;
				}
			public WebElement getExportLeadsbtn() {
				return ExportLeadsbtn;
				}
			public WebElement getDuplicatebtn() {
				return Duplicatebtn;
				}
			public WebElement getAddeventlink() {
				return Addeventlink;
				}
			public WebElement getEventname() {
				return Eventname;
				}
			public WebElement getEventlocation() {
				return Eventlocation;
				}
			public WebElement getStartdate() {
				return Startdate;
				}
			public WebElement getSearchtextfeild() {
				return Searchtextfeild;
				}
			public WebElement getOpportunitieslink() {
				return Opportunitieslink;
				}
			public WebElement getSearchnowbtn() {
				return Searchnowbtn;
				}
			public WebElement getOpportunityname() {
				return Opportunityname;
				}
			public WebElement getImportopportunities() {
				return Importopportunities;
				}
			public WebElement getExportOpportunities() {
				return ExportOpportunities;
				}
			public WebElement getExportopportunitiesbtn() {
				return Exportopportunitiesbtn;
				}
			public WebElement getCreateinvoiceLink() {
				return Createinvoicelink;
				}
			public WebElement getSubjecttextfeild() {
				return Subjecttextfeild;
				}
			public WebElement getBillingadress() {
				return Billingadress;
				}
			public WebElement getQuantity() {
				return Quantity;
				}
			public WebElement getAdressradiobtn() {
				return Adressradiobtn;
				}
			public WebElement getSearchicon() {
				return Searchicon;
				}
			public WebElement getServicenametxtfeild() {
				return Servicenametxtfeild;
				}
			public WebElement getAddservicesbtn() {
				return Addservicesbtn;
				}
			public WebElement getImportservices() {
				return Importservices;
				}
			public WebElement getExportServices() {
				return ExportServices;
				}
			public WebElement getExportservicesbtn() {
				return Exportservicesbtn;
				}
			public WebElement getSalesorder() {
				return Salesorder;
				}
			public WebElement getPurchaseorder() {
				return Purchaseorder;
				}
}
	

