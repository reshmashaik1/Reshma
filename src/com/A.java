 package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class A {
	WebDriver  d;
	@BeforeClass
	public void setUP(){
		
	}
	@Test
	public void test(){
	d.get("http://www.facebook.com");
	}
	@AfterClass
	public void teardown(){
		d.quit();
	}
	
}
