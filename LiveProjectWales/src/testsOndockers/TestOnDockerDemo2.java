package testsOndockers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOnDockerDemo2 {
	
	@Test
	public void openGoogleApp() throws MalformedURLException{
		
		DesiredCapabilities cap = new DesiredCapabilities(); 
		cap.setBrowserName(BrowserType.FIREFOX);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:32771/wd/hub"), cap);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
	}

}
