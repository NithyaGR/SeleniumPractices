package testNGDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestApp {
	
	WebDriver driver;
	
	@BeforeClass
	public void openDriver(){
		System.out.println("Opening Driver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("done");
	}
	@Parameters({"url"})
	@Test (priority=1, description = "passing parameters from parameters.xml")
	public void openApp(String url){
		System.out.println("Opening App "+url);
		driver.get(url);
	}
	@Parameters({"searchText"})
	@Test (priority =2)
	public void searchText(String searchText){
		System.out.println("Searching the text "+searchText);
		driver.findElement(By.name("q")).sendKeys(searchText);
		driver.findElement(By.xpath("//li[@class='sbct']//div[@class='sbtc']//div//span//b[text()=' webdriver']")).click();
	}
	
	@Test (priority=3)
	public void getTitle(){
		System.out.println("get the title");
		System.out.println(driver.getTitle());
	}
	@Test (priority = 4, alwaysRun = true)
	public void closeApp(){
		System.out.println("Closing the browser");
		driver.close();
	}
}
