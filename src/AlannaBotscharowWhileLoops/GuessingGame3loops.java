package AlannaBotscharowWhileLoops;
/*
 * Alanna Botscharow
 * 11/18
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom; 
public class GuessingGame3loops {

	public static void main(String[] args) {
		
				int attempts = 0; 
				
				Scanner input = new Scanner(System.in);
				
				//Welcome the player.
				
					System.out.println("Welcome to the Guessing Game player!");
					
					
				
				//Get a random number.
				
					int num = (int)(Math.random() * 100);
					
					
				
				//Prompt for guess.
					
				    System.out.println();
					System.out.println("Please guess a number between 0 and 100. But be careful, "
							+ "you only have 10 attempts!");
				
				//Get guess input.
				
					int guess = input.nextInt();
				
				//if statements and while loop.
					//display.
					
				//WHILE LOOP***	
					while (guess != num) {
						attempts++; 
						
						System.out.println("attempts: "+attempts);
						
						if (guess > num) {
							System.out.println("Guess a lower number.");
						}
						else  {
							System.out.println("Guess a higher number");
						}
						
						
						if (attempts == 10) {
							break;
						}
						
						
						
						
					}
					if (guess == num) {
						System.out.println("Congratulations! You guessed the right number!" );
						System.out.println("The number was "+num+" and it took you "+ attempts + " attempts!");
					}
					else {
						System.out.println("Game over! You ran out of attempts!");
						System.out.println("The number was "+num);
					}
					
					
					//DO LOOP***
					do {
						System.out.println("attempts: "+attempts);
						
						if (guess > num) {
							System.out.println("Guess a lower number.");
						}
						else  {
							System.out.println("Guess a higher number");
						}
						if (attempts == 10) {
							break;
						}
						attempts++; 
						guess = input.nextInt();
					}while(guess != num);
					if (guess == num) {
						System.out.println("Congratulations! You guessed the right number!" );
						System.out.println("The number was "+num+" and it took you "+ attempts + " attempts!");
					}
					else {
						System.out.println("Game over! You ran out of attempts!");
						System.out.println("The number was "+num);
					}
					
					   //sentry variable  condition     increments  
					for (guess = 0, attempts = 0; guess != num || attempts < 10 ; guess = input.nextInt(), attempts++) {
						System.out.println("attempts: "+attempts);
						if (guess > num) {
							System.out.println("Guess a lower number.");
						}
						else  {
							System.out.println("Guess a higher number");
						}
						if (attempts == 10) {
							break;
						}
					}
					
					
					
				if (guess == num) {
					System.out.println("Congratulations! You guessed the right number!" );
					System.out.println("The number was "+num+" and it took you "+ attempts + " attempts!");
				}
				else {
					System.out.println("Game over! You ran out of attempts!");
					System.out.println("The number was "+num);
				}
				
				
		
		
		
		

	}

}
