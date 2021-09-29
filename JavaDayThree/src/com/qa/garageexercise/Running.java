package com.qa.garageexercise;

import com.qa.garageexercise.workers.Secretary;

public class Running {
	

	public static void main(String[] args) {
		Garage garage = new Garage(); // make the array list
		
		Vehicle car = new Car("Landrover", "Discovery", 4, 2.0f, "large", true);
		Vehicle caravan = new Caravan("Conway" , "Cardinal", 2, 0.0f, "large", 6);
		Vehicle mb = new Motorbike("kawasaki", "Ninja", 2, 0, "small", true);
		Secretary sec = new Secretary("Richard", 21000);
		
		
//		System.out.println(car.engineSize); // prints car engine size
//		System.out.println(car.toString()); // prints the details of the car 
//		System.out.println(caravan.toString()); // prints the details of the caravan 
//		System.out.println(mb.toString()); // prints the details of the motorbike 
//		
		
		System.out.println("--------------------------------------------------------------------");
		
		garage.addVehicle(car); // adds them to the array list one at a time
		garage.addVehicle(caravan);
		garage.addVehicle(mb);
		System.out.println(garage.myGarage); // prints the array list
		

		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println(car.bill()); // prints the cost of car twice..? why?
		Secretary.garageBill(caravan);
		
		System.out.println("--------------------------------------------------------------------");
		
		//((Car) car).vroom(); // if there is a method in the car class when its set with polymorphism then you need to cast car to car in order to access the methods. 
		// this is casting it from a vehicle to a car is just temporary to access that method. 

	}

}
