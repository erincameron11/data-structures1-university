/*
 * Given an integer array, write a recursive method to find the maximum value in the array
 */

package maxvaluearray;

public class MaxValueInArray {

	public static void main(String[] args) {
		int[] array = {1, 5, 9, 34, 54, 12, 8, 77, 4, 1, 0, 104, 55, 32, 4, 1, 70, 9, 91, 5, 30, 22};
		
		MaxValueInArray mvin = new MaxValueInArray();
		
		System.out.println(mvin.findMax(array, array.length - 1));

	}
	
	public int findMax(int[] array, int size) {
		if (size == 0) {
			return array[0];
		} else {
		    return Math.max(array[size], findMax(array, size - 1));
		}
	   
	}

}
