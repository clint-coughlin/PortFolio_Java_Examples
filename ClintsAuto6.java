import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * @author Clint Coughlin
 */
public class ClintsAuto6 extends JFrame {
	private static final long serialVersionUID = -4826141153851821164L;
	private Routine6 routine;
	private NonRoutine6 nonRoutine;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	/**
	 * Constructor
	 */
	public ClintsAuto6() {
		// Set the title text bar
		super("Clint's Automotive and Maintanence");
		// Set Border layout manager
		setLayout(new BorderLayout());
		// set the action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Create the Custom panels
		routine = new Routine6();
		nonRoutine = new NonRoutine6();
		// Call the build panle method
		buildButtonPanel();
		// Add the custom panels the content pane
		add(routine, BorderLayout.NORTH);
		add(nonRoutine, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		// display the window
		pack();
		setVisible(true);
	}
	/**
	 * The BuildPanel method
	 */
	public void buildButtonPanel() {
		// create the panel
		buttonPanel = new JPanel();
		// Add buttons to the content pane
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		// Register Action Listeners
		calcButton.addActionListener(new CalcButtonListener());
		exitButton.addActionListener(new ExitButtonListener());
		// add components to the content pane
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}
	/**
	 * The private inner class is an action listener class for
	 * the calc button
	 */
	private class CalcButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double totalCost = 0.0;
			// get the total from both panels
			totalCost = routine.getRoutineCosts() +
					nonRoutine.getNonRoutineCosts();
			// Display the results
			JOptionPane.showMessageDialog
				(null, "The Total is $" + totalCost);
		}
	}
	/**
	 * The private inner class is an action listener class for
	 * the exit button
	 */
	private class ExitButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Exit the system process when the exit button is clicked
			System.exit(0);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ClintsAuto6();
	}
}
