package finalexampractice;

import java.util.NoSuchElementException;

public class LinkedList {
	private Node head = null; 
	private Node tail = null;
	
	public LinkedList() {
		tail = new Node(null, null, null);
		head = new Node(null, tail, null); 
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addLast(Object element) {
        
        Node temp = new Node(element, null, tail);
        
        if(tail != null) {
        	tail.setNext(temp);
        }
        
        tail = temp;
        if(head == null) { 
        	head = temp;
        }

    }
	
	public Object removeLast() {
		Node temp = tail;
		
		if (isEmpty()) {
        	throw new NoSuchElementException();
		} 
	    
		tail = tail.getPrevious();
	    tail.setNext(null);

        return temp.getElement();

	}
	
	
	public void displayList(){
		Node temp = head.getNext().getNext();
	    while(temp != null){
	    	System.out.println(temp.getElement());
	        temp = temp.getNext();
	    }
	}
	
	
	
	/** TESTING practice for Final Exam 
	 * Method to push all the items stored in a linked list into stack with reverse order
	 */
	public static void fromListToStack(Stack s, Node head) {
		// push the node head first, then 2nd item, etc

		Node n = head;
		n = n.getNext();
		
		while (n.getNext() != null) {
			n = n.getNext();
			System.out.println(n.getElement());
			s.push(n.getElement());
			n.setNext(n.getNext());
		}
	}
	
	
	
	// final
	public Node removeDuplicateInList(Node head, Object item) {

		Node n = head;
		while (n.getNext() != null) {
			if (n.getNext().getElement() == item) {
				n.setNext(n.getNext().getNext());
			}
		n = n.getNext();
		}
		return n;
	}
	
	
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		String s = "one";
		String t = "two";
		String g = "three";
		
		list.addLast(s);
		list.addLast(t);
		list.addLast(g);
		
//		list.displayList();
		
		System.out.println();
//		list.removeLast();
//		list.displayList();
		
		Stack stack = new Stack(5);
//		list.fromListToStack(stack, list.head);
//		list.displayList();
//		System.out.println(stack.top());

//		list.fromListToStack(stack, list.head);
		
		// final exam
//		list.removeDuplicateInList(list.head, "two");
//		list.displayList();
	}
	
}
