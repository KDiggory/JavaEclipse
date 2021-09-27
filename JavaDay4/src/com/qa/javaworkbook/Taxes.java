package com.qa.javaworkbook;

public class Taxes {
	
	public static int taxPerc;
	
	public static void method1(int salary) { 
		
		if (salary < 1500) {
		 taxPerc = 0;
		}
		else if (salary < 20000) {
		 taxPerc = 10;
		}
			else if (salary <30000) {
			 taxPerc = 15;
			} else if (salary <45000) {
			 taxPerc = 20;
			} else  {
			 taxPerc = 25;
			}
		
		int taxes = (salary / 100 ) * taxPerc;  
		System.out.println("Your tax rate is " + taxPerc +"%, on an annual salary of "+ salary + ".");
		
		
	}
	public static int method2(int salary) {
		if (salary <= 14999) {
			 System.out.println("Your salary is: £" + salary + "per annum. You are below the tax threshold, you wont pay any income tax");
			 System.out.println("--------------------------------------------------------------");	
		}
			else if (salary >= 14995 && salary <= 19999) {
			 taxPerc = 10;
			 int payable = (salary - 14995);
			 int taxes = (payable/100) * taxPerc;
			 System.out.println("Your salary is: £" + salary + " You wont pay tax on the first £14999. You will pay tax on: £" + payable + " this will be: £" + taxes
					 + "\n Your total tax to pay is: £" + payable);
			 System.out.println("--------------------------------------------------------------");
			}
		
			else if (salary >= 20000 && salary <= 29999) {
			taxPerc = 15;
			int firstBand = 20000-14999;
			int taxPayableOn = (salary - 14995);
			int bracket2 = (taxPayableOn - firstBand);
			int taxes10 = ((taxPayableOn - bracket2)/100) * 10;
			int taxes15 = (bracket2/100) * taxPerc;
			int total = taxes10 + taxes15;			
			
			System.out.println("Your salary is: £" + salary + 
					" You wont pay tax on the first £14999. "
					+ "You will pay tax on: £" + taxPayableOn  + ". \n £" +  
					firstBand + " will be at 10% tax and will be: £" + taxes10 +
					"\n £" + bracket2 + " will be at the second tax band of 15% this will be: £" + taxes15 +
					"\n Your total tax to pay is: £" + total);
			System.out.println("--------------------------------------------------------------");
			} 
			else if (salary >= 30000 && salary <= 44999) {
			taxPerc = 20;
			int firstBand = 20000-14999;
			int secondBand = 29000 - 20000;
			int taxPayableOn = (salary - 14995);
			int bracket3 = (taxPayableOn - firstBand - secondBand);
			int taxes10 = (firstBand/100) * 10;
			int taxes15 = (secondBand /100) * 15;
			int taxes20 = ((bracket3 /100) * taxPerc);
			int total = taxes10 + taxes15 + taxes20;
			
			System.out.println("Your salary is: £" + salary + 
					" You wont pay tax on the first £14999. "
					+ "You will pay tax on: £" + taxPayableOn  + 
					". \n £" + firstBand + " will be at 10% tax and will be: £" + taxes10 +
					"\n £" + secondBand + " will be at the second tax band of 15% this will be: £" + taxes15 +
					"\n £" + bracket3 + " will be at the third tax band of 20%. This will be £" + taxes20 +
					"\n Your total tax to pay is: £" + total);
			System.out.println("--------------------------------------------------------------");
			
			} else  {
			taxPerc = 25;
			int firstBand = 20000-14999;
			int secondBand = 29999 - 20000;
			int thirdBand = 44999 - 30000;
			
			int taxPayableOn = (salary - 14995);
			int bracket4 = (taxPayableOn - firstBand - secondBand - thirdBand);
			int taxes10 = ((firstBand)/100) * 10;
			int taxes15 = (secondBand /100) * 15;
			int taxes20 = ((thirdBand /100) * 20);
			int taxes25 = (((taxPayableOn - firstBand - secondBand - thirdBand) /100) * taxPerc );
			int total = taxes10 + taxes15 + taxes20 + taxes25;

			
			System.out.println("Your salary is: £" + salary + 
					" You wont pay tax on the first £14999. "
					+ "You will pay tax on: £" + taxPayableOn  + 
					". \n £" + firstBand + " will be at 10% tax and will be: £" + taxes10 +
					"\n £" + secondBand + " will be at the second tax band of 15% this will be: £" + taxes15 +
					"\n £" + thirdBand + " will be at the third tax band of 20%. This will be £" + taxes20 +
					"\n £" + bracket4 + " will be at the fourth tax band of 25%. This will be £" + taxes25 +
					"\n Your total tax to pay is: £" + total);
			System.out.println("--------------------------------------------------------------");
			
			}
		
		int taxes = (salary / 100 ) * taxPerc;
		return taxes; 
		
	}
	
	public static void main(String[] args) {
//		method1(5699);
//		method1(56000);
		int m2Taxes = method2(12000);
		int m3Taxes = method2(17000);
		int m4Taxes = method2(25000);
		int m5Taxes = method2(32000);
		int m6Taxes = method2(46000);
		
		
	
	
	}
}
