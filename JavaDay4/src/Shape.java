
public class Shape { // if this was a final class you wouldnt be able to have a child class from this one. 
	
	static final double PI; // need to set the variable first
	// this is a static block. Could also surround it with a try block - so Java will still run the code and gives you an error 
	static {
		PI = 3.14; // this is where you set PI - even though it is final in the line above, it does set it. 
	}
	
	public final void getArea() {
		System.out.println("An area");
	}
	
	public final void getArea(int x) { // this is overloading, which can be done with a final. Its a method with the same name, but the brackets have to have different arguments. 
		System.out.println("An area"); // although it looks the same, Java recognises this as a different method
	}

	
}


