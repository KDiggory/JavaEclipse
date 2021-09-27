package com.qa.garageexercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	public List<Vehicle> myGarage = new ArrayList<>(); // array list takes in a vehicle - as all vehicles inherit from superclass, so car bike etc are all vehicles
	
	public List<Vehicle> myGarage2 = new ArrayList<>();
	
	public void addVehicle(Vehicle car) {
		myGarage.add(car);
	}
	public void addVehicle(Vehicle mb) {
		myGarage.add(mb);
	}
	public void addVehicle(Vehicle caravan) {
		myGarage.add(caravan);
	}

	
public void bill() {
		for(int i = 0; i < this.myGarage.size() - 1; i++) {
			Object test = this.myGarage.get(i);
			if(test.toString().contains("Car")) { // can use getClassPAth().getSimpleName() - this will get the class path, and the simple name is the last part --> so car. 
			System.out.println("Your bill is £6000");
		} else if (test.toString().contains("Motorbike")) { // if(vehicle instanceof Car) - saying if your object is an instance of car do this...
		System.out.println("Your bill is £500");
	} else if  (test.toString().contains("Caravan")) {
		System.out.println("Your bill is £10000");
	} else {
		System.out.println("Thats invalid");
		
	}
}
}
}
	// getclasspath()
	
	