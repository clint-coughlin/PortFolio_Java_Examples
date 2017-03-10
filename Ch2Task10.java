import javax.swing.JOptionPane;
import java.util.Random;
public class Ch2Task10 {
		public static void main(String[] args) {
			Random rand = new Random ();
			String firstTest = JOptionPane.showInputDialog
					("Your first Test score? - ");
			int testOne = Integer.parseInt(firstTest);
			String secondTest = JOptionPane.showInputDialog
					("Your second test score? - ");
			int testTwo = Integer.parseInt(secondTest);
			String thirdTest = JOptionPane.showInputDialog
					("Your third test score? - ");
			int testThree = Integer.parseInt(thirdTest);
	        int RandNum = testOne + testTwo + testThree;
	        int aveScores = RandNum / 3;
	        for(int i = 0; i < 0; i++) {
	            RandNum = rand.nextInt();
	            System.out.println("Here is the average of scores " + aveScores);
	        }
	        int average = (aveScores);
	        System.out.println("Here is the average of scores " + average);
		}
    
}
