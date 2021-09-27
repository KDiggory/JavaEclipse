package com.qa.datatypes;

public class ExerciseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// task - create a string that prints H3LL0 W0rld 5.0 false
		// string must be concatenated and contain all 8 primitive types
		boolean bool = false;
		char L = 'L';
		char H = 'H';
		char r = 'r';
		char d = 'd';
		char space = ' ';
		char W = 'W';
		byte three = 3;
		int oneI = 1;
		long zero = 0L;
		short one = 1;
		float five = 5.0f;
		double zeroD = 0.00D;
		System.out.println(new StringBuilder().append(H).append(three).append(L).append(oneI).append(zero).append(space).append(W)
				.append(zeroD).append(r).append(one).append(d).append(space).append(five).append(space).append(bool));
		System.out.println(1+1); // will print 2 as it is doing it as a math operation
		System.out.println("" + H + 3 + L + oneI + zero + " " + W + zeroD + r + one + d + " " + five + " " + bool + " "); // putting in the spaces and empyt strings allows you to print using the  + sign and it not been seen as an arithmetic operator
		
		
	}

}
