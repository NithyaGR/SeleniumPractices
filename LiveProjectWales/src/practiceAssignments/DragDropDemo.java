package practiceAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//driver.manage().timeouts().i
		
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		/*action.clickAndHold(driver.findElement(By.id("draggable")));
		action.moveToElement(driver.findElement(By.id("droppable")));
		action.release(driver.findElement(By.id("draggable")));
		//action.build().perform();
		action.perform(); // both action.build().perform() and this line do the same job
*/		
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")));
		action.build().perform();
		
		driver.switchTo().defaultContent();
		//Right Click
		driver.findElement(By.name("s"));
		action.contextClick();
		driver.findElement(By.name("s")).sendKeys("ABC");
		action.build().perform();
		action.doubleClick(driver.findElement(By.name("s")));
		driver.findElement(By.name("s")).clear();
		action.sendKeys(Keys.DOWN).build().perform();
		//driver.close();		

	}

}
