package com.qa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExcercise extends Exception {
	
	//write a constructor for customException here
	public ExceptionsExcercise(String errorMessage) {
		super(errorMessage);
	}
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter a number: ");
	int x = scan.nextInt();
	System.out.println("Please enter another number: ");
	int y = scan.nextInt();
	
	try { 
		if (x < y) {
			throw new CustomException("Error! first number is smaller!");
		} }catch (CustomException c) {
			System.out.println(c);
		}
	
	catch (Exception e) {
			System.out.println("Error! - at catch");
			
		} finally {
			System.out.println("This will always run");
		}

		int z = x / y;
		System.out.println(z);
	
	}
	}


	

	
	
	
	
	

