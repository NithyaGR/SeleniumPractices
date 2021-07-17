package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.seleniumhq.org/docs/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.linkText("Introducing Selenium"));	
		Thread.sleep(3000);
		System.out.println("First Link Details");
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
		e1.click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		WebElement e2 = driver.findElement(By.partialLinkText("Team–Authors Past and Present"));

		Thread.sleep(3000);
		System.out.println("Second link Details");
		System.out.println(e2.isDisplayed());
		System.out.println(e2.isEnabled());
		e2.click();
		
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		//http://www.ironspider.ca/forms/checkradio.htm

		
		
		
		
		
		
	}

}
