package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithyakalyani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&authMechanism=primary&done=https%3A%2F%2Fmail.yahoo.com%2Fd&eid=100&as=1&login=mg_nithya&crumb=ffbbMiEBnvW");
		/*driver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26.partner%3Dnone%26.src%3Dfp");
		 
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("username"));
		//e1.clear();
		
		Thread.sleep(3000);
		
		WebElement e2 = driver.findElement(By.id("login-signin"));
		e2.click();
		
		Thread.sleep(3000);
		
		WebElement e3 = driver.findElement(By.id("username-error"));
		
		Thread.sleep(3000);
		String errorText = e3.getText();
		System.out.println(errorText);
		
		Thread.sleep(3000);
		
		driver.close();*/
		driver.manage().window().maximize();
		  
		  driver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26.partner%3Dnone%26.src%3Dfp");
		  //driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1549578926&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d480a11aa-d42f-0f31-17af-d564936672ac&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		 
		  //driver.findElement(By.name("signin")).click();
		  driver.findElement(By.id("idSIButton9")).click();
		  
		  
		  Thread.sleep(3000);
		  
		  //String errormsg= driver.findElement(By.id("username-error")).getText();
		  
		  String errorText = driver.findElement(By.id("usernameError")).getText();
		  
		  
		  //System.out.println(errormsg);
		  
		  System.out.println(errorText);
		
		  Thread.sleep(3000);
		  
		  driver.close();
		  /*
WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://docs.seleniumhq.org/");
  
  //WebElement which will store the location of link
  
  WebElement e= driver.findElement(By.linkText("Selenium WebDriver"));
  
  e.isDisplayed();
  e.isEnabled();
  e.click();
  
  
  System.out.println(driver.getTitle());
  //sponsor the Selenium project
  
  //Remote Control to WebDriver Migration Notes
  
  
  //WebElement e2= driver.findElement(By.linkText("Remote Control to WebDriver Migration Notes"));
  Thread.sleep(3000);
  WebElement e1= driver.findElement(By.partialLinkText("WebDriver Migration Notes"));
  e1.isDisplayed();
  e1.isEnabled();
  e1.click();
  
  




8:09 PM

h2kinfosys training

System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32\\chromedriver.exe");
  

	*/	
		
		
		
		
	}

}
