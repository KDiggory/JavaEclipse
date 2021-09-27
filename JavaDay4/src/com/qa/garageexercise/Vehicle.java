package com.qa.garageexercise;

public abstract class  Vehicle implements SatNav {
	
	String make;
	String model;
	int wheels;
	float engineSize;
	String catag;
	
	public Vehicle(String make, String model, int wheels, float engineSize,
			String catag) {
		super();
		this.make = make;
		this.model = model;
		this.wheels = wheels;
		this.engineSize = engineSize;
		this.catag = catag;
	}
	
	@Override
	public void direction() {
		System.out.println("Please take the next left");
}



	public String getMake() {
		return make;
	}




	public void setMake(String make) {
		this.make = make;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public int getWheels() {
		return wheels;
	}




	public void setWheels(int wheels) {
		this.wheels = wheels;
	}




	public float getEngineSize() {
		return engineSize;
	}




	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}




	public String getCatag() {
		return catag;
	}




	public void setCatag(String catag) {
		this.catag = catag;
	}

	public abstract void drive(); // abstract methods don't have a body. There are no implementation details but it is essential functionality that needs to be in each subclass. 


	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", wheels=" + wheels + ", engineSize=" + engineSize
				+ ", catag=" + catag + "]";
	}


}
