/**
 * @author Clint Coughlin
 */
public class Ch3Car {

	private int yearModel;
	private String make;
	private int speed;
	
	public Ch3Car(int yM, String Make) {
		this.yearModel = yM;
		this.make = Make;
	}
	public void accelerate() {
		this.speed += 5;
		System.out.print("You are going " + speed + " miles per hour.\n");
	}
	public void brake() {
		this.speed -= 5;
		System.out.print("You are going " + speed + " miles per hour.\n");
	}
	public int getSpeed(int speed) {
		return speed;
	}
	
	public static void main(String[] args) {
		Ch3Car car1 = new Ch3Car(2017, "Dodge Viper");
		for (int s = 0; s < 5; s++) {
			car1.accelerate();
		}
		for (int b = 0; b < 5; b++) {
			car1.brake();
		}
	}
}