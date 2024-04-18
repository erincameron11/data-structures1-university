/*
 * TESTING: 
 		System.out.println(maximumChar("i", (char)0)); // returns the character 'i'
		System.out.println(maximumChar("Data Structures", (char)0));  // returns the character ‘u‘
		System.out.println(maximumChar("Algoma U", (char)0)); // returns the character ‘o‘
		System.out.println(maximumChar("COSC2006", (char)0)); // returns the character ‘S'
		System.out.println(maximumChar("1234", (char)0)); // returns the character ‘4’
 */

package labtwo;

import java.util.Scanner;

public class MaxCharacter {

	public static char maximumChar(String str, char max) {
		
		if (str.length() == 0) {
			// Do nothing - base case
		} else {
			 int d = str.charAt(0) > max ? max = str.charAt(0) : max;
			 return maximumChar(str.substring(1), max);
			 
		}
		return max;
	}
	
	    
	
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a string and then a max value
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		System.out.println("Enter a max: ");
		char c = input.next().charAt(0);
		
		// Display results of the recursive method call
		System.out.println(maximumChar(s, c));
		
	}

}
