package main2109;





public class ITerationExercises {
	
	static int number = 74;
	static String numberString = Integer.toString(number);
	
	public static void numbers() {
		for (int i = 0; i <= numberString.length(); i++){
		    char singleNum = numberString.charAt(i);        
		    System.out.println(singleNum);
		}
		
	}
	

	public static void main(String[] args) {
		numbers();
		
		
	}

}
