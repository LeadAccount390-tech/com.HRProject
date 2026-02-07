package com.Test1;

import org.testng.annotations.Test;

import com.BasePack.BasePage;
import com.Util.CommonUtils;
import com.Util.TestNGUtil;
import com.pages.LoginPage;
import com.pages.PIMPage;

public class TestPIMPage extends BasePage {

	static LoginPage LoginPage = new LoginPage();
	PIMPage pimpage = new PIMPage();
     @Test(description="verify wether the employee is added or not")
	public static void addEmployeeThenVerify() {
	
	LoginPage .login();
	
	//validate welcome message
	
	TestNGUtil.assertTrue(CommonUtils.getElementText(LoginPage.welcomePage()),"Welcome Selenium");

	}
	}


