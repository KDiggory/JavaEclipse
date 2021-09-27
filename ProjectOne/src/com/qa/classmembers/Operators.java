package com.qa.classmembers;

public class Operators {
	
	public static void remainder(int x, int y) { // cant make a method inside another method. 
		int z = x % y;
		System.out.println("The modulus of " + x + " and " + y + " is: " + z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this includes:
		
		// = -- assign value
		// + -- addition
		// - -- minue
		// / -- divide
		// * -- multiply
		// % -- modulus. This is basically a remainder, for example 4 % 2 = 0 because 4 is a multiple for 2 
		int x = 10;
		int y = x % 4;
		System.out.println(y);
		
		// ++ operator
		int count = 0;
		count ++; // is the same as saying count = count + 1
		
		//-- operator
		int count2 = 0;
		count2 --; // says count = count -1
		
		remainder(2,4);
			
		}
		
	

	}


