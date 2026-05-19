package com.java.core.HasA;

public class Test {

	public static void main(String[] args) {

		accountsdetails a = new accountsdetails();
		a.setAdhar("12343212345");
		a.setPan("luyre4657f");
		a.setAccountnumber("7620728299");
		a.setBankname("axis bank ltd.");

		student s = new student();

		s.setRollno("101");
		s.setFirstname("prashant");
		s.setLastname("patil");
		s.setCity("pune");
		s.setDetails(a);
		
		System.out.println(s.getRollno());
		System.out.println(s.getFirstname());
		System.out.println(s.getLastname());
		System.out.println(s.getCity());
		System.out.println(s.getDetails().getAdhar());
		System.out.println(s.getDetails().getPan());
		System.out.println(s.getDetails().getBankname());
		System.out.println(s.getDetails().getAccountnumber());

	}
}
