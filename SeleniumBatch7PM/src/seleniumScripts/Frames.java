package seleniumScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		
		Thread.sleep(3000);
		//Get Selenium
		//driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"menu_download\"]/a"));
		e1.click();
		/*Alert a = driver.switchTo().alert();
		a.dismiss();*/
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.linkText("other languages exist"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",e2);
		
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.linkText("Javadoc"));
		e3.click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		// moving the driver control to frame 0
		driver.switchTo().frame("packageListFrame");
		System.out.println("Driver is in Frame 0");
		WebElement e4 = driver.findElement(By.linkText("org.openqa.selenium"));
		e4.click();
		//The above click moves the frame 1 to another set of links
		
		//To go back
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.switchTo().frame("packageFrame");
		System.out.println("Driver is in Frame 1");
		//driver.switchTo().frame(1);
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Alert")).click();
		driver.navigate().back();
		// This changes the content of Frame 2;
		
		Thread.sleep(3000);
		
		System.out.println("Switching to frame 2");
		driver.switchTo().frame("classFrame");
		//Now the cursor or control is on Frame 2.
		System.out.println("Driver is in frame 2");
		System.out.println(driver.getTitle());
		
		System.out.println("closing the driver");
		driver.close();
		
		
		
		
	}

}
