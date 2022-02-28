package com.testng1;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = -1)
	private void signin() {
		System.out.println("signin");

	}
	@Test(priority = 7)
	private void tshirt() {
System.out.println("tshirt");
	}
	@Test(priority = -2)
	private void signoff() {
System.out.println("signoff");
	}
	@Test(priority = 0)
	private void closebrowser() {
System.out.println("closebrowser");
	}
	
	

}
