package UnderstandInheritance;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Child extends Parent {

	@BeforeClass
	public void beforeClass() {

		System.out.println("Child before class");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("Child before Test");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("Child after class");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("Child after Test");
	}
	
	@Test
	public void parentTest() {
		
		System.out.println("Test method of Child class");
	}
}
