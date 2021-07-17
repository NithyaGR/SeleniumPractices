package testNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SampleTestNG {
	
	@Test (priority = 2)
	public void TestCase2(){
		System.out.println("Test Method2");
	}
  @Test (priority = 1)
  public void TestCase1() {
	  System.out.println("Test Method1");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
