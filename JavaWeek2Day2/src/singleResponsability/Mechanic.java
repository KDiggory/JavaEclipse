package singleResponsability;

public class Mechanic {
	
	public boolean mot = false;
	String part;
	int cost;
	
	 // constructor
	
	public static void fix(String part) {
		System.out.println("The mechanic fixes the " + part);
	}

	public static void MOT(boolean mot) {
		if (mot == true) {
		System.out.println("No MOT needed");
		} else {
			System.out.println("The mechanic does the MOT");
		}
	}
		
	public int bill(boolean mot, String part) {
		this.mot = mot;
		this.part = part;
		if (mot = true) {
			cost =+ 100;
		}
		if (part != null) {
			cost =+ 100;
		}
		return cost;
	}
	
}
