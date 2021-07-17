package driverTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverDemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.geckodriver.driver", "C:\\workspace\\SeleniumBatch7PM\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

}
