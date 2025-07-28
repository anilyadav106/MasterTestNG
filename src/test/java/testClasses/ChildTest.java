package testClasses;

import org.testng.annotations.BeforeSuite;

public class ChildTest extends TestNGBase{
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Running before suite method from child class");

		
	}
}
