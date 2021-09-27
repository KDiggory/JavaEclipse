
public class Dog {
	
	static final int legs = 4; // because all dogs have 4 legs. Final because you dont want to change it 
	String furColour;
	String name;
	static boolean hasTail;
	
	public static void bark() {
		System.out.println("Woof!");
	}
	
	public static void wagTail() { // any variable in a static method must also be static 
		if(hasTail) {
			System.out.print("Wag wag wag");
			
		}
	}
	

}
