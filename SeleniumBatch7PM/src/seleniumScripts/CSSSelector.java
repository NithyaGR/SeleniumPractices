package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelector {
	 public static void main(String[] args) {
		 
		 String drivePath = "C:\\workspace\\SeleniumBatch7PM\\geckodriver.exe"; 
		 System.setProperty("WebDriver.gecko.driver", drivePath);
		 String baseURL = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		 WebDriver driver = new FirefoxDriver();
		 driver.get(baseURL);
		 WebElement we = driver.findElement(By.cssSelector("input#identifierId"));
		 we.sendKeys("nithyakalyanigovindarajan");
		 
		 
	}

}
