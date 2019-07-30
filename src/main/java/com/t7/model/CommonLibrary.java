package com.t7.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonLibrary {
	
	WebDriver driver;
	
	public CommonLibrary(){
		//this.driver=driver;

	}
	
	public void launchBrowser(String browserName,String url) {
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\703204847\\CoraJourney360\\Drivers\\chromedriver.exe");	
		    driver= new ChromeDriver();
			}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\703204847\\CoraJourney360\\Drivers\\chromedriver.exe");	
			driver= new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\703204847\\CoraJourney360\\Drivers\\chromedriver.exe");	
			driver= new EdgeDriver();
		}
		else if(browserName.equals("ie")) {
			System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\703204847\\CoraJourney360\\Drivers\\chromedriver.exe");	
			driver= new InternetExplorerDriver();
			
		}
		else {
			
        	System.out.println("Browser is not found");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
	}

}
