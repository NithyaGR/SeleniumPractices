package browserCheck;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserCheck {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\SeleniumAutomation\\BrowserExe\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Connection Done... Opening the browser");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.close();

	}

}
