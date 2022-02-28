package com.testngprogram;

import org.testng.annotations.Test;

public class Prioritypro {
	@Test(priority = -1)
	public void swe() {
		System.out.println("name");

	}
	@Test
	public void jas() {
		System.out.println("flower");

	}
	@Test(priority = -2)
	
	public void jeni() {
		System.out.println("sis");

	}
	@Test(priority = 4)
	public void nithi() {
		System.out.println("big bro");

	}
	@Test(priority = 3)
	public void sri() {
		System.out.println("small bro");
		

	}
	

}
