package com.qa.TestNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations3 {

	
    WebDriver driver;
    
    @BeforeClass 
    
    public void openBrowser()
    {
    	
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://overview.mail.yahoo.com/");
    	System.out.println("BeforeClass - opening the browser");
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    }
    
	
	//@Test(priority = '1')
    
    @BeforeMethod
	public void login()
	
	{
		System.out.println("Before MEthod - Login");
	}
	
	@Test (priority = '2')
	public void compose()
	{
		System.out.println("Compose");
		
	}
	@Test (priority = '3')
	public void search()
	{
		System.out.println("Search");
	}
	
	@Test (priority = '4')
	public void delete()
    {
	    System.out.println("Delete"); 
	
	}
	//@Test (priority = '5')
	
	@AfterMethod
	public void logout()
	{
		System.out.println("After Method - Logout");
	}

	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AfterClass");
		driver.close();
		System.out.println("Closing the browser");
	}
	
}
