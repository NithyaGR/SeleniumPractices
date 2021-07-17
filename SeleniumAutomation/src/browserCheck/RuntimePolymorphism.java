package browserCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphism {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "./BrowserExe/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
		System.setProperty("webdriver.gecko.driver", "./BrowserExe/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
		
		

	}

}
