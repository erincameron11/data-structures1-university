/*
 * TESTING:
 * Reverse(12345) returns 54321 Reverse(-12345) returns 54321-
 */

package labtwo;

import java.util.Scanner;

public class ReverseNumber {

	public static void reverse(int number) {
		if (number < 0) {  // NEGATIVE
			
			number = number * -1; // Reverse the sign on the number
			
			if (number < 10) {  // Single digit handling
				System.out.println(number + "-");
				
			} else {
				System.out.print(number % 10);
				reverse((number - (number % 10)) / 10);
				System.out.println("-");
			}

		} else {  // POSITIVE
			if (number < 10) {  // Single digit handling
				System.out.print(number);
				
			} else {
				System.out.print(number % 10);
				reverse((number - (number % 10)) / 10);
			}
		}
	}

	
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number
		System.out.println("Enter a number (positive or negative): ");
		int number = input.nextInt();
		
		// Display the recursive method call
		reverse(number);
		
		// Close the input
		input.close();
	}

}
