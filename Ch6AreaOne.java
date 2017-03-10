import java.util.Scanner;

/**
 * @author Clint Coughlin
 */
public class Ch6AreaOne {
	private static double Radius; 		// Local field Radius
	private static double Length; 		// Local field length
	private static double Width; 		// Local field Width
	private static double Height; 		// Local field Height
	private static double Area; 		// Local field Area
	private static double TotalArea;	// Local field TotalArea
	/**
	 * No-arg Constructor
	 */
	public Ch6AreaOne() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * return the area of a circle
	 * @param
	 */
	public void setLength(double l) {
		this.Length = l;
	}
	/**
	 * @return length
	 */
	public double getLength() {
		return Length;
	}
	/**
	 * @param set width
	 */
	public void setWidth(double w) {
		this.Width = w;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return Width;
	}
	/**
	 * @param radius
	 */
	public void setRadius(double r) {
		this.Radius = r;
	}
	/**
	 * @return Radius
	 */
	public double getRadius() {
		return Radius;
	}
	/**
	 * @param set height 
	 */
	public void setHeight(double h) {
		this.Height = h;
	}
	/** 
	 * @return height
	 */
	public double getHeight() {
		return Height;
	}
	/**
	 * @return Area of a Circle / overloaded STATIC method
	 */
	public static double getArea() {
		return Area = Math.PI * (Radius * Radius);
	}
	/**
	 * @param widht
	 * @return The area of Rectangle / overloaded STATIC method
	 */
	public static double getArea(double l, double w) {
		Length = l;
		Width = w;
		return Area = Length * Width;
	}
	/**
	 * @param height
	 * @param radius
	 * @return the area of a cylinder / overloaded STATIC method
	 */
	public static double getArea
	(double totalArea, double h, double r) {
		return Area = Math.PI * (Radius * Radius) * Height;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double length = 0; // All local empty fields needed 
		double width = 0;  // for user input
		double radius = 0;
		double height = 0;
		// Create necessary objects needed for user input
		// and an instance of the Area class
		Ch6AreaOne area = new Ch6AreaOne();
		Scanner reader = new Scanner(System.in);
		// Ask the user for measurements and pass them 
		// Through static methods
		// Calculate the area of a Circle
		System.out.println("Calculate the area of a circle!");
		System.out.println("Enter the Radius: ");
		radius = reader.nextDouble();
		area.setRadius(radius);
		System.out.println("The area of the circle is\n" 
		+ Math.floor(area.getArea()));
		// Calculate the area of a Rectangle
		System.out.println("Calculate the area of a Rectangle!");
		System.out.println("Enter the width: ");
		width = reader.nextDouble();
		area.setWidth(width);
		System.out.println("Enter the Length: ");
		length = reader.nextDouble();
		area.setHeight(length);
		System.out.println("The area of the rectangle is\n" 
		+ Math.round(area.getArea(length, width)));
		// Calculate the area of a Cylinder
		System.out.println("Calculate the area of a Cylinder!");
		System.out.println("Enter the Radius: ");
		radius = reader.nextDouble();
		area.setRadius(radius);
		System.out.println("Enter the Height: ");
		height = reader.nextDouble();
		area.setHeight(height);
		System.out.println("The area of the Cylinder is\n" 
		+ Math.round(area.getArea(Math.PI, radius, height)));
		// exit the process
		System.exit(0);
	}

}
