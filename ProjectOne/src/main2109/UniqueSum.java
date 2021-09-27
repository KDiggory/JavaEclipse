package main2109;



public class UniqueSum {
	
		
		// give the sum of 3 variables, but dont include repeated numbers
		
		public static void uniqueSum(int num1, int num2, int num3) {
			if (num1 != num2 && num1 != num3 && num2 != num3) { // if all 3 are unique
				int answer = num1 + num2 + num3;
				System.out.println(answer);
			}
			else if (num1 != num2 && num1 != num2 && num2 == num3) { // if 1 and 2 are unique but 2 and 3 are the same
				int answer2 = num1 + num2;
						System.out.println(answer2);
			}
			else if (num2 != num3 && num1 != num3 && num1 == num2) { // if 2 and 3 are unique but 1 us the same as 2
				int answer3 = num3 + num2;
						System.out.println(answer3);
		}
			else if (num2 != num3 && num1 != num2 && num1 == num3) { // if 2 and 3 are unique but 1 us the same as 3
				int answer4 = num3 + num2;
						System.out.println(answer4);
		
	}
			else if (num1 == num2 && num1 == num3 && num2 == num3) { // if 2 and 3 are unique but 1 us the same as 3
						System.out.println("0");
		
	}
			else if (num1 == num2) { // if 2 and 3 are unique but 1 us the same as 3
				System.out.println(num3);

}
			else {
				System.out.println("Sorry I'm not sure");
			}
	} 
		
		public static void main(String[] args) { 
			uniqueSum(1, 2, 3);
			uniqueSum(1, 1, 1);
			uniqueSum(1, 1, 3);
			uniqueSum(2, 2, 3);
		}
		
		}


