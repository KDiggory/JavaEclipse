package com.qa.garageexercise.workers;

import java.util.List;

import com.qa.garageexercise.Vehicle;

public class Secretary extends Worker implements CalcBill{

	public Secretary(String name, int salary) {
		super(name, salary);
		}
	
	public void allBills(List<Vehicle> garage) {
		for(Vehicle vehicle : garage);
		garageBill(vehicle);
	}
		
	public static void garageBill(Vehicle vehicle) {
		System.out.println(vehicle.bill());
		
		
//		for(int i = 0; i < this.myGarage.size() - 1; i++) {
//			Object test = this.myGarage.get(i);
//			if(test.toString().contains("Car")) { // can use getClassPAth().getSimpleName() - this will get the class path, and the simple name is the last part --> so car. 
//			System.out.println("Your bill is £5000");
//		} else if (test.toString().contains("Motorbike")) { // if(vehicle instanceof Car) - saying if your object is an instance of car do this...
//		System.out.println("Your bill is £500");
//	} else if  (test.toString().contains("Caravan")) {
//		System.out.println("Your bill is £10000");
//	} else {
//		System.out.println("Thats invalid");
//		
//	}
}

	@Override
	public void bill() {
		// TODO Auto-generated method stub
		
	}
	}

