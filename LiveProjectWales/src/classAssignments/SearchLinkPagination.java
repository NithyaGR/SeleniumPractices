package classAssignments;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SearchLinkPagination {
	
	public static WebDriver driver;
	
	public static void takeScreenShot(String location){
		TakesScreenshot tsh = (TakesScreenshot) driver;
		File srcFile = tsh.getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile.getAbsolutePath());
		File destFile = new File(location);
		
		try{
			FileHandler.copy(srcFile, destFile);//org.openqa.selenium.io
			
		}
		catch (Exception e){
			System.out.println("Exception in handling File: "+e.getMessage());
		}
	
	}
	public static void highlightElement(WebElement ele){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red;')", ele);
		
	}
	public static void getWebPage(){
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\LiveProjectWales\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
	}
	public static void checkContentLinks(String searchText){
		
		List <WebElement> contents = driver.findElements(By.tagName("a"));
		for (WebElement links : contents) {
			if(links.getText().contains(searchText)){
				System.out.println(links.getText() +" Test Case Pass");
			}
			else {
				System.out.println("Test Case Fail");
			}
			
		}
		
	}

	public static void main(String[] args) throws Exception {
		
		
		getWebPage();
		Thread.sleep(3000);
		WebElement searchTextBox = driver.findElement(By.id("header-search-input"));
		searchTextBox.sendKeys("Selenium");
		takeScreenShot("yahooSearchPage.jpg");
		Thread.sleep(5000);
		
		WebElement searchElement = driver.findElement(By.xpath("//li[@data = 'selenium interview questions']"));
		highlightElement(searchElement);
		searchElement.click();
		Thread.sleep(3000);
		
		checkContentLinks("Selenium Interview Questions");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		takeScreenShot("SearchPage1.jpg");
		
		WebElement button2 = driver.findElement(By.xpath("//a[text()='2']"));
		highlightElement(button2);
		button2.click();
		//driver.findElement(By.xpath("//a[text()='2']")).click();//the id keep changes-thats why xpath
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		checkContentLinks("Selenium Interview Questions");
		
		WebElement button3 = driver.findElement(By.xpath("//a[text()='Next']"));
		//driver.findElement(By.xpath("//a[text()='Next']")).click();
		highlightElement(button3);
		button3.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		checkContentLinks("Selenium Interview Questions");
		
		WebElement button4 = driver.findElement(By.xpath("//a[text()='4']"));
		highlightElement(button4);
		button4.click();
		//driver.findElement(By.xpath("//a[text()='4']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		checkContentLinks("Selenium Interview Questions");
		
		WebElement button5 = driver.findElement(By.xpath("//a[text()='5']"));
		highlightElement(button5);
		button5.click();
		//driver.findElement(By.xpath("//a[text()='5']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		checkContentLinks("Selenium Interview Questions");
		driver.close();
		
		
		
	}

}
