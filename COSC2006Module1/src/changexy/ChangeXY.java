/*
 * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
 * 
 * changeXY("codex") → "codey"
 * changeXY("xxhixx") → "yyhiyy"
 * changeXY("xhixhix") → "yhiyhiy"
 */

package changexy;

public class ChangeXY {
	
	public String changeXY(String s, char from, char to) {
		if (s.length() < 1) {
			return s;
		} else {
		    char first = from == s.charAt(0) ? to : s.charAt(0);
		    return first + changeXY(s.substring(1), from, to);
		}
	}
	
	public static void main(String[] args) {
		ChangeXY cxy = new ChangeXY();
	
		System.out.println(cxy.changeXY("hello", 'x', 'y'));
		System.out.println(cxy.changeXY("codex", 'x', 'y'));
		System.out.println(cxy.changeXY("xxhixx", 'x', 'y'));
		System.out.println(cxy.changeXY("xhixhix", 'x', 'y'));

	}

}