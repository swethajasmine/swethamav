package com.testng2;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Excepted_Exception {
	@Test(expectedExceptions = InputMismatchException.class)
	private void addMthod() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int ne = s.nextInt();
		System.out.println(ne);
	}

}
