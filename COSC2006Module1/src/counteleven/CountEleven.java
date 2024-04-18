/*
 * Given an array of ints, compute recursively the number of times that the value 11 
 * appears in the array. We'll use the convention of considering only the part of the 
 * array that begins at the given index. In this way, a recursive call can pass index+1 
 * to move down the array. The initial call will pass in index as 0
 */

package counteleven;

public class CountEleven {
	
	public static void main(String[] args) {
		int[] array = {11, 5, 9, 34, 54, 12, 8, 77, 4, 1, 0, 11, 104, 55, 32, 4, 1, 11, 70, 11, 91, 5, 30, 22};

		CountEleven ce = new CountEleven();
		
		System.out.println(ce.countEleven(array, 0, array.length - 1, 11));
	}
	
	public int countEleven(int[] array, int start, int end, int number) {
		int count = 0;
		
		if (start == end) {
			int counter1 = array[start] == number ? ++count : count;
			return counter1;
			
		} else {
			int counter2 = array[start] == number ? ++count : count;
			return counter2 + countEleven(array, start + 1, end, number);
		}
	
	}

}
