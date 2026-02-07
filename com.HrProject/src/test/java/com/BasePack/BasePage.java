package com.BasePack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Util.CommonUtils;
import com.microsoft.playwright.Page;

public class BasePage {
	
	public Page page; 
 // @Test
 // public void startingTheBrowser() {
 // }
  @BeforeTest
  public void setup () {
	  
	  CommonUtils.readPropertiesFile();
	  CommonUtils.startBrowser();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
