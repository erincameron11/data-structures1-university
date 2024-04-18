package assignment3;

// FINAL EXAM NODE
public class Node {
	String element;
	Node next;
	Node(Node n, String e) {
		next = n;
		element = e;
	}
	String getElement() {
		return element;
	}
	
	Node getNext() {
		return next;
	}
}
