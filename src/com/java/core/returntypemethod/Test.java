package com.java.core.returntypemethod;

public class Test {
	
	public static void main(String[] args) {
		
		Add a = new Add();
		int total = a.addition();
		
	System.out.println(total);
	
	Sub s = new Sub();
	int cal = s.minus();
	System.out.println(cal);
	
	Mul m = new Mul();
	int mm = m.multiply();
	System.out.println(mm);
	
	Div d = new Div();
		int divide = d.div();
	System.out.println(divide);
	
	subtr t = new subtr();
	int value = t.sub();
	System.out.println(value);
	
	value v = new value();
	int multi = v.mul();
	System.out.println(multi);
	
	

	
	}

}
