package com.java.core.methodchaining.result;

public class average {

	public int ave(int eng, int math, int sci, int his, int geo) {

		addition a = new addition();
		int average = a.add(eng, math, sci, his, geo) / 5;
		return average;
	}

}
