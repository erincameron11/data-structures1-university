package linkedlistqueue;

public class LinkedNode {
	private Object item;
	private LinkedNode next;
	
	// 1-arg Constructor - for first nodes
	public LinkedNode(Object item) {
		this.item = item;
		next = null;
	}
	
	// 3-arg Constructor
	public LinkedNode(Object newItem, LinkedNode next) {
		this.item = newItem;
		this.next = next;
	}
		
//	// 1-arg Constructor
//	public LinkedNode(Object newItem) {
//		item = newItem;
//		next = null;
//	}
//	
//	// 2-arg Constructor
//	public LinkedNode(Object newItem, LinkedNode nextNode) {
//		item = newItem;
//		next = nextNode;
//	}
	
	public void setItem(Object newItem) { 
		item = newItem;
	}
	
	public Object getItem() { 
		return item;
	}
	
	public void setNext(LinkedNode nextNode) { 
		next = nextNode;
	}
	
	public LinkedNode getNext() { 
		return next;
	}	
}
