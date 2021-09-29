package com.qa.garageexercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	public List<Vehicle> myGarage = new ArrayList<>(); // array list takes in a vehicle - as all vehicles inherit from superclass, so car bike etc are all vehicles
	
	public void addVehicle(Vehicle car) {
		myGarage.add(car);
	}

	public List<Vehicle> getMyGarage() {
		return myGarage;
	}

	public void setMyGarage(List<Vehicle> myGarage) {
		this.myGarage = myGarage;
	}

	
	
}


	
	