package com.qa.garageexercise;

public class Motorbike extends Vehicle {
	
	boolean dangerous = true;

	public Motorbike(String make, String model, int wheels,
			float engineSize, String catag, boolean dangerous) {
		super(make, model, wheels, engineSize, catag);
		
	}

	@Override
	public String toString() {
		return "Motorbike [make=" + make + ", model=" + model + ", wheels=" + wheels + ", engineSize=" + engineSize
				+ ", catag=" + catag + " dangerous=" + this.dangerous + "]";
	}

	@Override
	public int bill() {
		
		return 200;
	}

	

	}
