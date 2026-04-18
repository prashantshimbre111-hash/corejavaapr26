package com.java.core.objectcreation.myntra;

public class myntra {
	public static void main(String[] args) {
		mens m = new mens();
		System.out.println("mens t= shirt details are : ");
		System.out.println("brandname : " + m.brandname);
		System.out.println("colour of t-shirt :" + m.colour);
		System.out.println("price of t-shirt : " + m.price);
		System.out.println("size of t-shirt : " + m.size);
		
		womens w = new womens();
		System.out.println("womens lipsstick details are : ");
		System.out.println("brandname : " + w.brandname);
		System.out.println("colour if product : " + w.colour);
		System.out.println("price of product : " + w.price);
		
	}

}
