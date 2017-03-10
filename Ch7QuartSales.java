import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Clint Coughlin
 */
public class Ch7QuartSales {
	private double[][] salesFigures;
	private final int ROW_SIZE = 4;
	private final int COL_SIZE = 6;
	/**
	 * No arg constructor to instantiate the array
	 */
	public Ch7QuartSales() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param row
	 * @param col
	 * @param sales
	 */
	public void setSalesFigures(int row, int col, double sales) {
		this.salesFigures[row][col] = sales;  
	}
	/**
	 * @return the salesFigures
	 */
	public double[][] getSalesFigures() {
		return salesFigures;
	}
	/**
	 * @param salesFigures the salesFigures to set
	 */
	public void setSalesFigures(double[][] salesFigures) {
		this.salesFigures = salesFigures;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int ROW_SIZE = 4;		// four quarters
		final int COL_SIZE = 6;		// six divisions
		double salesFigure = 0;		//
		// Create a DecimalFormat object for formatting
		// and a Scanner object for user input
		DecimalFormat form = new DecimalFormat("$#,###,###,##0.00");
		Scanner reader = new Scanner(System.in);
		// create an object of the QuartSales class
		Ch7QuartSales report = new Ch7QuartSales();
		// Nested for loop
		for(int i = 0; i < ROW_SIZE; i++) {
			for(int a = 0; a < COL_SIZE; a++) {
					do {
						System.out.println("Enter a Sales figure for Qtr " + (i + 1) + 
								":\nAnd Div " + (a + 1) + ": ");
						salesFigure = reader.nextDouble();
					while (salesFigure < 0) {
						// Show error message if number is below a zero
						System.out.println("Please enter a number greater than 0");
						salesFigure = reader.nextDouble();
					}
				} while(salesFigure < 0);
				report.setSalesFigures(i, a, salesFigure);
			} // End inner loop
		} // End outer loop
		// Display the results
		System.out.println("\tDiv 1\tDiv 2\tDiv 3\tDiv 4\t"
				+ "Div 5\tDiv 6");
		for(int row = 0; row < ROW_SIZE; row++){
				System.out.print((row + 1) + " Qtr:\t");
				for (int col = 0; col < COL_SIZE; col++) {
					System.out.print(form.format(report.getSalesFigures()[row][col])
							+ "\t");
			} // end for
				System.out.print("\n");
		} // end first for
		// Close the system processes
		System.exit(0);
	}

}
