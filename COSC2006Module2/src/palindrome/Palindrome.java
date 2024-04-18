/*
 * https://www.youtube.com/watch?v=UHEMG2TgD8Q
 */

package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		// Examples: mom, dad, poop, race car, nurses run
		
		String original = "mom";
//		original = original.replace(" ", "");  // This is for when a string has a space
		
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);
			
		}
		
		boolean palindrome = true;
		
		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if (palindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		

	}

}
