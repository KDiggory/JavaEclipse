package com.qa.datatypes;

public class DataTypes {
	public static void main(String[] args) {
	// In java - 2 types of variables. Primitives and reference.
	// there are 8 primitives 
	// only need to tell the JVM what type the variable is the first time you establish it. After that, ie if you are adding to it or changing it you dont need to
	
		// boolean - True or False. Only set with true and false in java, not 1 and 0
	boolean amIHungry = false;
	boolean isJavaFun = true; 
	
		// char - is a single character. A string is essentially a collection of chars. 
	char b = 'b'; // needs to be single quotes not double! Else it will tell you to switch to a string. 
	char example = 0; // can also be a number because 0 has a unicode value. Not all numbers? Can do emojis with the unicode
	
	// byte is the smallest numerical value.
	byte num = 10; // the range is from -128 --> 127. There are only 256 possible combinations in 8 bit --> thats why it is that range. 
	// this is 8-bit -- 00000000 - each number 
	
		//int - 32 bit size 00000000 00000000 00000000 00000000 
	int inty = 30000000; // most commonly seen primitive type you will use, often dont need the larger types

		// short - 16 bit size 00000000 00000000 
	short shorty = 300;
			
		// long - 64 bit size 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000
	long longNum = 30282965123220L; // putting the L at the end tells the compiler that it is a long not an int. 
	
	// float is 32 bit
	float floaty = 39.29f; // put a lowercase f after it and it will make sure the compiler knows its a float. lowercase f is just the convention. Still works with capital
	
	//double is 64 bit
	double doubleNum = 30.00095461D; // putting a capital D after tells the compiler that it is a double. 
	
	
	
	//REFERENCE VARIABLES - Javas strongest asset
	
	String dogName = "Fido"; // String is a class of variable. A string enables you to use the char and collect them all together to make sentences. 
	//using dogName. will show all the methods available to use on the string class. 
	System.out.println(dogName);
	//dogName.toUpperCase(); // changes letters to capitals. This doesn't work, it only works when you say print this. 
	String upper = dogName.toUpperCase(); // or set it as a new variable
	System.out.println(dogName.toUpperCase());
	System.out.println(upper);
	upper = upper.toLowerCase(); // this turns it into lowercase again
	System.out.println(upper); // and this prints this lowercase variable
	
	
	
	
}
}