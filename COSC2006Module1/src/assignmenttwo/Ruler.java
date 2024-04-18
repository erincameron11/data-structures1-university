package assignmenttwo;

import java.util.Scanner;

public class Ruler {
	
	public static String ruler(int length, int count, boolean firstRun) {
		if (firstRun) {
			System.out.print(" " + 0);
			firstRun = false;
		}
		
		if (length == 1) {
			return " ";
		} else {
			int middleHeight = (int)Math.round(Math.log(length) / Math.log(2));  // Calculation of log base e --> log base 2 for middle height
			int middle = length / 2;
					
			// Construct the ruler with the middle point and recursively call the method on the left and right side until lengths = 1
			return ruler(middle, count, false) + middleHeight + ruler(middle, count, false);
		}
	}
	
	
	public static String count(int count, int length, int counter) {
		if (count == length + 1) {
			return " ";
		} else {
			if (counter > 9) {
				counter = 0;
			}
			System.out.print(" " + counter);
			return count(count + 1, length, counter + 1);
		}
	}
	
	
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
	
		// Prompt the user to enter the height of a ruler
		System.out.println("Enter the integer length of the ruler: ");
		int length = input.nextInt();
	
		// Check If the number is at least 2
		if (length < 2) {
			System.out.println("Please re-run the program and ensure the number entered is at least 2.");
			System.exit(0);
		}
	
		// Check If the number is a power of 2
		if (Math.round(Math.log(length) / Math.log(2)) != 1) {
			System.out.println("Please re-run the program and ensure the number entered is a power of 2.");
			System.exit(0);
		}
		
//		System.out.print(ruler(length, 0 true));
//		ruler(length, 0 true);
		
		// Close the input
		input.close();
		
		
		// Display ruler 8
		System.out.print(ruler(8, 0, true));
		System.out.println(0);
		System.out.println(count(0, 8, 0) + "\n");
		
		
		// Display ruler 16
		System.out.print(ruler(16, 0, true));
		System.out.println(0);
		System.out.println(count(0, 16, 0));
		
		
		
	}
	
	
	
	
	
	
	

//	public static int rulerHeights(int length, int[] array) {
////		int[] array = new int[length];
//		int middle = length / 2;
//		
//		
//		// Base Case - if the length less than or equal to 2
//		if (length <= 2) {
//			return array[length - 1] = 0; // Set the last value of the array to 0
//		} else {
//			// Sets the middle of the array values to the middle tick height
//			boolean firstRun = true;
//			if (firstRun) {
//				array[middle] = (int)Math.round(Math.log(length) / Math.log(2));
//				firstRun = false;
//			}
//			
//			// Convert log base e --> log base 2 for the height of the middle tick
//			int middleHeight = (int)Math.round(Math.log(middle) / Math.log(2));
//			
//			// Calculate the middle and add middle to the array
//			int middleLeft = middle / 2;
//			int middleRight = (int)(middle * 1.5);
//			
//			
//			array[middleLeft] = middleHeight;
//			array[middleRight] = middleHeight;
//			
////			array[middleR] = middleHeight;
//			
//			
//			
////			boolean firstRun = true;
////			if (firstRun) {
////				firstRun = false;
////			} else {
////				array[middleRight] = middleHeight;
////			}
//			
////			plus = middle + (middle / 2);
////			array[plus] = middleHeight;
////			
////			minus = middle - (middle / 2);
////			array[minus] = middleHeight;
//			
//			
//			System.out.println(Arrays.toString(array));
//			
//			return rulerHeights(middle, array);
//			
//			
//		}
//		
//	}
//	
//	
//	public static void main(String[] args) {
////		// Create a Scanner
////		Scanner input = new Scanner(System.in);
////		
////		// Prompt the user to enter the height of a ruler
////		System.out.println("Enter the integer length of the ruler: ");
////		int length = input.nextInt();
////		
////		// Check If the number is at least 2
////		if (length < 2) {
////			System.out.println("Please re-run the program and ensure the number entered is at least 2.");
////			System.exit(0);
////		}
////		
////		// Check If the number is a power of 2
//////		double logTwo = Math.log(number) / Math.log(2);
////		if (Math.round(Math.log(length) / Math.log(2)) != 1) {
////			System.out.println("Please re-run the program and ensure the number entered is a power of 2.");
////			System.exit(0);
////		} else {
////			rulerHeights(length);
////		}
////		
////		// Close the input
////		input.close();
//		
//		
////		rulerHeights(8);
//		int[] array = new int[8 + 1];
////		System.out.println(rulerHeights(8, array));
//		rulerHeights(8, array);
//		
////		int l = 8;
////		int[] array = new int[l];
////		array[0] = 0;
////		array[l - 1] = 0;
////		
////		for (int i = 1; i < array.length; i++) {
////			
////		}
//		
//			
//		
//	}

}
