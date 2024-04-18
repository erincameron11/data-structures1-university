package labsix;

import java.util.Scanner;

public class TestStringsGenericArrayStack {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.println("Enter a string: ");
		String userIn = input.nextLine();
		
		GenericArrayStack<Character> stack = new GenericArrayStack<Character>(userIn.length());

		// Push onto the stack
		for(int i = 0; i < userIn.length(); i++) {
			stack.push(userIn.charAt(i));
		}
		
		// Pop from the stack and print in reverse
		for (int i = 0; i < userIn.length() - 1; i++) {
			System.out.print(stack.peek());
			stack.pop();
		}
		
		// Close the input
		input.close();
	}

}
