package com.testng1;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test
	private void signIn() {
System.out.println("signin");
	}
	@Test(invocationCount = 5)
private void tShrit() {
System.out.println("tshirt");
}
	@Test
private void signoff() {
System.out.println("signoff");
}
}
