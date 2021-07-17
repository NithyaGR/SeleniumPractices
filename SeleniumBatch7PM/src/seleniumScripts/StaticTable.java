package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		System.out.println("Opening the webpage");
		//find the table
		
		List <WebElement> e1 = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Columns of the table: "+e1.size());
		
		////*[@id="leftcontainer"]/table
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		List <WebElement> e2 = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		System.out.println("No of rows are: "+e2.size());
		
		
		
		WebElement e3 = driver.findElement(By.xpath("//table[@class ='dataTable']"));
		List <WebElement> rows = e3.findElements(By.tagName("tr"));
		System.out.println("No of Rows: "+rows.size());
		
		List <WebElement> cells = e3.findElements(By.tagName("td"));
		System.out.println("No of cells: "+cells.size());
		
 		
	}

}
