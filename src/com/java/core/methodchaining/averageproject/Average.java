package com.java.core.methodchaining.averageproject;

public class Average {
	
	public int avg(int math , int sci , int eng) {
		
		Addition a = new Addition();
		int total = a.add(math, sci, eng);
		int avg = total/3;
		return avg;
		
	}

}
