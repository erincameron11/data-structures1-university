package adtlinkedlist;

public class LinkNode {
	private Object item;
	private LinkNode next;
	
	public LinkNode(Object newItem) {
		item = newItem;
		this.next = null;
	}
		
	// 2-arg Constructor
	LinkNode(Object item, LinkNode nextNode) {
		this.item = item;
		this.next = nextNode;
	}
	
	// Getter for student number
	public Object getItem() {
		return item;
	}
	
	// Setter for student number
	public void setItem(Object newItem) {
		item = newItem;
	}
	
		
	// Getter for the next link node in the list
	public LinkNode getNext() {
		return next;
	}
	
	// Setter for the next link node in the list
	public void setNext(LinkNode node) {
		next = node;
	}

}
