package com.java.core.whileLoop;

public class Odd {
	public static void main(String[] args) {
		
		/*
		 *  1. Initialize
		 * 2. condition
		 * 3. increament/decreament
		 */
		//we have to find odd number from 1 to 30  with for loop.
		
		for(int i = 1 ; i<=30 ; i++) {
			if(i%2==1) {System.out.println(i);}
		}
		
		System.out.println("****************************************************************************************");
		
		//we have to find odd number with while loop.
		
		int i = 1;
		while(i<=30) {
			if(i%2==1) {
				System.out.println(i);
			}
			
			i++;
		}
	}
	

}
