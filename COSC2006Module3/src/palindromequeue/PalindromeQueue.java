/*
 * https://www.youtube.com/watch?v=UHEMG2TgD8Q
 */

package palindromequeue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeQueue {
	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		Queue queue = new LinkedList();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			queue.add(str.charAt(i));
		}
		
		String reverse = "";
	
		while (!queue.isEmpty()) {
			reverse += queue.remove();
		}
		
		if (str.equals(reverse))
			System.out.println("The input string is a palindrome");
		else
			System.out.println("The input string is not a palindrome");
		
		// Close the input
		input.close();
	}
}
