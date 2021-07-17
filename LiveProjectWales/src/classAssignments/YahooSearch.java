package classAssignments;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class YahooSearch {
	
	WebDriver driver;
	
	@Test
	public void validateSearchResults() throws Exception{
		/**
		 * Opening the browser and webPage
		 */
		String search = "QTP";
		String searchText ="QTP Interview Questions";
		String Title = "qtp interview questions";
		int pageCount = 3;
		SoftAssert sa = new SoftAssert();
				
		Utility util = new Utility(driver);
		util.getWebPage();
		List <WebElement> searchList = util.retrieveSearchList(search);
		/*int actualCount = util.listCount(searchList);
		int expectedCount = 10;
		sa.assertEquals(actualCount, expectedCount);
		System.out.println("count checked");*/
		
		
		boolean result = util.clickSearchValue(searchList, searchText);
		sa.assertTrue(result);
		//System.out.println("clicked");
		//util.checkPagination(searchText);
		result = util.validateLinkText(searchText, pageCount, Title);
		sa.assertTrue(result);
		sa.assertAll();
		
		
		
		
		
	}
	

}
