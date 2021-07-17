package practiceAssignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPortionsMMP {
	WebDriver driver;
	String URL = "http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php";
	
	
	public void getLoginPage(String URL){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Opened the browser");
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Opened the URL");
		
	}
	
	@Test (priority = 1, dataProvider = "testData")

	public void Testing(String uName, String password){

		getLoginPage(URL);
		loginApp(uName, password);
		getFName();
		logout();
		
	}
	

	public void loginApp(String uName, String password){
		
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		System.out.println("Logged in");
				
	}
	@DataProvider (name ="testData")
	public String[][] readExcel() throws IOException{
		
		File src = new File(System.getProperty("user.dir")+"\\Data\\testData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getLastRowNum()+1;
		int cols = 2;
		String [][] inputData = new String[rows][cols];
		for (int i=0; i<rows; i++){
		
				String rowData = sheet.getRow(i).getCell(0).toString();
				inputData[i][0]= rowData;
				System.out.println(rowData);
				String colData = sheet.getRow(i).getCell(1).toString();
				inputData[i][1] = colData;
				System.out.println(colData);
			
		}

		wb.close();
		return inputData;
		
	}

	public void getFName(){
		
		System.out.println("getFirstName");
		driver.findElement(By.xpath("//span[contains(text(),'Profile')]")).click();
		driver.findElement(By.id("Ebtn")).click();
		String firstName = driver.findElement(By.id("fname")).getAttribute("value");
		System.out.println("First Name is "+firstName);

	}
	public void logout(){
	     
		//System.out.println("Update functions");
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		System.out.println("Logout");
		driver.close();
		
	}
	
	

}
