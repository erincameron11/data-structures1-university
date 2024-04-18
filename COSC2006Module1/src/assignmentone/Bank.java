	// Define variables for customer number, accounts (char S, C, M), balance (double)
	// Store these values in three different arrays that are linked
	
	// Make the arrays parallel arrays
	// Make sure any action performed on one array happens to ALL the arrays to keep their order
	// Keep track of the size of the arrays once
	
	// When the program starts it looks for a text file called bank.txt, open it, and load three arrays with the data contained there
	// Contains one entry per line, cust numb, account, then balance
	// Bank holds a maximum of 200 accounts, but we do NOT know how many are in the file
	// Perhaps, consider checking to make sure there are less than 201 before reading data? and advise the user if over 200 that 200 is the max and some values may be missing
	
	// Once data read in, prompt user on screen to enter single char commands S (search), P (Print total balances), Q (quit)
	// Error check that no other char's are used, and prompt again
	// Continually accept P and S until Q command entered
	
	// When P command pressed:
	// 1) ensure account array (and all other arrays to keep order) are sorted by customer number
	// 2) create a selection sort method to print the total balances for that customer number
	// Should only have to go through all three arrays once to do this
	// Should be displayed in a table format, showing the fields from all three arrays. If no data found, display a message saying that
	
	// When S command pressed:
	// 1) Prompt the user to enter a customer number, account, or both
	// 2) If only searching by one entity, use a 0 for account number, or X for account
	// A single search command should only go through the arrays ONCE and should not sort the data at all
	// Should be displayed in a table format, showing the fields from all three arrays. If no data found, display a message saying that

package assignmentone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bank {	
	
	// Initialize variables
	private int custNum;
	private char accountType;
	private double balance;
	
	// Initialize arrays
	private static int[] custArray = new int[200];
	private static char[] accountArray = new char[200];
	private static double[] balanceArray = new double[200];
	
	Bank() {
		// No-arg Constructor
	}
	
	// 3-arg Constructor
	Bank(int custNum, char accountType, double balance) {
		super();

		// Only add the values if the array sizes are less than 200 - Customer Number array
		for (int i = 0; i < custArray.length; i++) {
	           if (i != custArray.length - 1
	        		&& custArray == null) {
	   				this.custNum = custNum;
	           }
	     }
		// Only add the values if the array sizes are less than 200 - Account Type array
		for (int j = 0; j < accountArray.length; j++) {
			if (j != accountArray.length - 1
	        	&& accountArray == null) {
				this.accountType = accountType;
			}
		}
		// Only add the values if the array sizes are less than 200 - Balance array
		for (int k = 0; k < balanceArray.length; k++) {
			if (k != balanceArray.length - 1
	        	&& balanceArray == null) {
				this.balance = balance;
			}
		}
		
	}

	// Get customer number
	public int getCustNum() {
		return custNum;
	}

	// Set customer number
	public void setCustNum(int custNum) {
		this.custNum = custNum;	
		
	}
	
	// Get account type
	public char getAccountType() {
		return accountType;
	}

	// Set account type
	public void setAccountType(char accountType) {
		this.accountType = accountType;
		
	}

	// Get balance
	public double getBalance() {
		return balance;
	}

	// Set balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	/** Method to sort arrays by custNum and Print total balances for the specified custNum in table format */
	public static void selectionSort(int custNum) {
		boolean dataFound = false;
		int index = 0;
		double bal = 0;
		int cus = 0;
		char[] acc = new char[3]; // Users can only hold 3 account types
		
		for (int i = 0; i < custArray.length; i++) {
			
			// Find the custNum in the array
			if (custArray[i] == custNum) {
				bal += balanceArray[i];
				cus = custArray[i];
				acc[index] = accountArray[i];
				index++;
				dataFound = true;
			}
			
		}
		// Print in table format
		print();
	
		// If no data found in the arrays that match the print call
		if (!dataFound) {
		    System.out.println("No data found.");
		} else {
			System.out.println(cus + "\t\t\t\t" + acc[0] + " " + acc[1] 
								+ " " + acc[2] + "\t\t\t\t" + String.format("$%,.2f", bal)); // 3 possible account's to display if present
		}
		
	}
	
	
	/** Method to handle Searches for custNum and accountType and display results in table format */
	public static void commandS(int custNum, char accountType) {
		
		boolean dataFound = false;
		
		if (custNum != 0 && accountType != 'X') { // If all two parameters given
			print();
			for (int i = 0; i < custArray.length; i++) {
				if (custArray[i] == custNum && accountArray[i] == accountType) {
					System.out.println(custArray[i] + "\t\t\t\t" + accountArray[i] + "\t\t\t\t" + String.format("$%,.2f", balanceArray[i]));
					dataFound = true;
				}
			}
			
		} else if (custNum != 0 && accountType == 'X') { // Else if, only custNum given
			print();
			for (int i = 0; i < custArray.length; i++) {
				if (custArray[i] == custNum) {
					System.out.println(custArray[i] + "\t\t\t\t" + accountArray[i] + "\t\t\t\t" + String.format("$%,.2f", balanceArray[i]));
					dataFound = true;
				}
			}
			
		} else if (custNum == 0 && accountType != 'X') { // Else if, only accountType given
			print();
			for (int i = 0; i < custArray.length; i++) {
				if (accountArray[i] == accountType) {
					System.out.println(custArray[i] + "\t\t\t\t" + accountArray[i] + "\t\t\t\t" + String.format("$%,.2f", balanceArray[i]));
					dataFound = true;
				}
			}
		}
		// If no data found in the arrays that match the search
		if (!dataFound) {
		    System.out.println("No data found.");
		}
		
	}
	
	
	/** Method for printing in table format */
	public static void print() {
		System.out.println("Customer Number\t\t||\tAccount Type\t\t||\tBalance");
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
	
	/** Method to read the data */
	public static void read() {
		File file = new File("a1data.txt");
		
		// Read the file contents and store in arrays
		try (Scanner inputFile = new Scanner(file)) {
			int index = 0;
			int count = 0;
			
			while (inputFile.hasNext()) {
				
				if (count >= 200) {
					System.out.println("There's too much information in the file to input into your arrays!");
				} else {
					custArray[index] = inputFile.nextInt();
					accountArray[index] = inputFile.next().charAt(0);
					balanceArray[index] = inputFile.nextDouble();
					index++;
					count++;
				}
				
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File not found.");
		}
	}
	
	
	/** Method for taking input from the user on commands */
	public static void getCommand() {
		// Prompt the user to enter a command, and handle the command entered with if/else
		boolean switcher = true;	
		Scanner input = new Scanner(System.in);
				
		while (switcher) {
			System.out.println("\nEnter P (print), S (search), or Q (quit): ");
			String userIn = input.next();
					
			if (userIn.equals("P") || userIn.equals("p")) {
				System.out.println("Please enter the Customer Number you would like to print a total balance for: ");
				int userCustNum = input.nextInt();
				selectionSort(userCustNum);
						
			} else if (userIn.equals("S") || userIn.equals("s")) {
				System.out.println("Enter customer number and account type. If only searching by one parameter, use 0, or X, respectively.");
				commandS(input.nextInt(), input.next().charAt(0));
						
			} else if (userIn.equals("Q") || userIn.equals("q")) {
				System.out.println("Thank you for banking with us. Sorry to see you go. Goodbye.");
				switcher = false;
				System.exit(0);
						
			} else {
				System.out.println("Invalid entry. Try again.");
			}
		}
				
		// Close the input to prevent memory leakage
		input.close();
	}
	
	
	/** Main Method */
	public static void main(String[] args) {
		// Method call to read the data and store in arrays
		read();
		
		// Method call to get commands from the user and display the output
		getCommand();
		
	}

}
