package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImagePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&authMechanism=primary&done=https%3A%2F%2Fmail.yahoo.com%2Fd&eid=100&add=1");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/img"));
		WebElement e1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/img"));
		
		Thread.sleep(3000);
		System.out.println("Yahoo image details as follows");
		System.out.println("Is it displayed?"+" "+ e1.isDisplayed());
		System.out.println("Is it enabled?"+" "+ e1.isEnabled());
		System.out.println(" The class of this Yahoo image is "+" " + e1.getAttribute("class"));
		
		WebElement e2 = driver.findElement(By.xpath("/html/body/div[1]/span[1]/a/img"));
		
		System.out.println("Yahoo image link details as follows");
		System.out.println("Is the image link displayed?"+ " " + e2.isDisplayed());
		System.out.println("Is it enabled?"+ " " + e2.isEnabled());
		System.out.println("Width of the image link is"+" " + e2.getAttribute("width"));
		e2.click();
		
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("Now going to newtours demoaut website");
		
		
		driver.get("http://newtours.demoaut.com/index.php");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement e3 = driver.findElement(By.name("userName"));
		e3.sendKeys("username");
		
		WebElement e4 = driver.findElement(By.name("password"));
		e4.sendKeys("passowrd");
		
		Thread.sleep(3000);
		
		
		WebElement e5 = driver.findElement(By.name("login"));
		
		System.out.println("Details of Image Button");
				
		System.out.println("Is it displayed?"+ " " +e5.isDisplayed());
		System.out.println("Is it enabled?" +" " + e5.isEnabled());
		e5.click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
