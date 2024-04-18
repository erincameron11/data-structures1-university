package test;

import java.util.Scanner;

public class TestRecursion {
	
	private static int endVal = 0;
//	private static int count = 0;
//	private static int endVal2 = 0;
	
	/** Recursive Method to return number of binary strings of length n 
	 * that do not have two consecutive ones */
	public static int binaryStringLength(int n) {
//		int endVal = 0;
		
		// Base Case - If the number is a 0, return 0
		if (n == 0) {
			return n;
		}
		
		// Base Case - If we are on the last digit of n
		if (n == 1) {
			if (endVal == 1) {
//				count++;
//				return count;
				return 1;
			} else {
//				count++;
//				count++;
//				return count;
				return 2;
			}
		}
		
		// Recursively call the method based on whether the end digit checked was a 1 or 0
		if (endVal == 0) {
//			int d = binaryStringLength(n - 1) + endVal;
//			endVal = 1;
//			d += binaryStringLength(n - 1) + endVal;
//			return d; // Add the strings that end with 0, and 10's together
////			endVal = 1;
//			count++;
//			count++;
			return (binaryStringLength(n - 1)) + (binaryStringLength(n - 1)); // Add the strings that end with 0, and 10's together
			
		} 
	
		if (endVal == 1) {
//			endVal = 0;
//			count++;
			return (binaryStringLength(n - 1));
		}
		
		return 0;
//		return count;
	}
	
	public static void main(String[] args) {
//		// Create a Scanner
//		Scanner input = new Scanner(System.in);
//		
//		// Prompt the user to enter a number
//		System.out.println("Enter a number for parameter 'n': ");
//		int n = input.nextInt();
//		
//		// Call the method
//		System.out.println(binaryStringLength(n));
//		
//		// Close the input
//		input.close();
		
		System.out.println(binaryStringLength(4));
		
		
	}

}




//WORKING EXAMPLE WITH TWO PARAMETERS
//package test;
//
//import java.util.Scanner;
//
//public class TestRecursion {
//	
//	/** Recursive Method to return number of binary strings of length n 
//	 * that do not have two consecutive ones */
//	public static int binaryStringLength(int n, int endVal) {
////		int endVal = 0; // The end value of the string currently
//		
//		// Base Case - If the number is a 0, return 0
//		if (n == 0) {
//			return 0;
//		}
//		
//		// Base Case - If we are on the last digit of n
//		if (n == 1) {
//			if (endVal == 1) {
//				return 1;
//			} else {
//				return 2;
//			}
//		}
//		
//		// Recursively call the method based on whether the end digit checked was a 1 or 0
//		if (endVal == 0) {
//			return (binaryStringLength(n - 1, 0)) + (binaryStringLength(n - 1, 1)); // Add the strings that end with 0, and 10's together
//		} else {
//			return (binaryStringLength(n - 1, 0));
//		}
//		
//	}
//	
//
//	public static void main(String[] args) {
////		// Create a Scanner
////		Scanner input = new Scanner(System.in);
////		
////		// Prompt the user to enter a number
////		System.out.println("Enter a number for parameter 'n': ");
////		int n = input.nextInt();
////		
////		// Call the method
////		System.out.println(binaryStringLength(n));
////		
////		// Close the input
////		input.close();
//		
//		System.out.println(binaryStringLength(6, 0));
//		
//		
//	}
//
//}
