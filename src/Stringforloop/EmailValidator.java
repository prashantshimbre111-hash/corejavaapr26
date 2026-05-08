package Stringforloop;

import java.util.Scanner;

public class EmailValidator {

//	we have to verify email from user either it is correct or not.
	
		public static void main(String[]args) {
			
//			this is for case sensitive email.
			
			Scanner sc = new Scanner(System.in);
			
//			System.out.println("please enter email ");
//			String email = sc.next();
//			sc.close();
//			
//			String copy = "wednesday@gmail.com";
//			
//			if(copy.equals(email)) {
//				System.out.println("valid email");
//			}
//			else {
//				System.out.println("invalid email");
//			}
//			
			
//			this is not for case sensitive email
			
			System.out.println("please enter gmail");
			String gmail = sc.next();
			
			String copy1 = "abc@gmail.com";
			
			if(copy1.equalsIgnoreCase(gmail)) {
				System.out.println("valid email");
			}else {
				System.out.println("invalid email");
			}
			
		}
}
