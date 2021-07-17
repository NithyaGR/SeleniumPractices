package com.qa.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class SecondTestNGDemo {
	
	public String baseURL = "https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page";
	String drivePath = "C:\\workspace\\SeleniumBatch7PM\\geckodriver.exe"; 
	public WebDriver driver;
	
	
	
  @Test
  public void VerifyTheTitle() {
	  
	  
	  String expectedTitle = "Log in - Wikipedia";
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  System.out.println(expectedTitle);
	  if (expectedTitle.equals(actualTitle)){
		  System.out.println("Verified the Title and is correct");
	  }
	  else {
		  System.out.println("Title is wrong");
	  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Launch the browser");
	  System.setProperty("WebDriver.gecko.driver", drivePath);
	  driver = new FirefoxDriver();
	  driver.get(baseURL);
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("closing the browser");
	  //driver.close();
  }

}
