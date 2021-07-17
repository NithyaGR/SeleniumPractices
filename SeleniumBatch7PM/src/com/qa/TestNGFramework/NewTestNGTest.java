package com.qa.TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class NewTestNGTest {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String drivePath = "C:\\workspace\\SeleniumBatch7PM\\geckodriver.exe";
	public WebDriver driver;
	
	
  @Test
  public void veifyHomePageTitle() {
	  System.out.println("Launching the browser");
	  System.setProperty("WebDriver.gecko.driver", drivePath);
	  System.out.println("Opening the WebPage");
	  driver = new FirefoxDriver();
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  if(expectedTitle.equals(actualTitle)){
		 System.out.println("Home Page Title is verified and is correct");
	 }
	  driver.close();
  }
}
