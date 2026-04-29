package com.java.core.forloops;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		
		//we have to print table by taking input by user.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number here : ");
		int input = sc.nextInt();
		
		for(int i = 0 ; i<=10 ; i++) {
			
			System.out.println(input + "*" + i + "= " + input*i);
		}
	}
}
