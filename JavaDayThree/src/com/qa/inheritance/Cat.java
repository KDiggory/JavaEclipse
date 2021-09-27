package com.qa.inheritance;

public class Cat extends Animal{ // this is a child class

	
	
	int numLives;



	public void meow() {
		System.out.println("Meow");
	}
	
	public Cat(int numLives) { // this is a constructor
		super(); // super requires you to have this in your child classes
		this.numLives = numLives; 	}
	
	
	
	public static void main(String[] args) {
		

	}

}
