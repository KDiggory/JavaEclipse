
public class Casting {
	
	public static void main(String[] args) {
	int num1 = 10;
	double doublenum = num1; // can go up a data size without any problem and without losing data
			
	float floatNum = 12.2F;
	// int num2 = floatNum; // ints cant take decimals so the extra data will be removed! Going down a step needs to be cast
	int num2again = (int) floatNum; // this casts the float to an int 
	
	System.out.println(doublenum);
	System.out.println(num2again);
	
	
	// can also cast with chars
	
	char character = 'a';
	int char1 = character; 
	System.out.println(char1); // prints 97 which is the unicode number for a 
	
	char character2 = '%';
	int char2 = character2; 
	System.out.println(char2); // 37 is the numerical code for %
	
	

}
}
