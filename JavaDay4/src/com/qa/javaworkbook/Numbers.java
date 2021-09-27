package com.qa.javaworkbook;

public class Numbers {
	
	// Create a method that takes a number 10-99 and adds the two digits together
	// eg 74 = 7 + 4 = 11
	//create a second method that when given the number 1-99 returns a string representation of this number
	
	public static void methodOne(int number) {
		// input as the number
		// convert to a string and then split the string
		// then convert back into an int
		// then add these together 
		String numberS = String.valueOf(number);
		char num1 = numberS.charAt(0);
		char num2 = numberS.charAt(1);
		
		int num1Int=Character.getNumericValue(num1);  
		//System.out.println(num1Int);  
		
		int num2Int=Character.getNumericValue(num2);  
		//System.out.println(num2Int); 
		
		int answer = num1Int + num2Int;
		System.out.println(number + " split gives: " + num1Int + " + " + num2Int + " = " + answer); 
		//System.out.println(numberS);
		
	}
	 public static void methodTwo(char number[]) {
		 int len = number.length;
		 System.out.println(len);
		 
		 if (len == 0); {
		 System.out.println("String is empty");
		 } if ( len > 4); {
			 System.out.println("Too many digits for me to handle!");
			 } 
		 String[] oneDigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		 String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"}; 
		 String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  		 
		 String[] poweroftens = new String[] {"Hundred", "Thousand"}; 
		 System.out.print(String.valueOf(number) + ": ");  }
	 
	 
	
	public static void main(String[] args) {
	// methodOne(44);
	// methodOne(74);
	methodTwo("11".toCharArray()); 

	}

}
