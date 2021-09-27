package com.qa.practice;

import java.util.Random;
import java.util.Scanner;

public class TextBasedAdventureGame {

	public static void main(String[] args) {
		
	// Doesnt fully work - something wrong with health potions. 
		// system objects
		Scanner in = new Scanner(System.in); // scanner is an import. System.in is for input - saying use the user input from the system in this scanner object
		Random rand = new Random(); //Random is a random number generator
		
		// game variables
		String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
		int maxEnemyHelath = 75;
		int enemyAttackDamage = 25;
		
		// player variables
		int health = 100;
		int playerAttackDamage = 50;
		int numHealthPotions = 3;
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 50; // percentage chance of enemy dropping health potion
		
		boolean running = true; // this is going to be the condition for a while loop
		
		System.out.println("Welsome to the dungeon");
		
		GAME: // this is labelling the while loop as GAME - can then tell the program to iterate back to it
		while(running) { 
			System.out.println("---------------------------------------------------------------------------");
			
			int enemyHealth = rand.nextInt(maxEnemyHelath); // picks a random integer from 0 to the variable given - in this case the max health which has been set at 75
			String enemy = enemies[rand.nextInt(enemies.length)]; // this sets the enemy as a random variable in an array, based off choosing a random number from 0 to the length of the array
			System.out.println("\t#" + enemy + " appeared! #\n "); // the \t# tabs it forward so its more in the middle the #/n makes sure it goes on the next line
					//eg # skeleton has appeared
			
			while(enemyHealth >0) { 
				System.out.println("\t# Your HP:" + health  );
				System.out.println("\t# " + enemy + "'s HP: " + enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Drink health potion");
				System.out.println("\t3. Run away!");
				
				String input = in.nextLine(); // this grabs the next line from the console and sets it as our variable
				if(input.equals("1")) {
					int damageDealt = rand.nextInt(playerAttackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);
					
					enemyHealth -= damageDealt;
					health -= damageTaken;
					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
					System.out.println("\t> You take " + damageTaken + " damage from the  " + enemy + ".");
					if(health < 1) {
						System.out.println("\t> You have taken too much damage, youa re too weak to go on!");
						break;
					
					
				}
				else if(input.equals("2")) {
					if(numHealthPotions > 0) {
						health += healthPotionHealAmount;
						numHealthPotions --;
						System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + " HP."
								+ "\n\t> You now have " + health + " HP."
								+ "\n\t> You have " + numHealthPotions + " health potions left.\n");
					}
					else {
						System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one! \n");
					}
				}
				else if(input.equals("3")) {
					System.out.println("\t>You have decided to run away from the " + enemy + "!!");
					continue GAME;
					
				}
				else {
					System.out.println("\t>Invalid command!");
				}
				}
						
				// this is now out of the while loop
				if(health < 1) { 
					System.out.println("You limp out of the dungeon, weak from battle.");
					break; // will break out of while running loop	
					
				}
				System.out.println("---------------------------------------------------------------------------");
				System.out.println(" # " + enemy + " was defeated! #");
				System.out.println(" # You have " + health + " HP left #");
				if(rand.nextInt(100) < healthPotionDropChance) {
					numHealthPotions ++; 
					System.out.print(" # The " + enemy + " dropped a health potion. # " );
					System.out.print(" # you now have " + numHealthPotions +" health potion(s). # "); 
					
				}
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("What would you like to do now?");
				System.out.println("1. Continue fighting");
				System.out.println("2. Exit dungeon");
				
				String input2 = in.nextLine(); 
				
				while (!input2.equals("1") && !input2.equals("2")) { // if input isnt one or two its not a valid input
					System.out.println("Invalid command");
					input2 = in.nextLine();
				}
				if (input2.equals("1")) {
					System.out.println("You continue on your adventure");
				} else if (input2.equals("2")) {
					System.out.println("You exit the dungeon victorious! ");
					break;
				} 
				
			}
			
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~Thanks for playing~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		

	}

}
