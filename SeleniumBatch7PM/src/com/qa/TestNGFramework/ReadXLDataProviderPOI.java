package com.qa.TestNGFramework;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.Xls_dataProvider;

public class ReadXLDataProviderPOI {

	@Test(dataProvider="testdata")
	public void login(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\SeleniumAutomation\\BrowserExe\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		//http://newtours.demoaut.com/index.php
		//http://newtours.demoaut.com/mercuryregister.php
		driver.get("http://newtours.demoaut.com/mercurywelcome.php?osCsid=a4e8311a49829ce060826da517fd2aad");
	    driver.findElement(By.name("userName")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("login")).click();
	    driver.close();
		
	}
	@DataProvider(name="testdata")
		public Object [][] readExcel()
		{
			Object data[][]= Xls_dataProvider.getTestData("Login");
			return data;	
		}
		
		
	}
	
	/*
	  package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.Xls_dataProvider;

public class DataProvider1 {



	@Test(dataProvider="testdata")
	public void login(String username, String password)
	{
		WebDriver driver=  new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php?osCsid=a4e8311a49829ce060826da517fd2aad");
	    driver.findElement(By.name("userName")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("login")).click();
	    driver.close();
		
	}
	@DataProvider(name="testdata")
		public Object [][] readExcel()
		{
			Object data[][]= Xls_dataProvider.getTestData("Sheet1");
			return data;	
		}
		
		
	}

	 */
	

