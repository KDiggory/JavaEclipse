package com.qa.inheritance;

public class Siamese extends Cat{ // a child class of cat, which is in turn a child class of Animal.
	
	public Siamese(int numLives) {
		super(numLives);
		
	}

	public void scratch() {
		System.out.println("Scratch attack!!");
	}
	
	@Override // tells the JVM that this is an overriding method. 
	public void meow() {
		System.out.println("I'm a regal cat, I dont meow!!"); // the meow class from the parent class it being overridden by this new method. 
	}

	public static void main(String[] args) {
		

	}

}
