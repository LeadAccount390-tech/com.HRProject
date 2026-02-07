package com.pages;

import com.Util.CommonUtils;
import com.Util.TestNGUtil;

public class LoginPage {

	private String by_username="input[name='txtUserName']";
	private String by_password="input[name='txtPassord']";
	private String by_login="input[name='Submit']";
	private String by_welcomePage = "xpath=/html/body/div[3]/ul/li[1]";
	
	public void login() {
		try {
			CommonUtils.entervalue2(getusername(),"selenium");	 
			CommonUtils.entervalue2(getpassword(),"selenium");
			CommonUtils.clickElement(getLogin());
			
			System.out.println("welcome to git");
			
		}catch(Exception e) {
			
			TestNGUtil.assertFail(e.getMessage());
			
		}
	}
	
	
	public String  getusername() {
		return by_username;
	}
		public String  getpassword() {
			return by_password;
		}
		
			public String  getLogin() {
				
				return by_login;
			}
			
				public String  welcomePage() {
					return by_welcomePage;
				}	
				
				
				}

