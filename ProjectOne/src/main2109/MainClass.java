package main2109;



public class MainClass {

	public static void main(String[] args) {
		boolean isSunny = true;
		
		if(isSunny) { // the condition in the if statement will either be true or false. 
			System.out.println("It's sunny!");
		}
		else {
			System.out.println("It's cloudy");
			
		}
		System.out.println("\n -------------------------------------\n"); // this is to just break up code when looking at it
		
		// setting a value to a variable
		int val1 = 100;
		
		if (val1 == 200) { // check this with an if statement
			System.out.println("is equal to 200");
		} else {
			System.out.println("Not equal");
		}

		// can also do the same with ! 
		if(val1 != 200) {
			System.out.println("is not equal to 200");
		} else {
			System.out.println("Is equal");
			
		}
		
		System.out.println("\n -------------------------------------\n"); 
		
		// Other operators for conditionals
		int aVal1 = 42;
		int aVal2 = 45;
		if(aVal1 > aVal2 ) {
			System.out.println("aVal1 is greater than aVal2");
		} else {
			System.out.println("Not greater");
		}
		
		if(aVal1 < aVal2 ) {
			System.out.println("aVal1 is not greater than aVal2");
		} else {
			System.out.println("its greater");
		}
		System.out.println("\n -------------------------------------\n"); 
		
		int bVal1 = 20;
		int bVal2 = 20;
		if(bVal1 >= bVal2 ) {
			System.out.println("bVal1: " + bVal1 +  " is greater than or equal to bVal2: " + bVal2);
		} else {
			System.out.println("Not greater");
		}
		
		if(bVal1 <= bVal2 ) {
			System.out.println("bVal1 is greater than or equal bVal2");
		} else {
			System.out.println("its greater");
		
	}
		System.out.println("\n -------------------------------------\n"); 
		
		// && - AND || - OR --> Logical operators
		// &  single and 	| single or --> These are bitwise operators 
		// difference is, if we use logical && and one of the statements is false it kicks you out straight away without checking the other one.
		// the bitwise & checks both even if the first is false.
		// Better to use the && as it saves memory and time etc. 
		
		int cVal1 = 21;
		int cVal2 = 12;
		int cVal3 = 9000;
		int cVal4 = 42;
		
		if(cVal1 > cVal2 && cVal3 < cVal4) {
			System.out.println("True");
		} else {
			System.out.println("False"); // prints false because both are not true!
		}
		
		if(cVal1 > cVal2 || cVal3 < cVal4) {
			System.out.println("True");
		} else {
			System.out.println("False"); // prints true because only one needs to be true!
		}
		
		System.out.println("\n -------------------------------------\n"); 
		
		//elseif operators
		
		int sum = 10 + 11;
		if(sum < 5) {
			System.out.println("Greater than 5");
		} else if(sum == 20) {
			System.out.println("Equal to 20");
		} else if (sum <30 ) {
			System.out.println("Less than 30");
		} else {
			System.out.println("Something");
		}
		
		System.out.println("\n -------------------------------------\n"); 
		
		// the switch statement
		
		int num = 8;
		switch(num) {
		case 1: // can be done with numbers or strings
			System.out.println("Monday");
			break; // if this condition is met then quit the loop
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Not a day of the week");
			break;
		}
		
		
		
		
		
		
}
}
