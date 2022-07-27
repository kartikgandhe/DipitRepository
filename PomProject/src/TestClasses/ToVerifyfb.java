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

public class ToVerifyfb {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void testA() {
		System.out.println("TestA");
	}
	
	@Test
	public void testB() {
		System.out.println("TestB");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void closedBrowser() {
		System.out.println("afterclass");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite");
	}
	
	
}
