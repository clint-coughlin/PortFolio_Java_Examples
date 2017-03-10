import java.util.Scanner;
/**
 * @author Clint Coughlin
 */
public class Ch5SumOfNumsOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;		// Starting value
		int maxValue;		// To get the max value
		
		// Creates a Scanner object for user input
		Scanner reader = new Scanner(System.in);
		
		// Asks the user for the max number 
		System.out.println("Enter a non-zero integer: ");
		maxValue = reader.nextInt();
		
		// Prints the numbers less the maxValue
		for (int i = 0; i <= maxValue; i++) {
			System.out.println(i);
			num = i;
		// Exit the system process
			System.exit(0);
		}
	}

}
