package com.vtiger.testscripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.OrganizationPage;
import com.vtiger.pom.ServicesPage;

public class EditOrganization extends BaseClass{

	@Test
	public void editorganization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		WebElement more = driver.findElement(By.xpath("//a[.='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		
		Reporter.log("opening the service page", true);
		ServicesPage s=new ServicesPage(driver);
		s.getServices().click();
		
		Reporter.log("clicking on the service name", true);
		s.getServiceName().click();
		
		Reporter.log("click on more information link", true);
		s.getMoreinfolink().click();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,5000)");
		
		Reporter.log("click on organization", true);
		OrganizationPage o=new OrganizationPage(driver);
		
		o.getOrganization().click();
		o.getSelectorganization().click();
		
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> i=allwh.iterator();
		String pid = i.next();//parent browser
		String cid = i.next();//child browser
		driver.switchTo().window(cid);
		
		Reporter.log("clicking on apporpriate organization", true);
		Thread.sleep(2000);
		String org = o.getOrganizationname().getText();
		o.getOrganizationname().click();
		driver.switchTo().window(pid);
		
		Reporter.log("verify if the organization is selected or not", true);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.textToBePresentInElement(o.getSelectedOrg(), org));
		
		String org1 = o.getSelectedOrg().getText();
		Assert.assertEquals(org1, org);
		Reporter.log("select the organization to be edited",true);
		o.getSelectedOrg().click();
		Reporter.log("click on edit button",true);
		o.getEditBtn().click();
		
		String detail = f.getExcelData("Organization", 3, 1);
		Reporter.log("edit the organization name", true);
		o.getEditdetail().clear();
		o.getEditdetail().sendKeys(detail);
		o.getSavebtn().click();
		
		Reporter.log("verify if the detail is edited or not", true);
		o.getOrglink().click();
		List<WebElement> allorg = driver.findElements(By.xpath("//a[@title='Organizations']"));
		for(WebElement ao:allorg)
		{
			String text = ao.getText();
		if(detail.equals(text))
		{
			Reporter.log("organization is edited successfully", true);
		}
		}
		
	}
}
