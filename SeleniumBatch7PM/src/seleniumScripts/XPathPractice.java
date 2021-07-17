package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathPractice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://selenium.dev/");
		WebElement we1 = driver.findElement(By.xpath("//h1[@class='sub-header']"));
		System.out.println(we1.getText());
		WebElement we2 = driver.findElement(By.xpath("//h1[starts-with(text(),'Selenium')]"));
		System.out.println(we2.getText());
		WebElement we3 = driver.findElement(By.xpath("//img[@class='backer-logo']"));
		we3.click();
		System.out.println(driver.getCurrentUrl());
		
	}

}
