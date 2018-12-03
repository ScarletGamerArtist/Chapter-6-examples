package AlannaBotscharowWhileLoops;
import java.util.Scanner;
/*
 * alanna Botscharow
 * 11/18
 */
public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		template(input);
		start(input);
	}
		//methods
			public static void template(Scanner input) {
			}
					private static void start(Scanner input) {
				
				//ASCII art
				System.out.println("");
				
				
				
				
				//story text
				System.out.println("");;
				
				
				//answer check
				String answer = "";
				//String answer = get_answer("enter the question you want the user to type: "
				//+"Response 1, Response 2, or rResponse 3","Response 1","response 2", "Response 3");
				while (answer.equals("") || answer.equals("house") || answer.equals("lake")) {
					//question prompt
					System.out.println("Would you like to go to the forest, the house, or the lake?");
					//user input 
					answer = input.nextLine(); 
					if(answer.equals("forest")|| answer.equals("house") || answer.equals("lake")) {
						break;
					}
					else {
						System.out.println("that's not a good response");
						answer = ""; 
					}
					
					
					
				}
					
				//check response
				switch(answer) {
				case "forest":
					forest(input); 
					break;
				case "house":
					house(input);
					break;
				case "lake":
					lake(input);
					break;
				
				}
				
				
				
				
				}
					private static void lake(Scanner input) {
						
					}
					private static void house(Scanner input) {
						
						
					}
					private static void forest(Scanner input) {
					}
				
					
					//scenario/question
					
					public static String get_answer(String question, String x, String y, String z) {
						Scanner input = new Scanner(System.in);
						String answer = "";
						while (answer.equals("")) {
							//question prompt
							System.out.println(question);
							//user input
							answer = input.nextLine();
							if (answer.equals(x) || answer.equals(y) || answer.equals(z)) {
								break;
								
							}
							else {
								System.out.println("that's not a good response");
								answer = "";
							}
						}
						return answer;
					}
					
					
				
				
				
				
				
			}
		
		
		
		
		
	


