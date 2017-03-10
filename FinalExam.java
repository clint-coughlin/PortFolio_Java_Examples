
/**
 * @author Clint Coughlin
 *
 */
public class FinalExam extends GradedActivity {
	private double pointsEach;
	private int numMissed;
	/**
	 * The constructor accepts as arguments  the number
	 * of questions on the exam and the number of 
	 * questions the student missed.
	 */
	public FinalExam(int questions, int missed) {
		double numericScore;
		
		// Set the numQuestions and numMissed fields
		pointsEach = 100.0 / questions;
		numericScore = 100.0 - (missed * pointsEach);
		
		// Call the super Class's setScore method to
		// set the numeric Score
		setScore(numericScore);
	}
	
	/**
	 * The getPointsEach method returns the 
	 * PointsEach field
	 */
	public double getPointsEach() {
		return pointsEach;
	}
	/**
	 * The getNumMissed method returns the
	 * numMissed field
	 */
	public double getNumMissed() {
		return numMissed;
	}
}
