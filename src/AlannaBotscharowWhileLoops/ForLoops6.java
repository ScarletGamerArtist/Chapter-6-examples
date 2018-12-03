package AlannaBotscharowWhileLoops;
/*
 * Alanna Botscharow
 * 11/18
 * for loops
 */
public class ForLoops6 {

	public static void main(String[] args) {
		
		//while loop
		int count =0; //sentry variable
		//while checks the condition then executes while condition evaluates to true
		while (count < 100) {//start loop body
			//loop body
			System.out.println(count);
			count++; //adjusted sentry variable
		}//end loop body
		
		//do loop
		count = 0;//sentry variable
		//do loops executes the loop body then checks the condition.
		do {//start loop body
			//loop body
			System.out.println(count);
			count++;//adjusted sentry variable
		
		}while (count < 100); //the loop will continue as long as the condition is true
		
		//A for loop can be used to simplify the preceding loop
		for ( count = 0 ; count < 100 ; count++ ) {//this structure consists of initial-action, loop content
			System.out.println(count);
		}
		
		
		
		for (int i = 0, j = 10; i == j; i++, j--) {
			System.out.println(i);
			System.out.println(j);
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
