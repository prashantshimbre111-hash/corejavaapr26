package com.java.core.Superthis;

public class child extends parent {
	
	
	public child(){
		super(30,"bombay");
	}
	
	public child(String a) {
		System.out.println(a);
		
	}
	


	int a = 11111;

	public void superthis() {
		System.out.println("parent to child");
		System.out.println(this.a);
		System.out.println(super.a);
		this.age();
		super.age();

	}
	
	public void age() {
		
		System.out.println("age of child is 9");
	}
}
