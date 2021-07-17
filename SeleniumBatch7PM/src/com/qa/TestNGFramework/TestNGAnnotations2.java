package com.qa.TestNGFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations2 {
	
	@BeforeMethod
	public void login()
	{
		System.out.println("BeforeMethod login");
	}
	
	@Test(priority = '1')
	public void compose()
	{
		System.out.println("TestMethod compose");
	}
	
	@Test (priority = '2')
	public void search()
	{
		System.out.println("TestMethod search");
	}
	
	@Test (dependsOnMethods = {"search"},priority = '3')
	public void modify()
	{
		System.out.println("TestMethod modify");
	}
	
	@Test (dependsOnMethods = {"search"},priority ='4')
	public void delete()
	{
		System.out.println("TestMethod delete");
	}
	//We can click on java project > TestNG > Convert to TestNG > give name of xml
	//We can have the doctype text pre-populated

	@AfterMethod
	public void logout()
	{
		System.out.println("AfterMethod logout");
	}
	
}
