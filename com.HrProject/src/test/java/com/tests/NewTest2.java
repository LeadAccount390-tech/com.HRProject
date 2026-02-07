package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
	public class NewTest2 {
		
		Playwright playwright;
		Browser  browser;
		Page driver;
		
	  @Test
	  public void verifyWelcomePage() {
		
		  driver.navigate("https://admin-demo.nopcommerce.com/admin/");
		  
		  //get the title of the web page
		  String title=driver.title();
		  
		  System.out.println("title of the webpage"+title);
		  
		  Assert.assertEquals(title, "nopCommerce demo store. Login");
		  
	       driver.locator("[id='Email']").fill("admin@yourstore.com");
	       
	       driver.locator("[id='Password']").fill("admin");
	       
	       driver.locator("[class='button-1 login-button']").click();
	       
	      
		 driver.locator("xpath=/html/body/div[3]/nav/div/ul/li[3]/a").click();
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
		  		  

	  }
	}
