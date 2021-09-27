package com.qa.encapsulation;

import com.qa.model.Car;

public class Runner {

	public static void main(String[] args) {
		Car ford = new Car(); // this is an empty car - need to pass things in
		//ford.colour = "Yellow"; // sets the colour --> can do this because it is public. But anyone could do this! Need encapsulation!!
		System.out.println(ford.toString()); // will print a location. com.qa.model.Car@3fee733d
		//System.out.println(ford.numOfWheels); // prints 0 because you havent set any things. These go red wiggly once they are changed to private in the car class
		//System.out.println(ford.colour); // once they are encapsulated and private need to use getters and setters to get this information
		
		Car discovery = new Car(4, "Landrover", "Discovery", "Grey", true);  // this is a car made using the constructor. Is red wiggly for some reason?? 
		
		
		// ford.colour = "Yellow";      // will become 
		((Car) ford).setColour("Yellow");
		// System.out.println(ford.colour); // will become
		System.out.println(((Car) ford).getColour()); // 
		System.out.println(((Car) discovery).getColour());
		
		
		

	}

}
