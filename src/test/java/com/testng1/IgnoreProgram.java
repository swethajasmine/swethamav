package com.testng1;

import org.testng.annotations.Test;

public class IgnoreProgram {
	@Test
 private void add_Test_One() {
System.out.println("method1");
}
	@Test(enabled=false)
	private void add_Test_Two() {
System.out.println("add");
	}
	@Test
	private void add_Test_Three() {
		System.out.println("three");

	}

}
