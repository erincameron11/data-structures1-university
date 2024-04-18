package labthree;

public class BitBank {

	// Initialize variables
	private String accountNum;
	private String name;
	private static double balance;
	
	public BitBank(String accountNum, String name) throws BankException {
		
		if (!verify(accountNum)) {
			throw new BankException("Invalid account number.");
		}
		this.accountNum = accountNum;
		this.name = name;
		this.balance = 0; // Initialize to zero
	}
	
	public BitBank(String accountNum, String name, double balance) {
		this(accountNum, name);
		this.balance = balance;
	}
	
	
	/** Method to deposit a specified amount of money */
	public double deposit(double amount) {
		return balance += amount;
	}
	
	
	/** Method to withdraw a specified amount (if sufficient funds) */
	public static void withdraw(double amount) {
		
		if ((balance - amount) > 0) {
			balance -= amount;
		} else {
			throw new BankException("Insufficient funds to withdraw $" + amount + " current balance = $" + balance);
		}	
	}
	
	
	/** Getter: Method to return the balance of the account */
	public double balance() {
		return balance;
	}
	
	
	/** Method to verify */
	private static boolean verify(String accountNum) {
		
		// Check that the account number is 8 characters in length
		if (accountNum.length() != 8) {
			return false;
			
		} else {
			// Move first 4 characters to the end of the string
			String newAccountNum = accountNum.substring(4) + accountNum.charAt(0) + accountNum.charAt(1) + accountNum.charAt(2) + accountNum.charAt(3);
			
			// Convert letters to their corresponding int values
			StringBuilder sb = new StringBuilder(newAccountNum);
			String c = ((sb.charAt(4) - 'A') + 10) + "";
			String c2 = ((sb.charAt(5) - 'A') + 10) + "";
			sb.replace(4, 5, c);
			sb.replace(6, 7, c2);
					
			// Interpret the number as a Double value and divide by 11, if remainder is 1 it is valid, else invalid
			if (Double.parseDouble(sb.toString()) % 11 == 1) {
				return true;
			} else {
				return false;
			}
		}
	}

}
