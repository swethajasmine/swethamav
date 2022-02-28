package com.MavenProject;

public class Pojo_Class2 {
	public static void main(String[] args) {
		PojoClass a=new PojoClass();
		int a2 = a.getA();
		System.out.println("the value of is"+a2);
		a.setA(1000);
		int a3 = a.getA();
		System.out.println("the value of a is what now:"+a3);
	}

}
