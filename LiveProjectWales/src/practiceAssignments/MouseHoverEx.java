package practiceAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverEx {
	WebDriver driver;
	public void openWebPage(){
		
		//System.setProperty("webdriver.chrome.driver", ".//Browsers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	public void searchElement(){
		WebElement we = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.moveToElement(we);
		action.perform();
		driver.findElement(By.xpath("//span[@class ='nav-text' and text()='Recommendations']")).click();
	}

	public static void main(String[] args) {

		MouseHoverEx mouseHover = new MouseHoverEx();
		mouseHover.openWebPage();
		mouseHover.searchElement();
		

	}

}
