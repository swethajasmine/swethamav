package com.testng2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Asser_Test {
	@Test
	private void AssTe() {
String actualresut="Swetha";
String exceptedresult="SWETHA";
Assert.assertEquals(actualresut,exceptedresult);
System.out.println("data validation");

	}
	@Test
	
	private void assTes2() {
		String actualresut="Swetha";
		String exceptedresult="SWETHA";
		SoftAssert sd=new SoftAssert();
		sd.assertEquals(actualresut, exceptedresult);
		System.out.println("data verification");
	}
	
	

	

}
