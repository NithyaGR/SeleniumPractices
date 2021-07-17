package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		//ul[@role='listbox']/child::li[@class='sbct']
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		//WebElement e1 = driver.findElement(By.xpath("//ul[@role='listbox']/child::li[@class='sbct']"));
		
		//Select selectObject = new Select(driver.findElement(By.xpath("//ul[@role='listbox']/child::li[@class='sbct']")));
		
		List <WebElement> e2 = driver.findElements(By.xpath("//ul[@role='listbox']/child::li[@class='sbct']"));
		
		
		System.out.println(e2.size());
		
		String s1 = "testing moms";
		
		for (int i = 0; i < e2.size(); i++)
		{
			if ( (e2.get(i).getText().equals(s1)))
			{
			   System.out.println(e2.get(i).getText());
			   break;
			}  
			
		}
		
		driver.close();
	}

}
