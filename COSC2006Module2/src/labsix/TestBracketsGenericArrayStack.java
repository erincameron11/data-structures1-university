package labsix;

import java.util.Scanner;

public class TestBracketsGenericArrayStack {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			// Prompt the user to enter a string
			System.out.println("Enter a string: ");
			String userIn = input.nextLine();
					
			GenericArrayStack<Character> stack = new GenericArrayStack<Character>(userIn.length());
			
			// Push onto the stack if opening bracket
			for (int i = 0; i < userIn.length(); i++) {
				// If open bracket, push onto the stack
				if (userIn.charAt(i) == '(') {
					stack.push(userIn.charAt(i));
				} 			
			}
			
			// Pop off the stack if closing bracket
			for (int i = 0; i < userIn.length(); i++) {
				if (userIn.charAt(i) == ')' && stack.peek() == '(')
					stack.pop();
			}
			
			// Display the results
			if (stack.isEmpty()) {
				System.out.println("The string: " + userIn + " has the correct number of parenthesis.");
			} else if (!stack.isEmpty()) {
				System.out.println("The string: " + userIn + " has too many opening parenthesis.");
			}
		
		} catch (GenericArrayException ex) {
			System.out.println("GenericArrayException: on pop operation - attempted to pop on an empty stack.\n"
								+ "The string entered has too many closing parenthesis.");
		}
			
	}

}
