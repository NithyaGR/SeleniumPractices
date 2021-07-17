package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("scroll(0,700)");
		
		//System.out.println("Scrolling down to 700 pixels");
		
		Thread.sleep(3000);
		WebElement we = driver.findElement(By.xpath("//div[@ class = 'selenium-backers separator']"));
		System.out.println(we.getText());
		
		Thread.sleep(3000);
		
        js.executeScript("arguments[0].scrollIntoView(true);",we);
		
		System.out.println("Scrolling down to the exact location" );
		//WebElement e1 = driver.findElement(By.linkText("Selenium IDE"));
		//*[@id="mainContent"]/p[3]/a[2] full list of sponsors
		Thread.sleep(6000);
		//js.executeScript("arguments[0].scrollIntoView(true);",e1);
		
		System.out.println("Scrolling down to the exact location" );
		
		Thread.sleep(6000);
		WebElement e2 = driver.findElement(By.linkText("full list of sponsors"));
		
		System.out.println(e2.getAttribute("xpath"));
		
		e2.click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		System.out.println();
		System.out.println();
		driver.close();
		
		System.out.println("Closing");
		
		
	}

}
