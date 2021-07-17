package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestCaseExecution {
	
	public WebDriver driver;
	SoftAssert SA = new SoftAssert();
	
	
	@Test
	public void testCase1(){
		long startTimeTC1 = System.currentTimeMillis();
		System.out.println("TestCase1 executing in thread named..."+Thread.currentThread().getName());
		System.out.println("TestCase1 executing in thread id..."+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("TestNG Interview Questions");
		long endTimeTC1 = System.currentTimeMillis();
		long time = endTimeTC1-startTimeTC1;
		System.out.println("TimeTakenForTC1 "+time);
		System.out.println("1111111111111111111111111111111111111111111111111");
		
	}
	
	@Test
	public void testCase2(){
		long startTimeTC2 = System.currentTimeMillis();
		System.out.println("TestCase2 executing in thread named..."+Thread.currentThread().getName());
		System.out.println("TestCase2 executing in thread id..."+Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("TestNG Interview Questions");		
		long endTimeTC2 = System.currentTimeMillis();
		long time = endTimeTC2-startTimeTC2;
		System.out.println("TimeTakenForTC2 "+time);
		System.out.println("222222222222222222222222222222222222222222222222222222222222222222");
		
		
	}
	

}
