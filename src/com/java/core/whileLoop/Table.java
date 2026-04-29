package com.java.core.whileLoop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we have to print table by taking user input.

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter value here : ");
		int number = sc.nextInt();
		
		int i = 1;
		while(i<=10) {
			System.out.println(number + "*" + i + "=" + i*number);
			i++;
		}
	}

}
