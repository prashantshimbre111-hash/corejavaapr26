package com.java.core.poly.compiletime1;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		operation o = new operation();
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter which calculation do you want ex. + , - , * , / ");
		String select = sc.next();
		System.out.println("how many numbers do you want for calculation ex. 2 , 3 , 4.");
		int n = sc.nextInt();
		
		if(n>5){
			System.err.println("please enter number between 2 to 5");
		}
				
		int[] arrayofcal = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arrayofcal[i] = sc.nextInt();
			
		}
		if(select.equals("+")){
			if(n==2) {
				o.sum(arrayofcal[0],arrayofcal[1]);
			}
			else if(n==3){
				o.sum(arrayofcal[0],arrayofcal[1],arrayofcal[2] );
				
			}
			else if(n==4) {
				o.sum(arrayofcal[0],arrayofcal[1],arrayofcal[2] , arrayofcal[3] );
			
			}
			else if (n==5) {
				o.sum(arrayofcal[0],arrayofcal[1],arrayofcal[2] , arrayofcal[3] , arrayofcal[4] );
	
			}
			
		}
	
		
		
		if(select.equals("-")){
			if(n==2) {
				o.sub(arrayofcal[0],arrayofcal[1]);
			}
			else if(n==3){
				o.sub(arrayofcal[0],arrayofcal[1],arrayofcal[2] );
				
			}
			else if(n==4) {
				o.sub(arrayofcal[0],arrayofcal[1],arrayofcal[2] , arrayofcal[3] );
			
			}
			else if (n==5) {
				o.sub(arrayofcal[0],arrayofcal[1],arrayofcal[2] , arrayofcal[3] , arrayofcal[4] );
	
			}
		}
		if(select.equals("*")){
			if(n==2) {
				o.mul(arrayofcal[0],arrayofcal[1]);
			}
			else if(n==3){
				o.mul(arrayofcal[0],arrayofcal[1],arrayofcal[2] );
				
			}
			else if(n==4) {
				o.mul(arrayofcal[0],arrayofcal[1],arrayofcal[2] , arrayofcal[3] );
			
			}
			else if (n==5) {
				o.mul(arrayofcal[0],arrayofcal[1],arrayofcal[2] , arrayofcal[3] , arrayofcal[4] );
	
			}
		}
		if(select.equals("+")){
			if(n==2) {
				o.div(arrayofcal[0], arrayofcal[1]);
			}
			else if(n==3){
				o.div(arrayofcal[0],arrayofcal[1],arrayofcal[2] );
				
			}
			else if(n==4) {
				o.div(arrayofcal[0],arrayofcal[1],arrayofcal[2] , arrayofcal[3] );
			
			}
			else if (n==5) {
				o.div(arrayofcal[0],arrayofcal[1],arrayofcal[2] , arrayofcal[3] , arrayofcal[4] );
	
			}
		}

	}

}
