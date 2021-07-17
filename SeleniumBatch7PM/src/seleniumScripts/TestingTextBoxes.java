package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;//Ask this doubt
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingTextBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithyakalyani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();	
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");
		Thread.sleep(3000);
		
		boolean display;
		display = driver.findElement(By.name("wpName")).isDisplayed();
		System.out.println(display);
		
		boolean enable;
		enable = driver.findElement(By.name("wpName")).isEnabled();
		System.out.println(enable);
		
		driver.findElement(By.name("wpName")).sendKeys("NithyaKumaravel");
		
		driver.findElement(By.name("wpPassword")).sendKeys("nithya");
		
		driver.findElement(By.id("wpRetype")).sendKeys("nithya");
		
		//*[@id="wpRetype"]
		
		driver.findElement(By.xpath("//*[@id=\"wpEmail\"]")).sendKeys("nithya@gmail.com");
		
		//*[@id="wpEmail"]
		
		String attribute1;
		
		attribute1 = driver.findElement(By.name("wpName")).getAttribute("placeholder");
		
		System.out.println(attribute1);

		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
