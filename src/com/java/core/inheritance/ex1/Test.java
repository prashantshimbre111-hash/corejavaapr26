package com.java.core.inheritance.ex1;

public class Test {
	public static void main(String[]args) {
		
		shubham s = new shubham();
		System.out.println(s.number);
		System.out.println(s.year);
		System.out.println(s.school);
		System.out.println(s.id);
		System.out.println(s.year);
		
		s.m1();
		s.m2();
		s.m3();
		
		student ss = new student();
		System.out.println(ss.year);
		ss.m2();
		
	}

}
