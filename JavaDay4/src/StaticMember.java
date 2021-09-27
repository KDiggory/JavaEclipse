public class StaticMember {
	 
	   static int x;
	   int y;
	 
	   StaticMember() { // the constructor - adds 2 onto x each time and one onto y.
	      x += 2;
	      y ++ ;
	   }
	   static int getSquare(){ 
	      return x * x;
	   }
	   public static void main(String[] args){
	      StaticMember sm1 = new StaticMember(); // instantiates StaticNumber so x += 2 and y += 1. Now x = 2, y=1
	      StaticMember sm2 = new StaticMember(); // instantiates StaticNumber so x += 2 and y += 1. Now x = 4, y=1 - y is still one because it was reset to 0 when instantiated because its not static!!
	      int z = sm1.getSquare(); // instantiates getSquare method 4 * 4 = 16. Its done on sm1 but x is a static variable so visible across class so it is 4 not 2. Could be sm1 or sm2
	      System.out.print("-x" + z + "-y" + sm2.y); // prints -x16 -y1 
	      											// z (the number 16) is from getSquare which takes in x as a value (Which was 4 after 2 instantiations)
	      											// sm2.y is 1 because each time it is run its reset to 0, so sm2.y is still 1
	   }
	}

// when something is declared as static it is stored in the memory. Its ok for small applications but not enterprise scale. 