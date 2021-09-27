
public class Circle extends Shape {
	
	final static double PI = 3.1415962d; // final variables are mostly also global (so accompanied by static). It would be written in all caps to represent a constant
											// a constant is a final static. This cannot be changed
	@Override
	public final void getArea() { // cannot override a final method from a superclass
		System.out.println("An area");
	}
	
	
}


