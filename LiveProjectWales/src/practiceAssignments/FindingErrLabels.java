package practiceAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingErrLabels {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.out.println("Launching the Application");
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\LiveProjectWales\\Browsers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/");
		//driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Patient Login")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("username")).sendKeys("jasmine");
		driver.findElement(By.id("password")).sendKeys("9ol.<KI*");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//a[contains(@data-original-title, 'Top')]")).click();
		driver.findElement(By.id("weight")).sendKeys("13345");
		driver.findElement(By.id("weight")).sendKeys(Keys.ENTER);
		
		List <WebElement> errElements = driver.findElements(By.tagName("p"));
		System.out.println(errElements.size());
		

	}

}
