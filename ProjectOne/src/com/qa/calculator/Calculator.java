package com.qa.calculator;

import java.util.Scanner;

// Create a method that accepts 2 integers as input, then returns an integer that is the sum of these two parameters.
// Also create multiplication, subtraction and division - be aware of rounding error with division ( use double parameters and return a double.)
public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
	
		System.out.println("\t ~~~~ Welcome to the calculator ~~~~~");
		System.out.println("\t What would you like to do?");
		System.out.println("\t1 - Addition"); 
		System.out.println("\t2 - Subtraction"); 
		System.out.println("\t3 - Multiplication"); 
		System.out.println("\t4 - Division"); 
		
		String input = in.nextLine(); // this grabs the next line from the console and sets it as our variable
		
		if(input.equals("1")) {
			 // go to addition class 
			System.out.println("\t What is the first number you would like to add?"); 
			Double firstNum = in.nextDouble(); // if this was an int it would be nextint(
			System.out.println("\t What is the second number you would like to add?");
			Double secondNum = in.nextDouble();
			Double answer = firstNum + secondNum;
			System.out.println("\t" + firstNum + " + " + secondNum + " = " + answer);
			
	}
		if(input.equals("2")) {
			System.out.println("\t What is the first number you would like to input?");
			Double firstSubNum = in.nextDouble();
			System.out.println("\t What is the number you would like to subtract from that?");
			Double secondSubNum = in.nextDouble();
			Double subAnswer = firstSubNum - secondSubNum;
			System.out.println("\t" + firstSubNum + " - " + secondSubNum + " = " + subAnswer);
	}
		if(input.equals("3")) {
			System.out.println("\t What is the first number you would like to multiply?");
			Double firstMultNum = in.nextDouble();
			System.out.println("\t What is the number you would like to multiply that with?");
			Double secondMultNum = in.nextDouble();
			Double multAnswer = firstMultNum * secondMultNum;
			System.out.println("\t" + firstMultNum + " x " + secondMultNum + " = " + multAnswer);
			
	}
		if(input.equals("4")) {
			System.out.println("\t What is the first number you would like to input?");
			Double firstDivNum = in.nextDouble();
			System.out.println("\t What is the number you would like to divide that by");
			Double secondDivNum = in.nextDouble();
			if (firstDivNum > secondDivNum) {
			Double divAnswer = firstDivNum - secondDivNum;
			System.out.println("\t" + firstDivNum + " x " + secondDivNum + " = " + divAnswer);
			} else {
				System.out.println("I'm not going to do that! Division cant be performed");
			}
			
	}
		else {
			//System.out.println("\t Sorry I didn't understand that");
	}
		//public static Double addition() {  //--> should set this up as separate classes too 
		
		}
		
} 