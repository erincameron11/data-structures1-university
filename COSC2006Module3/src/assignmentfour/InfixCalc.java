// Convert the infix expression to postfix
// When storing each operand or operator in postfix, place a space right after it
	// If not correct infix expression, report error
// Use StringTokenizer since spaces are delimiters
// Pick off characters one at a time using charAt
	// If they are operands, push them
	// If operator, pop top two operands off and apply the operator - push the result
// When at end of string, report the top of the stack as the result

package assignmentfour;

import java.util.Scanner;
import java.util.Stack;

public class InfixCalc {
	
	static String postfix = "";
	
	/** Method to convert Infix to Postfix */
	public static String convertPostfix(String userIn) {
		String empty = " ";
		Stack<String> stack = new Stack<String>();
		
		for (int i = 0; i < userIn.length(); i++) {

			char ch = userIn.charAt(i);
			char chr = ch;
			
			// Assign values to ch for switch cases
			if (Character.isDigit(ch)) {
				ch = '1';
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				ch = '2';
			} else if (empty.charAt(0) != ch && ch != '(' && ch != ')') {
				ch = '0';
			}
			
			switch (ch) {
				case '1': postfix = postfix + chr + " "; break;
				case '(': stack.push(String.valueOf(ch)); break;
				case ')':
					while (!stack.peek().equals("(")) {
						postfix = postfix + stack.pop() + " ";
					}
					stack.pop();  // Remove the open parenthesis from the stack
					break;
				case '2':
					while (!stack.isEmpty() 
							&& !stack.peek().equals("(") 
							&& precedence(chr) <= precedence(stack.peek().charAt(0))) {
						postfix = postfix + stack.pop() + " ";
					}
					stack.push(String.valueOf(chr));
					break;
				case '0': throw new InfixCalcException("InfixCalcException: Invalid operator used. Only + - * / % allowed.");
			}
		}
		
		// Pop the leftover contents of the stack - if open brackets left on the stack, throw exception
		while (!stack.isEmpty()) {
			if (!stack.peek().equals("("))
				postfix = postfix + stack.pop() + " ";
			else
				throw new InfixCalcException("InfixCalcException: not a valid infix expression.");
		}
		
		// Return the final postfix product
		return postfix;
	}
	
	
	/** Method to determine precedence of operators */
	public static int precedence(char ch) {
		switch (ch) {
			case '+': return 1;
			case '-': return 1;
			case '*': return 2;
			case '/': return 2; 
			case '%': return 2;
			default: return -1;
		}
	}
	
	
	/** Method to evaluate the postfix expression and return the result */
	public static int evaluate(String postfix) {
		
		// Initialize variables
		Stack<String> stack = new Stack<String>();
		int result = 0;
		int i = 0;
		int op1;
		int op2;
		
		// Eliminate spaces in string
		String postfixNoSpace = postfix.replace(" ", "");
		
		// If they are operands, push them; 
		// If operator, pop two operands and apply, pushing the result.
		while (postfixNoSpace.length() != i) {
			
			if (Character.isDigit(postfixNoSpace.charAt(i))) {
				stack.push(String.valueOf(postfixNoSpace.charAt(i)));
			
			} else if (postfixNoSpace.charAt(i) == '+'){
				op1 = Integer.valueOf(stack.pop());
				op2 = Integer.valueOf(stack.pop());
				result = op2 + op1;
				stack.push(String.valueOf(result));
				
			} else if (postfixNoSpace.charAt(i) == '-'){
				op1 = Integer.valueOf(stack.pop());
				op2 = Integer.valueOf(stack.pop());
				result = op2 - op1;
				stack.push(String.valueOf(result));
				
			} else if (postfixNoSpace.charAt(i) == '*'){
				op1 = Integer.valueOf(stack.pop());
				op2 = Integer.valueOf(stack.pop());
				result = op2 * op1;
				stack.push(String.valueOf(result));
				
			} else if (postfixNoSpace.charAt(i) == '/'){
				op1 = Integer.valueOf(stack.pop());
				op2 = Integer.valueOf(stack.pop());
				result = op2 / op1;
				stack.push(String.valueOf(result));
				
			} else if (postfixNoSpace.charAt(i) == '%'){
				op1 = Integer.valueOf(stack.pop());
				op2 = Integer.valueOf(stack.pop());
				result = op2 % op1;
				stack.push(String.valueOf(result));
			}
		
			i++;
		}
		// Push the result to the stack
		stack.push(String.valueOf(result));
		
		return result;
	}
	
	
	public static String getPostfix() {
		
		return "The postfix expression is: " + postfix;
	}
	
	
	/** Main Method */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an infix expression string
		System.out.println("Enter an infix expression: ");
		String userIn = input.nextLine();
		
		// Call the method to convert infix to postfix
		convertPostfix(userIn);
		
		// If conversion method not yet called, throw error
		if (postfix == "") {
			throw new IllegalStateException();
		} else {
			System.out.println(getPostfix());
			System.out.println("The result is: " + evaluate(postfix));
		}
		
		// Close the input
		input.close();
	}
		
}
	
