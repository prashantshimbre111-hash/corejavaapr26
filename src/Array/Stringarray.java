package Array;

public class Stringarray {
	
	public static void main(String[] suyashsir) {
		
		String[] day = {"monday" , "tuesday" , "wednesday" , "thursday" , "friday" , "saturday" , "sunday"};
		
		System.out.println(day[1]);
		
//		for(int i = 0 ; i < day.length ; i++) {
//			if(day[i].startsWith("s")) {
//				
//				System.out.println(day[i]);
//			}
//		}
		
		for(int i = day.length-1 ; i >= 0 ; i--) {
			
			if(day[i].startsWith("f")) {
			System.out.println(day[i]);
		}}
		
	}

}
