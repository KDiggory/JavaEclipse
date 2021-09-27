

	public class DFEExercise {
		 
		public static void main(String[] args) {
	 
			boolean isEdselHappy = true; // make a boolean called isEdseHappy and set to true
	 
			int weight = 20; // In this line, weight is being stored as and int with value 20 
			String name = "Billy Bob";  // This sets the variable name as Billy bob, it says string because it needs to set the variable type as a string
			Dog goodBoy = new Dog(name, weight); // this is setting a new instance of Dog, saying it needs name and weight. Establishes a new Dog called goodboy that requires name and weight. 
			int x = weight - 10; // the variable x is an int, and it is weight - 10. Weight is referencing the weight from earlier in the method not the weight from dog, that would need Dog.weight
			if (x < 15) goodBoy.bark(); // ?? if weight is less than 15, goodboy will run the goodboy method bark from the Dog.java file
	 
			while (x < 3) { // while weight is less than 3
				goodBoy.play(); // goodboy will run the goodboy play method from the Dog.java file 
			}
	 
			int[] numList = {1,2,3,4,5,6}; // setting a array of numbers - 1 through 6. The square brackets are there because it is an array of ints. 2 sets of square brackets would be a multiD array
			System.out.println("How are you"); // prints out how are you?
			System.out.println("My " + name + " is doing great" // prints out my (dogname) is doing great
					+ " how's yours"); // and asks how the other persons is. This statement is concatenated.
			String num = "305";  // sets the variable num as the characters 305 --> but as a string not an int
			int z = Integer.parseInt(num); // says the variable z is an int and it is equal to the variable num as an integer (parseInt is turning the string into an integer)
			// 
	 
	 
	 
		}
	 
	 
		}

