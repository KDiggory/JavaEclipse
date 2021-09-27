package main2109;



public class BlackJack {

	
	public static void play(int num1, int num2) {
		if (num1 > 21) {
			System.out.println("0");
		} else if (num1 <= 21 && num1 > num2) {
				System.out.println(num1);
		} else if (num1 < num2) {
			
			} 
		else if (num1 == num2) {
			System.out.println("They must be the same number, its a draw! 1 ");
		} else {
				
		}
		if (num2 > 21) {
			System.out.println("0");
		} else if (num2 > num1) {
				System.out.println(num2);
			} 
		else if (num1 < num2) {
			
		}
		else if (num1 == num2) {
			System.out.println("They must be the same number, its a draw!");
			
		} else {
		}
				
		}
	
	public static void main(String[] args) {
		play (10, 21); // 21
		play (20, 18); // 20
		play (1, 22); // this prints 0 once - it should be 1
		play (22, 23); //0 - but this is printed twice
		play (5, 5); // prints it must be a draw twice
		
		}
}






