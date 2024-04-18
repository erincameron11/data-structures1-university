package labthree;

public class TestBitBank {
	/** Main Method */
	public static void main(String[] args) throws BankException {

		BitBank bb = new BitBank("GB821234", "Joe"); // Valid account number
//		bb.withdraw(10.00); // Throws BankException insufficient funds
		bb.deposit(200.00);
		System.out.println("bb balance = $" + bb.balance());
		bb.withdraw(150.00);
		System.out.println("bb balance = $" + bb.balance());
		
//		BitBank bb2 = new BitBank("CA123456", "Bob", 120.0); // Invalid account number
		
//		BitBank bb3 = new BitBank("CA12345", "Bob", 120.0); // Invalid number of digits on account
		
		BitBank bb4 = new BitBank("GB821234", "Bob", 120.0);
		System.out.println("bb4 balance = $" + bb4.balance()); // Check pre-set balance of bb4
	}
}
