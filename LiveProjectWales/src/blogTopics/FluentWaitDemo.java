package blogTopics;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://total-qa.com/");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    	    .withTimeout(Duration.ofSeconds(30))
	    	    .pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
	    
			WebElement webLink = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.partialLinkText("Write XLSX"));
				}
				});
			webLink.click();
			System.out.println("clicked");
			System.out.println(driver.getTitle());
	}
	
}
