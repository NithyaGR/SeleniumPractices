package classAssignments;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	WebDriver driver;
	String searchText;

	public Utility(WebDriver driver){

		this.driver = driver;
	}
	public void getWebPage(){


		System.setProperty("webdriver.chrome.driver", ".//Browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public List<WebElement> retrieveSearchList(String searchValue) throws Exception{


		WebElement we = driver.findElement(By.id("header-search-input"));
		highlightElement(we);
		we.sendKeys(searchValue);
		WebDriverWait wait = new WebDriverWait(driver,30);
		List<WebElement> searchList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']/li/span")));	
		return searchList;
	}
	/**
	 * This is to return the total count of the search List items.
	 * @param searchList
	 * @return
	 */
	public int listCount(List<WebElement> searchList){

		int count;
		count = searchList.size();		
		return count;

	}


	/**
	 * This will search the string which you pass through searchText along with List of searchList which appear
	 * when you type the search Text. Search Text is Selenium Interview Questions
	 * @param searchList
	 * @param searchText
	 */
	public boolean clickSearchValue(List <WebElement> searchList, String searchText){

		boolean result = false;
		outerloop:
			for (WebElement webElement : searchList) {
				//System.out.println(webElement);
				if(webElement.getText().equalsIgnoreCase(searchText)){
					System.out.println(webElement.getText());
					//highlightElement(webElement);
					webElement.click();
					System.out.println("clicked....clickSearchValue");
					result = true;
					break outerloop;
				}
			}
		return result;
	}
	public void validateSearchLink(int i, String searchText){


		List <WebElement> contents = driver.findElements(By.xpath("//a[contains(text(), 'selenium')]/ancestor::ol/following::div[contains(@class, 'compTitle')]/h3/a"));
		HashMap <Integer, List<WebElement>> hMap = new HashMap<Integer, List<WebElement>>();
		hMap.put(i, contents);
		//System.out.println("Size of hMap :"+hMap.size());
		//System.out.println(hMap.values());
		System.out.println("Total No. Of Links in Page "+i+" is :"+ contents.size());
		int count = 0;
		for (WebElement links : contents) {
			if(links.getText().contains(searchText)){
				count++;
				System.out.println(links.getText()+ " TestCase Pass");
			}
			else{
				System.out.println("TestCase Fail");
			}
		}
		System.out.println("Total No. of Links with the correct Search Text is :"+count);
	}

	public boolean validateLinkText(String searchPattern, int n,String title )
	{


		boolean result = false; 
		List<WebElement> hLinkList;
		for(int i=1;i<=n;i++)
		{
			hLinkList = driver.findElements(By.xpath("//a[contains(text(), 'selenium')]/ancestor::ol/following::div[contains(@class, 'compTitle')]/h3/a"));	
			System.out.println("****************Validating the Links in the Page ::: " + i+"****************************" );
			for(int j=0;j<hLinkList.size();j++)//HyperLinks Text
			{
				System.out.println(hLinkList.get(j).getText().contains(searchPattern));
				if((hLinkList.get(j).getText().contains(searchPattern)))
				{
					result = true;
					System.out.println("The Link Text:::" + hLinkList.get(j).getText() +"   result:::" + result);	 
				}
			}
			clickHyperlink(driver.findElement(By.linkText((i+1)+"")));
			waitForTitle(title);

		}
		return result;
	}


	public void clickHyperlink(WebElement ele)
	{
		ele.click();

	}
	public void checkPagination(String searchText){

		for(int i=1;i<=4;i++){
			validateSearchLink(i,searchText);
			String xpathString = "//a[text()='"+(i+1)+"']";
			//String linkTextString;
			WebElement linkBox = driver.findElement(By.xpath(xpathString));
			highlightElement(linkBox);
			linkBox.click();
			validateSearchLink(i,searchText);
			//waitForTitle(searchText.toLowerCase());
		}
	}
	public void highlightElement(WebElement ele){

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red;')", ele);
	}
	public void waitForTitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains(title));
	}

}

