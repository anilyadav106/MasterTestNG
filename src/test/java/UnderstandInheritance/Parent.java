package UnderstandInheritance;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parent {

	@BeforeClass
	public void beforeClass() {

		System.out.println("Parent before class");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("Parent before Test");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("Parent after class");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("Parent after Test");
	}
	
	@Test
	public void parentTest() {
		
		System.out.println("Test method of parent class");
	}
}
