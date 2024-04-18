package linkedlist;

public class Node {
		
	private String data;
	private Node next;
		
	// 2-arg Constructor
	Node(String newItem, Node next) {
		this.data = newItem;
		this.next = next;
	}
	
	public String getData() {
		return data;
	}
		
	public Node getNext() {
		return next;
	}
		
	public void setData(String d) {
		data = d;
	}
		
	public void setNext(Node n) {
		next = n;
	}
	
	
	/** CHALLENGE Given a linked list with three values, get the third value */
	public static String getThird(Node list) {
		return list.getNext().getNext().getData(); // Gets first node data value
	}
	
	
	/** CHALLENGE Given a linked list with three values, insert into the second position
	 *  PRECONDITION: list is not empty (list != null) */
	public static void insertSecond(Node list, String s) {
		Node newNode = new Node(s, null);  // Create a new node
		newNode.setNext(list.getNext());  // Set the new node next to the following node
		list.setNext(newNode); // Change previous node to point to the new node
		// Could be re-written in one line as:
		// list.setNext(new Node(s, list.getNext()));
	}
	
	
	/** Method to find the size of the list (number of nodes) 
	 *  Will need a loop to solve, or a recursive solution - this is the loop way */
	public static int size(Node list) {
		int count = 0;
		
		while (list != null) {  // When the list itself is null we stop
			count++;
			list = list.getNext(); // How we increment a linked list variable (how to get to the next linked list node)
			// The above code line does not destroy the linked list because "list" is a local variable here passed as a parameter
		}
		return count + 1;
	}
	
	
	/** Method to add a node the the end of the list 
	 * 	PRECONDITION OPTION 1: list is not empty 
	 *  PRECONDITION OPTION 2: change the return type from void to return the resulting list */
	public static Node addLast(Node list, String s) {
		// If the list is empty create a new node with the string
		if (list == null) {
			return new Node(s, null);
		}
		
		// Make a node of the front of the list
		Node temp = list;
		
		while(temp.getNext() != null)
			temp = temp.getNext();
		temp.setNext(new Node(s, null));
		
		// Returns the front of the list
		return list;
	}
	
	
	/** Main Method */
	public static void main(String[] args) {
		Node aNode;
		Node anotherNode = null;
		aNode = new Node("hello", anotherNode);
		
//		Node list = new Node("A", new Node("B", new Node("C", null)));
	}
}
