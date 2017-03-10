import java.util.Scanner;
/**
 * @author Clint Coughlin
 */
public class Ch5AveRainFall {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double years;
		double months = 0;
		double MrainFall;
		// Create a AveRainFall object
		Ch5AveRainFall rain = new Ch5AveRainFall(); 
		// create a Scanner object for user input
		Scanner reader = new Scanner(System.in);
		// how much rain per mointh
		System.out.println("What many years of Rain Fall? ");
		years = reader.nextDouble();
		// get the amount of months from the user
		System.out.println("How many months per year? ");
		// print the average rainfall
		for (int i = 1; i <= years; i++) {
			System.out.println("What is the monthly amount of rain?");
			MrainFall = reader.nextDouble();
			for (int m = 1; m <= months; m++) {	
			}
		}
		// Display the result
		System.out.println("What was the approximate amount of\n"
				+ "monthly rain fall? ");
		// Exit the system process
		System.exit(0);
	}

}
