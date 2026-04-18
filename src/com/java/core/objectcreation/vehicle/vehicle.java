package com.java.core.objectcreation.vehicle;

public class vehicle {
		
	public static void main(String[] args) {
		 bike b = new bike();
		  
		  System.out.println("details of bike :");
		  System.out.println("name of bike :" + b.brand);
		  System.out.println("price of bike :" + b.price);
		  System.out.println("purchased year of bike :" + b.year);
		  System.out.println("milege of bike :" + b.milege);
		  System.out.println("colour of bike :" + b.colour);
		  
		  car c = new car();
		  System.out.println("details of car :");
		  System.out.println("name of car :"+c.name);
		  System.out.println("colour of car :" + c.colour);
		  System.out.println("model of car :" + c.model);
		  System.out.println("price of car :" + c.price);
		  
		  truck t = new truck();
		  System.out.println("details of truck :");
		  System.out.println("name of truck :" + t.name);
		  System.out.println("colour of truck :" + t.colour);
		  System.out.println("tear of purchase :" + t.year);
		  System.out.println("milege of truck :" + t.milege);

	}
}
