package com.java.core.Array;

public class array {
	
	public static void main(String[] args) {
		
		int[] a = new int[6];
		System.out.println(a.length);
		
		int[] s = new int[0];
		System.out.println(s.length);
		
		a[0] = 11;
		a[1] = 12;
		a[2] = 13;
		a[3] = 14;
		a[4] = 15;
		a[5] = 16;
		
		System.out.println(a[1]);
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
