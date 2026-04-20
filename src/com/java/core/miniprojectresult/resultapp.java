package com.java.core.miniprojectresult;

public class resultapp {
      
	public static void main(String[] args) {
		
		rohitmarksheet r = new rohitmarksheet();
		int rohitresult = (r.rohitmark*100)/r.totalsubmark;
		
		System.out.println("rohit result in percentage  : " + rohitresult);
		
		prashantmarksheet p = new prashantmarksheet();
		
		int prashantresult = (p.totalmarks*100)/p.totalsubmarks;
		System.out.println("prashant result in percentage  : " + prashantresult);
		
		rohanmarksheet rr = new rohanmarksheet();
		
		int rohanresult = (rr.totalmarks*100)/rr.totalsubmarks;
		System.out.println("rohan result in percentage  : "  + rohanresult);
		
		romamarksheet rrr = new romamarksheet();
		
		int romaresult = (rrr.totalmarks*100)/rrr.totalsubmarks;
		System.out.println("roma result in percentage  : " + romaresult);
		
		shivay s = new shivay();
		int result = (s.totalmarks*100)/s.totalsubtotal;
		System.out.println("shivay result in percentage : " + result);
		
	}
}
