package Stringforloop;

import java.util.Scanner;

public class EmailValidator {

//	we have to verify email from user either it is correct or not.
	
		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("please enter email ");
			String email = sc.next();
			
			String copy = "wednesday@gmail.com";
			
			if(copy.equals(email)) {
				System.out.println("valid email");
			}
			else {
				System.out.println("invalid email");
			}
			
		}
}
