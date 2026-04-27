package com.java.core.helper;

import com.java.core.entity.student;
import com.java.core.repository.repository;

public class outputhelper {
	
	public void printstudentdetails(student s) {
		
		System.out.println(s.id);
		System.out.println(s.fname);
		System.out.println(s.lname);
		System.out.println(s.english);
		System.out.println(s.math);
		System.out.println(s.science);
	 
	 
	}

}
