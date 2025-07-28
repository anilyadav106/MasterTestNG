package testClasses;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNGClassFirst {

	@Test(groups= {"my"})
	public void TestFirst1() {

		System.out.println("Hiii1 first class 1st test");

	}
@Test(dependsOnGroups = {"my"})
	public void TestFirst2() {

		System.out.println("Hiii1 first class 2nd test");

	}

}
