package com.Util;

import java.io.FileInputStream;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CommonUtils {
	public static FileInputStream fis ;
	public static Properties config;
	public static Playwright playwright;
	public static Browser  browser;
	public static Page page;
	
	public static void readPropertiesFile() {
		
		// to Acess the config file

		//create the memory space for config file
		  try {
		        fis = new FileInputStream("C:\\Users\\mounika\\Downloads\\Selenium software dump\\HRMSProject\\com.HrProject\\src\\test\\resource\\config.properties");
		      //create the memory space for config file
		        config = new Properties(); // ✅ Assign to the class-level variable
		        //store the config file
		        config.load(fis);
		    } catch(Exception e) {
		    	TestNGUtil.assertFail(e.getMessage());
		    }
		}
	
	public static void startBrowser() {
	   if (config == null) {
	    	TestNGUtil.assertFail("Config file not loaded. 'config' is null.");
	        return;
	    }

	    String browserName = config.getProperty("browser"); // e.g., "firefox"
	    playwright = Playwright.create();

	    switch (browserName.toUpperCase()) {
	        case "CHROME":
	            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	            break;

	        case "FIREFOX":
	            browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
	            break;

	        default:
	        	TestNGUtil.assertFail("Unsupported browser: " + browserName);
	            return;
	    }

	    page = browser.newPage();
	    page.navigate("http://127.0.0.1/orangehrm-2.5.0.2/login.php"); // safer than hardcoding
	}

	public static Locator findElement2(String selector) {
	    Locator element = null;
	    try {
	        element = page.locator(selector); // ✅ assign to element
	    } catch (Exception e) {
	    	TestNGUtil.assertFail(e.getMessage());
	    }
	    return element;
	}
		
	public static void entervalue2(String selector, String value) {
	    try {
	        Locator element = page.locator(selector);
	        element.fill("");       // clear the field
	        element.fill(value);    // enter the new value
	    } catch (Exception e) {
	        TestNGUtil.assertFail(e.getMessage()); // ensure correct utility class name
	    }
	}
		

			public static void clickElement(String selector) {
				try {
					//findElement2(selector).click();
					page.locator(selector).click();
				}catch(Exception e)
				{
					
					TestNGUtil.assertFail(e.getMessage());
				}
			
			
		}

			public static String getElementText(String selector) {
				
				String text=null;
			try {
				text= page.locator(selector).textContent();
				
			}catch(Exception e)
			{
				
				TestNGUtil.assertFail(e.getMessage());
			}
			
				return text;
			}

		}
	
	

