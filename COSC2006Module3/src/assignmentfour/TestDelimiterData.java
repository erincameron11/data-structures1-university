package assignmentfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TestDelimiterData {
	public static void main(String[] args) throws FileNotFoundException {
		
		try (Scanner input = new Scanner(new File("src/test_file_ass4.txt"))) {
			
			Stack<DelimiterData> stack = new Stack<DelimiterData>();
			boolean balancedSoFar = true;
			int line = 1;
			char character;
			char[] array = new char[20];  // To hold brackets and their position in the original string when pushed onto the stack
			
			
			// Loop through to read each line of data from the file
			while (input.hasNext()) {
				int column = 0;
				String s = input.nextLine();
				stack.removeAll(stack);
				
				// Loop through each line to read each column
				while (column < s.length()) {
					character = s.charAt(column);
					++column;
					
					// If the char is an opening bracket, push to stack
					if (character == '{' || character == '(' || character == '[') {
						stack.push(new DelimiterData(column, line, character));
						array[column] = character;
						
					// Else if the char is a curly closing bracket
					} else if (character == '}'){
						// Check that stack.peek() is the matching bracket - if so, pop off
						if (!stack.isEmpty() && stack.peek().getCharacter() == '{') {
							stack.pop();
							array[column] = ' ';
							
						} else {
							balancedSoFar = false;
							System.out.println("ERRORS (Line " + line + "):" + "Character: " + character + ", Column: " + column);
							
						}
						
					// Else if the closing bracket is a parenthesis bracket
					} else if (character == ')') {
						// Check that stack.peek() is the matching bracket - if so, pop off
						if (!stack.isEmpty() && stack.peek().getCharacter() == '(') {
							stack.pop();
							array[column] = ' ';
							
						} else {
							balancedSoFar = false;
							System.out.println("ERRORS (Line " + line + "):" + "Character: " + character + ", Column: " + column);
						}
						
					// Else if the closing bracket is a square bracket
					} else if (character == ']') {
						// Check that stack.peek() is the matching bracket - if so, pop off
						if (!stack.isEmpty() && stack.peek().getCharacter() == '[') {
							stack.pop();
							array[column] = ' ';
							
						} else {
							balancedSoFar = false;
							System.out.println("ERRORS (Line " + line + "):" + "Character: " + character + ", Column: " + column);
						}
					}
					
				}
				
				// Display the results to the user
				if (balancedSoFar && stack.isEmpty()) {
					System.out.println("Line: " + line + ", String: " + s + " is Balanced.\n");
				
				} else {
					// Loop through to display the characters on the stack still
					while (!stack.isEmpty()) {
						DelimiterData d = stack.pop();
						
						int index = 0;
						for (int i = 0; i < s.length(); i++) {
							if (s.charAt(i) == d.getCharacter())
								index = i;
						}
						// Display errors if any
						System.out.println("ERRORS (Line " + line + "):" + "Character: " + d.getCharacter() + ", Column: " + (index+1));
					}
	
					System.out.println("Line: " + line + ", String: " + s + " is not balanced.\n");
					
					// Reset the boolean value to true
					balancedSoFar = true;
				}
				
				// Increase line count before re-looping
				++line;
				
			}
		  
		// Catch the file not found exception
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    
	}
}
