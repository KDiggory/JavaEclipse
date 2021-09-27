package com.qa.exceptions;

import java.util.Scanner;

public class PeerExceptions extends Exception { // extend from exception but could also be runtime, areaoutofbounds etc. Would probably be checkedExceptions
	
	// for custom exceptions make 2 constructors
	
	public PeerExceptions(String errMessage) { // this is how you create your own error class
		super(errMessage);
		
	}
	public PeerExceptions() { // this is an empty constructor needed for creating your own error class as well - why??
		
	}

	
	public static double calculate() {
		double z = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		double x = scan.nextDouble();
		System.out.println("Please enter another number");
		double y = scan.nextDouble();
		scan.close();
		try {
			
			
			if (x < 10) { // if x is less than 10, throw out this exception
				throw  new PeerExceptions("Exception");
			} 
			z = x/y; // here because you want to throw the error after checking for the first error - as you don't want it to run if x < 10
			
		} catch (PeerExceptions e) { // exception is used here as it is high up the heirachy, its the most general exception available to us. Using this will catch potential exceptions possible. 
			System.out.println("This is not accepted"); // make it as general as possible, like using superclass. Make things as simple as possible. 
		} catch (ArithmeticException e) {
			System.out.println("This is a divide exception"); 
		} catch (Exception e) {
			System.out.println("Can't do that");
		}
		// the catch statements have to be in the right order from most niche to least 
		// custom exception, then arithmetic exception then exception. 
		return z;
		
	}
	
	public static void main(String[] args) {
		System.out.println(calculate());
	}
	
	
}
