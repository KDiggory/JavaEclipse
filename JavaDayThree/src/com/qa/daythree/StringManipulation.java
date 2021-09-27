package com.qa.daythree;

public class StringManipulation {
	
	
	// Create two strings where one string has a value of yesterday it was raining and the other string with a value of today it is sunny
	// Concatenate both value and print the output
	// result should be  Today it is sunny, yesterday it was raining. 

			public static void concat() {
			String yesterday = "yesterday it was raining";
			String today = "today it is sunny";
			String cat = yesterday +  ", " + today;
			System.out.println(cat);
			
			System.out.println((today.substring(0, 12) + yesterday.substring(17,24) ).toUpperCase());
			}
			// implement 4 methods that manipulate string objects - for all parts you are only allowed to use length(), substring() and equals() methods.
			// Avoid using arrays or any methods you have yet to be taught.
			
			// 1 When given a string count and return how many words there are in the string
			// needed to use split
			public static void countWords(String input) {
				if(input == null || input.isEmpty()) {
					System.out.println("No words in this sentence!");
					}
				String[] words = input.split("\\s+"); // this detects spaces including tabs and multiple spaces. 
						System.out.println(words.length); 
						}
			
				
			
	//2 When given a string print out this string in a vertical fashion each word on a different line
			public static void wordLines(String input) {
				int length = input.length();
				
				for (int i = 0; i < length; i++) {
					char c = input.charAt(i);
					System.out.println(c);
				}
			}
			
			// 3 Print the string in a vertical fashion in reverse order
			
			public static void wordLinesReverse(String input) {
				String reverse = new StringBuilder(input).reverse().toString();
				int length = input.length();
				
				for (int i = 0; i < length; i++) {
					char c = reverse.charAt(i);
					System.out.println(c);
				}
			}
			
			public static void isThere(String input) {
				String sentence = "This is the sentence to test";
				boolean bool = sentence.contains(input);
				System.out.println(bool);
				// String sub = sentence.substring(0,4); //selects the chars from 0 to 4 --> which is the word this
				// System.out.println(sub);
			}
			
			
			
				public static void main(String[] args) {
					concat();
					countWords("this is the string to test");
					wordLines("This is a long sentence");
					wordLinesReverse("Will this reverse??"); // yes it does
					isThere("is"); // returns true
					isThere("cow"); // returns false
				
					}
					
		
			
			
			//4 A find method, which takes 2 strings a message and a string you want to find in the message. Should return a boolean. 
			 // returns true - but shouldnt use this
				
	
	
	}


