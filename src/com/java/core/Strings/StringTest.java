package com.java.core.Strings;

public class StringTest {
	
public static void main(String[] args) {
	
	
		String day = "tuesday";
		
//		measure length
		int length = day.length();
		System.out.println(length);
		
//		get charecter using index
		char c = day.charAt(2);
		System.out.println(c);
		
//		converts uppercase to lowercase
		String d = day.toLowerCase();
		System.out.println(d);
		
//		converts lowercase to uppercase
		String e = day.toUpperCase();
		System.out.println(e);
		
//		check word is exist or not but it is case sensitive
		boolean flag = day.contains("t");
		System.out.println(flag);
		
//		concat two world or thingd
		
		String con = day.concat("abcd");
		System.out.println(con);
		
		
	}

}
