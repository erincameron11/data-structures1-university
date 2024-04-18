package assignmenttwo;

import java.util.Scanner;

public class RulerRecursion {
	
	/** Method to recursively construct the tick marks */
	public static String ruler(int length, int count, boolean firstRun) {
		if (firstRun) {
			System.out.print(" " + 0);
			firstRun = false;
		}
		
		if (length == 1) {
			return " ";  // Puts a space in between the ruler ticks
			
		} else {
			int middleHeight = (int)Math.round(Math.log(length) / Math.log(2));  // Calculation of log base e --> log base 2 for middle tick height
			int middle = length / 2;
					
			// Construct the ruler with the middle point and recursively call the method on the left and right side until length = 1
			return ruler(middle, count, false) + middleHeight + ruler(middle, count, false);
		}
	}
	
	
	/** Method to recursively return a count underneath the ruler tick values */
	public static String count(int count, int length, int counter) {
		if (count == length + 1) {
			return " ";
		} else {
			if (counter > 9) {
				counter = 0;
			}
			System.out.print(" " + counter);  // Display the counter
			return count(count + 1, length, counter + 1);  // Recursion call
		}
	}
	
	
	/** Main Method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
			
		// Prompt the user to enter the height of a ruler
		System.out.println("Enter the integer length of the ruler: ");
		int length = input.nextInt();
			
		// Check If the number is at least 2
		if (length < 2) {
			System.out.println("Number entered must be at least 2. Please re-run the program and try again.");
			System.exit(0);
		}
			
		// Check If the number is a power of 2
		if ((int)Math.pow(2, Math.round((Math.log(length) / Math.log(2)))) != length) {
			System.out.println("Number entered is not a power of 2. Please re-run the program and try again.");
			System.exit(0);
		}
		
		// Display the results to the user
		System.out.println(ruler(length, 0, true) + 0);
		System.out.println(count(0, length, 0));
				
		// Close the input
		input.close();
		
		
		// TESTING
//		// Display ruler 8
//		System.out.println(ruler(8, 0, true) + 0);
//		System.out.println(count(0, 8, 0) + "\n");
//		
//		
//		// Display ruler 16
//		System.out.println(ruler(16, 0, true) + 0);
//		System.out.println(count(0, 16, 0));		
		
	}
}
