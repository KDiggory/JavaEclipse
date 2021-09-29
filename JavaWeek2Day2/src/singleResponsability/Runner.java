package singleResponsability;

public class Runner {

	public static void main(String[] args) {
				
		 Car car = new Car("Red", "Ferrari", 16000);
		 
		 Mechanic.fix("exhaust");
		 System.out.println(car.toString());
		 
		 Mechanic.MOT(true);
		 Mechanic.MOT(false);
		 int bill = Mechanic.bill(true, "");
		 System.out.println(bill);
		// Driver.drive(100);
		 //System.out.println(Driver.getMileage);
	}
	

}
