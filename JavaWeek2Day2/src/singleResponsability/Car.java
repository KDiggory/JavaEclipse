package singleResponsability;

public class Car {
	
    

    // constructor
    public Car(String colour, String model, int mileage) {
        this.colour = colour;
        this.model = model;
        this.mileage = mileage;
    }

    // getters and setters for colour and model
    
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
    
    

    // getter for mileage
    public int getMileage() {
        return mileage;
    }

   

	// setter for mileage
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // functionality
    public void drive(int milesDriven) {
        this.setMileage(this.getMileage() + milesDriven);
    }
    
    private String colour;
    @Override
	public String toString() {
		return "Car [colour=" + colour + ", model=" + model + ", mileage=" + mileage + "]";
	}

	private String model;
    private int mileage;
}
