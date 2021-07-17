package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\workspace\\SeleniumAutomation\\BrowserExe\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=735b4360f3ca55b099087a24b879b082");
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
				
//		Select DDobject = new Select(driver.findElement(By.name("country")));
//		//System.out.println(DDobject.selectByIndex(92)); error message
//		//System.out.println(DDobject.getOptions().get(92));
//		
//		Thread.sleep(3000);
//		DDobject.selectByVisibleText("UNITED STATES");
//		
//		Thread.sleep(3000);
//		
//		DDobject.selectByValue("92");
//		//DDobject.selectByValue("ALBANIA"); 
//		Thread.sleep(3000);
//		
//		List<WebElement> e1 = DDobject.getOptions();
//		int count = e1.size();
//		
//	
//		System.out.println("The total number of dropdown values are"+" "+count);
//		
//		for(int i =0; i<count; i++)
//		{
//			System.out.println(e1.get(i).getText());
//			/*if (e.get(i).getText()== "INDIA")
//			{
//				System.out.println(i);
//			}*/
//			
//		}
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		Select mySelect = new Select(dd);
		//mySelect.selectByVisibleText("Books");
		mySelect.selectByIndex(2);
		Thread.sleep(3000);
		mySelect.selectByValue("search-alias=amazon-devices");
//		List <WebElement> choices = mySelect.getOptions();
		
//		for (WebElement we : choices) {
//			System.out.println(we.getText());
//		}
//		for(int i=0; i<choices.size(); i++){
//			System.out.println(choices.get(i).getText());
//		}
		
		//Thread.sleep(3000);
		
		//driver.close();
		
				
				
		
		
		
		
		
		
		
		
	
	}
}	