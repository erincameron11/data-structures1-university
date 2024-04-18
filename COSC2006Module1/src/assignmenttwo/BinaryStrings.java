package assignmenttwo;

import java.util.Scanner;

public class BinaryStrings {
	
	/** Method to calculate strings without consecutive 1's recursively */
	public static int binaryStringLength(int n) {
		// Base Case - if n is less than or equal to 1, return the value of n
		if (n <= 1)
	       return n;
	    
		// Recursively return the binary strings of length n-1 (1's) added to n-2 (0's and 1's)
	    return binaryStringLength(n - 1) + binaryStringLength(n - 2);  // Add the strings that end with 0, and 10's together
    }
	
	/** Method to call the recursive method accounting for the 2 values in binary digits */
	public static int count(int n) {
		// Returning the binary method recursively adding two to n each time to account for the 2 values in binary (0's and 1's)
		return binaryStringLength(n + 2);
	}
	
	/** Main Method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for a number
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		// Display result to the user
		System.out.println("The number of binary strings of count " + n + " that do not have consecutive 1's is: " + "\n" + count(n));
		
		// Close the input
		input.close();
	}

}