package com.testngprogram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//setup s,browserlaunch bt,url c ,login bm,search mobile t ,search laptop t,verify am,logout ac,delete cookies-->as

public class simple_annotation {
	@BeforeSuite
	public void setup() {
System.out.println("setup");
	}
	@BeforeTest
	public void browserlaunch() {
System.out.println("browserlaunch");
	}
	@BeforeClass
	public void url() {
System.out.println("url");
	}
	@BeforeMethod
public void login() {
System.out.println("login");
}
	@Test
	public void searchmobile() {
System.out.println("searchmobile");
	}
	@Test
	public void searchlaptop() {
System.out.println("searchlaptop");
	}
	@AfterMethod
	public void verify() {
		System.out.println("verify");

	}
	@AfterClass
	public void logout() {
System.out.println("logout");
	}
	@AfterTest
	private void closebrowser() {
System.out.println("closebrowser");
	}
	@AfterSuite
	public void deletecookies() {
System.out.println("deletecookies");
	}
}
