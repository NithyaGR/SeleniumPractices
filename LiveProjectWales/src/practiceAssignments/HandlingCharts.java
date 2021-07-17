package practiceAssignments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCharts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\LiveProjectWales\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 	driver.get("https://www.highcharts.com/demo/line-basic");
	 	
	 	//JavascriptExecutor is an interface
	 	JavascriptExecutor jse = (JavascriptExecutor) driver;
	 	Object o = jse.executeScript("return document.getElementsByTagName('path')[0].getAttribute('d')");
	 	String s = (String) o;
	 	System.out.println(s);
	 	
	 	
	 	o = jse.executeScript("return document.title");
	    s=(String) o;
	    System.out.println(s);

	}

}
