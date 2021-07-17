package practiceAssignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckingFlow {
	
	@BeforeClass
	public void openAPP(){
		System.out.println("OpenAPP");
	}
	@BeforeMethod
	public void login(){
		System.out.println("Login");
	}
	
	@Test
	public void testing(){
		System.out.println("Testing");
	}
	@Test
	public void testing2(){
		System.out.println("testing 2");
	}
	@AfterMethod
	public void logout(){
		System.out.println("Logout");
	}

}
