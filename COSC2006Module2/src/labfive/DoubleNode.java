package labfive;

public class DoubleNode<T extends Comparable<T>> {
	
	private T item;
	private DoubleNode<T> prev;
	private DoubleNode<T> next;
	
	// 1-arg Constructor - for first nodes
	DoubleNode(T item) {
		prev = null;
		this.item = item;
		next = null;
	}
	
	// 3-arg Constructor
	DoubleNode(DoubleNode<T> prev, T item, DoubleNode<T> next) {
		this.prev = prev;
		this.item = item;
		this.next = next;
	}
	
	/** Method to SET the item */
	public void setItem(T item) {
		this.item = item;
	}
	
	/** Method to GET the item */
	public T item() {
		return item;
	}

	/** Method to GET the previous the item */
	public DoubleNode<T> prev() {
		return prev;
	}

	/** Method to SET the previous item */
	public void setPrev(DoubleNode<T> prev) {
		this.prev = prev;
	}

	/** Method to GET the item */
	public DoubleNode<T> next() {
		return next;
	}

	/** Method to SET the next item */
	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}
	
	/** Method to print the item of the previous node, the current node, and the next node */
	@Override
	public String toString() {
		return null;
	}
	
}