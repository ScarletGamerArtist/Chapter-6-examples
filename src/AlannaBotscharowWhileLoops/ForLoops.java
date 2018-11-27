package AlannaBotscharowWhileLoops;
import java.util.Scanner;
/*
 * Alanna Botscharow
 * 11/18
 */
public class ForLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	//Prints "I will not be late for class" 100 times.
		/*int count = 0;
		while ( count < 100 ) {
			//while= while this it true, execute all tasks below until false. 
			System.out.println(count + "I will not be late to class");
				
				count++; 
			
			
		}
		*/
	/*	
	//Battle scenario.
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Their decaying green bodies stretch out, melting into the horizon.");
		System.out.println("Your hero unsheathes his sword for the last fight of his life. \n");
		
		int health = 10;
		int trolls = 0; 
		int damage = 3; 
		
		while (health > 0 ) {
			trolls ++; 
			health = health - damage; 
			System.out.println("Your hero swings and defeats an evil troll,\n but takes " + damage
					+ " damage points.");
			
			
			
		}
		System.out.println("Your hero fought valiantly and defeated "+ trolls + " trolls.");
		System.out.println("But alas, your hero is no more.");
		*/
	// Sum = 45
		/*
			int sum = 0, i = 1; 
			while (i < 10) {
			sum = sum + i; 
			i++; 
					
			}
		
		System.out.println("sum is " + sum); 
		*/
		
		
		int count = 2; 
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
			System.out.println("1. What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt(); 
		
				while (number1 + number2 != answer) {
						System.out.println("Wrong answer. try again. What is " + number1 + " + " + number2 + "? ");
						answer = input.nextInt(); 
			
		}
		
				
				
		
		
		while (number1 + number2 == answer && count <= 10) {
			
			System.out.println("You got it!");
			
			int number3 = (int)(Math.random() * 10);
			int number4 = (int)(Math.random() * 10);
			
			System.out.println();
			
			System.out.println(count +  ". What is " + number3 + " + " + number4 + "? ");
			
			int answer2 = input.nextInt(); 
			
			 
			count++; 
				
			if (number1 + number2 != answer) {
				System.out.println("Wrong answer. try again. What is " + number1 + " + " + number2 + "? ");
				answer = input.nextInt(); 
			}
		}
		
		System.out.println("Nice work! You have completed all of the problems!"); 
		
	}

}
