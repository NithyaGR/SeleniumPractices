package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxesNRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//*[@id="Content"]/div[1]/blockquote[1]/form/input[1]
		
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
		System.out.println("First CheckBox Details");
		System.out.println("Is the Check Box displayed:"+" "+ e1.isDisplayed());
		System.out.println("Is it enabled?"+" "+e1.isEnabled());
		e1.click();
		System.out.println("Is it slected after click?"+" "+e1.isSelected());
		
		Thread.sleep(3000);
		////*[@id="Content"]/div[1]/blockquote[1]/form/input[3]
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[3]"));
		System.out.println("Third CheckBox Details");
		System.out.println("Is the Check Box displayed:"+" "+ e2.isDisplayed());
		System.out.println("Is it enabled?"+" "+e2.isEnabled());
		Thread.sleep(3000);
		
		e2.click();
		
		Thread.sleep(3000);
		System.out.println("Is it slected after click?"+" "+e2.isSelected());
		e2.click();
		System.out.println("After the second click isSelected Value is "+" " +e2.isSelected());
		Thread.sleep(6000);
		
		//*[@id="Content"]/div[1]/blockquote[2]/form/input[1]
		
		WebElement e3 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[1]"));
		System.out.println("First Radio Button  Details");
		System.out.println("Is it displayed:"+" "+ e3.isDisplayed());
		System.out.println("Is it enabled?"+" "+e3.isEnabled());
		e3.click();
		Thread.sleep(3000);
		
		WebElement e4 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
		System.out.println("Second Radio Button Details");
		System.out.println("Is it displayed:"+" "+e4.isDisplayed());
		System.out.println("Is it enabled?"+" "+e4.isEnabled());
		e4.click();
		System.out.println("Second Radio Button is clicked"+" "+e4.isSelected());
		Thread.sleep(3000);
		
		WebElement e5 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[3]"));
		System.out.println("Third Radio Button Details");
		System.out.println("Is it displayed:"+" "+e5.isDisplayed());
		System.out.println("Is it enabled?"+" "+e5.isEnabled());
		e5.click();
		System.out.println("Third Radio Button is selected "+" "+e5.isSelected());
			
		Thread.sleep(3000);
		
		
		
		driver.close();
		
		
		
	}

}
