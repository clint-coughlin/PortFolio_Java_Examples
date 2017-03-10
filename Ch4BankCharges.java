import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Clint Coughlin
 *
 */
public class Ch4BankCharges {
	// local Variables
	private double balance;
	private double checksWritten;
	private double checkFeePerMonth = 10;
	private double addedCheckFee;
	private double bankServices;
	private double balanceFellB400 = 15;
	/**
	 * no-arg Constructor
	 */
	public Ch4BankCharges() {
		// TODO Auto-generated constructor stub
	}

	// Object to process input data
	public Ch4BankCharges(double bal, double cWritten) {
		this.balance = bal;
		this.checksWritten = cWritten;
	}
	
	// Return getBalance
	public double getBalance() {
		return balance;
	}

	// setBalance method
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// returns checksWritten
	public double getChecksWritten() {
		return checksWritten;
	}

	// setChecksWritten method
	public void setChecksWritten(double checksWritten) {
		this.checksWritten = checksWritten;
	}

	// return checkFeePerMonth
	public double getCheckFeePerMonth() {
		return checkFeePerMonth;
	}

	// setCheckFeePerMonth method
	public void setCheckFeePerMonth(double checkFeePerMonth) {
		this.checkFeePerMonth = checkFeePerMonth;
	}
	
	// returns Fee along with calculations for the fee
	public double getFee() {
		double fee = 10;
		if (balance <= 400) {
			fee += 15;
		}
		if (checksWritten >= 60){
			fee += checksWritten * .04;
		} else if (checksWritten >= 40) {
			fee += checksWritten * .06;
		} else if (checksWritten >= 20) {
			fee += checksWritten * .08;
		} else if (checksWritten <= 20) {
			fee += checksWritten * .10;
		}
		return fee;
	}

	// setAddedCheckFee method
	public void setAddedCheckFee(double addedCheckFee) {
		this.addedCheckFee = addedCheckFee;
	}

	// returns getBanknServices
	public double getBankServices() {
		return bankServices;
	}

	// setBankServices method
	public void setBankServices(double bankServices) {
		this.bankServices = bankServices;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double checksWrote;
		double balance;
		// gets input from user
		Scanner reader = new Scanner(System.in);
		// asks the user for current balance
		System.out.println("What is your current balance \nwithin "
				+ "your bank account? ");
		balance = reader.nextDouble();
		// asks the user how many checks they have written in a month
		System.out.println("How many checks do you write per month? ");
		checksWrote = reader.nextDouble();
		// Instantiates a new object with the class file
		Ch4BankCharges charge1 = new Ch4BankCharges(balance, checksWrote);
		// Creates a new DecimalFormat object
		DecimalFormat form = new DecimalFormat("#,#00.00");
		// creates a variable to store the final result
		double totalCalc = balance - charge1.getFee();
		// Displays the final result in the console
		System.out.println("Your total balance in the account is $" + form.format(balance));
		System.out.println("The total Monthly fee is $" + form.format(charge1.getFee()));
		System.out.println("Your account total after the fee is $" + form.format(totalCalc));
		// exit the system process
		System.exit(0);
	}

}
