package com.testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	private void setproperty() {
System.out.println("set  property");
	}
@BeforeTest
	
	private void browserLanunch() {
System.out.println("Browserlaunch");
	}
	@BeforeClass
	private void url() {
System.out.println("launching the url");
	}
	@BeforeMethod
	private void signin() {
System.out.println("signin");
	}
	@Test
private void women() {
System.out.println("women");
}
	@AfterMethod
private void signoff() {
System.out.println("signoff");
}
	@AfterClass
private void homepage() {
System.out.println("home page");
}
	@AfterTest
private void close() {
System.out.println("close");
}
	@Test
private void dress() {
System.out.println("Dress");
}
	@Test
private void tshirt() {
System.out.println("tshirts");
}
	@AfterSuite
private void deletecookies() {
System.out.println("Delete cookies");
}
}
