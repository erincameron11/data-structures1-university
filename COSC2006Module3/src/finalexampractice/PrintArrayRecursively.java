package finalexampractice;

public class PrintArrayRecursively {

	
	public static String printArray(int[] array, int i) {
		
		// Base Case
		if (i == array.length - 1) {
			return array[i] + "";
		}
		
		return array[i] + ", " + printArray(array, i + 1);
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(printArray(array, 0));
	}

}
