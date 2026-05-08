package Stringforloop;

public class TestOne {

	public static void main(String[] args) {

		String day = "wednesday";

//	w	
//	e	
//	d
//	n
//  e
//	s
//	d
//	a
//	y
		
		System.out.println(day);
		
		for(int i = 0 ; i<=day.length()-1 ; i++) {
			
			System.out.println(day.charAt(i));
		}

	}

}
