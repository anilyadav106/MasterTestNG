package testClasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGBase {
	@BeforeTest	
	public void  beforeTest() {
		
		System.out.println("Before Test First CLass ");
		
 		
	} 
	@AfterTest	 
	public void afterTest() {
		
		System.out.println("After Test Second Class ");
		
 		
	}

}
