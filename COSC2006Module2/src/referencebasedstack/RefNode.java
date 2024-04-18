/*
 * https://www.youtube.com/watch?v=looZMrdHwhU&t=27s
 */

package referencebasedstack;

public class RefNode {
	private Object item;
	private RefNode next;
	
	// Constructor creates the first node
	public RefNode(Object newItem) {
		item = newItem;
		next = null;
	}
	
	public RefNode(Object newItem, RefNode nextNode) {
		item = newItem;
		next = nextNode;
	}
	
	public void setItem(Object newItem) {
		item = newItem;
	}
	
	public Object getItem() {
		return item;
	}

	public RefNode getNext() {
		return next;
	}

	public void setNext(RefNode nextNode) {
		next = nextNode;
	}
	
}
