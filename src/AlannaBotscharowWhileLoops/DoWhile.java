package AlannaBotscharowWhileLoops;
import java.util.Scanner;
/*
 * Alanna Botscharow
 * 11/18
 * Do loops
 */
public class DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	/*	do {
			//loop body; statement(s);
			//Statement(s);
		}while (loop-continuation-coondition);
	*/	

		int data, sum ;
		sum = 0;
				/*
		do {
			System.out.println("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
			sum += data;
		} while (data != 0);
			System.out.println("The sum is " + sum);
		*/
		
			
	/*		
		do {
			System.out.println("Enter an integer equation (the input ends if it is 0): ");
			data = input.nextInt(); 
			sum += data; 
			
		}while (data != 0); 
			System.out.println(x + " = " + sum);
		
		
		*/
			System.out.println("2 + x = 7");
			
			int x = 0;
			int y = 1; 
			
			do {
				x++; 
				
			}while (y + x != 7); 
		 System.out.println(x);
		 
		
		// 2 + x = 7
		// x = 5
		
		
		
	}

}
