package assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestLinkedListNew {
	 
	public static void main(String[] args) throws FileNotFoundException {
		
		try (Scanner input = new Scanner(new File("src/scores2.txt"))) {
			// Create an empty LinkedListNew
			LinkedListNew list = new LinkedListNew();
			
			// Read in the data from the file
			int counter = 0;
			while (input.hasNext()) {
				int stuNum = input.nextInt();
				double mark = input.nextDouble();
				list = list.insertSort(list, stuNum, mark);
				counter++;
			}
		  
			// Display the data in table format
		    list.print(list);
			System.out.print("\n\n");
		    double[] marks = new double[counter];
		    int[] stu = new int[counter];
		    System.out.println(list.findMedian(list.head, 0, marks, stu));
		    
		    // TESTING for Final Exam
//		    list.getSmallest(list);
//		    System.out.println(list.find(new NodeNew(), "hi"));
		  
		// Catch the file not found exception
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    
	}
}
