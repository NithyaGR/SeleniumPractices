package practiceAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nithyakalyani/Downloads/SeleniumJavaByShantosh/IframeEx.html");
		
		/*
		 * switching between frames using index
		 */
		for(int i=0;i<3;i++){
			driver.switchTo().frame(i);
			System.out.println("Index of Current Frame is "+i);
			System.out.println(driver.getTitle());
			driver.switchTo().parentFrame();
			
		}
		/*
		 * switching between frames using id first and then name
		 * 
		 */
		
		driver.switchTo().frame("actiMind");
		System.out.println("in the actiTime frame");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@class='c-hor-nav-toggler']")).click();
		driver.switchTo().defaultContent();
		
		//switching between frames using name
		driver.switchTo().frame("demoTours");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("in demo tours frame");
		//driver.findElement(By.linkText("REGISTER")).click();
		driver.switchTo().parentFrame();
		
		/*
		 * switching between frames as webelement
		 */
		WebElement iFrameEle = driver.findElement(By.xpath("//iframe[@title='Login']"));
		driver.switchTo().frame(iFrameEle);
		driver.findElement(By.id("email")).sendKeys("Nithya");
		System.out.println("finding iframe using xpath");
		driver.switchTo().defaultContent();
		
		
	}

}
