package com.java.core.whileLoop;

import java.util.Scanner;

public class ThreeFreeTrail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//only three addition are free then buy a premium package.
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		while(i<=3) {
			
			System.out.println("enter first value : ");
			int a = sc.nextInt();
			
			System.out.println("enter second value : ");
			int b = sc.nextInt();
			
			int sum = a+b;
			
			System.out.println("addition : " + sum);
			i++;
		}
		System.err.println("please buy premium package");

	}

}
