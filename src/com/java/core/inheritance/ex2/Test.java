package com.java.core.inheritance.ex2;

public class Test {
	
	public static void main(String [] args) {
		
		System.out.println("****we will see parent child relationship/ Is A relationship****");
		
		cat c = new cat();
		
		System.out.println(c.name);
		System.out.println(c.food);
		System.out.println(c.colour);
		c.m5();
		c.m6();
		c.m1();
		c.m2();
		
		System.out.println("*******************************************************************");
		
		dog d = new dog();
		
		System.out.println(d.brid);
		System.out.println(d.age);
		System.out.println(d.add);
		System.out.println(d.country);
		System.out.println(d.catagery);
		d.m3();
		d.m4();
		d.m1();
		d.m2();
		
		System.out.println("*****************************************************************************");
		
		animal a = new animal();
		
		System.out.println(a.add);
		System.out.println(a.catagery);
		a.m1();
		a.m2();
	
	}
	

	
}
