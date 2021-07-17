package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingButtonsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithyakalyani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nithyakalyani\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nithyakalyani\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.out.println("Connection Made");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/index.php");
		
		System.out.println("Opening the URL");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.name("userName"));
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		e.sendKeys("username");
		
		WebElement e1 = driver.findElement(By.name("password"));
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
		e1.sendKeys("Password");
		
		Thread.sleep(3000);
		// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input
		WebElement e2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
		System.out.println(e2.isDisplayed());
		System.out.println(e2.isEnabled());
		e2.click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		System.out.println("Closing the driver");
		driver.close();
		
	/*WebDriver driver = new ChromeDriver();
  
  driver.manage().window().maximize();
  
  driver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26.partner%3Dnone%26.src%3Dfp");
 
  driver.findElement(By.id("login-signin")).click();
  
  Thread.sleep(3000);
  
  String errormsg = driver.findElement(By.id("username-error")).getText();
  
  System.out.println(errormsg);*/
		
		
		
		
		
	}

}
