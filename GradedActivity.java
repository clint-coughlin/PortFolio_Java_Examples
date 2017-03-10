
/**
 * @author Clint Coughlin
 * A class that holds a grade for a 
 * graded activity.
 */
public class GradedActivity {
	private double score;	// Numeric Score
	
	/**
	 * the setScore method stores its
	 * argument in the score field
	 */
	public void setScore(double s) {
		score = s;
	}
	/**
	 * the getScore method returns the score field
	 */
	public double getScore() {
		return score;
	}
	/**
	 * the getGrade method returns a letter grade
	 * determined from the score field
	 */
	public char getGrade() {
		char letterGrade;
		if (score >= 90) 
			letterGrade = 'A';
		  else if (score >= 80) 
				letterGrade = 'B';
			 else if (score >= 70) 
				letterGrade = 'C';
			 else if (score >= 60) 
				letterGrade = 'D';
			 else 
				letterGrade = 'F';
	
		return letterGrade;
	}
	/**
	 * The getHighest method returns a reference to 
	 * the element of the grades array that has the 
	 * highest Numeric score.
	 * @return
	 */
	public double getHightest() {
		double[] score = new double[0];
		double highest = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] > highest) {
				getScore();
				highest = score[i];
			}
		}
		return highest;
	}
	/**
	 * The getLowest method returns a reference to
	 * the element of the grades array that has the
	 * lowest numeric score.
	 * @return 
	 */
	public double getLowest() {
		double[] score = new double[0];
		double lowest = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] < lowest) {
				getScore();
				lowest = score[i];
			}
		}
		return lowest;
	}
}
