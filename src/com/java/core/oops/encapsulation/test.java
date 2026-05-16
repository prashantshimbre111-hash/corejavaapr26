package com.java.core.oops.encapsulation;

public class test {
	public static void main(String[] args) {
		instagram i = new instagram();
//		i.username  = "apple";
		i.password = "87654";

		i.setUsername("wsderf43432");
		String s = i.getUsername();
		System.out.println("username : " + s);
		System.out.println("password :  " + i.password);
		System.out.println("");

		Twitter t = new Twitter();
		t.setId("prashant123");
		String get = t.getId();
		System.out.println("Twitter Id : " + get);

		t.setPassword(121212);
		int getpass = t.getPassword();
		System.out.println("password : " + getpass);
		System.out.println("");
		
		Facebook f = new Facebook();
		f.setid("prashant543facebook");
		String facebookid = f.getid();
		System.out.println("facebook id : " + facebookid);
		
		f.setPassword("qwer4321");
		String password = f.getPassword();
		System.out.println("password : " + password);
	}

}
