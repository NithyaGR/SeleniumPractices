package testNGPractice;

import org.testng.annotations.Factory;

public class FactoryDemo {
	
	@Factory
	public Object[] getTestClasses(){
		
		Object[] tests = new Object[2];
		tests[0] = new TestCase1();
		tests[1] = new TestCase2();
		
		return tests;
		
	}

}
