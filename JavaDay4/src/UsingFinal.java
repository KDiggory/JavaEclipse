
public class UsingFinal {
	
	final static int ten = 10;
	static int x;
	int y = 2;
	int numX;
	int numY;
	
	UsingFinal() {
		x ++;
		y++;
		System.out.println("An instantiation of the method, adds 1 to x, adds 1 to y. x will increase each time");
		System.out.println("x is now: " + x);
		System.out.println("y is still: " + y);
	}

	void timesTen() {
		numX = (x * ten);
		numY = (y * ten);
		System.out.println("x times 10 is: " + numX + " \ny times 10 is: " + numY);
		
	}
	public static void main(String[] args) {
		UsingFinal one = new UsingFinal();
		UsingFinal two = new UsingFinal();
		UsingFinal three = new UsingFinal();
		UsingFinal four = new UsingFinal();
		UsingFinal five = new UsingFinal();
		one.timesTen(); 
	}
	
		
	}


