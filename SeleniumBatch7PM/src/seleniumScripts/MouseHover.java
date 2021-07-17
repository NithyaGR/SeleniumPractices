package seleniumScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions actobject = new Actions(driver);
		
		WebElement we1 = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
		actobject.moveToElement(we1).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement((By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span"))).click();
		
		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
			
		//*[@id="nav-link-accountList"]/span[1]
	}

}
