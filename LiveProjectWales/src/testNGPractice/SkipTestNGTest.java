package testNGPractice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestNGTest {
	
	@Test
	public void aSkipTest(){
		String st = "skipTest";
		System.out.println("SecondLine");
		if(st.equals("skipTest")){
			throw new SkipException("This Test Willbe Skipped");
		}
		else {
			System.out.println("In the elseCondition");
		}
		System.out.println("LastLine");
			
	}
	
	@Test
	public void aNonSkipTest(){
		System.out.println("NonSkipTest");
	}

}
