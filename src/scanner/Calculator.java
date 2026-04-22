package scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter value of a :");
		int a = sc.nextInt();

		System.out.println("enter value of b");
		int b = sc.nextInt();

		int total = a + b;
		System.out.println("addition of a and b : " + total);

	}

}
