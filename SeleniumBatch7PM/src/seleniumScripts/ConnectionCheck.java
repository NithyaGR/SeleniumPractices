package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ConnectionCheck {

	/**
	 * @
	 * @author Nithyakalyani
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\workspace\\LiveProjectWales\\Browsers\\chromedriver.exe");
		System.getProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nithyakalyani\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver1 = new ChromeDriver();
		System.out.println("Connectin done");
		//WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");
		Thread.sleep(6000);
		System.out.println("Opening the page");
		try{
			Alert a = driver1.switchTo().alert();
			System.out.println("Alert Object");
			Thread.sleep(3000);
			System.out.println(a.getText());
			a.dismiss();
			Thread.sleep(3000);
		}
		catch (NoAlertPresentException ne){
			System.out.println("No Alert Present Exception");
		}
		//Select mySelect = new Select
		driver1.findElement(By.id("wpName2"));
		driver1.findElement(By.id("wpName2")).sendKeys("Nithya");
		Thread.sleep(3000);
		WebElement we1 = driver1.findElement(By.name("wpPassword"));
		we1.sendKeys("Nithya");
		Thread.sleep(3000);
		//driver1.close();
		
	}

}
                                                            