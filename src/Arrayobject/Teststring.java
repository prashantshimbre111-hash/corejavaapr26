package Arrayobject;

public class Teststring {
	public static void main(String [] args) {
	
	Student s = new Student();
	s.id = 101;
	s.name = "prashant";
	
	Student s1 = new Student();
	s1.id = 102;
	s1.name = "rohan";
	
	Student s2 = new Student();
	s2.id = 103;
	s2.name = "suyash";
	
	Student s3 = new Student();
	s3.id = 104;
	s3.name = "mayur";
	
	
	
	Student[] studentarray = {s , s1 , s2 , s3};
	
	for(int i = 0 ; i < studentarray.length ; i++) {
		
		Student st = studentarray[i];
		System.out.println("Student id : " +  st.id);
		System.out.println("Student name : " + st.name);
	}

}
}