/**
 * @author Clint Coughlin
 */
public class Ch3RetailItem {

	private static String description;
	private static int unitsOnHand;
	private static double price;
	/**
	 * No arg contructor
	 */
	public Ch3RetailItem() {
		// No arg Constructor
	}
	/**
	 * Constructor
	 */
	public Ch3RetailItem(String d, int u, double p) {
		this.description = d;
		this.unitsOnHand = u;
		this.price = p;
	}	
	/**
	 * @param description
	 */
	public static void setDesc(String description) {
		Ch3RetailItem.description = description;
	}
	/**
	 * @param unitsOnHand
	 */
	public static void setNumUnits(int unitsOnHand) {
		Ch3RetailItem.unitsOnHand = unitsOnHand;
	}
	/**
	 * @param price
	 */
	public static void setPrice(double price) {
		Ch3RetailItem.price = price;
	}
	/**
	 * @param string
	 * @return
	 */
	public static String getDesc(String string) {
		return description;
	}
	/**
	 * @param i
	 * @return
	 */
	public static int getNumUnits(int i) {
		return unitsOnHand;
	}
	/**
	 * @param d
	 * @return
	 */
	public static double getPrice(double d) {
		return price;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ch3RetailItem item1 = new Ch3RetailItem();
		Ch3RetailItem item2 = new Ch3RetailItem();
		Ch3RetailItem item3 = new Ch3RetailItem();
		item1.setDesc("Jacket");
		item1.setNumUnits(12);
		item1.setPrice(59.95);
		item2.setDesc("Designer Jeans");
		item2.setNumUnits(40);
		item2.setPrice(34.95);
		item3.setDesc("Shirt");
		item3.setNumUnits(20);
		item3.setPrice(24.95);
		// Display the total reult
		System.out.print(
		"       Description        Units on Hand           Price \n" + 
		"________________________________________________________\n");
		System.out.println("Item #1 " + item1.getDesc(null) + " " 
			+ item1.getNumUnits(0) + " " + item1.getPrice(0));
		System.out.println("Item #2 " + item2.getDesc(null) + " " 
				+ item2.getNumUnits(0) + " " + item2.getPrice(0));
		System.out.println("Item #3 " + item3.getDesc(null) + " " 
				+ item3.getNumUnits(0) + " " + item3.getPrice(0));
		System.exit(0);
	}
}
