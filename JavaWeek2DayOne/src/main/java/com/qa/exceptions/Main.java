package com.qa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{ // the throws exception means that if you get an error java wont shut down - not best idea though. Better to use a try block exception
		// the throws keyword - would be unlikely to use this instead of a try catch block
		
		// int five = "five"; // the error would say its not an int. java.lang.Error: Unresolved compilation problem: Type mismatch: cannot convert from String to int
		// Dog dog = new Dog; // God cannot be resolved to a type
		
		// Need to catch these errors - A try block
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		// int x = scan.nextInt(); // if you put a letter in not an int it throws an error java.util.InputMismatchException 
		
		try { // a try block says everything inside this block of code - try to run it, if it doesnt run we can catch it 
		int x = scan.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Number wasn't an int, error message: " + e); // this will print out if the error message is thrown when running
		} finally {			// finally says regardless of what ever run this piece of code. 
			System.out.println("This will run regardless of what is above.");
		}
		
		int y = scan.nextInt();
		int x = scan.nextInt();
		
			int z = y + x;
			if (z<10) {
				throw new ArithmeticException();
			}
		
		
		
		
	}

}
