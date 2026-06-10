package com.java.core.scanner;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("please enter value of A :");
			int A = sc.nextInt();
			
			System.out.println("please enter value of B : ");
			int B = sc.nextInt();
			
			System.out.println("Addition : " + (A+B));
		}
	}

}
