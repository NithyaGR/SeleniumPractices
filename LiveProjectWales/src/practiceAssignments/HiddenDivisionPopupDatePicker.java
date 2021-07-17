package practiceAssignments;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopupDatePicker {
	
	public static String  pickDate(){
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(d);
		System.out.println(date);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 10);
		d = cal.getTime();
		System.out.println(d);
		String s = d.toString();
		s = s.substring(8,10);
		System.out.println(s);
		return s;
		
		
	}

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\LiveProjectWales\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	 	//driver.get("https://www.makemytrip.com/");
		driver.get("https://www.cleartrip.com/");
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	/*driver.findElement(By.xpath("//label[@for='fromCity']")).click();
	 	WebElement we = driver.findElement(By.xpath("//div[contains(@id,'react-autowhatever')]/parent::div/input"));
	 	we.click();
	 	driver.findElement(By.xpath("//p[text()='Delhi, India']")).click();
	 	driver.findElement(By.xpath("//input[@id='toCity']/parent::label")).click();
	 	driver.findElement(By.xpath("//label[@for ='toCity']//input[@id='toCity']")).click();
	 	driver.findElement(By.xpath("//div[contains(@id,'react-autowhatever')]/parent::div/input")).click();
	 	driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
	 	
	 	driver.findElement(By.xpath("//label[@for='departure']")).click();
	 	driver.findElement(By.xpath("(//p[text()=11])[1]")).click();*/
	 	
	 	//driver.findElement(By.xpath("//input[contains(@class,'depart_date')]")).click();
	 	
	 	String date = "30";
	 	date = pickDate();
	 	driver.findElement(By.id("DepartDate")).click();
	 	//WebElement cal = driver.findElement(By.className("calendar"));
	 	//div[@id='ui-datepicker-div']//div[contains(@class, 'last')]//table[@class='calendar']
		WebElement cal = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//div[contains(@class, 'last')]//table[@class='calendar']"));
	 	List <WebElement> trList = cal.findElements(By.tagName("tr"));
	 	System.out.println(trList.size());
	 	outerloop:
	 	for(int i=0;i<trList.size(); i++){
	 		System.out.println(trList);
	 		List <WebElement> tdList = trList.get(i).findElements(By.tagName("td"));
	 		System.out.println(tdList);
	 		for (int j=0; j<tdList.size(); j++){
	 			String s = tdList.get(j).getText();
	 			System.out.println(s);
	 			if(date.equals(s)){
	 				tdList.get(j).click();
	 				System.out.println(s);
	 				break outerloop;
	 			}
	 		}
	 	}
	}

}
