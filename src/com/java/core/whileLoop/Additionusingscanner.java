package com.java.core.whileLoop;

import java.util.Scanner;

public class Additionusingscanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("enter first value : ");
			int a = sc.nextInt();
			
			System.out.println("enter second value : ");
			int b = sc.nextInt();
			
			int sum = a+b;
			
			System.out.println("addition of a and b : " + sum);
		}
	}

}
