package testNGPractice;

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
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchLinkHashMap {

	
	public  WebDriver driver;
	//String webPage = "https://www.yahoo.com/";
	
	@Test (priority = 0, alwaysRun=true, groups = {"Unit"})
	public void prepUp(){
		
		System.out.println("In the prepUp Method");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeDriver(){
		driver.close();
	}
	
	@Parameters ({"webPage"})
	@Test (priority = 1, description="Opening the givien WebApp", groups={"Sanity", "Unit"})
	public  void getWebPage(String webPage){
		
		//System.setProperty("webdriver.chrome.driver",".//Browsers/chromedriver.exe");
		System.out.println(webPage);
		System.out.println(driver);
		driver.get(webPage);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	public  void highlightElement(WebElement ele){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red;')", ele);
	}
	
	public  void takeScreenShot(String fLocation){
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
	public  void searchContentLink(int i){
		
		
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
					System.out.println(links.getText()+ " Matched with required text");
				}
				else{
					System.out.println("No match");
				}
			}
			System.out.println("Total No. of Links with the correct Seatch Text is :"+count);
		}
	@Parameters ({"searchText"})
	@Test (priority = 2, dependsOnMethods = {"getWebPage"}, groups={"Regression"})
	public  void searchText(String searchText){
		
		WebElement searchTextBox = driver.findElement(By.id("header-search-input"));
		searchTextBox.sendKeys(searchText);
		//takeScreenShot("yahooSearchPage.jpg");
		WebElement searchElement = driver.findElement(By.xpath("//li[@data = 'selenium interview questions']"));
		highlightElement(searchElement);
		searchElement.click();
	}
	
	@Test (priority = 3, dependsOnMethods = {"searchText"}, groups ={"Sanity","Regression"})
	public  void checkPagination(){
		
		for(int i=1;i<=4;i++){
			searchContentLink(i);
			String xpathString = "//a[text()='"+(i+1)+"']";
			WebElement linkBox = driver.findElement(By.xpath(xpathString));
			//String linkText = "+i+1";
			//WebElement linkBox = driver.findElement(By.linkText(""));
			highlightElement(linkBox);
			linkBox.click();
			//driver.findElement(By.xpath("//a[text()='2']")).click();//the id keeps changing-thats why xpath
			searchContentLink(i);
		}
	}
	

}
