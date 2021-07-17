package practiceAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchPagination {
	
	public static String drivePath = "C:\\workspace\\LiveProjectWales\\Browsers\\chromedriver.exe";
	public static String baseURL = "https://demo.openmrs.org/openmrs/appointmentschedulingui/manageAppointmentTypes.page"; 
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", drivePath);
	    WebDriver driver = new ChromeDriver();
	    driver.get(baseURL);
	    
	    
	
		

	}

}
