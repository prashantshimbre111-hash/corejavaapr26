package StringImmutable;

public class Test {

public static void main(String[] args) {
		
		String p = "Prashant.1234";
		
		String p1 = p.toUpperCase();
		
		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(p1));
		
		if(p==p1) {
			
			System.out.println("memory location is same");
		}
		else {
			System.out.println("Strig is immutable");
		}
	}

}
