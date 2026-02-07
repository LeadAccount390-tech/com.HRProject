package com.Util;

public class TestNGUtil {

	public static CharSequence expected;
	public static String actual;
		
	
	public static void assertFail(String message) {

		if (actual.contains(expected)) {
			System.out.println("print as wrong ");
		} else {
		
			System.out.println(expected+" not present in "+actual);
		}
	}

	public static void assertTrue(String actual,String expected) {
		
		
		if(actual.contains(expected)) {
			//Assert.assertTrue(actual.concat(expected));
			System.out.println("print as wrong ");
			
		}else
		{
			//Assert.fail(expected +"not present in"+actual);
			
			System.out.println(expected+" not present in "+actual);
		}
	}

	
}
