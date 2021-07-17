package practiceAssignments;

import java.util.Iterator;
import java.util.Set;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		/*WebElement linkText = driver.findElement(By.partialLinkText(" Judge India "));
		linkText.click();*/
		String parentWindow = driver.getWindowHandle();
		System.out.println("Address Of Parent Window: "+parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		Thread.sleep(3000);
		System.out.println(allWindows);
		System.out.println(allWindows.size());
		
		for (String string : allWindows) {
			if(!(string.equals(parentWindow))){
				driver.switchTo().window(string);
				System.out.println("Title is "+driver.getTitle());
				System.out.println("URL is "+driver.getCurrentUrl());
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println("Title of parent window is "+driver.getTitle());
		
		//If multiple windows open, and we need to switch to those windows...
		Iterator <String> it = allWindows.iterator();
		
		for (String string : allWindows) {
			System.out.println(string);
			String childWindow = it.next();
			driver.switchTo().window(childWindow);
			System.out.println("Title is "+driver.getTitle());
			System.out.println("URL is "+driver.getCurrentUrl());
		}
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window :: "+driver.getTitle());
		driver.quit();	
		}
	    
	
	}


