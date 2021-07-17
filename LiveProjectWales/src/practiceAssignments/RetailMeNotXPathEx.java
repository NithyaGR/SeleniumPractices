package practiceAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RetailMeNotXPathEx {

	WebDriver driver;
	String linkText;
	static String title;
	

	public void openWebPage(){

		System.setProperty("webdriver.chrome.driver", ".//Browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.retailmenot.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * This is to click the required link -
	 * @param linkText
	 */
	public void navigateToLink(String linkText){

		try{
			String xpathExpression = "//a/span[text()='"+linkText+"']";
			driver.findElement(By.xpath(xpathExpression)).click();
		}catch(Exception e){

			System.out.println(e.getMessage()+ " The element is not Found");

		}
	}
	public void getTitle(){
		String Title = driver.getTitle();
		System.out.println(Title +"Title of the page");
		
	}
	

	public void validateOptions(String heading){

		String xpathExpression = "//h3[text()='"+heading+"']/ancestor::div/following-sibling::div";
		driver.findElement(By.xpath(xpathExpression));

	}

	public void validateElements(String heading){

		String xpath = "//h3[contains(text(),'"+heading+"')]/ancestor::div[contains(@class,'sc-')]/child::div[contains(@class,'sc-')]";
		//xpathExpression = "(//h3[contains(text(),'Gifts for Mom')]/following::div//a//img)[4]";
		List <WebElement> list = driver.findElements(By.xpath(xpath));
		System.out.println("No. Of Options "+list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
		}
	}
	public void waitForTitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void getAttributeForSelected(String select, int num) throws Exception{

		waitForTitle(title);
		System.out.println("In the Method to get the gift links");
		for(int i=1;i<=num;i++){

			String xpath = "(//h3[contains(text(),'"+select+"')]/following::div//a//img)["+i+"]";
			WebElement webElement = driver.findElement(By.xpath(xpath));
			System.out.println(webElement.getAttribute("alt"));

			}

		
	}

	public void check() throws Exception{
		System.out.println("check methods");
		Thread.sleep(5000);
		WebElement we = driver.findElement(By.xpath("(//h3[contains(text(),'Gifts for Mom')]/following::div//a//img)[1]"));
		String value = we.getAttribute("alt");
		System.out.println(value);

	}
	public static void main(String[] args) throws Exception {

		RetailMeNotXPathEx obj = new RetailMeNotXPathEx();
		obj.linkText = "COVID-19 Savings";
		title = "COVID-19 Deals";
		obj.openWebPage();
		obj.navigateToLink(obj.linkText);
		obj.getTitle();
		String searchGiftText = "Gifts for Mom";//Gifts for Mom That Ship On Time
		//obj.validateElements(linkText);

		//obj.check();
		//System.out.println();
		obj.getAttributeForSelected(searchGiftText, 4);
		/*String xpath = "//h3[contains(text(),'"+linkText+"')]/ancestor::div[contains(@class,'sc-')]/following::div";

		 * //h3[contains(text(),'Gifts for Mom')]---To Find the required elements under -Gifts for Mom
		 * 
		 * //h3[contains(text(),'Gifts for Mom')]/ancestor::div[contains(@class,'sc-')] --- parent of required
		 * 
		 * //h3[contains(text(),'Gifts for Mom')]/ancestor::div[contains(@class,'sc-')]/following::div --exact 
		 */



	}

}
