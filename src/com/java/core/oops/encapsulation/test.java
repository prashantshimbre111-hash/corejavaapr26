package com.java.core.oops.encapsulation;

public class test {
	public static void main(String[] args) {
		instagram i = new instagram();
//		i.username  = "apple";
		i.password  ="87654";
		
		
		
		i.setUsername("wsderf43432");
		String s = i.getUsername();
		System.out.println("username : " + s);
		System.out.println("password :  " + i.password);
	}

}
