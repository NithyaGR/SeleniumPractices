package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametrization {
	
	WebDriver driver;
	
	@Parameters({"url","searchText"})
	@Test (description = "Passing parameters through testng.xml", groups = {"Sanity","Unit"})
	public void openApp(String url, String searchText){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(searchText);
		
		
		
		
		
		
	}
	

}
