package com.java.core.Strings;

public class dayfinder {
	public static void main(String[] args) {
	
	String s = "monday";
	
	System.out.println(s.charAt(2));
	System.out.println(s.charAt(1));
	
	for(int i = 0 ; i < s.length(); i++) {
		System.out.println(s.charAt(i));
		
		
	}
	
	System.out.println("-------------------------------");
	 System.out.println(s.lastIndexOf('y'));
	 System.out.println(s.lastIndexOf('n'));
	 System.out.println(s.toUpperCase());
	 System.out.println(s.toLowerCase());
	 System.out.println(s.charAt(5));
	 System.out.println(s.concat("tuesday"));
	 System.out.println(s.contains("da"));
	 
}}
