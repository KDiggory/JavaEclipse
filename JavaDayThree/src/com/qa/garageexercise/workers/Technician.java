package com.qa.garageexercise.workers;

public class Technician extends Worker {
	
	Secretary sec;

	public Technician(String name, int salary, Secretary sec) {
		super(name, salary);
		this.sec = sec;
		
	}
	
	public void fix(CalcBill cb,Vehicle vehicle) {
		cb.bill(vehicle);
	}

	

}
