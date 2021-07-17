package classAssignments;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
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

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchLinkHashMap {

	
	public static WebDriver driver;
	public static void getWebPage(){
		
		//System.setProperty("webdriver.chrome.driver",".//Browsers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
	}
	public static void highlightElement(WebElement ele){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red;')", ele);
	}
	
	public static void takeScreenShot(String fLocation){
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile.getAbsolutePath());
		File destFile = new File(fLocation);
		try {
			FileHandler.copy(srcFile, destFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void searchContentLink(int i){
		
		
			List <WebElement> contents = driver.findElements(By.tagName("a"));
			HashMap <Integer, List<WebElement>> hMap = new HashMap<Integer, List<WebElement>>();
			hMap.put(i, contents);
			System.out.println("Size of hMap :"+hMap.size());
			System.out.println(hMap.values());
			System.out.println("Total No. Of Links in Page "+i+" is :"+ hMap.values().size());
			int count = 0;
			for (WebElement links : contents) {
				if(links.getText().contains("Selenium Interview Questions")){
					count++;
					System.out.println(links.getText()+ " TestCase Pass");
				}
				else{
					System.out.println("TestCase Fail");
				}
			}
			System.out.println("Total No. of Links with the correct Seatch Text is :"+count);
		}
	
	public static void searchText(){
		
		WebElement searchTextBox = driver.findElement(By.name("p"));
		searchTextBox.sendKeys("Selenium ");
		takeScreenShot("yahooSearchPage.jpg");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement searchElement = driver.findElement(By.xpath("//li[@data = 'selenium interview questions']"));
		highlightElement(searchElement);
		searchElement.click();
	}
	
	public static void checkPagination(){
		
		for(int i=1;i<=4;i++){
			searchContentLink(i);
			String xpathString = "//a[text()='"+(i+1)+"']";
			WebElement linkBox = driver.findElement(By.xpath(xpathString));
			//String linkText = "+i+1";
			//WebElement linkBox = driver.findElement(By.linkText(""));
			highlightElement(linkBox);
			linkBox.click();
			//driver.findElement(By.xpath("//a[text()='2']")).click();//the id keeps changing-thats why xpath
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			searchContentLink(i);
		}
	}
	
	public static void main(String[] args) {
		
		getWebPage();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		searchText();
		checkPagination();
		driver.close();	
		
		
	}

}
