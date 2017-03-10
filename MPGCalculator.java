import javax.swing.*;
import java.awt.event.*;
/**
 * @author Clint Coughlin
 */
public class MPGCalculator extends JFrame {
	private static final long serialVersionUID = 7169951020347062920L;
	private JLabel messageLabel;
	private JPanel panel;
	private JButton calcButton;
	private JButton exitButton;
	private JLabel gallons;
	private JTextField gallonsField;
	private JLabel miles;
	private JTextField milesField;
	private int MPG = 0;
	private final int WINDOW_WIDTH = 280;
	private final int WINDOW_HEIGHT = 200;
	/**
	 * Constructor
	 */
	public MPGCalculator() {
		// Set the title text bar
		super("Miles Per Gallon Calculator");
		// set size of the window
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		// set the action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Call the build panle method
		buildPanel();
		// Add the panel the content pane
		add(panel);
		// Display the window
		setVisible(true);
	}
	/**
	 * BuildPanel method to create
	 * amnd add components to the 
	 * content pane.
	 */
	public void buildPanel() {
		// Create the labels and text fields
		messageLabel = new JLabel
				("Enter the total Gallons and Miles on a full tank");
		gallons = new JLabel("Gallons in a Full Tank: ");
		gallonsField = new JTextField(20);
		miles = new JLabel("Total Miles on a full tank: ");
		milesField = new JTextField(20);
		// Create the buttons and register action listeners
		calcButton = new JButton("Calculate MPG");
		exitButton = new JButton("Exit");
		calcButton.addActionListener(new CalcButtonListener());
		exitButton.addActionListener(new ExitButtonListener());
		// add the new components to the content pane
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(gallons);
		panel.add(gallonsField);
		panel.add(miles);
		panel.add(milesField);
		panel.add(calcButton);
		panel.add(exitButton);
	}
	/**
	 * The private inner class is an action listener class for
	 * the calc button
	 */
	private class CalcButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// local field
			String gals;
			String mils;
			int galsTotal;
			int milsTotal;
			// Get what the user input
			gals = gallonsField.getText();
			mils = milesField.getText();
			// Parse the text field inputs
			galsTotal = Integer.parseInt(gals);
			milsTotal = Integer.parseInt(mils);
			// Calculate the amount
			MPG = milsTotal / galsTotal;
			// Display the result
			JOptionPane.showMessageDialog(null,
					"The total Gallons your vehicle holds is " +
					galsTotal + "\nand the total miles on a full tank is "
					+ milsTotal + ".\nThe total Miles Per Gallon (Appr.) is "
					+ MPG + " total miles per gallon(MPG).");
		}
	}
	/**
	 * The private inner class is an action listener class for
	 * the exit button
	 */
	private class ExitButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Exit the system process when
			// the exit button is clicked
			System.exit(0);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MPGCalculator();
	}

}
