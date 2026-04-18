package com.java.core.objectcreation.vegitables;

public class vegitables {
	public static void main(String[] args) {
		
		chilli c = new chilli();
		System.out.println("chilli detais are :");
		System.out.println("name : " + c.name);
		System.out.println("price : " + c.price);
		System.out.println("colour : " + c.colour);
		System.out.println("weight : " + c.weight);
		
		cucumber cc = new cucumber();
		System.out.println("cucumber details are : ");
		System.out.println("name : " + cc.name);
		System.out.println("colour : " + cc.colour);
		System.out.println("price : " + cc.price);
		System.out.println("weight : " + cc.weight);
		
		tomato t = new tomato();
		System.out.println("tomato details are : ");
		System.out.println("name : " + t.name);
		System.out.println("colour : " + t.colour);
		System.out.println("price : " + t.price);
		System.out.println("weight : " + t.weight);
		
		
	}

}
