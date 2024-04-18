package demolinestack;

import java.util.Scanner;

public class TestLineEditorStack {
	
public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			// Prompt the user to enter a string
			System.out.println("Type: ");
			String userIn = input.nextLine();
					
			LineEditorStack<Character> stack = new LineEditorStack<Character>(userIn.length());
			
			// Push onto the stack if opening bracket
			for (int i = 0; i < userIn.length(); i++) {
				// If open bracket, push onto the stack
				if (userIn.charAt(i) != '<') {
					stack.push(userIn.charAt(i));
//				} else if (userIn.charAt(i) == '-') {
//					continue;
				} else {
					stack.pop();
				}

			}
			
			// Display the results
	        while (!stack.isEmpty()) {
	            System.out.print(stack.pop());
	        }
	
		
		} catch (LineEditorStackException ex) {
			System.out.println("LineEditorStackException: on pop operation - attempted to pop on an empty stack.\n"
								+ "The string entered has too many backspaces.");
		}
			
	}

}
