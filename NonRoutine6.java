import javax.swing.*;
import java.awt.*;
/**
 * @author Clint Coughlin
 */
public class NonRoutine6 extends JPanel {
	private static final long serialVersionUID = 1064396536807244100L;
	private JLabel parts;
	private JTextField partsField;
	private JLabel labor;
	private JTextField laborField;
	private final double PAY_RATE = 20.00;
	private final double PARTS_CHARGE = 30.0;
	/**
	 * Constructor
	 */
	public NonRoutine6() {
		// Set the GridLayout manager
		setLayout(new GridLayout(2,1));
		// Set the border with title
		setBorder(BorderFactory.createTitledBorder("Non-Routine"));
		// create the text fields and labels
		parts = new JLabel("Parts Charged: ");
		partsField = new JTextField(10);
		labor = new JLabel("Labor");
		laborField = new JTextField(10);
		// Add the components to the content pane
		add(parts);
		add(partsField);
		add(labor);
		add(laborField);
	}
	/**
	 * @return Total Costs of Non Routine services
	 */
	public double getNonRoutineCosts() {
		double totalCost = 0.0;
		String parts;
		String labor;
		double partsTotal;
		double laborTotal;
		// Get what the user enters in the text fields
		parts = partsField.getText();
		labor = laborField.getText();
		// Parse the input
		partsTotal = Double.parseDouble(parts) + PARTS_CHARGE;
		laborTotal = Double.parseDouble(labor) * PAY_RATE;
		// display the result
		totalCost += partsTotal + laborTotal;
		return totalCost;
	}
}
