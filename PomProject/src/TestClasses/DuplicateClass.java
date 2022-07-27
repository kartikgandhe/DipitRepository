package TestClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DuplicateClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite11");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest11");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass11");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod11");
	}
	
	@Test
	public void testA() {
		System.out.println("TestA11");
	}
	
	@Test
	public void testB() {
		System.out.println("TestB11");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("afterMethod11");
	}
	
	@AfterClass
	public void closedBrowser() {
		System.out.println("afterclass11");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest11");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite11");
	}
	
	
	
}
