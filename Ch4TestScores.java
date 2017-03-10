import java.util.Scanner;

/**
 * @author Clint Coughlin
 */
public class Ch4TestScores {
	
	/**
	 * No arg constructor 
	 */
	public Ch4TestScores() {
		// TODO Auto-generated constructor stub
	}
	private int score;
	// getScore method
	public Ch4TestScores(int s) {
		score = s;
	}
	// Return Score
	public int getScore() {
		return score;
	}

	// getLetterGrade method
	public char getLetterGrade() {
		char grade;
		if (score < 60) {
			grade = 'F';
		} else {
			if (score < 70) {
				grade = 'D';
			} else {
				if (score < 80) {
					grade = 'C';
				} else {
					if (score < 90){
						grade = 'B';
					} else {
						grade = 'A';
					}
				}
			}
		}
		return grade;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Emtpy local variables
				int testScore = 0;
				int testScore2 = 0;
				int testScore3 = 0;
				char letterGrade;
				//Gets the input from the user
				Scanner reader = new Scanner(System.in);
				// Gets the first test grade and stores the data in the field
				System.out.println("What was the first test score? ");
				testScore = reader.nextInt();
				// Gets the second test score and stores the data in the field
				System.out.println("What was the second test score? ");
				testScore2 = reader.nextInt();
				// Gets the third test score and stores the data in the field
				System.out.println("What was the third test score? ");
				testScore3 = reader.nextInt();
				// Adds all the scores together and divides that number by 3.0 = Average
				int aveScores = (int) ((testScore + testScore2 + testScore3) / 3.0);
				// New instance to associate with TestScore3
				Ch4TestScores test = new Ch4TestScores(testScore);
				// Assigning our empty variable to our new instance method
				letterGrade = test.getLetterGrade();
				// Display result
				System.out.println("Your grade is an " + letterGrade + " at a " + aveScores + "%.");
				// Exit the system process
				System.exit(0);
	}

}
