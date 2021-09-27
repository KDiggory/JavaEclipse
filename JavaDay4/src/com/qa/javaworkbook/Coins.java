package com.qa.javaworkbook;

public class Coins {
	// Given a cost and amount, work out the change given in specific coinage. For
	// example: The cost is £4.58, and the customer pays with a £20 note, so as change they
	// receive: 1 £10 note, 1 £5 note, 2 20ps 1 2p.
	
	private double cost;
	private double pays;
	public static String[] changeGiven = new String[10];
	
	public static void Change(double cost, double pays) {
		double changeAmount = pays - cost;
		System.out.println(changeAmount);
		// to work out the change
		// if amount - 10 > 0then add 10 note
		while (tempChangeGiven > 0) {
		if ((changeAmount - 50) >= 0 ) {
			changeGiven[0] = "£50 note";
			double tempChangeGiven = changeAmount - 50;
			System.out.println(changeGiven[0]);
		} 
		if ((changeAmount - 20) > 0 ) {
			changeGiven[1] = "£20 note";
			double tempChangeGiven = changeAmount - 20;
			System.out.println(changeGiven[1]);	
			}
		if ((changeAmount - 10))
		}
		// if amount left - 5 > 0 then add 5 note
		// if amount left -2 > 0 then add £2 coin
		//if amount left - 1 > 0 then add £1 coin
		
		
		
	}
	public static void main(String[] args) {
		Change(13.99d, 50.0d);
		
	}
		
	}


