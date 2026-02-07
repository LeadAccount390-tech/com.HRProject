package com.Test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Annotations {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("connecting to database..........");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void beforClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void testCaseOne()
	{
		System.out.println("testCaseOne");
	}
	
	@Test
	public void testCaseTwo()
	{
		System.out.println("testCaseTwo");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("disconnecting to database..........");
	}
	
}
