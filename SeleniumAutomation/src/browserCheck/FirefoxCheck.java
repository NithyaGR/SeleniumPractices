package browserCheck;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./BrowserExe/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		System.out.println("Connection made...Launching the browser");
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		driver.close();

	}

}
