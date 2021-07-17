package com.qa.TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNGAnnotations1 {
	
	WebDriver driver;
	
	@Test(priority = '1')
	public void login()
	
	{
		System.out.println("Login");
	}
	
	@Test (dependsOnMethods = {"login"}, priority =2, enabled = false)
	public void compose()
	{
		System.out.println("Compose");
		
	}
	@Test (dependsOnMethods = {"login"}, priority = 3, timeOut=100)
	public void search()
	{
		System.out.println("Search");
		Assert.assertEquals(true, true);
		
	}
	
	@Test (dependsOnMethods = {"search"}, priority = '4')
	public void delete()
    {
	    System.out.println("Delete"); 
	
	}
	@Test (priority = '5', alwaysRun=true)
	public void logout()
	{
		System.out.println("Logout");
	}

}
