package practiceAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class castingPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		////li[@class='sbct']//span//b[text() = 'selenium']
		driver.findElement(By.xpath("//li[@class='sbct']//div[@class='sbtc']//div//span//b[text()=' webdriver']")).click();
		TakesScreenshot tss = (TakesScreenshot) driver;
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		System.out.println("driver instance "+driver+" hashcode  "+driver.hashCode());
		System.out.println("tss instance "+tss+" hashcode  "+tss.hashCode());
		System.out.println("jse instance "+jse+" hashcode  "+jse.hashCode());
		

	}

}
