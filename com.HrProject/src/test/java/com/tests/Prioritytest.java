package com.tests;

import org.testng.annotations.Test;


public class Prioritytest {

	@Test(priority = 0)
	public void login() {

		System.out.println("Login Successful");
	}

	@Test(priority = 1)
	public void checkEmail() {
		System.out.println("checkEmail Successful");
	}

	@Test(priority = 2, enabled = false)
	public void search() {
		System.out.println("search Successful");
	}

	@Test(priority = 3)
	public void logout() {
		System.out.println("logout Successful");
	}

}

