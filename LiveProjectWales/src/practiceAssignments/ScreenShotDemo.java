package practiceAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShotDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\LiveProjectWales\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		TakesScreenshot tsh = (TakesScreenshot) driver;
		java.io.File srcFile = tsh.getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile.getAbsolutePath());
		
		File destFile = new File("googleSearch1.jpg");
		try {
			FileHandler.copy(srcFile, destFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
