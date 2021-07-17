package com.qa.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.poi.hslf.util.SystemTimeUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public String drivePath = "C:\\workspace\\SeleniumBatch7PM\\geckodriver.exe";
	public String baseURL = "http://demo.guru99.com/test/web-table-element.php";
	public WebDriver driver;
	String xpathExpression = "//table[@class = 'dataTable']";
	
	
  @Test
  public void findTheTable() {
	  
	  WebElement table = driver.findElement(By.xpath(xpathExpression));
	  List <WebElement> columns = driver.findElements(By.xpath(xpathExpression)));
	  System.out.println("No. of Columns "+columns);
	  List <WebElement> rows = driver.findElements(By.xpath(xpathExpression));
	  System.out.println("No. of Rows "+rows);
	  
 	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("WebDriver.geckco.driver, drivePath);
	  driver = new FirfoxDriver();
	  driver.get(baseURL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  System.out.println("Before Test: Launching the Browser");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
	  driver.close();
  }

}
