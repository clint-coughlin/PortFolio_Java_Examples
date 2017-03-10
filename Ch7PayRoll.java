import java.util.Scanner;

/**
 * @author Clint Coughlin
 */
public class Ch7PayRoll {
	private double[] employeeID = {5658845, 4520125,
			7895122, 8777541, 8451277, 1302850, 7580489};
	private double[] hours;
	private double[] payRate;
	private double wages;
	/**
	 * no arg constructor
	 */
	public Ch7PayRoll() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the hours
	 */
	public double[] getHours() {
		return hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(double[] hours) {
		this.hours = hours;
	}
	/**
	 * @return the payRate
	 */
	public double[] getPayRate() {
		return payRate;
	}
	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double[] payRate) {
		this.payRate = payRate;
	}
	/**
	 * @return the wages
	 */
	public double getWages(int j) {
		// the employee's ID Numbers
		double[] employeeID = {5658845, 4520125,
		7895122, 8777541, 8451277, 1302850, 7580489};
		// Initialize all the empty arrays
		double[] hours = new double[employeeID.length]; // hours worked
		double[] payRate = new double[employeeID.length]; // Pay rate
		double wages /*= new double[employeeID.length]*/ = 0; // total Wages
		for (int i = 0; i < employeeID.length; i++) {
			return wages = payRate[i] * hours[i];
		}
		return wages;
	}
	/**
	 * an Array to hold each employee's 
	 * total gross wages
	 * @param wages the wages to set
	 */
	public void setWages(double[] hours, double[] payRate) {
		this.wages = wages;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// the employee's ID Numbers
		double[] employeeID = {5658845, 4520125,
		7895122, 8777541, 8451277, 1302850, 7580489};
		// Initialize all the empty arrays
		double[] hours = new double[employeeID.length]; // hours worked
		double[] payRate = new double[employeeID.length]; // Pay rate
		double[] wages = new double[employeeID.length]; // total Wages
		// Create a Scanner object for user input
		Scanner reader = new Scanner(System.in);
		// Create an new object to pass data to the 
		// PayRoll2 class
		Ch7PayRoll check = new Ch7PayRoll();
		// get the hours for each employee
		for (int i = 0; i < employeeID.length; i++) {
			// Get the total amount of hours worked
			// By each corresponding employee
			System.out.println("How many hours was worked by employee " +
					(i + 1) + ": ");
				hours[i] = reader.nextInt();
					while (hours[i] < 0) {
						// Don't accept a negative integer
						System.out.println
						("Please enter a positive Number"
								+ "\nEnter the hours worked: ");
						hours[i] = reader.nextInt();
					} // end while
					check.setHours(hours);
			// Get the total pay rate for each 
			// Corresponding employee
			System.out.println("What is the Pay Rate of employee "
					+ (i + 1) + ": ");
				payRate[i] = reader.nextDouble();
					while (payRate[i] < 0) {
						// Don't accept a negative integer
						System.out.println
						("Please enter a positive Number"
								+ "\nEnter Pay Rate:");
						payRate[i] = reader.nextDouble();
					} // end while
					check.setPayRate(payRate);
					check.setWages(hours, payRate);
		}// end For loop
		// Display the all results
		for (int d = 0; d < employeeID.length; d++) {
			System.out.println();
			System.out.println("For Employee " + (d + 1) + " ID # is "  
					+ employeeID[d + 1] + "\nworked a total of "
					+ hours[d + 1] + " hours, " + 
					"\nAnd their average payrate is $" + 
					payRate[d + 1] + 
					"\nTotal wages are $" + check.getWages(d + 1));	
			System.out.println();
		} // end display all results loops
		// Exit the process
		System.exit(0);
	}

}
