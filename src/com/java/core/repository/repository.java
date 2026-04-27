package com.java.core.repository;

import com.java.core.entity.student;

public class repository {

	public student ramdetails() {

		student s = new student();
		s.id = 101;
		s.fname = "ram";
		s.lname = "patil";
		s.english = 87;
		s.math = 98;
		s.science = 99;
		return s;

	}

	public student shamdetails() {

		student s1 = new student();

		s1.id = 102;
		s1.fname = "sham";
		s1.lname = "patil";
		s1.english = 78;
		s1.math = 88;
		s1.science = 98;
		return s1;

	}

	public student vijaydetails() {
		student s2 = new student();
		s2.id = 103;
		s2.fname = "vijay";
		s2.lname = "patil";
		s2.english = 99;
		s2.math = 97;
		s2.science = 87;
		return s2;

	}

	public student manojdatails() {

		student s3 = new student();
		s3.id = 104;
		s3.fname = "manoj";
		s3.lname = "shimbare";
		s3.english = 89;
		s3.math = 99;
		s3.science = 87;
		return s3;
	}
	
	public student rohandetails() {
		
		student s4 = new student();
		s4.id = 105;
		s4.fname = "rohan";
		s4.lname = "shimbare";
		s4.english = 99;
		s4.math = 89;
		s4.science = 87;
		return s4;
		
	}

}
