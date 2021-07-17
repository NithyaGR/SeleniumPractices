package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTests2 {
	
	@Test
	public void TestCase2(){
		
		System.out.println("TestCase 2's "+Thread.currentThread().getName());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("TestNG Interview Questions");
		driver.close();
		System.out.println("Closing the Chrome Browser");
		
	}

}
