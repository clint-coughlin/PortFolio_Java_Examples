/**
 * @author Clint Coughlin
 */
public class Ch2Task1 {
	String name;
	int age;
	double annualPay;
	/**
	 * Constructor
	 */
	public Ch2Task1(String n, int a, double c) {
		System.out.println("My name is " + n + 
				", my age is " + a + 
				"\nand I hope to earn " + c + " per year.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Ch2Task1("Clint Coughlin", 49, 100000.0);
	}

}
