package com.java.core.returntypeparameterized;

public class Test {
	
	public static void main(String[] args) {
		
		additon a = new additon();
		int cal = a.add(12, 15);
		System.out.println(cal);
		
		subtraction s = new subtraction();
		int ans = s.sub(12, 3);
		System.out.println(ans);
		
		Multiplication m = new Multiplication();
		int total = m.mul(21, 12);
		System.out.println(total);
	}

}
