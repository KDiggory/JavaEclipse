package com.qa.practice;
import java.util.Random;
import java.util.Scanner;
//import java.util.random;

public class RockPaperScissors {
	static Scanner in = new Scanner(System.in); // scanner is an import. System.in is for input - saying use the user input from the system in this scanner object
	Random rand = new Random();
	public static int count;
	public static int numGames;
	public static String choice;
	
	public static void play() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~Welcome to Rock, Paper, Scissors!~~~~~~~~~~");
		System.out.println("\t What would youn like to play the best of, 3 or 5?");
		numGames = in.nextInt();
		System.out.println("\t 3");
		System.out.println("\t 2");
		System.out.println("\t 1...");
		System.out.println("\t ");
		System.out.println("\t Rock");
		System.out.println("\t Paper");
		System.out.println("\t or Scissors");
		System.out.println("\t What do you choose?");
	    choice = in.nextLine(); 
		
		
		
		while (numGames <= count) {
		if(choice.equals("rock")) {
			System.out.println("You chose rock!");
			count++;
			rock();
		} 
		else if(choice.equals("paper")) {
			System.out.println("You chose paper!");
			count++;
			paper();
		}
		else if (choice.equals("scissors")) {
			System.out.println("You chose scissors!");
			count++;
			scissors();
		} else {
			System.out.println("Sorry I didnt catch that, try again ");
			inGame();
		}
		}
	}
		
	public static void inGame() {
		int count = 1;
		while (numGames <= count) {
		
		System.out.println("\t What do you choose?");
		System.out.println("\t Rock");
		System.out.println("\t Paper");
		System.out.println("\t or Scissors");
		System.out.println("\t : ");
		String choice2 = in.nextLine();
		
	if(choice2.toLowerCase().equals("rock")) {
		System.out.println("You chose rock!");
		count++;
		rock();
		
	} 
	else if(choice2.toLowerCase().equals("paper")) {
		System.out.println("You chose paper!");
		count++;
		paper();
	}
	else if (choice2.toLowerCase().equals("scissors")) {
		System.out.println("You chose scissors!");
		count++;
		scissors();
	}
	else {
		System.out.println("Sorry I didnt catch that, try again");
		inGame();
	}
		}
	}
	public static void rock() {
		System.out.println("This will be rock");
		
	}
	
	public static void paper() {
		System.out.println("This will be paper");
	}
	public static void scissors() {
		System.out.println("This will be scissors");
		
	}
	public static void playAgain() {
		System.out.println("This will be play again");
		
	}

	public static void main(String[] args) {
		play();
		

	}

}

