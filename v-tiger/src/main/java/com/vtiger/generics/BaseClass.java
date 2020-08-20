package com.vtiger.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vtiger.pom.AdministratorPage;
import com.vtiger.pom.LoginPage;


public class BaseClass {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public WebDriver driver;
	public FileLib f=new FileLib();
	@BeforeClass
	public void openbrowser()
	{
		System.out.println("open browser");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		System.out.println("login");
		String un = f.getPropertyData("un");
		String pwd=f.getPropertyData("pwd");
		String url =f. getPropertyData("url");
		
		driver.get(url);
		System.out.println(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
		
		WebElement img = driver.findElement(By.xpath("//img[contains(@src,'user')]"));
		Actions a=new Actions(driver);
		a.moveToElement(img).perform();
		
		AdministratorPage ap=new AdministratorPage(driver);
		ap.clickLogout();
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("close browser");
		driver.close();
	}
}
