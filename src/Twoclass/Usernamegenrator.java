package Twoclass;

public class Usernamegenrator {
	
	public String GetUsername(String fname , String lname , int yob) {
		
		int year = 1999 % 100;
		String username = fname + lname + year;
		return username;
		
	}

}
