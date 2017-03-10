import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @author Clint Coughlin
 */
public class Ch6Geometry {
	private static double area;
	private static double radius;
	private static double Length;
	private static double Width;
	private static double base;
	private static double height;
	/**
	 * Constructor to initialize the 
	 * private fields within the class
	 */
	public Ch6Geometry() {
		radius = 0;
		Length = 0;
		Width = 0;
		base = 0;
		height = 0;
	}
	/**
	 * @return the area
	 */
	public static double getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public static void setArea(double area) {
		Ch6Geometry.area = area;
	}
	/**
	 * @return the radius
	 */
	public static double getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public static void setRadius(double radius) {
		Ch6Geometry.radius = radius;
	}
	/**
	 * @return the length
	 */
	public static double getLength() {
		return Length;
	}
	/**
	 * @param length the length to set
	 */
	public static void setLength(double length) {
		Length = length;
	}
	/**
	 * @return the width
	 */
	public static double getWidth() {
		return Width;
	}
	/**
	 * @param width the width to set
	 */
	public static void setWidth(double width) {
		Width = width;
	}
	/**
	 * @return the base
	 */
	public static double getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public static void setBase(double base) {
		Ch6Geometry.base = base;
	}
	/**
	 * @return the height
	 */
	public static double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public static void setHeight(double height) {
		Ch6Geometry.height = height;
	}
	/**
	 * @return the total area of a circle
	 */
	public static double getAreaCirc() {
		return area = Math.PI * (radius * radius);
	}
	/**
	 * @return the total area of a Rectangle
	 */
	public static double getAreaRect() {
		return area = Length * Width;
	}
	/**
	 * @return the total area of a Cylinder
	 */
	public static double getAreaTri() {
		return area = base * height * 0.5;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an object of the Geometry class
			Ch6Geometry formula = new Ch6Geometry();
			// create the Scanner object for user input
			Scanner reader = new Scanner(System.in);
			DecimalFormat form = new DecimalFormat("###,###,###");
			// char to decide which case of operation to use
			int userInput1 = 0;
			// Display list of choices to the user to 
			// select which operation of calculations 
			// they wish to perform
			System.out.println("1: Calculate the Area of a Circle");
			System.out.println("2: Calculate the Area of a Rectangle");
			System.out.println("3: Calculate the Area of a Triangle");
			System.out.println("4: Quit");
			System.out.println("\n");
			// Enter a number 1 through 4 the switch statement
			System.out.println("Enter a number 1 through 4");
			userInput1 = reader.nextInt();
			// According to what the user wished to perform
			// perform the correct process
			switch (userInput1) {
			case 1:
				// calculations for a circle
				double radius;
				System.out.println("What is the Radius of the circle: ");
				radius = reader.nextDouble();
				while (radius < 0) {
					System.out.println("Please enter a positive integer.");
					radius = reader.nextDouble();
				}
				formula.setRadius(radius);
				System.out.println("The total area of the circle is\n" 
						+ form.format(formula.getAreaCirc()));
				break;
			case 2:
				double width;
				double length;
				// Calculate the area of a Rectangle
				System.out.println("Enter the Rectangles width: ");
				width = reader.nextDouble();
				while (width < 0) {
					System.out.println("Please enter a positive integer.");
					width = reader.nextDouble();
				}
				formula.setWidth(width);
				System.out.println("What is the length?  ");
				length = reader.nextDouble();
				while (length < 0) {
					System.out.println("Please enter a positive integer.");
					length = reader.nextDouble();
				}
				formula.setLength(length);
				System.out.println("The total area of Rectangle is\n"
									+ form.format(formula.getAreaRect()));
				break;
			case 3:
				// Calculate the area of a Circle
				double base;
				double height;
				System.out.println("Enter the base of the triangle: ");
				base = reader.nextDouble();
				while (base < 0) {
					System.out.println("Please enter a positive integer.");
				}
				formula.setBase(base);
				System.out.println("Enter the total height: ");
				height = reader.nextDouble();
				while (height < 0) {
					System.out.println("Please enter a positive integer.");
					height = reader.nextDouble();
				}
				formula.setHeight(height);
				System.out.println("The total area of the Triangle is\n" + 
						form.format(formula.getAreaTri()));
				break;
			case 4:
				System.out.println("You have exited the application, Bye Bye!");
				System.exit(0);
				break;
			default: 
				System.out.println("Please enter a number 1 through 4 to perform\n"
						+ "one of the operations.");
				userInput1 = reader.nextInt();
			}
			System.exit(0);
		}
	}


