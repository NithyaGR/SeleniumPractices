package practiceAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {
	
	@Test 
	public void fileUploadPopUp(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[text()='Upload Resume']/parent::a[contains(@title, 'Click')]")).click();
		String filePath = System.getProperty("user.dir")+"\\newTextFile.txt";
		System.out.println(filePath);
		//driver.findElement(By.id("file-upload")).sendKeys(filePath);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Nithyakalyani\\Desktop\\sampleUpload.docx");
	}

}
