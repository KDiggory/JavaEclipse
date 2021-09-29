package com.qa.garageexercise;

public class Caravan extends Vehicle {
	
int berth = 6;

	public Caravan(String make, String model, int wheels, float engineSize,
			String catag, int berth) {
		super(make, model, wheels, engineSize, catag);
		
	}

	@Override
	public String toString() {
		return "Caravan [berth=" + berth + ", make=" + make + ", model=" + model + ", wheels=" + wheels
				+ ", engineSize=" + engineSize + ", catag=" + catag + "]";
	}

	@Override
	public int bill() {
		
		return 600;
	}

}
