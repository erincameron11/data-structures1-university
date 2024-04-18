package assignment3;

import java.util.NoSuchElementException;

public class LinkedListNew {
	static NodeNew head;
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	/** Method to insert a new node into the list */
	public LinkedListNew insertSort(LinkedListNew list, int stuNum, double mark) {
        // Create a new node with the specified data from the file
		NodeNew newNode = new NodeNew(stuNum, mark);
        newNode.setNext(null);
        NodeNew curr = head;
        
        // If the list is empty, link the head to the new node
        if (isEmpty() || curr.getMark() <= newNode.getMark()) {
        	newNode.setNext(head);
            list.head = newNode;
        
        // If the list is not empty, advance nodes until the correct place for insertion is found
        } else {
        	
            while (curr.next() != null && curr.next().getMark() > newNode.getMark()) {
            	curr = curr.next();
            }

            // Set the current location of the list to the new node
            newNode.setNext(curr.next());
            curr.setNext(newNode);
        }
        return list;
	}
	
	
	/** Method to display each node in the list for the user */
    public void print(LinkedListNew list) {
    	NodeNew curr = list.head;
    
        System.out.print("Student Number\t\tMark");
        System.out.print("\n=======================\t========");
    
        // Loop through the list and print each node
        while (curr != null) {
            System.out.print("\n\t" + curr.getStuNum() + "\t\t" + curr.getMark());
            curr = curr.next();
        }
    }
    
  
    /** Method to recursively find the median */
    public double findMedian(NodeNew list, int count, double[] marks, int[] stu) {
    	marks[count] = list.getMark();
    	stu[count] = list.getStuNum();
    	int middle = 0;
    	
    	// Base Case
    	if (list.next() == null) {
    		middle = Math.round((count + 1) / 2);
    		
    		System.out.print("(Node #" + (middle + 1) + ") The median mark is by student number: " + stu[middle] + " with a mark of: ");
    		return marks[middle];
    	}
    	
    	return findMedian(list.next(), count + 1, marks, stu);
    }
    
    
    
    
    
    /** TESTING Method for Final Exam:
     * Write method getSmallest that returns the object that precedes all others in the 
     * SortedList if it is not empty. If the list is empty, return null.
     */
      // TESTING QUESTION 1
//    public static void getSmallest(LinkedListNew list) {
//    	NodeNew curr = list.head;
//    	
//    	if (list.isEmpty()) {
//    		System.out.println("The list is empty. There is no smallest element to retrieve.");
//    	
//    	} else {
//    		curr = list.head;
//    		System.out.println("The smallest item in the list is... Student#: " + curr.getStuNum() + ", Mark: " + curr.getMark());
//
//    	}
//    }   
    

    
    //    public static LinkedListNew getSmallest(LinkedListNew list) {
//    	
//    	if (list.isEmpty()) {
//    		return null;
//    	
//    	} else {
//    		boolean firstIteration = true;
//    		
//    		while (firstIteration) {
//    			
//    			firstIteration = false;
//    			return list;
//    		}
//
//    	}
//		return list;
//    }
//    
//    
//    // TESTING QUESTION 2
//    boolean find(NodeNew head, String s) {
//    	boolean answer = true;
//    	
//    	while (head != null) {
//	    	if (s.equals(head))
//	    		answer = true;
//	    	else
//	    		answer = false;
//	    	
//	    	head = head.next();
//    	}
//    	return answer;
//    }
    
    
    // final
	public Node removeDuplicateInList(Node head, Object item) {

		Node n = head;
		
		while (n != null) {
			
			if (n.next.getElement() == item) {
				n.next = n.next.next;
			}
			
			n = n.next;
		}
		
		return n;
	}
    
}
