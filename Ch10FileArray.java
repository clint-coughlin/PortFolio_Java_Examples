import java.io.*;
/**
 * @author Clint Coughlin
 */
public class Ch10FileArray {
	private static String fileName = "";
	private static int[] numbers = new int[0];
	/**
	 * No-arg Constructor
	 */
	public Ch10FileArray() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param filename
	 * @param array
	 */
	public static void writeArray(String filename, int[] array) {
		fileName = filename;
		numbers = array;
 	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// Create an array of random numbers
		int[] numbers = {1, 6, 63, 91, 42, 57, 87, 74, 26, 35};
		int number = 0;				// to hold a number
		boolean end = false;		// end of file flag
		// Open binary file for output
		FileOutputStream output = new FileOutputStream("Numbers.dat");
		DataOutputStream outPutFile = new DataOutputStream(output);
		System.out.println("Writing data to the file...");
		// Write the array elemets to the binary file
		for (int i = 0; i < numbers.length; i++) {
			outPutFile.writeInt(numbers[i]);
		}
		// close the file
		outPutFile.close();
		System.out.println("Done. Now We will read that\n"
				+ "file and display the results.");
		// Object needed for reading from a file
		DataInputStream inputFile = 
			new DataInputStream(new FileInputStream("Numbers.dat"));
		System.out.println("Reading the data from the file...");
		// Read the data from the file
		while (!end) {
			try {
				number = inputFile.readInt();
				System.out.println(number + " ");
			} catch (EOFException e) {
				end = true;
			}
		} // end While
		// Close the file
		inputFile.close();
		System.out.println("\nDone.");
		// Exit the System process
		System.exit(0);
	}
}
