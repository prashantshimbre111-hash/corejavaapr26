package com.java.core.main;

import java.util.Scanner;

import com.java.core.entity.student;
import com.java.core.helper.outputhelper;
import com.java.core.repository.repository;

public class Test {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name :");
		String name = sc.next();
		
		repository repo = new repository();
		outputhelper op = new outputhelper();
		
		
		switch (name) {
		case "ram" : {
			student ram = repo.ramdetails();
			op.printstudentdetails(ram);
			break;
		
		}
		case "sham" :{
			student sham = repo.shamdetails();
			op.printstudentdetails(sham);
			break;
		}
		case "vijay" : {
			
			student vijay = repo.vijaydetails();
			op.printstudentdetails(vijay);
			break;
		}
		case "manoj" : {
			student manoj = repo.manojdatails();
			op.printstudentdetails(manoj);
			break;
		}
		case "rohan" : {
			student rohan = repo.rohandetails();
			op.printstudentdetails(rohan);
			break;
		}
		case "nikhil" : {
			student nikhil = repo.nikhildetail();
			op.printstudentdetails(nikhil);
			break;
	
		}
		case "pratik" : {
			
			student pratik = repo.pratikdetail();
			op.printstudentdetails(pratik);
			break;
		}
		case "pranali" : {
			
			student pranali = repo.pranalidetail();
			op.printstudentdetails(pranali);
			break;
			
		}
		case "vansh" : {
			
			student vansh = repo.vanshdetail();
			op.printstudentdetails(vansh);
			break;
			
		}
		case "arav" : {
			
			student arav = repo.aravdetail();
			op.printstudentdetails(arav);
			break;
		}
		default:
			System.err.println("please enter propper name");
			
		}
	}
		
		
		
		
		

		//repository repo = new repository();
		
		//System.out.println("print ram detais");
		//student ram = repo.ramdetails();
		//System.out.println(ram.id);
		//System.out.println(ram.fname);
		//System.out.println(ram.lname);
		//System.out.println(ram.english);
		//System.out.println(ram.math);
		//System.out.println(ram.science);
		
		//System.out.println("print sham details");
		//student sham = repo.shamdetails();
		//System.out.println(sham.id);
		//System.out.println(sham.fname);
		//System.out.println(sham.lname);
		//System.out.println(sham.english);
		//System.out.println(sham.math);;
		//System.out.println(sham.science);
		
		//System.out.println("print vijay details");
		//student vijay = repo.vijaydetails();
		//System.out.println(vijay.id);
		//System.out.println(vijay.fname);
		//System.out.println(vijay.lname);
		//System.out.println(vijay.english);
		//System.out.println(vijay.math);
		//System.out.println(vijay.science);
		
		//System.out.println("print manoj details");
		//student manoj = repo.manojdatails();
		//System.out.println(manoj.id);
		//System.out.println(manoj.fname);
		//System.out.println(manoj.lname);
		//System.out.println(manoj.english);
		//System.out.println(manoj.math);
		//System.out.println(manoj.science);
		
		//student rohan = repo.rohandetails();
		//System.out.println("print rohan details");
		//System.out.println(rohan.id);
		//System.out.println(rohan.fname);
		//System.out.println(rohan.lname);
		//System.out.println(rohan.english);
		//System.out.println(rohan.math);
		//System.out.println(rohan.science);
	}


	


