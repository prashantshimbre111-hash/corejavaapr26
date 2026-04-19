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
		
		division d = new division();
		int calc = d.div(234,654);
		System.out.println(calc);
		
		practice p = new practice();
		int calcul = p.cal(45,65,78,54);
				System.out.println(calcul);
				
		assg as = new assg();
		int add = as.sum(12,43,54);
		System.out.println(add);
		
		four f = new four();
		int value = f.sum(12,34,56,78);
		System.out.println(value);
		
		
		
		
				
	}

}
