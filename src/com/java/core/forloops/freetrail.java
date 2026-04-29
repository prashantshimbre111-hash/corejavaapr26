package com.java.core.forloops;

import java.util.Scanner;

public class freetrail {
	
	public static void main(String[] args) {
		
		//only three addition are free then buy a premium package.

		Scanner sc = new Scanner(System.in);
		
		for(int i = 1 ; i<=3 ; i++) {
			
			System.out.println("enter first value : ");
			int a = sc.nextInt();
			
			System.out.println("enter first value : ");
			int b = sc.nextInt();
			
			int sum = a+b;
			
			System.out.println("additon : " + sum);
			
		}
		System.err.println("please buy premium package");
	}

}
