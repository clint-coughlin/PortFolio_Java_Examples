/**
 * @author Clint Coughlin
 */
public class Ch10TestScores {
	private double average;		// Average Test scores
	private double[] testScores;	// Array of Test scores
	/**
	 * Constructor that accepts an array
	 * as its argument and stores the 
	 * test scores.
	 */
	public Ch10TestScores(double[] scores) {
		this.testScores = scores;
	}
	/**
	 * Get the average of all the test scores
	 * within the array.
	 * @return
	 */
	public double getAverageScores() {
		double total = 0.0;	// local score field
		int incorrect = testScores.length;
		try {
			for (int i = 0; i < testScores.length; i++) {
				try {
				if(testScores[i] < 0 || testScores[i] > 100) {
					incorrect--;		// Decrement for each incorrect
					// Throw an error for an invalid score
					throw new IllegalArgumentException("Error, "
							+ "an invalid score has been entered.");
						} else {
							// add the test scores together
							total += this.testScores[i];
						}
					} catch (Exception e) {
						// Print error message
						System.out.println(e.getMessage());
					} // end first try/catch
				} // end for
			} catch (Exception e) {
				// Print error message
				System.out.println(e.getMessage());
			} // end second try/catch
		// Return the total and subtract the incorrect scores
		return total/(double)incorrect;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Errors will be printed on the 
		// negative and 110 scores
		double[] testScores = 
			{-23.0, 45.0, 85.0, 90.0, 110.0};
		Ch10TestScores scores = new Ch10TestScores(testScores);
		// Display the results
		System.out.println(scores.getAverageScores());
		// Exit the system process
		System.exit(0);
	}

}
