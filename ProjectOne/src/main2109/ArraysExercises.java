package main2109;




public class ArraysExercises {
	
	//Create an array that will hold 10 integer values, populate the array with values and then call and output each element.
	
	public static void firstArray() {
		int[] numberArray = {1,32,877,23,587,66,33,12,9000,42};	
		for(int num: numberArray) {
			System.out.println(num);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~The first Array ^^ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	//Create a for loop that populates an integer array with values, outputting them at each iteration.
	// then create another loop that iterates through the array changing the values at each point to equal itself time 10, outputting at each iteration. 
	public static void secondArray() {
		
	
		int[] numberArray2 = new int[20];
		for(int i = 0; i <= numberArray2.length -1 ; i++) {
				System.out.println(numberArray2[i] ); // iterates through the array 
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~The empty second array ^^ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i = 0; i <= numberArray2.length -1 ; i++) {
			numberArray2[i] = (int)(Math.random()*100); // math is better than random for random numbers.
			System.out.println(numberArray2[i]);
			}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~The second array populated with numbers ^^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int j = 0; j <= numberArray2.length -1; j++) {
			System.out.println(numberArray2[j] * 10);
			
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~The second array numbers * 10 ^^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
			
	}

	public static void main(String[] args) {
		firstArray();
		secondArray();
	}
	}

