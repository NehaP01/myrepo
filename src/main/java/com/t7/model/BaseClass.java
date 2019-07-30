package com.t7.model;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BaseClass {
	CommonLibrary comlib = new CommonLibrary();
	WebDriver  driver;
	
	//public  BaseClass() {
	//	comlib = new CommonLibrary();
	//}
	
	@BeforeClass
	public void startup() {
		
	 comlib.launchBrowser(ConfigurationLibrary.browser,ConfigurationLibrary.URL);
		
	}
	
	@Test
	public void test() {
		System.out.println("tested successfully");
	}

}
