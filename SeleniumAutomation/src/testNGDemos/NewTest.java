package testNGDemos;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
		
		@BeforeSuite
		public void beforeSuite(){
			System.out.println("before suite");
		}
		@BeforeTest
		public void beforeTest(){
			System.out.println("before Test");
		}
		@BeforeClass
		public void beforeClass(){
			System.out.println("before class");
		}
		@BeforeMethod
		public void beforeMethod(){
			System.out.println("before method");
		}
		@Test
		public void Test(){
			System.out.println("Test");
		}
		@AfterMethod
		public void afterMethod(){
			System.out.println("after method");
		}
		@AfterClass
		public void afterClass(){
			System.out.println("after class");
		}
		@AfterTest
		public void afterTest()
		{
			System.out.println("after test"); 
		}
		@AfterSuite
		public void afterSuite(){
			System.out.println("after suites");
		}
}
