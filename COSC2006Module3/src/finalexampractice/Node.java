package finalexampractice;

public class Node {
	private Object element = null;
	private Node next = null; 
	private Node previous = null;
	
	public Node() {
		
	}
	
	public Node(Object obj, Node n, Node p) {
		setElement(obj); 
		setNext(n); 
		setPrevious(p);
	}
	
	public Node getNext() { 
		return next;
	}
	
	public Node getPrevious() {
		return previous; 
	}
	
	public Object getElement() { 
		return element;
	}
	
	public void setNext(Node n) {
		next = n; 
	}
	
	public void setPrevious(Node p) { 
		previous = p;
	}
	
	public void setElement(Object obj) {
		element = obj; 
	}
}
