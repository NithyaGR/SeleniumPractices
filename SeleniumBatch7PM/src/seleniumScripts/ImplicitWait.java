package seleniumScripts;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumhq.org/");
		
		driver.manage().window().maximize();
		
		//implicit wait
		System.out.println("Implicit Wait");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		//js.executeScript("scroll(0,700)");
		
		//System.out.println("Scrolling down to 700 pixels");
		
		//Thread.sleep(3000);
		
		//explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,3);
		
		
		WebElement e1 = driver.findElement(By.linkText("Selenium IDE"));
		
		System.out.println("Explicit Wait");
		
		wait.until(ExpectedConditions.visibilityOf(e1));
		//*[@id="mainContent"]/p[3]/a[2] full list of sponsors
		//Thread.sleep(6000);
		js.executeScript("arguments[0].scrollIntoView(true);",e1);
		
		System.out.println("Scrolling down to the exact location" );
		
		//Thread.sleep(6000);
		FluentWait <WebDriver> wait2 = new FluentWait <WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		WebElement e2 = wait2.until(new Function<WebDriver,WebElement>()
				{
			     public WebElement apply(WebDriver driver)
			              {
			    		   WebElement e2 = driver.findElement(By.linkText("full list of sponsors"));
			    		   return e2;
			    		   }
			    		    
			     });
		/*FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(10))
			          .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
			          
			   
			   WebElement element = wait.until
			     (new Function<WebDriver, WebElement>() 
			     {
			   public WebElement apply(WebDriver driver) {
			   WebElement element = driver.findElement(By.xpath(""));
			   
			   return element;
			   }
			     });	*/
		
		System.out.println(e2.getAttribute("xpath"));
		
		e2.click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		

		driver.close();
		
		System.out.println("Closing");
		
		
	}

}
