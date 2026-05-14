package com.java.core.main.costructor;

public class Test {
	public static void main(String[] args) {
		
		Student s = new Student("prashant" , 12);
			s.printname();
	
		Candidate c = new Candidate("prashant");
		c.printname();
			
		Poco cc = new Poco("pune");
		cc.printcity();
		
		Trainee t = new Trainee("jack");
		t.java();
		
	}

}
