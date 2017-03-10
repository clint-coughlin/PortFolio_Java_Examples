import javax.swing.*;
import java.awt.*;
/**
 * @author Clint Coughlin
 */
public class Routine6 extends JPanel {
	private static final long serialVersionUID = -6268135810466352596L;
	// Check box selections
	private JCheckBox oilChangeBox;
	private JCheckBox lubeJobBox;
	private JCheckBox radiatorFlushBox;
	private JCheckBox transmissionFlushBox;
	private JCheckBox inspectionBox;
	private JCheckBox mufflerReplacementBox;
	private JCheckBox tireRotationBox;
	// the prices for each service
	private final double OIL_CHANGE = 26.00;
	private final double LUBE_JOB = 18.00;
	private final double RADIATOR_FLUSH = 30.00;
	private final double TRANSMISSION_FLUSH = 80.00;
	private final double INSPECTION = 15.00;
	private final double MUFFLER_REPLACEMENT = 100.00;
	private final double TIRE_ROTATION = 20.00;
	/**
	 * Constructor
	 */
	public Routine6() {
		// Set the layout
		setLayout(new GridLayout(7, 1));
		// set Border Layout
		setBorder(BorderFactory.createTitledBorder("Routine"));
		// Create the check boxes and add them to the content
		oilChangeBox = new JCheckBox("Oil Change  ($26.00)");
		lubeJobBox = new JCheckBox("Lube Job   ($18.00)");
		radiatorFlushBox = new JCheckBox("Radiator Flush  ($30.00)");
		transmissionFlushBox = new JCheckBox("Transmission Flush  ($80.00)");
		inspectionBox = new JCheckBox("Inspection  ($15.00)");
		mufflerReplacementBox = new JCheckBox("Muffler Replacement   ($100.00)");
		tireRotationBox = new JCheckBox("Tire Rotation  ($20.00)");
		// Add the checkboxes to the content pane
		add(oilChangeBox);
		add(lubeJobBox);
		add(radiatorFlushBox);
		add(transmissionFlushBox);
		add(inspectionBox);
		add(mufflerReplacementBox);
		add(tireRotationBox);
	}
	/** 
	 * @return Total Costs of Routine Services
	 */
	public double getRoutineCosts() {
		double totalCost = 0.0;
		if (oilChangeBox.isSelected()) {
			totalCost += OIL_CHANGE;
		} else if (lubeJobBox.isSelected()) {
			totalCost += LUBE_JOB;
		} else if (radiatorFlushBox.isSelected()) {
			totalCost += RADIATOR_FLUSH;
		} else if (transmissionFlushBox.isSelected()) {
			totalCost += TRANSMISSION_FLUSH;
		} else if (inspectionBox.isSelected()) {
			totalCost += INSPECTION;
		} else if (mufflerReplacementBox.isSelected()) {
			totalCost += MUFFLER_REPLACEMENT;
		} else if (tireRotationBox.isSelected()) {
			totalCost += TIRE_ROTATION;
		}
		return totalCost;
	}
}
