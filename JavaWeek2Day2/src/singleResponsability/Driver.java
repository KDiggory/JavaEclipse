package singleResponsability;

public class Driver {
	
	
	private String colour;
    private String model;
    private int mileage;
    public Car car;
    
 
    // functionality
    public void drive(int milesDriven){
        car.setMileage(car.getMileage() + milesDriven);
    }

    // getters and setters
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


    
    
}