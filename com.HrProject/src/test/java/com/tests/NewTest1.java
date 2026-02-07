package com.tests;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
public class NewTest1 {
	
	Playwright playwright;
	Browser  browser;
	Page driver;
	
  @Test
  public void verifyWelcomePage() {
	
	  driver.navigate("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  
	  //----------------------------------operation code
	  
	  //get the title of the web page
	  String title=driver.title();
	  
	  System.out.println("title of the webpage"+title);
	  
	  //-----------------------------verification code
	  
	  Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");	
	 
	 //identify the username
	 driver.locator("[name='txtUserName']").fill("selenium");
	 
	 //identify the password
	 driver.locator("[name='txtPassword']").fill("selenium");
	 
	 //identify and click the login
	 driver.locator("[name='Submit']").click();
	 
	 //identify text
	 String  text = driver.locator("xpath=/html/body/div[3]/ul/li[1]").textContent();
	 
	 System.out.println(text);
	 
	 if(text.equals("Welcome selenium")) 
	 {
		 System.out.println("Welcome page verified successfully");
	 }
	 else
	 {
		 System.out.println("Welcome page not verified successfully");
	 }
	 
	 driver.locator("xpath=/html/body/div[3]/ul/li[3]/a").click();
  }
  @BeforeClass 
  public void openBrowser() {
	  //start the playwright engin
	   playwright = Playwright.create();
	  
	  //open the firefox browser
	    browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
	 
	 //open the new tab (new web page) in firefox broswer
	     driver= browser.newPage();
  }
  @AfterClass
  public void closeBrowser() {	  
	  
	  driver.close();
  }
}
