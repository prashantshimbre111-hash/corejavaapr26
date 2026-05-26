package com.java.core.Superthis;

public class parent {
	
	public parent() {
		System.out.println("parent const");
	}
	
	public parent(int a , String b) {
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public parent (String s) {
		
		System.out.println(s);
	}
	int a = 12;
	
	
	public void age() {
		System.out.println("age of parent = 37");
	}

}
