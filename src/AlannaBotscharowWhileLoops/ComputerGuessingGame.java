package AlannaBotscharowWhileLoops;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom; 

/*
 * Alanna Botscharow
 * 11/18
 */
public class ComputerGuessingGame {

	public static void main(String[] args) {
	
				int attempts = 0; 
				int low = 0; 
				int high = 100;
				Scanner input = new Scanner(System.in);
				
				//Welcome the player.
				
					System.out.println("Welcome to the Guessing Game player!");
					
					int random = ThreadLocalRandom.current().nextInt(low,high);
					//System.out.println(random);
				
				//Get a random number.
				
					int num = (int)(Math.random() * 100);
					
					
				
				//Prompt for guess.
					
				    System.out.println();
					System.out.println("Please guess a number between 0 and 100. But be careful,"
							+ " you only have 10 attempts!");
				
				//Get guess input.
				
					//int guess = input.nextInt();
				
				//if statements and while loop.
					//display.
					
					
					while (random != num ) {
						attempts++; 
						
						System.out.println("attempts: "+attempts);
						System.out.println();
						
						
						if (random > num) {
							System.out.println("Guess a lower number.");
							
						}
						else  {
							System.out.println("Guess a higher number");
							
						}
						
						
						if (attempts == 10) {
							break;
						}
						
						random = ThreadLocalRandom.current().nextInt(low,high);
						
						
					}
					
				if (random == num) {
					System.out.println("Congratulations! You guessed the right number!" );
					System.out.println("The number was "+num+" and it took you "+ attempts + " attempts!");
				}
				else {
					System.out.println("Game over! You ran out of attempts!");
					System.out.println("The number was "+num);
				}
				
				
				
		
		
		
		
		
	}

}
