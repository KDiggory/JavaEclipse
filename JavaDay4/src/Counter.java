
public class Counter {

	static int count =0;
	int wontChange = 0;
	
	Counter() {
	count ++;
	wontChange ++;
	}
	
	void printOut() {
		System.out.println("This is the count: " + count);
		System.out.println("The non static variable is still: " + wontChange);
		
	}
	
	void printOutLarge() {
		System.out.println("This is the count multiplied by 100: " + (count * 100 ));
		System.out.println("The non static variable multiplied by 100 is : " + (wontChange * 100));
	}
	
	public static void main(String[] args) {
	Counter one = new Counter();
	Counter two = new Counter();
	Counter three = new Counter();
	Counter four = new Counter();
	Counter five = new Counter();
	
	one.printOut();
	one.printOutLarge();
	System.out.println(count); // main would normally be in a different class so you would need to put Counter.x
	
	}

}
