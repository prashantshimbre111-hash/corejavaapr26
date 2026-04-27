package com.java.core.main;

import com.java.core.entity.student;
import com.java.core.repository.repository;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		repository repo = new repository();
		
		System.out.println("print ram detais");
		student ram = repo.ramdetails();
		System.out.println(ram.id);
		System.out.println(ram.fname);
		System.out.println(ram.lname);
		System.out.println(ram.english);
		System.out.println(ram.math);
		System.out.println(ram.science);
		
		System.out.println("print sham details");
		student sham = repo.shamdetails();
		System.out.println(sham.id);
		System.out.println(sham.fname);
		System.out.println(sham.lname);
		System.out.println(sham.english);
		System.out.println(sham.math);;
		System.out.println(sham.science);
		
		System.out.println("print vijay details");
		student vijay = repo.vijaydetails();
		System.out.println(vijay.id);
		System.out.println(vijay.fname);
		System.out.println(vijay.lname);
		System.out.println(vijay.english);
		System.out.println(vijay.math);
		System.out.println(vijay.science);
		
		System.out.println("print manoj details");
		student manoj = repo.manojdatails();
		System.out.println(manoj.id);
		System.out.println(manoj.fname);
		System.out.println(manoj.lname);
		System.out.println(manoj.english);
		System.out.println(manoj.math);
		System.out.println(manoj.science);
		
		student rohan = repo.rohandetails();
		System.out.println("print rohan details");
		System.out.println(rohan.id);
		System.out.println(rohan.fname);
		System.out.println(rohan.lname);
		System.out.println(rohan.english);
		System.out.println(rohan.math);
		System.out.println(rohan.science);
	}


	}


