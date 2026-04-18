package com.java.core.miniprojectresult;

public class resultapp {
      
	public static void main(String[] args) {
		
		rohitmarksheet r = new rohitmarksheet();
		int rohitresult = (r.rohitmark*100)/r.totalsubmark;
		
		System.out.println("rohit percentage : " + rohitresult);
		
		prashantmarksheet p = new prashantmarksheet();
		
		int prashantresult = (p.totalmarks*100)/p.totalsubmarks;
		System.out.println("prashant percentage : " + prashantresult);
		
		rohanmarksheet rr = new rohanmarksheet();
		
		int rohanresult = (rr.totalmarks*100)/rr.totalsubmarks;
		System.out.println("rohan percentage : "  + rohanresult);
		
		romamarksheet rrr = new romamarksheet();
		
		int romaresult = (rrr.totalmarks*100)/rrr.totalsubmarks;
		System.out.println("roma percentage : " + romaresult);
		
	}
}
