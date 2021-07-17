package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
*/
public class HandlingErrorAlert {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		System.out.println("Opened the browser");
		WebElement e1 = driver.findElement(By.name("proceed"));
		e1.click();
		System.out.println("clicking the button");
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(6000);
		System.out.println("Alert box");
		System.out.println(a.getText());
		
		Thread.sleep(5000);
		
		System.out.println("Clicking the ok/dismiss button");
		
		Thread.sleep(3000);
		a.dismiss();
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
